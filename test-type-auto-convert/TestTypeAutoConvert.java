/*
 测试类型自动转化
*/
public  class  TestTypeAutoConvert{
	public static void main(String[] args){
		// 容量小的类型可以自动转化成容量大的类型
		int a = 1234;
		long b = a;
		//int c = b;              // long类型不能自动转化成int
		double d = b;             // long转double可转，只是可能会丢失精度
		float f = b;              // long可转float,只是可能会丢失精度
		
		
		// 特例：整型常量是int类型，但是可以自动转成：byte/short/char
		// 只要不超过对应类型的表述范围
		byte b1 = 123;
		//byte b2 = 1234           // int自动转byte类型失败，因为1234超过了byte可表示的范围
		
		char h3 = 97;
		System.out.println(h3);    // a
	}
}