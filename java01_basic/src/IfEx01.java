import java.util.Scanner;
class IfEx01 
{
	public static void main(String[] args) 
	{
/*
		Scanner scan = new Scanner(System.in);
		System.out.print("�⵵ = ");
		int year = scan.nextInt();

		
		
		if (year%4==0)
		{
			System.out.println(year + "���� �����Դϴ�.");
		}

		if (year%4!=0)
		{
			System.out.println(year + "���� ������ �ƴմϴ�.");
		}

		if(){
			
		}
*/ //���� Ǭ Ǯ��


	Scanner scan = new Scanner(System.in);
		System.out.print("�⵵ = ");
		int year = scan.nextInt();
		// 4�� ����� �⵵ 100������δ� ������ �ƴϴ�.   <-���� �߰�
		// 400�⿡ �ѹ����� ������ �����̴�.   <- ���� �߰�

/*		boolean result = year%4==0 && year%100!=0 || year%400==0;
		if(result){
			
		}
		if(!result){
			
		}
		�̷������� ���°� �� �����ϴ�.
*/ 


		if(year%4==0 && year%100!=0 || year%400==0){
			System.out.println(year+"�� �����Դϴ�.");
//https://ojs20022002.tistory.com/272 ���� ���� �����ϱ�
//���������>����(��)������>��������(&&>||>!=)
// ����Ȯ��

		}


		if (!(year%4==0 && year%100!=0 || year%400==0))
		{
			System.out.println(year + "���� ������ �ƴմϴ�.");
		}

	

	}
}

/*
�ֿܼ��� �⵵�� �Է¹޾� �������� �ƴ��� �����Ͽ� ����϶�.

����
�⵵ = 2020
2020���� �����Դϴ�.

�⵵ - 2022
2022���� ������ �ƴմϴ�.

*/