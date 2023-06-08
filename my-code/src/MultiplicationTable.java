/**
 * 九九乘法表
 */
public class MultiplicationTable {
    public static void main(String[] args) {
        for(int m=1;m<=9;m++){
            // 思考下为什么不是i<=9？
            for(int i=1;i<=m;i++){
                System.out.print(i+"*"+m+"="+(i*m)+"\t");
            }
            System.out.println();
        }
    }
}
