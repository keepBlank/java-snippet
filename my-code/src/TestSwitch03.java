/**
 * 测试switch
 */
public class TestSwitch03 {
    public static void main(String[] args) {
        String str = "a";
        switch (str){
            case "a":
                System.out.println("a");
            case "A":
                System.out.println("A");
                break;
            default:
                System.out.println("*");
        }
    }
}
