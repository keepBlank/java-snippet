/*
  * �����߼���������÷�
*/
public class TestOperator04{
	public static void main(String[] args){
		boolean b1 = false;
		boolean b2 = true;
		System.out.println(b1&b2); //�룺��һ��false�����Ϊfalse
		System.out.println(b1|b2); // ����һ��true�����Ϊtrue
		System.out.println(!b2);   // �ǣ� ȡ�� �����Ϊfalse
		System.out.println(b1^b2); // �����ͬΪfalse����ͬΪtrue
		
		// ��·�롢��·��
		//int b3 = 3/0;              // �����ܳ���0���쳣
		boolean b3 = 1 > 2 && (4 < 3 / 0);
		System.out.println(b3);      // ��·������false���õ������������ұ߲�ִ�У����Բ�����
		
		boolean b4 = 1 > 2 & (4 < 3 / 0);
		System.out.println(b4);      // ������Ϊ���Ƕ�·�룬������ұ�Ҳִ��
	}
}
