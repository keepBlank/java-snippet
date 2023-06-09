/*
 * 测试浮点数的基本用法
*/
public class TestFloatNumber{
	public static void main(String[] args){
		double d1 = 3.14;
		double d2 = 3.14E2;    // 科学技术法
		
		float f1 = 1.65F;      // 浮点常量的默认类型是double，改float后面需要加f
		
		// 浮点数是不精确的，尽量不要直接比较
		float f2 = 0.1F;
		double d3 = 1.0/10;
		System.out.println(f2 == d3);   // false
		
		float f3 = 123123123123L;
		float f4 = f3 + 1;
		System.out.println(f3 == f4);   // true
		System.out.println(d2);
	}
}