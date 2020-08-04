import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest {

	public TreeMapTest() {
		// TODO Auto-generated constructor stub
	}
	
	public void start() {
		//TreeMap : key, value�� ������.
		//			key�� �������� ���ĵǾ� �ִ�.  ... �̸����ξ��� �̸�������, ��ȣ�ξ��� ��ȣ������
		
		TreeMap<String, MemberVo> tm = new TreeMap<String, MemberVo>();
		
		MemberVo vo= new MemberVo(50, "ȫ�浿", "010-7899-2121", "abcd@nate.com");
		tm.put("ȫ�浿", vo); //�� �����Ͱ� �� map�� ����.
		tm.put("������", new MemberVo(10, "������", "010-9999-4444", "great@naver.com"));
		tm.put("�������", new MemberVo(30, "�������", "010-1212-1212", "best1234@hanmail.net"));
		tm.put("�̼���", new MemberVo(25, "�̼���", "010-7412-1111", "asdf@nate.com"));
		tm.put("���", new MemberVo(40, "���", "101-222-5555", "hhhhh@naver.com"));
		
		MemberVo vo2 = tm.get("�̼���");
		vo2.print();
		System.out.println("************key*************");
		Set<String> KeyList= tm.keySet();  //tm.key������ ���� ����� ���ϵǴ��� �����µ� �����ϸ� ����.
		Iterator<String> i = KeyList.iterator();
		while(i.hasNext()) {
			MemberVo vo3 = tm.get(i.next());
			vo3.print();
		}
		System.out.println("************value*************");
			
		
		Collection<MemberVo> value = tm.values();
		Iterator<MemberVo> v = value.iterator();
		while(v.hasNext()) {
			MemberVo vo4 = v.next();
			vo4.print();
			
		}
		
		
		
	}
	

	public static void main(String[] args) {
		TreeMapTest tmt = new TreeMapTest();
		tmt.start();
	}

}
