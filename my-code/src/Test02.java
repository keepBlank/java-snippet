import java.util.Arrays;
/**
 * 测试if-else 双分支结构
 */
public class Test02 {

    public static void main(String[] args) {
        double r = 4 * Math.random();
        double area = 3.14 * r * r;
        double circle = 2 * Math.PI * r;

        System.out.println("半径:" + r);
        System.out.println("周长:" + circle);
        System.out.println("面积:" + area);

        if (area >= circle) {
            System.out.println("面积的数值大于等于周长");
        } else {
            System.out.println("面积的数值小于周长");
        }

        // 条件运算符

        int a = 3,b = 4;
        int c = a<b?b:a;
        System.out.println("较大数是：" + c);  // 把a和b中大的数返回

        // 把a和b中，较大的数返回
        if(a<b){
            c = b;
        }else{
            c = a;
        }
        System.out.println("较大数是：" + c);
    }
}
