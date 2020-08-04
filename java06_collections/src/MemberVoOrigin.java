


public class MemberVoOrigin {
	//��ȣ, �̸�, ����ó, �̸���
	//���� Vo�� ���������� ������ ���� �����ɷ� ������ش�. 
	//= �ܺο��� ������� ���� ���ϰ� = ĸ��ȭ, ��������
	private int num;
	private String name;
	private String tel;
	private String email;
	
	public MemberVoOrigin() {
		
	}
	
	public MemberVoOrigin(int num, String name) {
		this.num = num;
		this.name = name;
	}
	
	public MemberVoOrigin(int num, String name, String tel, String email) {
		//this.num = num;
		//this.name = name+"��"; //�ʿ��ϸ� �̷��� �߰��� �� �ִ�.
		//���� �޼ҵ� (int num, Strin name) �� �߰� �߱⶧���� �ٷ� ���� ��ģ��.
		//�ٸ������� ȣ���ϴ� ���
		this(num, name); //ù��°�� �����������
		this.tel = tel;
		this.email = email;
	} //�̰� �ϴ� ���� = �̷��� ���� ������ �Ʒ� ���� �ϳ��ϳ� ��� ȣ���ؾ��Ѵ�.
	
	public void print() {
		System.out.println(num+","+name+","+tel+","+email);
	}

	
	//��ȣ�� �ܺο��� ������ �� �ִ� �޼ҵ�
	//getter, setter
	public int getNum() {
		return num;  //�̰� ���� Ŭ������ private�� ȣ�� �����ϴ�.
	} //���� �ƿ�ǲ ��Ű�� �޼ҵ� �ϳ�
	
	
	public void setNum(int num) { //���� �����ϴ°Ŷ� ��ȯ������. �ܺο��� �����͸� �޾ƿ��⶧���� �Ű����� �Է��ؾ��Ѵ�.
		this.num = num;  //���� ������ �� �ִ� �޼ҵ�. �̰� ���ٸ� �ܺο��� �����͸� �������� ���Ѵ�.
	} //���� �����Ű�� �޼ҵ� �ϴ�.
	
	public String getName() {
		return name; 
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getTel() {
		return tel;
	}
	
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
}
	
