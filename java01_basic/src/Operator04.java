import java.util.Scanner;
class Operator04
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);

		System.out.print("�����Է�:");
		int inData = scan.nextInt();
		// and : &&, or : ||, not = !
		String result = (inData>=1 && inData<=100)?" �ֽ��ϴ�":" �����ϴ�";
		System.out.println(inData+"�� ���� ���� ����"+result);

	}
}


/*
����
�����Է�:59

59�� ���� �������� �ֽ��ϴ�.
-38�� ���� �������� �����ϴ�.
0�� ���� �������� �����ϴ�.

*/
 /*
 ����
 ������ �Է��ϼ���. (1~100���̼���)
 �Է�: 500, 5, -5

 ������ 1<=x<=100
 �ڵ����� x>=1  x<=100 �� �ΰ��� ������ �� �����Ҷ� 
	   true	   true   => �� �� ��. 
	   true    false  
	   false   true
 ���������� : &&(and)�� �� ���̾�� ��, or(||) : �� �� �ϳ��� ���̸� ��, not(!) : ���� �������� ������ ������ �ٲ۴�.
           ������ && > || > !
       
	   ���������>���迬����>����������
 */
 