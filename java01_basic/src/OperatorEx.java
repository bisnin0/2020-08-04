import java.util.Scanner;
class OperatorEx 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("�޿��Է�=");
		int pay = scan.nextInt();
		double a = pay*0.1;
		double b = pay*0.05;
		double result = (pay>=2000000)?b:a;
		System.out.println("�޿�="+pay);
		System.out.println("���ʽ�="+(int)result);
		double all = pay + result;
		System.out.println("���޾�="+(int)all);
		//���� Ǭ Ǯ��
		

	}
} 

/*
����
import java.util.Scanner;
class OperatorEx
{
	public static void main(String[] srgs)
	{
		Scanner scan = new Scanner(System.in);

		//1. �޿��Է�
		System.out.print("�޿��Է�=");
		int salary = scan.nextInt();
		//2. ���            2000000�̻��϶� 2000000�̸��϶�
		double bonus= (salary>=2000000)?salary*0.05:salary*0.1;
		double payment = salary + bonus;
		//3. ���
		System.out.printf("�޿�=%d\n���ʽ�=%f\n���޾�=%f\n", salary, bonus, payment);
	}

}

*/
/*
�޿��� �Է¹޾� �޿��� 200���� �̸��̸� ���ʽ��� 10% �����ϰ�,
�޿��� 200���� �̻��̸� ���ʽ��� 5%�����ϴ� ���α׷��� �ۼ��϶�

����
�޿��Է�=_____
�޿�=
���ʽ�=
���޾�=

*/