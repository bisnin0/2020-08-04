import java.util.Scanner;
class ForEx07 
{
	public static void main(String[] args) 
	{
	
		Scanner scan = new Scanner(System.in);
		System.out.print("Ȧ���Է� = ");
		int data = scan.nextInt();
		
		String msg = " ";
		char al = 'A';		

		for(int i=1; i<=data; i+=2){

			for(int j=1; j<=(data-i)/2 ; j++){
				System.out.print(msg);
			}
			for(int k=1; k<=i; k+=1){
				System.out.print(al++);
				if(al>'Z')al='A';

			}System.out.println();	
		}

/* �����ϴ���
		//������
		for(int i=1; i<=data-2; i+=1){
			//����
			for(int j=1; j<=i; j+=1){
				System.out.print(msg);
			}
			for(int k=1; k<=(data-i)/2 ;k++){
				System.out.print(al++);
				if(al>'Z')al='A';
			}System.out.println();


			//����
		}
*/		
		for(int i=data-2; i>=1; i-=2){ //9,7,5,3,1 �� ������ �� �����ϱ�
			//����
			for(int s=1; s<=(data-i)/2 ; s++){
				System.out.print(" ");
			}
			//����
			for(int j=1; j<=i; j++){
				System.out.print(al++);
				if(al>'Z') al='A';
			}System.out.println();


		}
	}
		
	}
		
/*
//Ǯ��
		Scanner scan = new Scanner(System.in);
		System.out.print("Ȧ���Է� = ");
		int max = scan.nextInt();
		if(max%2==0){//¦���� Ȧ���� ����
			max++;
		}
		char txt ='A';//����� �������� �ʱⰪ

		for(int i=1; i<=max; i+=2){ //1,3,5,7,9, ... max �Է��� ���� �� ����
			//����
			for(int s=1; s<=(max-i)/2; s++){ //�¿�� ������2
				System.out.print(" ");
			}

			//����

			for(int j=1; j<=i; j++) { //1
				System.out.print(txt++);
				if(txt>'Z') txt='A';
				
			}System.out.println();


//���� Ǯ��
		for(int i=max-2; i>=1; i-=2){ //9,7,5,3,1
			//����
			for(int s=1; s<=(max-9)/2 ; s++){
				System.out.print(" ");
			}
			//����
			for(int j=1; j<=i; j++){
				System.our.print(txt++);
				if(txt>'Z') txt='A';
			}


		}


		} 
		
*/

	
	



/*
����
Ȧ���Է� = 11
		
		  A
		 BCD
		EFGHI
	   JKLMNOP
	  QRSTUVWXY
     ZABCDEFGHIJ   //11��
  	  KLMNOPQRS
	   TUVWXYZ
	    ABCED
		 FGH
		  I



*/
