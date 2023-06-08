import java.sql.SQLOutput;

/**
 * 测试多分支结构
 */
public class Test03 {

    public static void main(String[] args) {
        int age = (int)(120*Math.random());
        System.out.println("年龄是："+ age);
        // 15以下(不含15)：儿童，15-24青年，25-44中年，45-64中老年，65-84老年，85-99老寿星，100-109百岁老人，110以上，打破年龄最长记录
        if(age<15){
            System.out.println("儿童，好好玩");
        }else if(age<25){
            System.out.println("青年，好好读书");
        }else if(age<45){
            System.out.println("中年，好好工作，养家糊口");
        }else if(age<65){
            System.out.println("中老年，遛遛狗，下下棋，泡泡茶，吹吹牛");
        }else if(age<85){
            System.out.println("老年，今天跳广场舞了吗？");
        }else if(age<100){
            System.out.println("老寿星，家有一老，如有一宝");
        }else if(age<110){
            System.out.println("百岁老人，跨世纪的见证者");
        }else{
            System.out.println("110岁以上，已经打破世界记录了");
        }


















//        int i = (int) (Math.random() * 6 + 1);
//        int j = (int) (Math.random() * 6 + 1);
//        int k = (int) (Math.random() * 6 + 1);
//
//        int count = i + j + k;
//        System.out.println("第一个骰子：" + i);
//        System.out.println("第二个骰子：" + j);
//        System.out.println("第三个骰子：" + k);
//
//        if (count > 15) {
//            System.out.println("今天手气不错！再来一把");
//        } else if (count >= 10) {
//            System.out.println("手气一般！再来两把");
//        } else {
//            System.out.println("手气不行，明天再来吧");
//        }
//        System.out.println("今天掷骰子得分：" + count);
    }
}
