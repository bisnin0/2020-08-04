class ArrayEx3_2
{
	public static void main(String[] args) 
	{
		int arr[][] = new int[10][10];

		for(int r=0; r<arr.length; r++){
			for(int c=0; c<arr[r].length; c++){
				if(r==c || r+c==arr.length-1){arr[r][c] += 100;};/*�࿭�� ũ�Ⱑ �޶����� �۵��� �� �ְ� ���̷�*/
//				if(r+c==9){arr[r][c] += 100;}; //0~9��. 9���̴�.
			}
		}




		for(int r=0; r<arr.length; r++){
			for(int c=0; c<arr[r].length; c++){
				System.out.print(arr[r][c]+"\t");
			}
			System.out.println();
		}
		


	}
}
