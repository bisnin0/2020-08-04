import java.util.Scanner;
class IfElseEx01 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("�޴�(1.�簢���� ����, 2�� ���� ����) = ");
		int data = scan.nextInt();
		int result = 0;
		if (data==1) //1
		{
			System.out.print("�غ� = ");
			int a = scan.nextInt();
			System.out.print("���� = ");		
			int b = scan.nextInt();
			result = a*b;
			System.out.print("�簢���� ���̴� "+ result+"�Դϴ�.");
				
		}else{  //1�̿��� ��
			if(data==2){ //2�� ����������
				System.out.print("������ = ");
				double a = scan.nextDouble();
				double b = 3.14;
				//double result2 = a*a*b;
				double result2 = a*a*Math.PI;
					//Math.PI = ������

				System.out.print("���� ���̴� "+ result2+"�Դϴ�.");	
			
			}else{ //1,2�� ������ �޴��϶�..
				System.out.println("�޴��� �߸� �����Ͽ����ϴ�..");

			
			}
			
			
			
			
		
		}
		
		
			

	}
}


/*
����
�޴�(1:�簢���� ����, 2�� ���� ����)-> 1
�غ� = 
���� = 
�簢���� ���̴� ____�Դϴ�.

�޴�(1:�簢���� ����, 2�� ���� ����)-> 2
������ = 
���� ���̴� ____�Դϴ�.



*/