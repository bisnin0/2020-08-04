import java.util.Scanner;
class ForEx03 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("�� �Է� = ");
		int a = scan.nextInt();
		for(int i=2;i<=9;i++){
			int b = a * i;
			System.out.printf("%d * %d = %d\n", a, i, b);
		}
	}
}


/*

�Է¹��� ���� ����ϴ� ���α׷�

����
���Է� = 5
5 * 2 =10
:
:
5 * 9 = 45

*/
