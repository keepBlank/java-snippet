/*
  * 测试算数运算符用法
*/
public class TestOperator01{
	public static void main(String[] args){
		int a = 3;
		long b = 4;
		//int c = a + b;       // a+b 的结果是long，long赋值给c是int，报错
		long c = a + b;
		
		double d = 3 + 3.14;  // 3.14是double类型加整数结果还是double类型
		int d2 = 32 / 3 ;     // 2个整数相除，直接保留结果的整数部分，不四舍五入
		double d3 = 32.0 / 3; // 如果想让结果不是整数，就将其中一个变成浮点数
		
		
		System.out.println(d2); // 10
		System.out.println(d3); // 10.666666666666666
		
		// 取模运算
		int e = 10 % 3;        // 取余操作，结果符号和左边操作数相同
		System.out.println(e); // 1
		
		// 测试自增、自减
		int g = 30;
		g++;                  // 相当于： g = g + 1
		g--;                  // 相当于： g = g - 1
		
		g = 10;
		int h = g++;	     // ++在后，先赋值后自增,h=10,g=11
		g = 10;
		int i = ++g;         // ++在前，先自增后赋值,g=11,i=11
		
		System.out.println(h);  // 10
		System.out.println(i);  // 11
	}
}