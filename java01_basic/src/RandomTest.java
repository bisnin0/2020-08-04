class RandomTest 
{
	public static void main(String[] args) 
	{
		// ���� ����
		// 0.0~1.0 ������ ���� �������ش�.
		// java.lang �ȿ� ������ import�����൵�ȴ�.
/*
		double ran = Math.random();
		System.out.println(ran);

// Scanner. �� �ȵǴ� ����
// API ���� ���� static�� ���� �͵��� Math.PI ������ .�̺���
// Scanner�� String�� ���� static�� �Ⱥ����͵��� �ִµ� �̷��͵��� .�� �Ⱦ���.

		int ranInt =(int)(ran*100);
		System.out.println(ranInt);
*/

		for(int i=1; i<=1000; i++){
			double ran = Math.random();
//			int ranInt =(int)(ran*100); //100�� ���ϸ� 0~99���� 100��, 50�� ���ϸ� 0~49������ 50��
			//1~100���̸� ����� �ʹٸ�
//			int ranInt =(int)(ran*(100-1+1))+1; //1~100���̸� ����� �ʹٸ� (����)(����*(ū��-������+1)) +������
			//51~100���� ����� �ʹٸ�
			int ranInt =(int)(ran*(100-51+1))+51;
			System.out.print(ranInt+"\t");
		}

	}
}
