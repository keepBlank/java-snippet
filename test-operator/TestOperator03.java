/*
  * ���Թ�ϵ��������÷�
*/
public class TestOperator03{
	public static void main(String[] args){
		int a = 3;
		int b = 4;
		boolean c = a > b;
		System.out.println(c);                    // false
		
		char d = 'h';
		System.out.println((int)d);              // charֵλ��0~65536֮�䣬����ͨ��intǿ��ת�ͳ�����   14
		boolean e = d > 100;
		System.out.println(e);                   // true
	}
}
