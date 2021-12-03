package _2021._2021._10_October.test_1011;

import _2021._10_October.test_1011.Account;
import _2021._10_October.test_1011.MemberInfo;
import com.sun.tools.corba.se.idl.StringGen;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Description
 * @Author XuShen
 * @Date 2021/10/11 9:57
 */
public class test_01ListFootball {
    public static void main(String[] args) {
        List<_2021._10_October.test_1011.Account> accountList = new ArrayList<>();
        List<_2021._10_October.test_1011.MemberInfo> infoList = new ArrayList<>();


        String[] names = {"梅西","C罗","德布劳内","莱万","内马尔","范戴克"};
        String[] countrys = {"阿根廷","葡萄牙","比利时","波兰","巴西","荷兰"};
        String[] clubs = {"巴黎圣日耳曼","曼联","曼城","拜仁慕尼黑","巴黎圣日耳曼","利物浦"};
        Integer[] ages = {34,36,30,33,29,30};
        Integer[] nums = {7,3,0,8,0,10};

        //创建的对象要放在每一次的循环都要重新建一个
        for (int i = 0;i<names.length;i++){
            _2021._10_October.test_1011.MemberInfo info = new MemberInfo();
            info.setId(i+1);
            info.setName(names[i]);
            info.setCountry(countrys[i]);
            info.setClub(clubs[i]);
            info.setAge(ages[i]);
            info.setAwardNum(nums[i]);
            infoList.add(info);
        }

        System.out.println(infoList);

        for (int i = 0;i<infoList.size();i++){
            _2021._10_October.test_1011.Account account = new _2021._10_October.test_1011.Account();
            account.setXm(infoList.get(i).getName());
            account.setNl(infoList.get(i).getAge());
            account.setNum(infoList.get(i).getAwardNum());
            accountList.add(account);
        }
        System.out.println(accountList);
        List<_2021._10_October.test_1011.Account> sortList = accountList.stream().sorted(Comparator.comparing(_2021._10_October.test_1011.Account::getNum)).collect(Collectors.toList());
        System.out.println("根据获奖个数进行排序：升序-"+sortList);
        List<_2021._10_October.test_1011.Account> sortReverseList = accountList.stream().sorted(Comparator.comparing(Account::getNum).reversed()).collect(Collectors.toList());
        System.out.println("根据获奖个数进行排序：降序-"+sortReverseList);
    }
}
