class ArraySelectionSort
//�������� ���� Ǯ��
{
	public static void main(String[] args) 
	{
		int ran[] = new int[10];
		//���� ����
		System.out.println("=========������=========");
		for(int i=0; i<ran.length; i++){
			ran[i] = (int)(Math.random()*(100-1+1))+1;
			System.out.print(ran[i]+"\t");
		}//for
		//				10-1
		for(int i=0; i<ran.length-1; i++){//0,1,2,....8
			//   i�� 5�� 6���� ���.. �迭�� ���̺��� ����������(0����~)
			for(int j=i+1; j<ran.length; j++){
				if(ran[i] < ran[j]){
					int temp = ran[j];
					ran[j] = ran[i];
					ran[i] = temp;
				}
			}
		}//for
		
		System.out.println("\n========������========");
		for(int i=0; i<ran.length; i++){
			System.out.print(ran[i]+"\t");
		}
	}
}
