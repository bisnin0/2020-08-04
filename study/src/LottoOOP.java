import java.util.*;

public class LottoOOP {

	int[] lotto = new int[7];
	Random rand = new Random();
	Scanner sc = new Scanner(System.in);
	int choice = 1;

	public LottoOOP() {
	}

	public void playLotto() {
		do {
			int num = insertRounds();
			gameRounds(num);
			choice = askMore();
		}while(choice ==1);
	}
	
	public int insertRounds() {
		System.out.print("�Է�=");
		int num = sc.nextInt(); // �Է�
		return num;
	
	}
	
	public void gameRounds(int num) {
		// ���Ӽ�
			for (int i = 0; i < num; i++) {
				produceNumber();
			}
	}

	public void produceNumber() {
		for (int i = 0; i < 7; i++) { // �ζǹ�ȣ
			lotto[i] = rand.nextInt(45) + 1;
			
		}
		arrangeNumber();
	}
	
	public void arrangeNumber() {
		checkNumber();
		sortNumber();
		checkBonus();
		printNumber();
	}

	public void checkNumber() {
		for (int i = 0; i < lotto.length - 2; i++) {
			for (int j = i + 1; j < lotto.length - 1; j++) {
				if (lotto[i] == lotto[j]) { // �ߺ�üũ
					lotto[j] = rand.nextInt(45)+1;
				}
			}
		}
	}
	
	public void sortNumber() {
			Arrays.sort(lotto, 0, 6); // ����
	}
	
	public void checkBonus() {
		for (int i = 0; i < lotto.length - 1; i++) {
			if (lotto[6] == lotto[i]) { // ���ʽ� �ߺ�üũ
				lotto[6] = rand.nextInt(45) + 1;
			}
		}
	}

	public void printNumber() {
		System.out.print(Arrays.toString(Arrays.copyOfRange(lotto, 0, 6)));
		System.out.print(", bonus=");
		System.out.print(lotto[6]);
		System.out.println();
	}

	public int askMore() {
		System.out.print("����Ͻðڽ��ϱ�?(1:��, 2:�ƴϿ�)");
		choice = sc.nextInt();
		return choice;
	}

}

/*
 * ���Ӽ�=7 [1, 11, 27, 29, 35, 41], bonus=31 [3, 23, 27, 28, 36, 44], bonus=5 [2,
 * 5, 8, 25, 28, 32], bonus=36 [10, 11, 23, 32, 42, 44], bonus=4 [5, 22, 24, 28,
 * 35, 36], bonus=44 [7, 9, 16, 35, 36, 45], bonus=44 [2, 5, 9, 21, 29, 30],
 * bonus=26 ����Ͻðڽ��ϱ�?(1:��, 2:�ƴϿ�)
 */