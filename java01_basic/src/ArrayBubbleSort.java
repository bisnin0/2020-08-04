class ArrayBubbleSort 
{
	public static void main(String[] args) 
	{
		int data[] = new int[10];
		

		for(int i=0; i<data.length; i++){
			data[i] = (int)(Math.random()*100)+1;
		}//for
		System.out.println("========������========");
		for(int i=0; i<data.length; i++){
			System.out.print(data[i]+"\t");
		}//for
		
		//���� �ѹ�
		for(int i=0;i<data.length-1;i++){//0,1,2,3....8 ���ʰ��� �����̶�.
			if(data[i] > data[i+1]){
				//��ȯ				
				int temp = data[i];
				data[i]= data[i+1];
				data[i+1] = temp;

			}
									
		} 
		System.out.println("\n=============������=============");
		for(int t: data){
			System.out.print(t+"\t");
		}
		System.out.println();
		System.out.println();
		System.out.println();
/*
		//���� �ݺ�
		for(int j=0; j<data.length; j++){
			for(int i=0;i<data.length-1;i++){//0,1,2,3....8 ���ʰ��� �����̶�.
				if(data[i] > data[i+1]){
					//��ȯ				
					int temp = data[i];
					data[i]= data[i+1];
					data[i+1] = temp;

				}
										
			} 
		
			System.out.println("\n=============������2=============");
			for(int t: data){
				System.out.print(t+"\t");	
			}
		}

		System.out.println();
		System.out.println();
		System.out.println();
*/
		//���� �ݺ� ȸ�� �� ���̱�
		for(int j=0; j<data.length-1; j++){
			//        0  < 9  : 1~8
			//        0  < 8  : 1~7
			for(int i=0;i<data.length-1-j;i++){//0,1,2,3....8 ���ʰ��� �����̶�.
				if(data[i] > data[i+1]){
					//��ȯ				
					int temp = data[i];
					data[i]= data[i+1];
					data[i+1] = temp;

				}
										
			} 
		
			System.out.println("\n=============������3=============");
			for(int t: data){
				System.out.print(t+"\t");	
			}
		}



	}	
}
