import java.util.Scanner;
class Lotto

// �ζǹ�ȣ�� ����ϴµ� �ߺ��Ǵ°��� �ٸ����� �����ϰ� ����. ���� Ǯ���. �ߺ��˻� ��Ȯ��
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);


		int lotto[] = new int[7];
		for(int r=1; r<2; r++){
			System.out.print("���Ӽ�=");
			int game = scan.nextInt();
			for(int i=1; i<=game; i++){
				for(int j=0; j<lotto.length; j++){
					lotto[j] = (int)(Math.random()*(45-1+1))+1;
					
				}
				//�ߺ��˻�
				for(int k=0; k<lotto.length-1; k++){
					for(int a=k+1; a<lotto.length; a++){
						if(lotto[a] == lotto[k]){
							lotto[a] = (int)(Math.random()*(45-1+1))+1;
						}
					}	
					
				} //�ߺ��˻����� <==�ߺ� �߻���
				//����
				for(int k=0; k<lotto.length-2; k++){
					for(int a=k+1; a<lotto.length; a++){
						if(lotto[k] > lotto[a]){
							int temp = lotto[a];
							lotto[a] = lotto[k];
							lotto[k] = temp;	
						}
					}			
				}//��������
				
				System.out.println(i+"����=["+lotto[0]+", "+lotto[1]+", "+lotto[2]+", "+lotto[3]+", "+lotto[4]+", "+lotto[5]+"], bonus="+lotto[6]);

					
			} //for
			System.out.print("����Ͻðڽ��ϱ�?(1:��, 2:�ƴϿ�)");
			int restart = scan.nextInt();
			if(restart==1){
				r=0;			
			}else{
				break;
			}
			System.out.println();
		}//for


	}
	}

// 45�� ��ȣ �ȿ��� ������  7��(���ʽ� ����)
// �������� ����
// ������ȣ ������ ���� �����Ȱ� ���ΰ� ���߿� �����Ȱ� ��������(�ߺ��˻�)