public class TestInt{
	public static void main(String[] args){
		int a = 100;             // 十进制
		int b = 015;             // 八进制
		int c = 0xff;            // 十六进制
		int d = 0b1001010101;    // 二进制
		
		System.out.println(a);
	    System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		int salary = 30000;             // 整型常量默认是int类型
	    //int yearSalary = 3000000000;  // 超过最大范围报错
		long yearSalary = 3000000000;   // 把整型常量定义为long类型
		System.out.println("你的年薪为：" + yearSalary);
	}
}