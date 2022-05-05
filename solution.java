import java.util.Array;

class insertionsort{
	public static void main(String... args){
		int []a1={1,2,4,5,3};
		
		int len1 = a1.length;
		
		System.out.println("Array before sorting"+Array.toString(a1));
		
		for(int i =1 ;i<a1.length;i++){
			int var=a1[i];
			int j=i-1;
			int temp = 0;
			
			while(j>=0 && a1[j]>=var){
				a1[j]=a1[j+1];
				a1[j+1]=temp;
				j--;
				
			}
			temp=a1[j+1];
			a1[j+1]=temp;
			var=temp;
			System.out.println(Array.toString(a1));
		}	
			
		System.out.println(Array.toString(a1)" --->sorted Array");
	}
	}
