import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class Lotto {
	
	Scanner scan = new Scanner(System.in);
	Random ran = new Random(); //����Ʈ �ʿ�
	
	int lottoNum[] = new int[7]; //��ȣ
	int gameCount;  //���� �� 

	public Lotto() {
		
	}
	
	//���� �� �Է�
	public void getGameCount() {
		System.out.print("���Ӽ�=");
		gameCount = scan.nextInt();  //��������� �ִ°Ŷ� ���� �����൵�ȴ�.
	} 
	
	
	//���� ���� Ȯ��. ���������� Ȯ���ϴ°�.
	public String getEndQna() {  //�������� �غ���. ���ڶ� String
		
		System.out.println("����Ͻðڽ��ϱ�?(Y:��, N:�ƴϿ�)");
		return scan.nextLine(); //�̷��� ���� ������ �� �־ �ʱ�ȭ �۾��� �ѹ� ���ش�.
	}
	
	//��ȣ+���ʽ� ��ȣ�� �����Ͽ� �迭�� �߰�
	public void createLotto() {
		//54, 32, 2, 54, 6, 4�� ������� ġ�� �� ��ȣ�� lottoNum[]�� ����. 
		// ������ �Է��� ��ȣ�� ��������� �״�� �����ְԵȴ�. �̷��� �������� ����Ҷ��� ���� ��ȣ�� ��������Ѵ�.
		lottoNum = new int[7]; //���ο� �ζǹ�ȣ ������ ������ȣ���� �����.
		for(int i=0; i<lottoNum.length; i++) {
			lottoNum[i] = ran.nextInt(45)+1; //i��°�� ���ڸ� �ִ´�.
			i = lottoCheck(i); //�ߺ��˻�� �Ʒ����� �ҰŴ�.
			// �Ʒ����� i�� �޾Ƽ� ����i�� �־���� �ϴϱ� i=lottoCheck(i);
		}
	}
	
	
	//�ߺ��˻�(�޼ҵ� �����Ұ�)
	public int lottoCheck(int i) {//i�� ���޹޴´�. i�� 4���
		for(int j=0; j<i; j++) {               //j��0~3
			if(lottoNum[j] ==  lottoNum[i]) {
				return --i; //�ϸ� �Ǵµ� �̰� ������ ������Ѵ�.
			}
		}
		return i; //�Ȱ������� ������ �ϳ� �ٿ��� i�� �������ְ� �ƴϸ� �׳� i�� �������ش�.
	}
	
	

	//������ Arrays�� �ִ� ����� �̿�. sort(static�̶� ��ü �ȸ���� �� �� �ִ� Ŭ����)

	
	
	//���
	public void lottoPrint(int cnt) {
		//�����ϱ�  - ���ʽ��� ������ ����
		Arrays.sort(lottoNum,0, 6); //�迭 lottoNum�� 0���� 5���� ���� (�������� ���ʽ��� ����)
		//6�� ������ 6�ձ��� ���ϱ� ������ 0~5���Ǵ°Ŵ�.
		System.out.print(cnt+"����=");
		
		System.out.print(Arrays.toString(Arrays.copyOfRange(lottoNum,0,6)));
		//���縦 �ؼ� ���ڿ��� �ٲپ� ���.
		
		System.out.print(", bonus="+lottoNum[6]);
		System.out.println();
	}
	
	public void lottoCreateStrat() { //��ü������ �����ϴ� �޼ҵ�
		
		//�� break;�� Ư�� �ݺ����� �����Ͽ� �ߴܽ�ų��
		a:    //�� �̷��� �����ϸ� a: do ~ while 00000000 �� �ߴܵȴ�.
		do {
			getGameCount(); //���Ӽ�
			for(int i=1; i<=gameCount; i++) { //���Ӽ� ��ŭ ����
				createLotto(); //�ߺ��˻�
				lottoPrint(i); //���  cnt���� ���� i�� 1�϶� cnt�� 1
				
			}
			//��ӿ��� Ȯ�� Y�� ����ϰ� N�� �����ϰ� �� �ܿ��� �ٽ�����
			scan.nextLine(); //���� ��� �ʱ�ȭ 27�࿡ �ִ°�.
			do {
				String qna = getEndQna();  //ȣ��
				if(qna.equalsIgnoreCase("Y")) {
					break; //���� ����� �ݺ����� ������. ���⼭ �극��ũ�� �ɸ��� �Ʒ� 00000000���� ����.
				}else if(qna.equalsIgnoreCase("N")) {
					break a; //�� a ����
				} // �� �ΰ��� ������ �������� �ݺ����̴� ���� ���ư��� ���� �ٽ��Ѵ�.
			}while(true); //y�϶� �� �ݺ����� ������ �Ʒ��� �������� �ٽ� �� ���� �ö󰣴�.
		}while(true);  ///00000000
		System.out.println("���α׷��� ����Ǿ����ϴ�.."); //�� a�� ����Ǹ� ����� �´�.
	}
	
}



/* ���� Ǯ��
Scanner, �迭 �ʿ�

*/