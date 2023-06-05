/*
  * 测试位运算符的用法
*/
public class TestOperator05{
	public static void main(String[] args){
		int a = 7;
		int b = 8;
		System.out.println(a & b);         // 按位与：0 0 0 0                             结果： 0
		System.out.println(a | b);         // 按位或：1 1 1 1                             结果： 15
		System.out.println(a ^ b);         // 按位异或(相同false即0，不同true 1) 1 1 1 1  结果： 15
		System.out.println(~b);            // 取反：0 1 1 1 (补码，暂不用掌握)            结果：-9
		
		// 移位
		int c = 5 << 1;                    // 左移一位乘2，相当于5*2
		int d = 5 << 2;                    // 相当于5*2*2      
		System.out.println(c);             // 10
		System.out.println(d);             // 20
		System.out.println(40>>3);         // 右移一位除以2，相当于 40 / 8 = 5
	}
}
