import java.util.Scanner;
class SwitchEx2 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("���� = ");
		int a = scan.nextInt();
		System.out.print("���� = ");
		int b = scan.nextInt();
		System.out.print("���� = ");
		int c = scan.nextInt();

		int total = a+b+c;
		double ave = total / 3;
		String grade ="";
		double d = ave*0.1; 
		//int d = (int)(ave/10);
		//switch(d)
		if(ave>=0 && ave<=100){
			switch((int)d){
				case 10: 
				case 9:
					grade="A";
					break;
				case 8:
					grade="B";
					break;
				case 7:
					grade="C";
					break;
				case 6:
					grade="D";
					break;
				default:
					grade="F";		
				}
				

			}
			System.out.printf("����=%d\n���=%f\n����=%s\n", total, ave, grade);

			
/*



*/




	}
}

/*
3������ ������ �Է¹޾� ����, ���(�Ǽ�), ����(�Ǽ�)�� ����϶�.
90~100 A
80~89 B
70~79 C
60~69 D
0~59 F
���� ������ switch�� ���Ѵ�.

����=
����=
����=
����=
���=
����=
*/
