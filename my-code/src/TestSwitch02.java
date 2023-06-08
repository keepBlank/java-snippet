/**
 * 测试switch语法
 */
public class TestSwitch02 {
    public static void main(String[] args) {
        int month = (int)(Math.random()*12)+1;
        switch (month){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println(month + "月，属于上半年");
                break;
            default:
                System.out.println(month + "月，属于下半年");
                break;
        }
    }
}
