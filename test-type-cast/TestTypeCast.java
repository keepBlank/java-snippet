/*
 * 测试类型强制转换 
*/
public class TestTypeCast{
	public static void main(String[] args){
		double a = 3.141592654;
		int b = (int)a;        // 浮点数强转为整数，直接丢失小数部分                
		System.out.println(b); // 3
		
		int c = 97;
		char d = (char)c;
		System.out.println(d);  // 'a'
		
		// 强制转型，超过了表示的范围，则会转成一个完全不同的值
		byte b1 = (byte)300;
		System.out.println(b1); // 44
		
		// 测试常见错误之溢出
		int money = 1000000000; // 10亿
		int years = 20;
		// 返回total是负数，超出int的范围
		int total = money*years;
		System.out.println("total=" + total);
		// 返回total1是负数,乘积还是int类型且值为200亿，已经溢出了int的最大表示范围
		long total1 = money*years;
		System.out.println("total1=" + total1);
		//返回total2正确：先将一个因子变成long，整个表达式发生提升，全部用long来计算
		long total2 = money*((long)years);
		// 1变成long类型，结果还是long类型
		long total2 = 1L*money*years
		System.out.println("total2=" + total2);
	}
}