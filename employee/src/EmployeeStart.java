import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class EmployeeStart {
	Scanner scan = new Scanner(System.in);
	HashMap<String, EmployeeVO> list = new HashMap<String, EmployeeVO>(); //key�� �̸�, ����?���? EmployeeVO
	
	public EmployeeStart() {
		//�α��� .. 3�� �Է��� �� �ֵ���
		int loginCnt = 0; //�α��� Ƚ�� ī��Ʈ
		
		do {
			String userid = conInput("���̵�");  //�̷��� ���� �Ʒ� msg�� ���̵� �ԷµǾ� ���̵� = ���� ��µȴ�.
			String userpwd = conInput("��й�ȣ");
			Login login = new Login(); //��ü����
			if(login.empCheck(userid,  userpwd)) { //�α��� ���� Ȯ��
				//�α��� �����ϸ� �޴��� �����ٰŴ�.
				
				//��� ����
				list = Login.setEmp(); //Login �Ʒ��� ���� HashMap Ȯ�� //�ʱ�ȭ��. �̰� ���� �Ʒ� do �ȿ� ������ �޴� ȣ���Ҷ����� �����Ͱ� �ʱ�ȭ �Ǿ� ������ ������ �ݿ� �ȵȴ�. 
				do {
					
					
					// conInput�� ������ �ְ� �ٷ� ���
					String menu = conInput("�޴�(1:������, 2:������, 3:�������, 4:�������, 5:����)"); //�޴�ǥ�� .. �� ���̵𶧿� ���������� �Է��س�� conInput���� �� ��Ŀ� �°���µȴ�.
					if(menu.equals("1")) { //��� ��� ȣ��
						employeeList();
					}else if(menu.equals("2")){ //����� ���
						employeeInsert();
					}else if(menu.equals("3")){ //��� ����
						employeeEdit();
					}else if(menu.equals("4")) {//��� ����
						employeeDelete();
					}else if(menu.equals("5")) {//���� ����
						System.out.println("���α׷��� ����Ǿ����ϴ�.");
						System.exit(0);
					}else {
						System.out.println("�޴��� �߸������Ͽ����ϴ�.. �ٽ� �����ϼ���.");
					}
						
				}while(true);
				
			}else{  //�α��� ����
				loginCnt++;
				if(loginCnt>=3) {  //�α���Ƚ���� 3�� ������ �극��ũ.. 3������ �α��� ���� 
					break;
				}
			}
		}while(true);
		
	}
	
	public String conInput(String msg) { //���̵�� ��й�ȣ �Է¹޴°�
		System.out.print(msg+"=");
		return scan.nextLine();
	}
	//��� ���
	public void employeeList() {
		Collection<EmployeeVO> valueList = list.values();   	//list�� ����������� ������ HashMap ��ü
		Iterator<EmployeeVO> ii = valueList.iterator();
		while(ii.hasNext()) {
			ii.next().output();  //ii.next()�� VO �� �ȿ� �ִ� output()�� ȣ��
		}
	}
	
	
	//��� ���
	public void employeeInsert() {
		//�ֿܼ��� �Է¹޾Ƽ� �װ� VO�� �־ list(HashMap)�� �߰��Ѵ�.
		int num = Integer.parseInt(conInput("��ȣ")); //���� ��ȣ�Է¹޾� ��Ʈ�� �ٲ�
		String name = conInput("�̸�");
		String tel = conInput("����ó");
		String department = conInput("�μ���");
		String position = conInput("����");
		
		EmployeeVO vo = new EmployeeVO(num, name, tel, department, position);  //VO�� �ֱ� ���� ��ü�� ����� �۾�
		
		list.put(name, vo); //�̸����� ȣ���ϰ� ������ ��� ������ ���� vo�� ����ִ�.
		employeeList();
		
	}
	
	//��� ���� .. ����ó, �μ���, ���޸�
	public void employeeEdit() {
		String name = conInput("������ �����");
		//������� �Է� ������ ������� ������ ������ٰŴ�. ex)�̼����̸� �̼����� ����
		EmployeeVO vo = list.get(name);  //HashMap(list)���� key(name)�� �Ѱ�(get)�޴´�.
		if(vo!=null) {  //����������
			vo.output(); //EmployeeVO�� �ִ� ��¸޼ҵ� .. ��� ���� ���
			String subMenu = conInput("������ �׸��� �����ϼ���.(1:����ó, 2:�μ���, 3:����)");
			String data = conInput("������ �������Է�");  //�Է��� �����͸� data�� �ִ´�. 
			if(subMenu.equals("1")) {
				vo.setTel(data);				//�Է¹��� �����Ͱ� tel�� ����.
			}else if(subMenu.equals("2")) {
				vo.setDepartment(data);
			}else if(subMenu.equals("3")) {
				vo.setPosition(data);
			}else {
				System.out.println("������ �׸��� �߸������Ͽ����ϴ�.");
			}
		}else {
			System.out.println(name+"�� ���� ����Դϴ�."); //���� null(����Ʈ�� ������)�̸� ���.. ������
		}
		
	}
	//��� ����
	public void employeeDelete() {
		String key = conInput("������ �����"); //������ ����� �Է��ϸ� key�� ����.
		list.remove(key); //�Է¹��� key�� HashMap���� �����Ѵ�.
		
	}
	


	public static void main(String[] args) {
		new EmployeeStart(); 
	}

}
