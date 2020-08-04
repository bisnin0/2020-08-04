


import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ArrayListTest {

	public ArrayListTest() {

	
	
	}
	
	public void start() {
		//������ �����ϰ� , index�� ������ �ִ�.
		List al = new ArrayList();  //List�� ���� �������̽�. new List�� �Ҽ�����. �������̽���. 
		// ArrayList al�ص� ������ List�� ���� ����. �ֳ��ϸ� List�� ��Ƶ� ��ɿ� ���̰� ���⶧����. 
		al.add(100);
		al.add(10.6);
		al.add(new VectorTest()); //Ŭ������ �����°�
		al.add("����� ������ �����");
		
		double data1 = (double)al.get(1); 
		System.out.println(data1);
		
		
		VectorTest vt = (VectorTest)al.get(2);  //Ŭ������ �����°�
		Vector v = vt.getData(); // VectorTestŬ������ getData�� Vector�� ���ϵǰ��ִ�.
		String name = (String)v.get(2);
		System.out.println("name="+name);
			
		Vector v2 = vt.getMember();
		for(int i=0; i<v2.size(); i++){
			MemberVo vo = (MemberVo)v2.get(i);
			vo.print();
		}
		
		////���ʸ�
		// 	E:element  K:key		V:value
		List<String> data = new ArrayList<String>(); //<>���ʸ�  data���� String ��ü�� �߰��� �� �ִ�.
		List<MemberVo> data2 = new ArrayList<MemberVo>(); // data2���� MemberVo ��ü�� �߰��� �� �ִ�.
		//���ʸ��� �÷��� �߰��ϴ� ��ü���� ���ϴ� ���̴�.
		
		//data.add(12345); //���� ���ʸ����� String�� �߰��ϰ� �߱⶧���� ����
		data.add("12345");
		data.add("�ڹ��÷���");
		
		String str = data.get(1); //����ȯ ���ص� ��������. ���ʸ����� �����
		System.out.println(str);  //���ʸ��� �ִ� �÷����� get()ȣ�� �Ҷ� ����ȯ�� �� �ʿ䰡 ����.
		
		data2.add(new MemberVo(111,"hong", "010-1234-5678","kakjs@naver.com"));
		//data2.add(Calendar.getInstance()); -> MemberVo��ü���ƴϾ ������. ����
		
		MemberVo vo3 = data2.get(0);
		vo3.print(); //���. 
		
		System.out.println(data);
		System.out.println(data2);
		
		
		
		List<Integer> data3 = new ArrayList<Integer>();
		for(int i=1; i<100; i+=8) {
			data3.add(i);
		}
		System.out.println("size="+data3.size());

		Object arr[] = data3.toArray(); //�迭�� ����°�
		for(Object obj:arr) {
			System.out.println(obj);
		}
		
	
		
		
	}
	public static void main(String[] args) {
		new ArrayListTest().start();
	}

}
