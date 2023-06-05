/*
  * 测试字符串连接符的用法
*/
public class TestOperator06{
	
	public static void main(String[] args){
		String a = "3";
		int b = 4;
		System.out.println(a + b);   // "34"
		
		// 条件是String，不是char。若是char，则仍然是加法
		char c1 = 'h';
		char c2 = 'i';
		System.out.println(c1 + c2);
		// 将c1左边的加号变成字符串连接符
		System.out.println("" + c1 + c2);
	}
}
