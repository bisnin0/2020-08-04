import java.util.Scanner;
import java.util.TreeSet;

public class LottoCollectionEEEEXXXX {
	Scanner scan = new Scanner(System.in);

	public LottoCollectionEEEEXXXX() {

	}
	
	//�ֿܼ��� ���ڿ� �Է�
	public String conInput(String msg) {
		System.out.println(msg+"=");
		return scan.nextLine();
	}
	
	
	
	//1���� ���� : �ߺ��˻�, ����
	public void createLotto(int cnt) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		do {
			int lotto = (int)(Math.random()*45)+1; //���������� ������ ��ȣ
			ts.add(lotto);
			if(ts.size()>=7) {  // ts�� 7���� ��ȣ�� ����
				ts.remove(lotto);//������ ������ ��ȣ �����
				lottoNumPrint(ts, lotto, cnt);
				break;
			}
			
		}while(true);
	}

	//���
	public void lottoNumPrint(TreeSet<Integer> ts, int lotto, int cnt) { //�� ���� �Ѱܹ޴´�.
		System.out.print(cnt + "���� = ");
		System.out.print(ts.toString());
		System.out.println(", bonus = "+lotto);
	}
	
	//���� ����
	public void createStart() {
		do {
			try {
			//���� �� �Է�
				int gameCnt = Integer.parseInt(conInput("���Ӽ�")); //conInput�� String.. �̰� int�� �ٲ���Ѵ�. Integer.Valuof�� ParseInt
				for(int i=1; i<=gameCnt; i++) {					  //���ڹ��ڰ� �ƴѰ� �Է������� ����ó��
					createLotto(i);
				}
				
				//��Ұ��
				do {
					String qna = conInput("����Ͻðڽ��ϱ�?(Y:��, N:�ƴϿ�)");
					if(qna.equalsIgnoreCase("Y")) {//Y
						break;
					}else if(qna.equalsIgnoreCase("N")) {//N
						//���α׷� ����
					System.out.println("���α׷��� ����Ǿ����ϴ�.");
					System.exit(0);  //�������� �ִ� ������� ���⼭ �ڹ� ����ӽ��� �����Ų��. System.exit(�ƹ�����);
					}
				}while(true);
				
			}catch(NumberFormatException nfe) {				 
				System.out.println("���� ������ �Է��ϼ���...");
			}	
			
		}while(true);
		
		
	}

	public static void main(String[] args) {
		new LottoCollectionEEEEXXXX().createStart();

	}

}
