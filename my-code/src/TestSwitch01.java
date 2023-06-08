/**
 * 测试switch语句的用法
 */
public class TestSwitch01 {
    public static void main(String[] args) {
        int grade = (int)(Math.random()*4)+1;
        System.out.println("你的年级是："+grade);
        switch (grade){
            case 1:
                System.out.println("大一，输出博客,坚持运动");
            break;
            case 2:
                System.out.println("多参加学校的党组织部门和活动，锻炼融入社会的能力");
            break;
            case 3:
                System.out.println("准备考研或者为校招做准备");
            case 4:
                System.out.println("做好简历，海量投和面试，积累经验");
            default:
                System.out.println("你已经毕业了");
        }
    }

}
