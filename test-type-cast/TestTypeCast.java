/*
 * ��������ǿ��ת�� 
*/
public class TestTypeCast{
	public static void main(String[] args){
		double a = 3.141592654;
		int b = (int)a;        // ������ǿתΪ������ֱ�Ӷ�ʧС������                
		System.out.println(b); // 3
		
		int c = 97;
		char d = (char)c;
		System.out.println(d);  // 'a'
		
		// ǿ��ת�ͣ������˱�ʾ�ķ�Χ�����ת��һ����ȫ��ͬ��ֵ
		byte b1 = (byte)300;
		System.out.println(b1); // 44
		
		// ���Գ�������֮���
		int money = 1000000000; // 10��
		int years = 20;
		// ����total�Ǹ���������int�ķ�Χ
		int total = money*years;
		System.out.println("total=" + total);
		// ����total1�Ǹ���,�˻�����int������ֵΪ200�ڣ��Ѿ������int������ʾ��Χ
		long total1 = money*years;
		System.out.println("total1=" + total1);
		//����total2��ȷ���Ƚ�һ�����ӱ��long���������ʽ����������ȫ����long������
		long total2 = money*((long)years);
		// 1���long���ͣ��������long����
		long total2 = 1L*money*years
		System.out.println("total2=" + total2);
	}
}