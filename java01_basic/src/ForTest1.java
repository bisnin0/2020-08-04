class ForTest1
{
	public static void main(String[] args) 
	{
		//�ݺ���
		//1~10���� ����ϴ� ���α׷� �����
		for(int i=1; i<=10 ;i++){
			System.out.print("A");

		}

/*		for(int j=1;;j=j+10){
			System.out.println("Test->"+ j);
		} // ���ѷ���

*/
		System.out.println();
		//1~100���� ¦���� ���
		for(int i=1 ; i<=100; i++){
			if(i%2==0)System.out.println(i);
		}

		for(int i=2; i<=100; i+=2){// i=i+2
			System.out.println(i);
		}
		
		for(int i=10;i>=1;--i){ //i--, --i, i=i=1, i-=1
			System.out.println("i="+i);
			
		}


	}
}

/*
	: 
		 �ʱⰪ     ������(���ǽ� true, false������ ����)  ������
	for( int i=1 ;              i<=10          ;  i  ){
		// �� �ʱⰪ i�� for�� ��ȣ �ȿ����� ���ǰ� ����� ��������.(��������)
		// �������� i++, ++i, i=i+1, i+=1
		System.out.println(i);


	} // �ʱⰪ�� ������ ���ǽ� ������ �����Ҷ� ��ȣ ���� ������ ���� �� ó������ ���ư��� �������� ���� �� �� �����.
	  // �ݺ��ϴ� ���ǽ��� �������� �ʰԵǸ� for���� ������ �̰����� ���´�.



����
1
2
3
4
5
:
10





10
9
8
:
1

*/


