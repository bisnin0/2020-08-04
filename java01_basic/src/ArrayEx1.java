class ArrayEx1 
{
	public static void main(String[] args) 
	{
		int numArr[] = new int[102]; //index�� 0���� 101���� ���������.
		//������ �����Ͽ� �迭�� �߰�, index 100�� ��ġ�� ���� ����
		for(int idx=0; idx<numArr.length-2; idx++){ // -2�� ���� = 100����� 101��°�� �հ�� ����� ������ �������� ���Ŵ�.

			numArr[idx] = (int)(Math.random()*1000)+1; //1~1000

			numArr[numArr.length - 2] += numArr[idx];	
			//���ڴ� 102���ε� idx�� 0����101�����ϱ� idx�� �����Ϸ��� 100��°���� ������102 -2

		}
		numArr[numArr.length - 1] = numArr[numArr.length - 2] / (numArr.length-2); //���
		
		for(int i=0; i<numArr.length; i++){ //0~101
			if(i==numArr.length-2){
				System.out.println("\n�հ�="+numArr[i]);
			}else if(i==numArr.length-1){
				System.out.println("\n���="+numArr[i]);			
			}else{
			System.out.print(numArr[i]+"\t");
			}
		}
/* ����Ǭ��
		int[] arr = new int[100];
		
		int sum = 0;

		for(int idx=0 ; idx< arr.length; idx++){
			double ran = Math.random();
			int ran2 = (int)(ran*1000)+1;
			arr[idx] = ran2;
			sum += arr[idx];
			System.out.print(arr[idx]+"\t");
				if((idx+1)%5==0){
					System.out.println();				
				}
		}System.out.println();
		System.out.println("�հ� = "+sum);
		System.out.println("��� = "+sum/100);
*/
	}
}

/*
�迭�� ����(1~1000)������ ���� 100�� �����ϰ�
�迭�� ���� �հ�� ����� ���϶�.

����
1	34 4343 343

..
..

�հ� = ____
��� = ____

*/
