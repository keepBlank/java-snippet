/*
  * ����λ��������÷�
*/
public class TestOperator05{
	public static void main(String[] args){
		int a = 7;
		int b = 8;
		System.out.println(a & b);         // ��λ�룺0 0 0 0                             ����� 0
		System.out.println(a | b);         // ��λ��1 1 1 1                             ����� 15
		System.out.println(a ^ b);         // ��λ���(��ͬfalse��0����ͬtrue 1) 1 1 1 1  ����� 15
		System.out.println(~b);            // ȡ����0 1 1 1 (���룬�ݲ�������)            �����-9
		
		// ��λ
		int c = 5 << 1;                    // ����һλ��2���൱��5*2
		int d = 5 << 2;                    // �൱��5*2*2      
		System.out.println(c);             // 10
		System.out.println(d);             // 20
		System.out.println(40>>3);         // ����һλ����2���൱�� 40 / 8 = 5
	}
}
