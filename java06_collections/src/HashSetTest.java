


import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public HashSetTest() {
		//Set interface : �Է¼���(�������)�� �������� �ʴ´�. ���� ���� ������ �𸥴�.
		//				    �ߺ���ü�� ������� �ʴ´�. �Ȱ��� ��ü�� ������ �ϳ��� ������.
		
		
	}

	public void start() {
		//						+	  -					+      -     �ߺ� ������ 4��
		Double[] data = {23.6, 52.8, 85.6, 84.7, 12.8, 52.8, 85.6, 56.5};
		
		HashSet<Double> hs = new HashSet<Double>();
		for(Double d : data) {
			hs.add(d);
		}
		System.out.println("size="+hs.size()); //�ߺ� ������ ������� �ʱ⶧���� �Ȱ����� ������.
		
		//HashSet�� get()�޼ҵ尡 ����.
		//Iterator �������̽��� �̿��Ͽ� �����͸� ����Ҽ��ִ�.
		
		Iterator<Double> iter= hs.iterator();  //�����͸� ��������� �ٸ� Ŭ������ �����ؾ��Ѵ�.
		while(iter.hasNext()) {//��ü�� �ִ��� Ȯ��
			double d = iter.next();
			System.out.println(d); //���� ���� ���� �ʴ´�. ������ �˰� �ʹٸ� �� Ŭ������ ���� �ʴ´�.
		}
		
		
	}
	public static void main(String[] args) {
		new HashSetTest().start();
	}

}
