import java.util.Scanner;
class IfEx02 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("ù��° �� = ");
		int first = scan.nextInt();
		System.out.print("�ι�° �� = ");
		int second = scan.nextInt();

		if(first>0 && second>0){
			System.out.println("�� ���� ��� �Դϴ�.");
			System.out.println(first+"+"+second+"="+(first+second));
			System.out.println(first+"-"+second+"="+(first-second));
			System.out.println(first+"*"+second+"="+(first*second));
			System.out.println(first+"/"+second+"="+(first/second));			
		}
		if(first<0 || second<0){
			System.out.println("�Է� ���� ������ ���ԵǾ� �ֽ��ϴ�.");
		}
	}
}


/*
�ݵ�� if���� ���
�� ���� �Է¹޾� �� ���� ��� �϶��� ��Ģ������ �Ͽ� ����϶�.

����
ù��° ��=6
�ι�° ��=4
6 + 4 = 10
6 - 4 = 2
6 * 4 = 24
6 / 4 = 1


*/