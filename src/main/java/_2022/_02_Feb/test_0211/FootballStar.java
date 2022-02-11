package _2022._02_Feb.test_0211;

/**
 * @Description 球员枚举类
 * @Author XuShen
 * @Date 2022/2/11 11:10
 */
public enum FootballStar {

    Messi(10,"梅西"),
    Ronaldo(7,"C罗"),
    Neymar(11,"内马尔"),
    Mbappé(17,"姆巴佩");


    /**
     * 球员姓名
     */
    private String name;

    /**
     * 球员编号
     */
    private Integer number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    FootballStar(Integer number,String name){
        this.number = number;
        this.name = name;
    }

}
