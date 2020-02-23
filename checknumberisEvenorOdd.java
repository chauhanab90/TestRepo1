package JavaRelatedTopics;

public class checknumberisEvenorOdd {

	public static void main(String[] args) {
		evenodd();
		evenodd2(3);
		evenodd2(10);
	}
		public static void evenodd(){
		
			int n=27;
			int rem = n%2;
			if(rem==0){
				System.out.println("this number " + n + " is even" );
			}
			else{
				System.out.println("this number " + n + " is odd");
			}
			
		}
		
		
		public static void evenodd2(int n){
			
			
			int rem= n%2;
			if(rem==0){
				System.out.println("this number " + n + " is even" );
			}
			else{
				System.out.println("this number " + n + " is odd");
			}
				
			}
			
		}
	
	
	

