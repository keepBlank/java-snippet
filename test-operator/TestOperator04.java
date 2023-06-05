/*
  * 测试逻辑运算符的用法
*/
public class TestOperator04{
	public static void main(String[] args){
		boolean b1 = false;
		boolean b2 = true;
		System.out.println(b1&b2); //与：有一个false，结果为false
		System.out.println(b1|b2); // 或：有一个true，结果为true
		System.out.println(!b2);   // 非： 取反 ，结果为false
		System.out.println(b1^b2); // 异或：相同为false，不同为true
		
		// 短路与、短路或
		//int b3 = 3/0;              // 报不能除以0的异常
		boolean b3 = 1 > 2 && (4 < 3 / 0);
		System.out.println(b3);      // 短路与遇到false，得到结果，运算符右边不执行，所以不报错
		
		boolean b4 = 1 > 2 & (4 < 3 / 0);
		System.out.println(b4);      // 报错，因为不是短路与，运算符右边也执行
	}
}
