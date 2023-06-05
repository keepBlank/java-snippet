/*
  * 测试关系运算符的用法
*/
public class TestOperator03{
	public static void main(String[] args){
		int a = 3;
		int b = 4;
		boolean c = a > b;
		System.out.println(c);                    // false
		
		char d = 'h';
		System.out.println((int)d);              // char值位于0~65536之间，可以通过int强制转型成数字   14
		boolean e = d > 100;
		System.out.println(e);                   // true
	}
}
