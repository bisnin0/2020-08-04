package javaAPI;
import java.util.Scanner; // lang ���� Ŭ������ ������ import

class ScannerTest    //���� Scanner�θ� ���� API���ִ� Scanner�� ����� �� ������ ����. ���� ���� Scanner�� �켱�̵� 
{
	public static void main(String[] args) 
	{
		// Scanner : �ֿܼ��� ����, ���ڸ� �Է¹��� �� �ִ� Ŭ����
		//1. Ŭ�������� ���������� ���(��ü�� ������ �ʰ� ���)
		//2. ��ü�� �����Ͽ� ����ϴ� ���
		// new : ��ü�� �����ϴ� Ű����(����� : �̸� ����� ����������)
		
	
		

		Scanner scan = new Scanner(System.in);
		System.out.print("�����Է�=");
		int data = scan.nextInt();  //���ڷ� �Է¹޾� ������ �ٲ��ִ� �޼ҵ�
			// int���� ���� ���� �Է¹޾ƶ�.int�� �Է¹����� data�� int
			// nexInt() -> int, nextdouble() -> double, 
			// next() -> �Ѵܾ ���ڷ� �о��
			// nextLine() -> 1���� ���ڷ� �о��

		// 1,2,3,4,5,6,........ 
		// ¦���� ���Ϸ��� 2�� ������ 0�� ������ �ȴ�. 
//		String result = (data%2==0)?"¦��":"Ȧ��"; //���ڿ��̴� String .. ���׿����� ¦�� Ȧ�� ���ϴ¹��
		String result = (data/2==data/2.0)?"¦��":"Ȧ��";
		// 10/2 10/2.0 5�� 5.0 �����Ǽ��� �ٸ����� ���� ���� ���̴�.
		// 9/2  9/2.0 4�� 4.5�� �ٸ��� �����ϱ� �ٸ����̴�.


		
	
		System.out.println(data+"�� "+ result+"�Դϴ�.");
		

		// new�� Scanner ��ü�� �������ְ� �̰� scan������ �������ش�. ���⼭ ��ü�� ������� ������ scan�� ���۷���������� �Ѵ�.



	}
}
