class ForTest2 
{
	public static void main(String[] args) 
	{
		int sum = 0; //���������϶� �ڹٴ� �ʱⰪ�� ������ null�̴�. ����. �ݵ�� �ʱ�ȭ �ؾ��Ѵ�.
		// i�� for�� �ۿ��� ���� ������ ���⿡ int i =0; ���� �ϰ� for�� �տ� i=1 ���ش�

		 int i=0;
		 for(i=1;i<=100;i++){
//		for(int i=1;i<=100;i++){
			sum += i;			
		}		
		System.out.println(sum);
		System.out.println("1~"+(i-1)+"������ ���� "+sum);
		//�̷��� ���� i�� for���� ������ i++�� ���� 101�� �Ǳ⶧���� -1�������
		// (i-1)
	}
}



/*
1~100���� ���� ��? 5050


*/