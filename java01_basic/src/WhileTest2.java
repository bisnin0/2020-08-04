class WhileTest2
{
	public static void main(String[] args) 
	{
/*		
		int cnt = 1;
		while(true){

			while(cnt<=5){
				int a=1;
				System.out.print(a);
				a++;
				cnt++;
			}System.out.println();
		if(cnt==5){
			break;
		}
		}
*/ //��Ǭ��

		int row = 1;
		while(row<=5){//�� 1

			int col=1;
			while(col<=5){
				System.out.print(col);
				col++;
			}System.out.println();
			row++;
		}
		System.out.println("The End.....");



//while���� ������ false�̸� �ѹ��� ������ �ȵ�����
//do while���� ������ false�̶� �ѹ��� ����ȴ�.
	}
}
/*
12345
12345
12345
12345
12345
*/