/*
 ���������Զ�ת��
*/
public  class  TestTypeAutoConvert{
	public static void main(String[] args){
		// ����С�����Ϳ����Զ�ת���������������
		int a = 1234;
		long b = a;
		//int c = b;              // long���Ͳ����Զ�ת����int
		double d = b;             // longתdouble��ת��ֻ�ǿ��ܻᶪʧ����
		float f = b;              // long��תfloat,ֻ�ǿ��ܻᶪʧ����
		
		
		// ���������ͳ�����int���ͣ����ǿ����Զ�ת�ɣ�byte/short/char
		// ֻҪ��������Ӧ���͵ı�����Χ
		byte b1 = 123;
		//byte b2 = 1234           // int�Զ�תbyte����ʧ�ܣ���Ϊ1234������byte�ɱ�ʾ�ķ�Χ
		
		char h3 = 97;
		System.out.println(h3);    // a
	}
}