/**
 * 循环0-130之间的数字，每行显示5个数字
 */
public class ExePring0_130Bye5 {
    public static void main(String[] args) {
        int count = 0;    // 每行打印了几个数
        for(int i=1;i<=130;i++){
            System.out.print(i + "\t");
            /*if(i%5==0){
                System.out.println();
            }*/
            count++;
            if(count == 5){
                System.out.println();
                count = 0;
            }

        }
    }
}
