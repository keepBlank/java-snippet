public class TestConstant{
	public static void main(String[] args){
		final double PI = 3.14;
		// PI = 3.1415926;               // 无法为常量再次赋值
		final int MAX_SPEED = 120;       // 常量的命名全用大写字母，单词之间下划线隔开
		int r = 4;
		double area = PI * r * r;
		double circle = 2 * PI * r;
		System.out.println("面积 = " + area);
		System.out.println("周长 = " + circle);
	}
} 