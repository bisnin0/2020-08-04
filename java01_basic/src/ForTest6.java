class ForTest6
{
	public static void main(String[] args) 
	{
		for(int i=1; i<=5 ; i++){//5��
			for(int j=1; j<=5 ; j++){
//				System.out.print(i+"\t");//25��
//				System.out.print(j+"\t");
				System.out.print("*");
			}
			System.out.println(); //�ٺ���
		}

		/*
		*
		**
		***
		****
		*****


		
		*/
		System.out.println();


		for(int i=1; i<=5; i++){
			for(int j=1; j<=i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		/*
		*****
		****
		***
		**
		*
		*/
		System.out.println();


		for(int i=5; i>=1; i--){
			for(int j=1; j<=i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		/*
		    *
		   **
		  ***
	  	 ****
		*****

		*/

		String msg = " ";
		
		for(int i=1; i<=5; i++){ 
//			for(int j=1; j<=i; j++){ Ʋ���κ�
				for(int k=4; k>=i; k--){
					System.out.print(msg);
					
				}	
				for(int j=1; j<=i; j++){
					System.out.print("*");
					}
				

//			}
				System.out.println();

		}
 //������ �������ϱ�

 //Ǯ�� 
 		for(int i=1; i<=5; i++){//1 2 3 4 5
			//����
			for(int space=1; space<=5-i ; space++){
				System.out.print(" ");
			}
			//��
			for(int j=1; j<=i; j++){
				System.out.print("@");
			}
			System.out.println();
		}

		/*
		*****
		 ****
		  ***
		   **
		    *
		*/
		for(int i=1; i<=5; i++){
			for(int space=4; space>=i; space--){
			System.out.print(" ");
			}
			for(int j=1; j<=i; j++){
			System.out.print("*");
			}
			
			System.out.println();

		}
// �߸��� ����Ǯ��. Ȯ��





		for(int i=5; i>=1; i--){//5, 4, 3, 2, 1
			//����
			for(int s=1; s<=5-i; s++){
				System.out.print(" ");
							
			} 

			//��
			for(int j=1; j<=i; j++){
				System.out.print("%");
			}
			System.out.println();
		}
		//Ǯ��

		/*
		      *
			 ***
			*****
		   *******
		  *********
		*/
		int a = 5;
		for(int i=1; i<=10; i+=2){ 
				a = a- 1;
			//����
			for(int s=1; s<=a; s++){
				System.out.print(" ");
			}
			//��
			for(int j=1; j<=i ; j++){
				System.out.print("*");
			} 
			System.out.println();
		}	
		
		//Ǯ��
		
		for(int i=1; i<=9; i+=2){// 1,3,5,7,9
			//����					//4,3,2,1,0
			for(int s=1; s<=(9-i)/2;s++){
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++){
				System.out.print("$");
			}
			System.out.println();
		}

		/*
		*********
		 *******
		  *****
		   ***
		    *
		���������� �غ���
		
		*/
					

	}
}

/*
��ø�ݺ��� : �ݺ������� �ݺ���

���� 
1	2	3	4	5
1	2	3	4	5
1	2	3	4	5
1	2	3	4	5
1	2	3	4	5


*/
