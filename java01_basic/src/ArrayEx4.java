import java.util.Scanner;
class ArrayEx4 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("�л� �� = ");
		int stu = scan.nextInt();
		String arr[] = new String[stu+2];
		int arr2[][];
		arr2 = new int[stu+2][6];	
		int arr3[] = new int[stu];

		for(int i=0; i<stu; i++){
			System.out.print("�̸� = ");
			String name = scan.next();
			arr[i] = name;
			System.out.print("���� = ");
			int lang = scan.nextInt();
			System.out.print("���� = ");
			int eng = scan.nextInt();
			System.out.print("���� = ");
			int math = scan.nextInt();
				for(int j=0; j<arr3.length; j++){
				arr2[i][0] = lang;
				arr2[i][1] = eng;
				arr2[i][2] = math;
				arr2[i][3] = lang+eng+math;
				arr2[i][4] = (lang+eng+math)/3;

				}
				arr3[i] = arr2[i][4];		
		}

		int sum = 0;	//�Ʒ��� �հ� ���
		for(int i=0; i<6; i++){ //��
			sum =0;
			for(int j=0; j<stu+1; j++){ 
				sum += arr2[j][i];
			} //��
			arr2[stu][i] = sum;
			arr2[stu+1][i] = sum/3;
		}
		int rank; //���� ���ϴ���
		for(int q=0; q<arr3.length; q++){
			rank = 1;
			for(int w=0; w<arr3.length; w++){

				if(arr3[q] < arr3[w]){
					rank+=1;
				}				
				arr2[q][5] = rank;
			}
			
		}
//		2���� �迭 ������ ���� ����
	
		arr[stu] = "����";
		arr[stu+1] = "���";

		System.out.println("�̸�\t����\t����\t����\t����\t���\t����"); //��½���

		for(int i=0; i<arr2.length; i++){//���?
			for(int j=0; j<arr2[i].length; j++){
				if(j==0) System.out.print(arr[i]+"\t");
				System.out.print(arr2[i][j]+"\t");
			}
			System.out.println();
		}

	}
}

/*
�л����� �Է¹ް� 3���� ������ �Է¹��� �� ���κ� ����, ���, ������ ���ϰ�
�� ���� ������, ����� ���϶�.
��, ���������� ���(�����ϴٸ�)

����
�л��� = 3
�̸� = 
���� = 
���� = 
���� = 
�̸� = 
���� =
:
:

*/