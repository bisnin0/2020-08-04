class Array4 
{
	public static void main(String[] args) 
	{
		//�迭�� ����

		//�迭�� ���� �� �迭�� ũ�⸦ ������ �� ����.

		int arr[] = {56, 15, 78, 69, 86, 42, 99}; //0~6  7��
		
		//arr�� ���� arr2�� �����ϴ¹��

		int arr2[] = new int[20]; 

		//----arraycopy?(Object src, int srcPos, Object dest, int destPos, int length)----
		//				�����迭	  , ������� index, Ÿ�ٹ迭��   , ������ġ		, ����
		System.arraycopy(arr, 2, arr2, 0, 4 ); //arr�迭�� 78���� arr2�� �����ؼ� �ִ´�. arr2�� 0�� ��ġ���� 4����
		for(int i=0; i<arr2.length; i++){
			System.out.println("arr2["+i+"]="+arr2[i]);
		}
		System.out.println("=================================");
		
		//Ȯ��� for��
		//	�迭�� ������Ÿ�� ���� : �迭��
		for( int data	 	: arr ){
			System.out.println(data);
			
		}//for

	}
}
