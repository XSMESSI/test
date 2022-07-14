package common.wisdragon.oauth.demo;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DemoController {
	
	Logger log = LoggerFactory.getLogger(DemoController.class);

	@Value("${uaap.codeEndpoint}")
	private String codeEndpoint;

	@Value("${uaap.accessTokenEndpoint}")
	private String accessTokenEndpoint;

	@Value("${uaap.profileEndpoint}")
	private String profileEndpoint;

	@Value("${client.id}")
	private String client_id;

	@Value("${client.secret}")
	private String client_secret;

	@Value("${client.codeRedirectUrl}")
	private String redirectUrl;

	@Value("${client.scope}")
	private String scope;
	
	public static final String  AUTHORIZATION_CODE = "authorization_code";

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView index(HttpServletRequest request) {

		ModelAndView mv = new ModelAndView();

		
		String redirect = this.addParameter(this.codeEndpoint, "client_id", this.client_id);
		redirect = this.addParameter(redirect, "redirect_uri", this.redirectUrl);
		redirect = this.addParameter(redirect, "scope", this.scope);
		
		int x = (int)(Math.random()*100);	//可使用其他更随机的随机数
		
		redirect = this.addParameter(redirect, "state", x + "");
		request.getSession().setAttribute("state", x + "");
		mv.setViewName("redirect:" + redirect);

		return mv;
	}

	@RequestMapping(value = "/code", method = RequestMethod.GET)
	public ModelAndView code(HttpServletRequest request, @RequestParam(value = "code") String code, @RequestParam(value = "state") String state) throws UnsupportedEncodingException {

		//校验state参数
		if(!state.equals(request.getSession().getAttribute("state") + "")){
			
			throw new RuntimeException("state参数校验失败");
		}
		
		ModelAndView mv = new ModelAndView();
		
		//请求access_token
		RestTemplate restTemplate = new RestTemplate();

		String redirect = this.addParameter(this.accessTokenEndpoint, "client_id", this.client_id, false);
		redirect = this.addParameter(redirect, "client_secret", this.client_secret, false);
		redirect = this.addParameter(redirect, "grant_type", DemoController.AUTHORIZATION_CODE, false);
		redirect = this.addParameter(redirect, "redirect_uri", this.redirectUrl, false);
		redirect = this.addParameter(redirect, "code", code, false);
			
		ResponseEntity<String> responseEntity = restTemplate.getForEntity(redirect, String.class);

		//请求用户信息
		responseEntity = restTemplate.getForEntity(this.profileEndpoint + "?" + responseEntity.getBody(), String.class);
		log.info(responseEntity.getBody());
		
		mv.addObject("info", responseEntity.getBody());
		
		mv.setViewName("info");
		
		return mv;
	}

	private String addParameter(final String url, final String name, final String value) {
		return this.addParameter(url, name, value, true);
	}
	
	private String addParameter(final String url, final String name, final String value, final boolean encode) {
		final StringBuilder sb = new StringBuilder();
		sb.append(url);
		if (url.indexOf("?") >= 0) {
			sb.append("&");
		} else {
			sb.append("?");
		}
		sb.append(name);
		sb.append("=");
		if (value != null) {
			try {
				if(encode){
					
					sb.append(URLEncoder.encode(value, "UTF-8"));
				}else{
					
					sb.append(value);
				}
			} catch (final UnsupportedEncodingException e) {
				throw new RuntimeException(e);
			}
		}
		return sb.toString();
	}
}
