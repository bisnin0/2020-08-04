import java.util.Scanner;
class ForEx05 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("������ ��=");
		int su = scan.nextInt();
		int sum=0;

		for(int i=1;;i++){ //���� ����θ� ���ѷ���
			sum +=i;
			if(su<=sum){
				System.out.print("1���� "+i+"������ ����"+sum+"�̴�");
				break;				
			}
			
		}//System.out.print("1���� "+su+"������ ����"+sum+"�̴�");
		// ���⿡�ϸ� for�� ���� ��°��� ������ �ʴ´�.?? �����µ� Ȯ���ϱ�
		

//		for(int i=1;;i++){
			
//		}
		

	}
}

/*
���Ǽ��� �Է¹޾�
1���� ���� ���ϴµ� ���� �Է¹��� ���� ���ʷ� �ʰ��ϴ� ������ ���� ���� ���϶�.


1+2+3+4+5+....

����
������ ��=253254
1���� ___������ ���� ___ �̴�.


*/