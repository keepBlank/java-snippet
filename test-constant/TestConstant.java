public class TestConstant{
	public static void main(String[] args){
		final double PI = 3.14;
		// PI = 3.1415926;               // �޷�Ϊ�����ٴθ�ֵ
		final int MAX_SPEED = 120;       // ����������ȫ�ô�д��ĸ������֮���»��߸���
		int r = 4;
		double area = PI * r * r;
		double circle = 2 * PI * r;
		System.out.println("��� = " + area);
		System.out.println("�ܳ� = " + circle);
	}
} 