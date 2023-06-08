/**
 * 测试for循环
 */
public class TestFor03 {
    public static void main(String[] args) {
        // 测试90-1之间能被3整除的数
        /*for(int i=90;i>0;i--){
            if(i%3==0){
                System.out.println("90-1之间能被3整除的数："+ i);
            }
        }*/
        for(int i=90;i>0;i-=3){
            System.out.println("90-1之间能被3整除的数："+ i);
        }
    }
}
