class Operator05 
{
	public static void main(String[] args) 
	{
		//��Ʈ������ : 2������ ����� �ϴ� ������
		//			&, |, ~(���� = !), ^(EOR = �ΰ��� �ٸ��� �� t,f / f,t = true)

		int a = 10;
		int b = 3;
		int c = a & b;
		System.out.println("c="+c);
		int d = a | b;
		System.out.println("d="+d);
		
		// �����ΰ�� 2�� ������ �����.
		// 2�� ������ 1�� ����+1�� �ϸ� �ȴ�.
		// 1�� ������ 0->1, 1->0
		int e = ~a;
		System.out.println("e="+e);
		
		int f = a ^ b;
		System.out.println("f="+f);

		//����Ʈ������
		// << : �����ʿ��� �������� �̵� , >> : ���������� �̵� 
		// >>> : ���������� �̵�(0���� ä����)    ������������ �̵�
		
		int g = a<<2; // 40  -> * ���ϱ�
		System.out.println("g="+g);

		int h = a>>2; // 2  -> / ������
		System.out.println("h="+h);

		int i = a>>>2; //2
		System.out.println("i="+i);

		a = -10;

		int j = a>>2; 
		System.out.println("j="+j); //3

		int k = a>>>2; 
		System.out.println("k="+k); //61 ������ int������ ����߱⶧���� �ٸ����̳���
		
	
	}
}
