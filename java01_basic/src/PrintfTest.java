public class PrintfTest
{
	//static public void main(String[] args) ����
	//public static void main(String args[]) ���� 
	//public static void main(String data[]) ����
	//main �޼ҵ�� ���α׷��� ������ �˸��� �߿��� �޼ҵ�
	
	//public static void mainTest(String[] args) <���θ޼ҵ尡 ��� ������
	public static void main(String[] args)
		//�޼ҵ�� �ҹ��ڷ� �����Ѵ�. �빮�ڷ� �����ϴ°� Ŭ������ final ��� �Ѹ�
		
	{
		//
		String msg = "�ι�° �ڹٰ�����...";
		System.out.println(msg);

		// printf() : ��� ������ �������� �����Ѵ�.
		// double result = 10 / 3;       // �ΰ� �� ������ ������ ���� ���ͼ� ����� 3�̳��´�.
		double result = 10 / (double)3;      //�ϳ��� �Ǽ��� ��ȯ(typecasting)�ؼ� ���� + �Ǽ� : �Ǽ��� ���´�.
		// double result = 10 / 3.0; // �����Ͱ� ������������ .0�� �� �Ǽ��� ��ȯ 
		System.out.println("result="+ result);

		// ������ �����ϴ� �⺻ ������ ������ ����, �Ǽ�, ���ڿ�
		int numInt = 1234;
		String userName = "ȫ�浿";
		// ���� format : %10d = �� 10�ڸ��� ǥ���ض�
		System.out.printf("numInt(����)=%10d\n",numInt);
		// ^^^^^^1234 <��°��� �̷��� �����Ǵ°� ����.(^:����)
		
		// �Ǽ� format : %10.2f (��ü 10�ڸ��߿� �Ҽ����� 2�ڸ��� ǥ���ض�)
		System.out.printf("result=%10.2f\n", result);

		// ���� fotmat : %10s = �� 10�ڸ��� ǥ���ض�
		System.out.printf("�̸�=%10s",userName);
		
		System.out.println();
		// �ѹ��� ���� ������ ���
		System.out.printf("%6.1f, %7d, %5s\n", result, numInt, userName);

		// * �����
		// �̸� ��� : �� �̸��� "ȫ�浿"�Դϴ�.
//		System.out.printf("�� �̸���"%s"�Դϴ�." );  // %s ���� ���� �ȳ����� �����Ͱ���ŭ ���
								//"" %s "" ����ǥ�� ���°ɷ� ��޵�
		System.out.printf("\t�� �̸���\"%s\"�Դϴ�.\n", userName);  // \(�齽����)
		// ����� : \", \', \n (newline : ���� �ٲ�� ln������), \t (tab : �ѹ� �Է��Ҷ����� 8ĭ �̵�)

		// �̸���� : �� �̸��� \ȫ�浿\�Դϴ�.
//		System.out.printf("\t�� �̸���\%s\�Դϴ�.\n", userName);  //�̷��� �Է��ϸ� \���� %�� ����ڰ� �Ǿ� ����� ��� �ȵȴ�.
		System.out.printf("\t�� �̸���\\%s\\�Դϴ�.\n", userName); 

		
	}
}
