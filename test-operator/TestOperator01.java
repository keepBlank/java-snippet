/*
  * ��������������÷�
*/
public class TestOperator01{
	public static void main(String[] args){
		int a = 3;
		long b = 4;
		//int c = a + b;       // a+b �Ľ����long��long��ֵ��c��int������
		long c = a + b;
		
		double d = 3 + 3.14;  // 3.14��double���ͼ������������double����
		int d2 = 32 / 3 ;     // 2�����������ֱ�ӱ���������������֣�����������
		double d3 = 32.0 / 3; // ������ý�������������ͽ�����һ����ɸ�����
		
		
		System.out.println(d2); // 10
		System.out.println(d3); // 10.666666666666666
		
		// ȡģ����
		int e = 10 % 3;        // ȡ�������������ź���߲�������ͬ
		System.out.println(e); // 1
		
		// �����������Լ�
		int g = 30;
		g++;                  // �൱�ڣ� g = g + 1
		g--;                  // �൱�ڣ� g = g - 1
		
		g = 10;
		int h = g++;	     // ++�ں��ȸ�ֵ������,h=10,g=11
		g = 10;
		int i = ++g;         // ++��ǰ����������ֵ,g=11,i=11
		
		System.out.println(h);  // 10
		System.out.println(i);  // 11
	}
}