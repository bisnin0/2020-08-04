import java.util.Scanner;
class NumberCount
//������ ���Դ� 1~1000���� ������ 1,2,3,4,5,6,7,8,9,0�� ��� ����ִ��� ã�� ���� Ǯ��
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);

		System.out.print("���� ���� �Է� = ");
		int max = scan.nextInt();

		int cnt[] = new int[10];//�� ���ڸ� ī��Ʈ�� �迭
		for(int i=1; i<=max; i++){//1,2,3,....1000
			//1�� �ڸ��� 10���� ���� �������� ���ϸ� ���´�. %10
			//10�� �ڸ��� ���� 10���� ������, 10���� ���� ������ �� ���Ѵ�. /10%10

			cnt[i%10]++; //���ڸ� 1�� ���������� 1->1���迭�� +1�� ���ش�.
						 //1~9������ ����

			if(i>=10){//10�� �ڸ�
				cnt[i/10%10]++;
			}
			if(i>=100) cnt[i/100%10]++; //100�� �ڸ�
			if(i>=1000) cnt[i/1000%10]++; //1000�� �ڸ�
				
			
		}//for

		for(int idx=0; idx<cnt.length; idx++){ //���
			System.out.println(idx+"->"+cnt[idx]);
		}//for
	}
}
