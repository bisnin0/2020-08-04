import java.util.Scanner;

public class EmailCheckEX {
	Scanner scan = new Scanner(System.in);
	final String EMAIL_MSG ="�̸��� �Է�";
	final String QNA_MSG = "����Ͻðڽ��ϱ�?(Y:��, N:�ƴϿ�)";
	
	public EmailCheckEX() {
		
		
	}
	
	public void emailCheckStart() {
		a:
		do {
			String email = getInput(EMAIL_MSG);//�̸����Է�

			if(emailCheck(email)){ //�̺κ� �ݵ�� Ȯ���ϱ�. �Ʒ� ����˻縦 ������¹��
				//�������
				emailOutput(email);//������, ���̵� �и� ���
				//�������Ȯ��
				do {
					String qna = getInput(QNA_MSG);
					
					if(qna.equalsIgnoreCase("Y")) {
						break;
						
					}else if(qna.equalsIgnoreCase("N")) {
						
						break a;
					}
					
				}while(true);
			}else {
				System.out.println("�߸��� �̸��� �ּ� �Դϴ�. �ٽ� �Է��ϼ���..");//�߸������̴�.
			}
		}while(true);
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
	}
	//�������Ȯ��
//	public boolean qna() { //������ �������� �������� ����
//		String qna = getInput(QNA_MSG);
//		if(qna.equalsIgnoreCase("Y")) { //Y
//			return true;			
//		}else if(!qna.equalsIgnoreCase("N")) {//Y,N ����
//			qna();
//		}else {//N
//			return false;
//		}
//	}
	public void emailOutput(String email) {
		String emailCut[] = email.split("@");
		System.out.println("���̵�="+emailCut[0]);
		System.out.println("������="+emailCut[1]);
	}
	
	//�����, .�˻�
	public boolean emailCheck(String email) { //�̰� email������ ���޹޴°Ŵ�.
		//
		int atMark = email.indexOf("@"); //@��ġ�� index�� ���ϰ� �������-1;
		int point = email.indexOf(".");//.��ġ���ϱ�
								
		if(atMark<4 || point<6 || point<atMark || point-atMark<2 || atMarkCount(email,'@')!=1 || atMarkCount(email, '.')>2) { 
			//       0123456789012345678
			//�̸���  = oaos@.asddamail.com //. ��ġ�� @���� �տ� ������ indexOf .-@ ������ -�� ���´�.
			return false;  
		}else {
			return true; 
		}
	}	
	public int atMarkCount(String email, char str) {
		int cnt=0;
		for(int i=0; i<email.length(); i++) {
			if(email.charAt(i)=='@') {
				cnt++;
			}
		}
		return cnt;
		
	}	
	
	
//	public void emailCheckStart() {
//		do {
//			String email = getInput(EMAIL_MSG);//�̸����Է�
//			//��ȿ�� �˻�		//�� ���� �Ʒ� String msg�� ���� �� �Ʒ� msg+"="�� ǥ�õǰ�
//			//		        //�ٽ� ���ƿͼ� email�� ����.
//			if(check(email,"@") && check(email,".")){ //�̺κ� �ݵ�� Ȯ���ϱ�. �Ʒ� ����˻縦 ������¹��
//				//�������
//			}else {
//				System.out.println("�߸��� �̸��� �ּ� �Դϴ�. �ٽ� �Է��ϼ���..");//�߸������̴�.
//			}
//		}while(true);
//	}
	//�����, .�˻�
//	public boolean check(String email, String p) { //�̰� email������ ���޹޴°Ŵ�.
//		//�̸��� ������ ����� ������ ����� ��������Ѵ�.
//		int index = email.indexOf(p);//����̰� �ִ��� ������ ã�¹�. �̾��ٰ�  .�� �ִ����� Ȯ���ϴ¹������ ����
//									// String email�� �־��� p�� "@"����.
//									//email CheckStart(){}�ȿ� ���� ������ check(email)�̾���.
//									   //����� ��ġ�� index�� ���ϰ� ������� -1�� ��������.
//		if(index>5) { //@�� ���ڿ� 4��°���� �ڿ� ������ 
//			return true;  //true�� boolean�� ����
//		}else
//			return false; //false�� boolean�� ����
//	}
	

	//���ڿ� �Է�
	public String getInput(String msg) {
		System.out.print(msg+"=");
		return scan.nextLine();
	} 
	

	public static void main(String[] args) {
		new EmailCheckEX().emailCheckStart();
		
	}

}
