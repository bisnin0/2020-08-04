class Operator01
{
	public static void main(String[] args) 
	{
		// ��������� : +, -, *, /, %(�������� ���ϴ°�)
		int num1 = 25;
		int num2 = 4;
		
		int result = num1 + num2;
		System.out.printf("%d + %d = %d\n", num1, num2, result);   //������ �������� ������ ������ �״�� ���

		int mod = num1 % num2; //25�� 4�� ���� ������.. 1�� ����� �������̴� int
		System.out.printf("%d %s %d = %d\n", num1, "%", num2, mod);                     // %%�־ �ǳ�?

		// ���������� : ++(1�� ����), --(1�� ����)
		num1++;			// num1 = num1 +1;   num1+=1; �� �� ���� �����ε� ++�� ���� ���̾�
		System.out.printf("++ = %d\n", num1);	 // ������� 25���� 1 ���� 26�� ����

		num1--;		//num1 = num1-1;   num1-=1; ���� ����
		System.out.printf("-- = %d\n", num1);

		int a = 10;
		int b = 5+ a++;
		int c = 5+ ++a;
		int d = 9+ --a;
		int f = 7+ a--;
		System.out.printf("a=%d, b=%d, c=%d, d=%d, f=%d\n", a, b, c, d, f);

		int r1 = num1++ + 7 - 3; //num1=26 ,r1=29    ++�� �ڿ������� ���� 25+7-3�� ��� �� num�� 1�� ���Ѱ��� �������� �ѱ��.
		System.out.printf("num=%d, r1=%d\n", num1, r1);

		// ���Կ����� : +=, -=, /=, *=, %=
		num1 /=3;   // num1 = num1 / 3; ���� ���̴�.
		// int r2 = num1 / 3; �̷��� ���� �ƴ� �ٸ� ������ ����ִ°� ���Կ����� ������.
		System.out.printf("num1/=3 --> %d\n", num1);

	}
}
