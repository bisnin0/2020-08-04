import java.util.Scanner;
public class EmailCheck {
	Scanner scan = new Scanner(System.in);
	String emailStr = "";
	
	
	public EmailCheck() {
				
	}
	//�̸��� �Է�
	public void mail() {

		System.out.print("�̸��� �Է� (���ĺ�, ���ڸ� ����)= ");
//		scan.nextLine();
		emailStr = scan.nextLine();

		
	}
	//�����˻� > 
	public void err() {
		//@, . �ִ��� �˻�
		boolean b1=emailStr.contains("@") && emailStr.contains(".");
		
		if (!b1)
		{
		  System.out.println("�߸��� �̸��� �ּ��Դϴ�.");
		  start();
		}		

		// @�� ���ڿ��� ���ĺ��� ���ڸ� ������ �ٸ��� �ԷµǾ��ִ��� Ȯ��
		int atMark2 = emailStr.indexOf("@");
		String id2 = emailStr.substring(0, atMark2);

		
		int[] a = new int[id2.length()];
		
		for(int i = 0; i < id2.length(); i++) {
			a[i] = (int)id2.charAt(i);
			if(65<=a[i] && 90>=a[i] || 97<=a[i] && 122>=a[i] || 48<=a[i] && 57>=a[i]) {
						continue;
			}else{
				System.out.println("�߸��� �̸��� �ּ��Դϴ�.");
				start();
			}
		}

		
	}
	
	//��� 
	public void output() {

		int atMark = emailStr.indexOf("@");
		
		String id = emailStr.substring(0, atMark);
        System.out.println("id="+id);
        
        String domain = emailStr.substring(atMark+1); 
        System.out.println("domain="+domain);		
	
	}
	
	//���Ῡ�� Ȯ��
	public String endQna() {
		System.out.println("����Ͻðڽ��ϱ�?(Y:��, N:�ƴϿ�)");
		return scan.nextLine();
	}
	
	public void start() {
		a:
		do {
			mail();
			err();
			output();
			do {
				String qna = endQna();
				if(qna.equalsIgnoreCase("Y")) {
					break;
				}else if(qna.equalsIgnoreCase("N")){
					break a;
				}
				
			}while(true);
		}while(true);
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
		
		

	}
	

	public static void main(String[] args) {
		EmailCheck OOP = new EmailCheck();
		OOP.start();
	}

}


/*
����

 //�̸����Է� = gog��������.������asas@nate.com
�߸��� �̸��� �ּ� �Դϴ�.
�̸��� �Է� = jjjj@nate.com


�̸����Է� = goguma@nate.com
���̵� = goguma
������ =nate.com
����Ͻðڽ��ϱ�?(Y:��, N:�ƴϿ�)

����κ��� �ľ��ؼ� �߸��Ȱ� üũ�ؾ����� ��ü��������




*/