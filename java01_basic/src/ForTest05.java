class ForTest05
{
	public static void main(String[] args) 
	{
		// break : �ݺ��� ����
		// continue : �ݺ��� �ѹ� �ǳ� �ٱ�
		int sum = 0;
		for(int i=1; i<=1000; i++){
			sum += i;
			if(sum>1000){
				System.out.println(i+"-->"+ sum);
//				break;
				continue;
				
			}
			System.out.println("aaaaaaaaa");  //�� �ڿ� ���������� Ȯ��
		}
		System.out.println("end...");
	}
}

/*
break; �ݺ��� ����
continue; -> �ѹ� �ǳʶڴ�.
for(i=1;i<=1000;i++){
//	break; // �׳� �ݺ����� ������.
	if(i==100){
//		break; //i�� 100�϶� �ݺ����� �ߴ��ϰ� 1000���� ������ ���ƶ�.
		continue; //i�� 100�϶� �ǳʶٰ� 101���� �ݺ����� �����ض�.
	}



}

*/