import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class HashMapTest {
//MemberVo Ŭ���� (���������) Ȱ���ؼ� �ۼ�
	public HashMapTest() {
	}

	public void start() {
		
		//HashMap : ����ȭ���� �ʴ´�.   Hashtable : ����ȭ�Ѵ�.
//		HashMap<String, MemberVo> map = new HashMap<String, MemberVo>();  //�� ����� hashtable�� Ŭ������ �ٲ㺻��.
	
		Hashtable<String, MemberVo> map = new Hashtable<String, MemberVo>();
		
		MemberVo vo= new MemberVo(50, "ȫ�浿", "010-7899-2121", "abcd@nate.com");
		map.put("ȫ�浿", vo); //�� �����Ͱ� �� map�� ����.
		map.put("������", new MemberVo(10, "������", "010-9999-4444", "great@naver.com"));
		map.put("�������", new MemberVo(30, "�������", "010-1212-1212", "best1234@hanmail.net"));
		map.put("�̼���", new MemberVo(25, "�̼���", "010-7412-1111", "asdf@nate.com"));
		map.put("���", new MemberVo(40, "���", "101-222-5555", "hhhhh@naver.com"));
		
		//key�� �̿��� ���� ������
		MemberVo vo2 = map.get("������"); //Ű�� �Է��ϸ� memberVo������Ÿ������ �ƿ�ǲ�ȴ�.
		vo2.print();
		System.out.println("===================================================");
		//key�� ��� ���ϱ�
		Set<String> keyList = map.keySet();
		Iterator<String> key = keyList.iterator();
		
		while(key.hasNext()) {
			MemberVo vo3 = map.get(key.next());
			vo3.print();
		}
		System.out.println("-----------------------");
		//value ��� ���ϱ�
		Collection<MemberVo> value = map.values(); //map�� ������ HashMap�� ��ü�������Ǿ��ִ�.
		
		Iterator<MemberVo> v = value.iterator();
		while(v.hasNext()) {
			MemberVo vo4 = v.next();
			vo4.print();
		}
	}
	public static void main(String[] args) {
		new HashMapTest().start();
	}

}
