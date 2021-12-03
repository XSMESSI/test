package Leetcode.testCs;

/**
 * @Description
 * @Author XuShen
 * @Date 2021/12/2 16:16
 */
public class test_01hiuWenNUmber {
    public static void main(String[] args) {

        String str = "1234";
        int x = 12321;
        System.out.println(isPalindrome1(x));
    }

    /**
     * 整数转换为字符串进行操作，但是效率不是很高，把整数反转过来，进行比较两个数是否一致
     * @param x
     * @return
     */
    public static boolean isPalindrome(int x) {
        if (x<0){
            return false;
        }else{
            String str = x+"";
            int m  = str.length()-1;
            for (int i = 0;i<str.length()/2;i++){
                if (str.substring(i,i+1).equals(str.substring(m,m+1))){
                    m--;
                }else{
                    return false;
                }
            }
            return true;
        }
    }


    /**
     *整数反转进行数据输出
     * @param x
     * @return
     */
    public static boolean isPalindrome1(int x) {
        if (x < 0) {
            return false;
        } else {
            int num = reverse(x);
            if (num == x){
                return true;
            }else{
                return false;
            }
        }
    }

        public static int reverse ( int x){
            int rev = 0;
            while (x != 0) {
                if (rev < Integer.MIN_VALUE / 10 || rev > Integer.MAX_VALUE / 10) {
                    return 0;
                }
                int digit = x % 10;
                x /= 10;
                rev = rev * 10 + digit;
            }
            return rev;
        }
    }