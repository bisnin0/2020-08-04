import java.util.Scanner;
class IfElseIf01 
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
		
		double total = a+b+c;
		double ave = total/3;
		char grade;
		if(ave>=90 && 100>=ave){
			grade = 'A';
		}else if(ave>=80 && ave<90){
			grade = 'B';
		}else if(ave>=70 && ave<80){
			grade = 'C';
		}else if(ave>=60 && ave<70){
			grade = 'D';
		}else if(ave>=0 && ave<60){
			grade = 'F';		
		}else{
			grade = 'X';
		}
		//���⼭ else�� ������ ������ ����.
		//char grade ���� ���� ���� �����ε� else�� ������ ���� ���� ����϶�� �ϴ� ��찡 ����
		//else �� ���� �������� grade�� �ʱⰪ�� ������ �ȴ�. char grade='X';



		//���
		if(grade!='X'){
			System.out.printf("����=%f\n���=%f\n����=%s", total, ave, grade);
		}else{
			System.out.println("������ �߸��Է��Ͽ����ϴ�.");
		}


//		System.out.println("���� = " + total);
//		System.out.println("��� = " + ave);
//		System.out.println("���� = " + grade);

	}
}

/*
3������ ������ �Է¹޾� ����, ���(�Ǽ�), ����(�Ǽ�)�� ����϶�.
90~100 A
80~89 B
70~79 C
60~69 D
0~59 F
����
����=
����=
����=
����=
���=
����=
*/

/*
	if~elseif��

	if(���ǽ�){
		���๮;
	
	}else if(���ǽ�){
		���๮;
	
	}else if(���ǽ�){
		���๮;
	
	}else(���ǽ�){//�׿� ó��
		���๮;
		
	} // if�� ��ȣ ������� �ѹ���. �߰��� ���� �����Ǹ� �� ���� elseif���� �� �������� ����


*/

