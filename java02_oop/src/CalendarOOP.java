import java.util.Calendar;
import java.util.Scanner;
public class CalendarOOP {
	Calendar date = Calendar.getInstance();  //���糯¥
	
	
	public CalendarOOP() {}

	//�Է� - �ֿܼ��� �����Է�
	public int getInt(String msg) {
		Scanner scan = new Scanner(System.in);
		System.out.print(msg+"->");
//		int num =scan.nextInt();
//		return num;
		return scan.nextInt(); //������ ����������� �ٷ� �ص� �ȴ�.
				
	}	
	
	//���� - �Է¹��� ��,��,1���� ������������ ���Ѵ�.
	public int getWeek(int year, int month) { //���⿣ �Ʒ��� �Է��� y, m�� ���⶧���� ������ �ް� �ؾ� �Ѵ�.
//		Calendar date = Calendar.getInstance();  //���糯¥
		date.set(year, month-1, 1);
//		int w = date.get(Calendar.DAY_OF_WEEK);
		return date.get(Calendar.DAY_OF_WEEK);		
	}
	
	//����
	public void titlePrint(int week, int day) {
		String weekStr[] = {"��","��","ȭ","��","��","��","��"};
		for(String w:weekStr) {
			System.out.print(w+"\t");
		}
		System.out.println();
		spacePrint(week, day);
	}
	//����
	public void spacePrint(int week, int day) {
		for (int i=1; i<week; i++) {
			System.out.print("\t");
		}
		dayPrint(week, day); //���������� ������Ÿ���� ���� �ȵȴ�.
		
		
	}
	
	//��¥
	public void dayPrint(int day, int week) { //������ �־�� �ٹٲ������Ҽ��ִ�.
		for(int d=1; d<=day; d++) {
			System.out.print(d+"\t");
			if((week-1+d)%7==0) {
				System.out.println();
			}
		}
		System.out.println();
	} 
	
	public void start(){
		int y = getInt("�⵵"); 
		int m = getInt("��");
		int w = getWeek(y,m); //getWeek�� y���� int year�� ������, m���� int month�� ������.
		int lastDay = date.getActualMaximum(Calendar.DAY_OF_MONTH);//������ �� ���ϱ�
//		System.out.println("����="+w);
//		System.out.println("��������"+lastDay);
		
//		titlePrint();
//		spacePrint(w);
//		dayPrint(lastDay, w);
		titlePrint(w, lastDay);
		
	}
		
	
/*	public static void main(String args[]) {
		CalendarOOP oop = new CalendarOOP();
		oop.start();
		System.out.println("���α׷��� ����Ǿ����ϴ�."); 
	}
*/	//������ ������ ����°�
	
}
/*	
//	Scanner scan = new Scanner(System.in);
	Calendar date = Calendar.getInstance();	
	int year, month, week, lastDay=31;
	
	public CalendarOOP() {}
	
	public void year2() { //�� �Է�
		Scanner scan = new Scanner(System.in);		
		System.out.print("�⵵ =");
		year = scan.nextInt();
		System.out.print("�� = ");
		month = scan.nextInt();
	}
//	public void month2() { //�� �Է�
//		Scanner scan = new Scanner(System.in);		
//		System.out.print("�� = ");
//		month = scan.nextInt();
//	}
	public void set2() {
				
		date.set(year, month-1, 1);
		week=date.get(Calendar.DAY_OF_WEEK);
	}
	public void lastDay2() {

		switch(month) {
			case 4: case 6: case 9: case 11:
				lastDay=30;
				break;
			case 2:
				if(month%4==0 && month%100!=0 || month%400==0){
					lastDay = 29;
				}else{
					lastDay = 28;
				}
				
		}
	}
	public void end() {
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
		for(int s=1; s<week; s++) {
			System.out.print("\t");
		}
		for(int i=1; i<=lastDay; i++) {
			System.out.print(i+"\t");
			if((i + (week-1))%7==0) {
				System.out.println();
			}
		}
	}
	public void start () {
		year2();
//		month2();
		set2();
		lastDay2();
		end();

	}
	
	public static void main(String args[]) {
		CalendarOOP oop = new CalendarOOP();
		oop.start();
	}

*/

