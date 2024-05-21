package _2024.FaceTest;

/**
 * @Author Xu Shen
 * @Date 2024/1/31 14:55
 * @Version 1.0
 * @DESC :
 */
public class BirdTest {

    public void test(Bird bird){
        System.out.println(bird.getName() + "能够飞" + bird.fly() + "米");
    }

    public static void main(String[] args) {
        BirdTest test = new BirdTest();
        test.test(new Bird() {
            @Override
            public int fly() {
                return 1000;
            }

            public String getName(){
                return "大雁";
            }
        });
    }
}
