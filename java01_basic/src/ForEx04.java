import java.util.Scanner;
class ForEx04 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("�� �Է� = ");
		int max = scan.nextInt();
		int i=0, sum=0, oddsum=0, evensum=0; // �ѹ��� �����ϴ°� ����ϴ�.
		for(i=1;i<=max;i++){ //1,2,3,4,....max
			sum += i; //��ü��
			if(i%2!=0){
				oddsum +=i;
			}else{
				evensum +=i;
			}
			
		} 
		System.out.println("1~"+max+"������ ����"+sum);
		System.out.println("1~"+max+"������ Ȧ���� ����"+oddsum);
		System.out.println("1~"+max+"������ ¦���� ����"+evensum);

	}
}


/*
���(����)�� �Է¹޾�
�Է¹��� ������ ¦���� ��, Ȧ���� ��, ��ü���� ���Ͽ���.

����
���Է� = 100
1~100������ ���� 5050
1~100������ Ȧ���� ���� 2500
1~100������ ¦���� ���� 2550

*/