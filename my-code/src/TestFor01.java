/**
 * 测试for循环
 */
public class TestFor01 {
    public static void main(String[] args) {
        /*
            int a = 0;    // 初始化部分
            while (a<3){  // 布尔表达式
                System.out.println("while循环了"+ a + "次");  // 循环体
                a++;      // 迭代因子
            }
        */

        // 使用for循环对while其改在
        for (int a = 0; a < 3; a++) {
            System.out.println("进入for循环" + a + "次");
        }
        System.out.println();

        /*
            // 累加： 0+ 1 + 2 + 3 + 4 + ... + 100
            int i = 0;
            int sum = 0;
            while (i<=100){
                sum = sum + i;
                i++;
            }
            System.out.println("1累加到100的和为：" + sum);
        */

        // 使用for循环对while其改在
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum = sum + i;
        }
        System.out.println("1累加到100的和为：" + sum);
    }
}
