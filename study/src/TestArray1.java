import java.util.Scanner;

public class TestArray1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String title[] = {"�̸�","����","����","����","����","���","����"};
		
		System.out.print("�л� �� = ");
		
		int cnt = scan.nextInt(); //�л� �� �Է�
		
		String name[] = new String[cnt];
		double jumsu[][] = new double[cnt+2][6];
				
		
		for(int i=0; i<cnt; i++) {//�л� �� ��ŭ ȸ���Ѵ�.
			System.out.print(title[0] + "=");
			scan.nextLine();
			name[i] = scan.nextLine();
			// �̸��� �Է¹޾� name�迭�� ����ִ´�.
			for(int j=0; j<3; j++) {
				System.out.print(title[j+1]+"=");
				jumsu[i][j] = scan.nextDouble();
			}
		}

		/*
		 Scanner scan = new Scanner(System.in);
	        String title[] = {"�̸�","����","����","����","����","���","����"};
	 
	        //�л����� �Է¹޾� �̸� ������ �迭, ���� ������ �迭 ����
	        System.out.print("�л��� = ");
	        int cnt = scan.nextInt();
	 
	        String name[] = new String[cnt];//�̸� ������ �迭
	        double jumsu[][] = new double[cnt+2][6]; //������ ������ �迭
	 
	        //������ �Է�
	        for(int i=0; i<cnt; i++){// i=0,1,2,3,4 -> �л�����ŭ ȸ��
	            System.out.print(title[0]+"=");//�̸�
	            scan.nextLine();  // nextLine �������� �ʱ�ȭ �ѹ� ����
	            name[i] = scan.nextLine();  // nextLine Ȯ��
	            //�������� ����
	            for(int j=0; j<3; j++){ //j= 0,1,2
	                System.out.print(title[j+1]+"=");
	                jumsu[i][j] = scan.nextInt();
	                
	            }
	        }		*/
		//���κ� ����, ���, ���� ����
       for(int r=0; r<cnt; r++){//0,1,2,3,4
            for(int c=0; c<3; c++){//0,1,2		
		//for(int r=0; r<cnt; r++) {
		//	for(int c=0;c<3;c++) {
                jumsu[r][3] = jumsu[r][3] + jumsu[r][c]; //���κ� ����            	
			//jumsu[r][3]= jumsu[r][3] + jumsu[r][c];
                jumsu[cnt][c] = jumsu[cnt][c] + jumsu[r][c]; //���� ����
				
//				jumsu[cnt][c]= jumsu[cnt][c] + jumsu[r][c];
				
			}
			jumsu[r][4] = jumsu[r][3] / 3;
		}
		for(int c=0; c<=2; c++) {
			jumsu[cnt+1][c] = jumsu[cnt][c] /cnt;
		}
		
		//���� ���ϱ�
		for(int i=0; i<cnt; i++) {
			jumsu[i][5]++; //�⺻���ڴ� 0�̴ϱ� ������ +1�� ����� ������ ���´�.			
			for(int j=0; j<cnt; j++) {
				if(jumsu[i][3] < jumsu[j][3]) {
					jumsu[i][5]++;
				}
			}

		}
		
		
		
		//���
		for(String t : title) { //Ȯ��� for��
			System.out.print(t+"\t");
		}
		System.out.println();
		for(int i=0;i<jumsu.length;i++) { //cnt+2�� 5���̸� 0~6���� 7��(�Ʒ��� ��µǴ°�) 
			if(i==cnt) {
				System.out.print("����\t");
			}else if(i==cnt+1){
				System.out.print("���\t");
			}else {
				System.out.print(name[i]+"\t");
			}
			for(int j=0; j<jumsu[i].length ; j++) { //jumsu.length�� jumsu�� ���� ���� jumsu[i].length�� jumsu�� i���� ����
				System.out.printf("%.1f\t", jumsu[i][j]);
			}
			System.out.println();
		}
		
		
		
	}

}
