import java.util.Scanner;
class DowhileEx
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);

		do{
			System.out.print("�����Է� = ");
		
			int data = scan.nextInt();
			if(data<0){
				System.out.println("���α׷��� ����Ǿ����ϴ�.");
				break;
			} 
			//0���� ũ�ų� ������
			int sum = 0;
			int cnt = 0;
			int hap1 = 0;
			int hap2 = 0;
			do{
				sum+=cnt;
				if(cnt % 2 == 0) hap1+=cnt;
				if(cnt % 2 != 0) hap2+=cnt;
				cnt++;
			}while(data>=cnt);

			System.out.println("1~"+data+"������ ���� "+sum);
			System.out.println("1~"+data+"������ Ȧ���� ���� "+hap2);
			System.out.println("1~"+data+"������ ¦���� ���� "+hap1);
			
		}while(true);

	}
}

/*
==�ݵ�� while �Ǵ� do~while��==
== 0���� �������� �ԷµǸ� ���α׷��� ����ȴ�.==
����
�����Է� = 100
1~100������ ����5050
1~100������ Ȧ���� ���� 2500
1~100������ ¦���� ���� 2550

�����Է� = 150
1~150������ ����5050
1~150������ Ȧ���� ���� 2500
1~150������ ¦���� ���� 2550

�����Է� = -1(�����̸�)
���α׷��� ����Ǿ����ϴ�.

*/