
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.Vector;

public class LottoCollection {

	Random ran = new Random();
	Vector<Integer> vector = new Vector<Integer>();
	HashSet<Integer> set1 = new HashSet<Integer>();
	TreeSet<Integer> ts = new TreeSet<Integer>();
	Scanner sc = new Scanner(System.in);
	int choice = 0;
	int num;
	int cnt;
	int q = 1;

	public LottoCollection() {
	}

	public void playLotto() { // ���� ���� �� ����
		do {
			int num = insertRounds();
			gameRounds(num);
			try {
				if (q == 1) {
					choice = askMore();
				}
			} catch (InputMismatchException ime2) {
				System.out.println("���ڸ� �Է��Ͽ��� �մϴ�...");

			}
			cnt = 0;
		} while (choice == 1);
		if (choice >= 3 || choice == 0) {
			System.out.println("�߸� �Է� �ϼ̽��ϴ�.");
		}
		System.out.println("������ ���� �Ǿ����ϴ�.");

	}

	public int insertRounds() { //��� �Ұ��� ����
		try {
			System.out.print("��� ������ �Ͻðڽ��ϱ�? =");
			num = sc.nextInt(); 
		} catch (InputMismatchException ime) {
			System.out.println("���ڸ� �Է��Ͽ��� �մϴ�...");
			q++;
		}
		return num;
	}

	public void gameRounds(int num) { // ���� ��
		for (int i = 0; i < num; i++) {
			cnt++;
			produceNumber();

		}
	}

	public void produceNumber() {
		do { // vector�� �� �����ϰ� hashset�� �����ؼ� �ߺ� �� Ȯ��. hashset size�� 7 ���ϸ� �����
			vector.clear();
			set1.clear();
			for (int i = 0; i < 7; i++) {
				vector.addElement(ran.nextInt(45) + 1);
			}

			for (int i = 0; i < 7; i++) {
				set1.add(vector.elementAt(i));
			}
		} while (set1.size() < 7);
		arrangeNumber();
	}

	public void arrangeNumber() {
		sortNumber();
		printNumber();
	}

	public void sortNumber() { // treeset�� vector 0~5������ �Է�
		ts.clear();
		for (int i = 0; i < 6; i++) {
			ts.add(vector.elementAt(i));
		}
	}

	public void printNumber() { //treeset����  �������� ��� �� vector 6�� ���ʽ� ��ȣ ���

		Iterator<Integer> result = ts.iterator();
		System.out.print(cnt + "���� = ");
		while (result.hasNext()) {
			System.out.print(result.next() + " ");
		}

		System.out.print("bonus = " + vector.elementAt(6));
		System.out.println();

	}

	public int askMore() {
		
		System.out.print("����Ͻðڽ��ϱ�?(1:��, 2:�ƴϿ�)");
		choice = sc.nextInt();
		return choice;

	}
	public static void main(String[] args) {

		LottoCollection lott = new LottoCollection();
		lott.playLotto();
	}

}

//�迭������ arraylist
//����ó��
//������������ treeset  .. ���߿��� ���° �ڷ� �ϳ� �̾Ƽ� ���ʽ���