/*
 * ����char���͵�ʹ��
*/
public class TestChar{
	public static void main(String[] args){
		char c1 = 'a';
		char c2 = '��';
		char c3 = '\u0082';  // /u��ʾUnicode�ַ���
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		// Java���ַ������ǻ����������ͣ�����һ����
		String str = "ƽ��ϲ��";
		System.out.println(str);
		
		// ת���ַ�
		System.out.println("\"a\"\n\"b\"\nc\nd\ne\nf\ng");
		System.out.println("q\tw\te\tr");
	}
}
