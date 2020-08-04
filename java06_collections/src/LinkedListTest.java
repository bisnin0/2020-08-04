


import java.util.LinkedList;

public class LinkedListTest {

	public LinkedListTest() {
	}
	public void start() {
		//LinkedList : �Է¼��� ����, queue, deque ó���� �� �� �ִ�.
		//			      ��ü�� output�ϸ� �÷��ǿ��� ��ü�� ���ŵȴ�. �̺κ� ���� �߿�.
		
		//queue = ���� �Էµ� ��ü�� ���� ��� : First In First Out
		//deque = �������� �����͸� �ְ� �� �� �ִ�.
		
		LinkedList<String> ll = new LinkedList<String>();

		//queue
		//��ü �߰�
		ll.offer("ȫ�浿");
		ll.offer("�̼���");
		ll.offer("�������");
		//queue = �������� ���� ���̰� �ݴ������� ���� ���ΰͺ��� �����°�. ������ �����ȴ�.
		
		//��ü �� ���ϱ�
		System.out.println("��ü��="+ll.size()); //3��
		String str = ll.poll(); // ���� �� ��ü�� str�� ll���� ���� �ִ´�.
		System.out.println("str="+str); //ȫ�浿
		System.out.println("��ü��="+ll.size()); //2��.. ȫ�浿�� ���ŵȰ�
		
		//deque
		ll.offerFirst("����"); // ���� �����ʿ� �������
		System.out.println("��ü��="+ll.size());
		
		String str2 = ll.pollLast(); //���� ���ʰ� ��
		System.out.println("str2="+str2);
		System.out.println("��ü��="+ll.size());
		
		
		//�÷����� ��� ��ü�� ������� ����϶�.
		//index�� ����. for �ƴ� while������ ���
		
		while(!ll.isEmpty()){ //��ü�� ������ false,������ true ����� �������ִ� �޼ҵ�
			//���	�����Ͱ� ������ true���߸� while���� ����Ǵϱ� false�� true�� ������� ! �������ָ�ȴ�.
			System.out.println("-->"+ll.poll());
			
		}
	
		
		
		
	}
	public static void main(String[] args) {
		new LinkedListTest().start();
	}

}
