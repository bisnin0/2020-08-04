import java.util.Scanner;
class WhileEx1
{
	public static void main(String[] args) 
	{

		Scanner scan = new Scanner(System.in);
		System.out.print("������ �� = ");
		int data = scan.nextInt();
/*
		int sum = 0;
		int a = 0;
		while(sum<=data){
			a = a+1;
			sum=sum+a;
			}
*/
			
		
//////////

		int sum = 0;
		int a = 1;
		while(true){
			a = a+1;
			if(sum<=data){
				System.out.println("1���� "+a+"������ ����"+sum+"�̴�");
				sum += a;
				break;

			}

		}

//		System.out.print("1���� "+a+"������ ����"+sum"�̴�");
//		System.out.printf("1���� %d������ ���� %d�̴�", a, sum);
	}
}
