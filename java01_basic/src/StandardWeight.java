import java.util.Scanner;
class StandardWeight
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("���� = ");
		int age = scan.nextInt();
		System.out.print("����(1:����, 2:����) = ");
		int gender = scan.nextInt();
		System.out.print("Ű = ");
		double height = scan.nextDouble();
		System.out.print("����ü�� = ");
		double weight = scan.nextDouble(); 

		double aveWeight = 0;
		if(age<36 && gender==1){
			aveWeight = (height-100)*0.90;
		}else if(age<36 && gender==2){
			aveWeight = (height-100)*0.85;
		}else if(age>=36 && gender==1){
			aveWeight = (height-100)*0.95;
		}else if(age>=36 && gender==2){
			aveWeight = (height-100)*0.90;
		}

					
		double aw = (weight/aveWeight)*100;

		String result = "";
		if(aw<=85){
			result = "������";
		}else if(aw<=95){
			result = "���ݸ�����";
		}else if(aw<=115){
			result = "ǥ����";			
		}else if(aw<=125){
			result = "���� ����";
		}else{
			result = "����";
		}

		System.out.println("ǥ��ü�� = "+aveWeight);
		System.out.println("����� ǥ��ü�������� "+aw+"���� "+result+"�Դϴ�.");


		


	}
}
