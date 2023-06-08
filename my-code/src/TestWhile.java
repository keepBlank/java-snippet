/**
 * 测试while循环
 */
public class TestWhile {
    public static void main(String[] args) {
//        int a = 0;
//        while (a<3){
//            System.out.println("while循环了"+ a + "次");
//            a++;
//        }

        // 累加： 0+ 1 + 2 + 3 + 4 + ... + 100
        int i = 0;
        int sum = 0;
        while (i<=100){
            sum = sum + i;
            i++;
        }
        System.out.println("1累加到100的和为：" + sum);
    }
}
