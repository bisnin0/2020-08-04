import java.util.Scanner;
class OperatorEx2 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
			System.out.print("�޴�(1:�簢���� ����, 2:�簢���� �ѷ�) = ");
			int data = scan.nextInt();
			System.out.print("�غ� = ");
			int data2 = scan.nextInt();
			System.out.print("���� = ");
			int data3 = scan.nextInt();

			String result = (data==1)?"�簢���� ���̴� = "+(int)data2*(int)data3:"�簢���� �ѷ��� = "+((int)data2+(int)data3)*2;
			System.out.print(result);

			//���� Ǭ Ǯ��
			//������ �Է�->���->��� ������Ű��.
			
	


	}
}

/*
����
import java.util.Scanner;
class OperatorEx2 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		//1. ������ �Է�
		System.out.print("�޴�(1:�簢���� ����, 2:�簢���� �ѷ�) = ");
		int menu = scan.nextInt();
		System.out.print("�غ�->");
		int width = scan.nextInt();
		System.out.print("����->");
		int height = scan.nextImt();


		//2. ���
		int	result = (menu==1)? width&height : (width+height)*2;
		String msg = (menu==1)? "����" : "�ѷ�";
		//3. ���
		System.out.printf("�簢���� %s�� %d\n", msg, result);

	}
}
*/

/*
�� ���� �Է¹޾� �簢���� ���� �Ǵ� �簢���� �ѷ��� ���϶�
�簢���� ���� = �غ�(����) * ����(����)
�簢���� �ѷ� = (�غ�+����) * 2

���� 
�޴�(1:�簢���� ����, 2:�簢���� �ѷ�)-> 1
�غ� ->
���� ->
�簢���� ���̴� ___

�޴�(1:�簢���� ����, 2:�簢���� �ѷ�)-> 2
�غ� ->
���� ->
�簢���� �ѷ��� ___

*/