/*
 * ���Ը������Ļ����÷�
*/
public class TestFloatNumber{
	public static void main(String[] args){
		double d1 = 3.14;
		double d2 = 3.14E2;    // ��ѧ������
		
		float f1 = 1.65F;      // ���㳣����Ĭ��������double����float������Ҫ��f
		
		// �������ǲ���ȷ�ģ�������Ҫֱ�ӱȽ�
		float f2 = 0.1F;
		double d3 = 1.0/10;
		System.out.println(f2 == d3);   // false
		
		float f3 = 123123123123L;
		float f4 = f3 + 1;
		System.out.println(f3 == f4);   // true
		System.out.println(d2);
	}
}