/*
 * ���Լ������룺Scanner�÷�
*/
import java.util.Scanner;

public class TestScanner{
	public static void main(String[] args){
		Scanner  s = new Scanner(System.in);
		
		// �����û��������䡢��н
		System.out.println("�������û�����");
		String uname = s.nextLine();  		    // �ӿ���̨��ȡһ���ַ���
		
		System.out.println("������������䣺");
		int age = s.nextInt();
		
		System.out.println("�����������н��");
		double monthSalary = s.nextDouble();
		
		System.out.println("\n\n\n\n\n\n");
		System.out.println("***************��н������*****************");
		System.out.println("�û���:"+uname);
		System.out.println("���䣺" + age);
		System.out.println("��н" + (monthSalary*12));
	}
}