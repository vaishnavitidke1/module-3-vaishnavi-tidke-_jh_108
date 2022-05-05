import java.util.*;

class StackArray{
	int [] arr;
	int size;
	int top1;
	int top2;
	
	StackArray(int a){
		size = a;
		arr = new int[a];
		top1=a/2+ 1;
		top2 =a/2;
		
		
	}
	void push(int v){
		if(top1>0){
			top1--;
		}
		else{
			System.out.println("overflow");
			
			
		}
		return;
	}
		void pushtwo(int v ){
			if(top2 < size-1){
				top2++;
				arr[top2] =v;
				
			}
			else{
				System.out.println("overflow");
			}
			return;
		}
		int pop(){
			if(top1<=size/2)
			{
				int v = arr[top1];
				top1++;
				return v;
				
			}	
               else{
		System.out.println("underflow pop 1");
			
                 }	
                  return -1	;			 
	
	} 
	      int poptwo(){
			  if(top2>= size/2 +1)
			  {
				  int v = arr[top2];
				  top2--;
				  return v;
			  }
			  else{
				System.out.println("underflow pop 2 ");
				System.exit(1);

			  }
			  return 1;
			  
		  }
		  public static void main(String ... args){
			 StackArray a1 = new StackArray(7);
                  a1.push(5);	
				  a1.pushtwo(10);	
				  a1.push(15);	
				  a1.pushtwo(11);	
				  a1.push(7);	
				 
          System.out.println("Popped element from stack1 is "+ a1.pop()); 
	            a1.pushtwo(40);
   System.out.println("Popped element from stack2 is "+ a1.poptwo()); 
		  }
	
}