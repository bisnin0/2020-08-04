//java.lang ��Ű�� ���� Ŭ������ �����Ϸ��� �˾Ƽ� �߰��� ���ش�(���� �ȳ־ �ȴ�. ��������)
//lang ��Ű�� ���� �ٸ� Ŭ������ ������ import���� ������Ѵ�.

import java.lang.String; // java��� ��Ű�� �ؿ� lang�� �ְ�, lang��Ű�� �ؿ� String�� ������ �����ض�.
import java.lang.System;

class Operator02 
{
	public static void main(String[] args) 
	{
		int num = 10;
		int data = 5;

		// ��(����) ������ : �⺻������ Ÿ�Կ� ���� �񱳶� String�� ����
		//                >, <, >=, <=, ==(����.), !=(���� �ʴ�.)
		boolean boo = 10 > 5;
		System.out.println("boo="+ boo);

		boolean boo2 = 20 <= num * 10 / 2 + 15 - --data;
		// ��������ڴ� �񱳿����ں��� �켱������ ����.
		// ���������ڴ� ��������ں��� �켱������ ����.
		// --data �� 1��, * / + - 2��, <= 3��
		System.out.println("boo2="+ boo2);


		// ���� ������
		num = -num;
		System.out.println("num="+ num);  // num = -10

		// ���� ������     = ( 1��  )? 2��  : 3��  ;
		//	=(���ǽ�)?���϶�:�����϶�;
		String str = (num  > 0)? "���" : "����" ;
		System.out.println("str="+str);


		// �ֿܼ��� �ܺο��� ������ �Է¹޴°�





	}
}
