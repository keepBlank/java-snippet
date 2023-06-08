/**
 * 计算100之内的累加和、所有奇数和、所有偶数和
 */
public class Exe1Sum100 {
    public static void main(String[] args) {

        int sum = 0;     // 总和
        int oddSum = 0;  // 奇数和
        int evenSum = 0; // 偶数和
        for(int i=0;i<=100;i++){
            sum = sum + i;
        }
        /*int a = 0;
        while (a<=100){
            a++;
            if(a%2==0){
                evenSum += a;
            }else{
                oddSum += a;

            }
        }*/
        for(int a=0;a<=100;a++){
            if(a%2==0){
                evenSum += a;
            }else{
                oddSum += a;

            }
        }
        System.out.println("100之内偶数和"+ evenSum);
        System.out.println("100之内奇数和"+ oddSum);
        System.out.println("100之内的累加和"+ sum);
    }
}
