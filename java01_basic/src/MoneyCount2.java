import java.util.Scanner;
class MoneyCount2
{
	public static void main(String[] args) 
	{
		
		Scanner scan = new Scanner(System.in);
		System.out.print("�ݾ��� �Է��ϼ���.");
		int money = scan.nextInt();
		
		int won = 50000;
		int danwi = 5;

		while(won>=10){
			int cnt = money / won;
			if (cnt>0){
				System.out.print(won+"��="+cnt);
				if(won>=1000){
					System.out.println("��");
				}else{
					System.out.println("��");
				}
			}
			//����ȭ�����
			money -= cnt*won;
			won = won / danwi; // 10000
			if(danwi==5){
				danwi = 2;
			}else{
				danwi = 5;
			}
		}
		
	}
}

/*
		Scanner scan = new Scanner(System.in);
		System.out.print("�ݾ��� �Է��ϼ��� = ");
		int cash = scan.nextInt();
		String msg = " ";
		int result = 0;
		int money = 50000;
		int a=1;
		while(a<=10){
			result = cash/money;
			cash = cash%money;
	
			if(cash>=1000){
				msg = "��";
			}else{
				msg = "��";
			}
			if(result>0){
			System.out.printf("%d�� = %d%s", money, result, msg);
			System.out.println();
			}

			if(a%2==0){
				money/=2;
			}else{
				money/=5;
			}

			a++;
		}



		Scanner scan = new Scanner(System.in);
		System.out.print("�ݾ��� �Է��ϼ��� = ");
		int cash = scan.nextInt();
		String msg = " ";
		int result = 0;
		int money = 50000;

		for (int i=1; i<=10 ; i++){
			result=cash/money;
			cash=cash%money;

			if(money>=1000){
				msg = "��";
			}else{
				msg = "��";
			}
			if(result>0){
			System.out.printf("%d�� = %d%s", money, result, msg);
			System.out.println();
			}

			if(i%2==0){
				money/=2;	
			}else{
				money/=5;
			}
			

		}//for

Scanner scan = new Scanner(System.in);

		System.out.print("�ݾ��� �Է��ϼ��� = ");
		int money = scan.nextInt();

		//50000, 10000, 5000, 1000, 500, 100, 50, 10, 1
		//50000��
		int cnt = money / 50000;
		if(cnt>0){
			System.out.println("50000��="+cnt+"��");
			money = money - (cnt*50000);
		}
		//10000��
		cnt = money / 10000;
		if(cnt>0){
			System.out.println("10000��"+cnt+"��");
			money = money - (cnt*10000);
		}
		//5000�� �̷������� ���� �־ ����
		
		if((cnt = money / 5000) > 0){
			System.out.println("5000��"+cnt+"��");
			money = money - (cnt*5000);
		}
		//1000��
		if((cnt = money / 1000) > 0){
			System.out.println("1000��"+cnt+"��");
			money = money - (cnt*1000);
		}
		//500��
		if((cnt = money / 500) > 0 ){
			System.out.println("500��"+cnt+"��");
			money = money - (cnt*500);
		}
		//100��
		if((cnt = money / 100) > 0){
			System.out.println("100��"+cnt+"��");
			money = money - (cnt*100);
		}




*/