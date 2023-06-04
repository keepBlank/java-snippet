/*
 * 测试char类型的使用
*/
public class TestChar{
	public static void main(String[] args){
		char c1 = 'a';
		char c2 = '中';
		char c3 = '\u0082';  // /u表示Unicode字符集
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		// Java中字符串不是基本数据类型，而是一个类
		String str = "平安喜乐";
		System.out.println(str);
		
		// 转义字符
		System.out.println("\"a\"\n\"b\"\nc\nd\ne\nf\ng");
		System.out.println("q\tw\te\tr");
	}
}
