/* ���� Ǭ Ǯ��
import java.util.Scanner;
class WhileEx2
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		double ran = Math.random();
		int ran2 = (int)(ran*100);
		int count = 0;

		while(true){

		System.out.print("����(1~100) �Է� = ");
		int data = scan.nextInt();

			count+=1;
			if(ran2>data){
				System.out.println(data+"���� ū�� �Դϴ�.");
			}else if(ran2<data){
				System.out.println(data+"���� ������ �Դϴ�.");
			}else{
				System.out.println(count+"��° ����"+ran2+"�� ���߼̽��ϴ�.");
				break;
			}

		}
	}
}
*/
//Ǯ��
import java.util.Scanner;
import java.util.Random;
class WhileEx2
{
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		Random ran= new Random();
//������ ����ؼ� �ݺ��ϰ� �ʹٸ� ���� �κ��� while�� �ݺ���Ų��.
		while(true){
			System.out.println("=========������ �����մϴ�.=========");
			//����
			int ranInt = ran.nextInt(100)+1;// 0~99 +1 ->1~100

			int cnt=0;
			while(true){
				System.out.print("����(1~100)�Է� = ");
				int inData = scan.nextInt();
				cnt++;
				if(ranInt>inData){//������ ū���϶�
					System.out.println(inData+"���� ū���Դϴ�...");
				}else if(ranInt<inData){//�Է¹��� ���� Ŭ��
					System.out.println(inData+"���� �������Դϴ�...");
				}else{
					System.out.println(cnt+"��° ���� "+ranInt+"�� ���߼̽��ϴ�.");
					break;
				}//if

			}//while
		}//while
	}//main

}//class

/*
//����
*************���� ���߱�*************
����(1~100) �Է� =  52
52���� ū�� �Դϴ�.

����(1~100) �Է� =  70
70���� ������ �Դϴ�.

����(1~100) �Է� = 65
65���� ������ �Դϴ�.

����(1~100) �Է� = 62

4��°���� 62�� ���߼̽��ϴ�.

*/