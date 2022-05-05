import java.util.Arrays;

class insertionsort{
	public static void main(String... args){
		int []a1={1,2,4,5,4,9,8,2};
		
		int len1 = a1.length;
		
		System.out.println("Array before sorting"+Arrays.toString(a1));
		
		for(int i =len1-1 ;i>=0;i--){
			int var=a1[i];
			int j=i-1;
			int temp = 0;
			
			while(j>=0 && a1[j]>=var){
				temp=a1[j+1]=a1[j];
				a1[j]=a1[j+1];
				a1[j+1]=temp;
				j--;
				
			}
			temp=a1[j+1];
			a1[j+1]=temp;
			var=temp;
			System.out.println(Arrays.toString(a1));
		}	
			
		System.out.println(Arrays.toString(a1)+" --->sorted Array");
	}
	}
