


import java.util.Calendar;
import java.util.Random;
import java.util.Vector;

public class VectorTest {

	public VectorTest() {
		//List �������̽��� ��ӹ��� �÷����� �Է¼����� �����ϰ�index�� ������ �ִ�.
		
	}
	

	public Vector getData() { //�������ִ� ������ Ÿ���̾�� �ϴϱ� void�� Vector�� �ٲ����Ѵ�.
		int num = 500;
		String name = "ȫ�浿";
		Calendar now = Calendar.getInstance();
		now.set(2022,10,10);
		Random ran = new Random();
		double ave = 80.5;
		
		Vector vector = new Vector();
		vector.add(num); //Integer�� �ٲ� object���� ��  //0��° 
		// �� ���̿� ave�� ���Դ�.
		vector.addElement(name); //addó�� �߰��ϴ±��. ��� �ᵵ �������. //1��° ->2
		vector.add(now);//2 ->3
		vector.add(ran);//3 ->4
		vector.add(1, ave);//�̷��� ave�� 1��°�� ����. 
		
		//�� �ȿ� �ִ� �����͵��� object���� ���Ŵ�.
		//�̰� ��������� ���������ʹϱ� ������ ���� ������ ������ ����ȯ �ؾ��Ѵ�.
		
		return vector;
	}
	//MemverVo�� ����
	//�л�����
	public Vector getMember() {
		Vector v = new Vector();
		MemberVo vo = new MemberVo();
		vo.setNum(100);
		vo.setName("ȫ�浿");
		vo.setTel("010-1234-5678");
		vo.setEmail("aaaa@nate.com");
		v.add(vo);
		
		MemberVo vo2 = new MemberVo(200, "�̼���", "010-1111-1111", "bbbb@naver.com");
		v.add(vo2);
		v.add(new MemberVo(300, "�������", "010-2222-3333", "cccccc@hanmail.net"));
		v.add(new MemberVo(400, "������", "010-3333-4444", "asdq@naver.com"));
		v.add(new MemberVo(500, "�̼���", "010-4444-5555", "ppppp@gmail.com"));
		
		return v;
		
		
	} 
}
