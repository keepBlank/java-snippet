/**
 * 使用嵌套循环打印出5x5方阵
 */
public class PhalanxBy5X5 {
    public static void main(String[] args) {
        // 方法一： 使用计数器count，count=1打印"\*",count=2打印"#"
        /*int count = 0;
        for(int m=1;m<=5;m++){
            for(int n=1;n<=5;n++){
                count++;
                if(count==2){
                    System.out.print("#"+ "\t");
                    count = 0;
                }else{
                    System.out.print("*"+ "\t");
                }

            }
            System.out.println();
        }*/

        // 方法二：m+n如果是奇数就输出"*",m+n如果是偶数就输出"#"
        for(int m=1;m<=5;m++){
            for(int n=1;n<=5;n++){
                if((m+n)%2 == 0){
                    System.out.print("*"+ "\t");
                }else{
                    System.out.print("#"+ "\t");
                }
            }
            System.out.println();
        }

    }
}
