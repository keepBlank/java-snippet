/**
 *  测试多分支结构
 */
public class Test03 {

    public static void main(String[] args) {
        int i = (int) (Math.random() * 6 + 1);
        int j = (int) (Math.random() * 6 + 1);
        int k = (int) (Math.random() * 6 + 1);

        int count = i + j + k;
        System.out.println("第一个骰子：" + i );
        System.out.println("第二个骰子：" + j );
        System.out.println("第三个骰子：" + k );

        if(count > 15){
            System.out.println("今天手气不错！再来一把");
        }else if(count>=10){
            System.out.println("手气一般！再来两把");
        }else{

        }
        if( && count < 15){

        }
        if(count < 10){
            System.out.println("手气差点，下次再来吧！");
        }

        System.out.println("今天掷骰子得分：" + count);
    }
}
