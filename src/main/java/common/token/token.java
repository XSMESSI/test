//package common.token;
//
//import org.jose4j.jwt.JwtClaims;
//import org.jose4j.keys.HmacKey;
//
//import java.security.Key;
//
///**
// * @Description
// * @Author XuShen
// * @Date 2022/5/25 9:57
// */
//public class token /**
// * 生成token
// * @param userToken
// * @param expire
// * @return
// * @throws Exception
// */
//public static String generateToken(UserToken userToken, int expire) throws Exception {
//    JwtClaims claims = new JwtClaims();
//    claims.setSubject(userToken.getUsername());
//    claims.setClaim(CommonConstants.CONTEXT_USER_ID,userToken.getUserId());
//    claims.setClaim(CommonConstants.CONTEXT_NAME, userToken.getName());
//    claims.setClaim(CommonConstants.CONTEXT_DEPT_ID, userToken.getDeptId());
//    claims.setClaim(CommonConstants.CONTEXT_APPLICATION_ID, userToken.getApplicationId());
//    claims.setExpirationTimeMinutesInTheFuture(expire == 0 ? 60*24 : expire);
//
//    Key key = new HmacKey(CommonConstants.JWT_PRIVATE_KEY.getBytes("UTF-8"));
//
//    JsonWebSignature jws = new JsonWebSignature();
//    jws.setPayload(claims.toJson());
//    jws.setAlgorithmHeaderValue(AlgorithmIdentifiers.HMAC_SHA256);
//    jws.setKey(key);
//    jws.setDoKeyValidation(false); // relaxes the key length requirement
//
//    //签名
//    String token = jws.getCompactSerialization();
//    return token;
//}
//
//        /**
//         * 解析token
//         * @param token
//         * @return
//         * @throws Exception
//         */
//        public static UserToken getInfoFromToken(String token) throws Exception {
//
//            if (token == null) {
//                return null;
//            }
//
//            Key key = new HmacKey(CommonConstants.JWT_PRIVATE_KEY.getBytes("UTF-8"));
//
//            JwtConsumer jwtConsumer = new JwtConsumerBuilder()
//                    .setRequireExpirationTime()
//                    .setAllowedClockSkewInSeconds(30)
//                    .setRequireSubject()
//                    .setVerificationKey(key)
//                    .setRelaxVerificationKeyValidation() // relaxes key length requirement
//                    .build();
//
//            JwtClaims processedClaims = jwtConsumer.processToClaims(token);
//
//            return new UserToken(
//                    processedClaims.getSubject(),
//                    processedClaims.getClaimValue(CommonConstants.CONTEXT_USER_ID).toString(),
//                    processedClaims.getClaimValue(CommonConstants.CONTEXT_NAME).toString(),
//                    processedClaims.getClaimValue(CommonConstants.CONTEXT_DEPT_ID).toString(),
//                    processedClaims.getClaimValue(CommonConstants.CONTEXT_APPLICATION_ID).toString());
//        }
//
//        public static void main(String[] agars) throws Exception {
//            UserToken userToken=new UserToken("admin","1","超级管理员名称","1","111111");
//            String token = generateToken(userToken, 0);
//            System.out.println(token);
//            UserToken infoFromToken = getInfoFromToken(token);
//            System.out.println(infoFromToken);
//
//        }
//
