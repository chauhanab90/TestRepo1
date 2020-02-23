package JavaRelatedTopics;

public class addingnumbers {

	//---this is main method start point for execution of a program---//
	public static void main(String[] args) {   
		addingnumbers(0);
		addingnumbers g = new addingnumbers();
		g.add(0);
		addition();
		
	}
	
	//---this is first method for adding a number---//
	private static void addingnumbers(int sum) {  
		 sum = 0;
		for (int i = 1; i <= 20; i++) {
			sum = sum +i;
			
		}
		System.out.println(" Sum for numbers : " + sum);
	}
	
	//---second method in this we used method called using object in main method to  print the sum---//
	public void add (int n){    
		
		n=0;
		for (int i = 0; i <=10; i++) {
			n=n+i;
			
		}
		System.out.println(" Sum for n : " + n);
}
	//---this is third method again using static method to add numbers---//
	public static void addition(){ 
		int b=0;
		for (int i = 0; i <=15; i++) {
			b=b+i;
		}
		System.out.println(" Sum for b : " + b);
	}
}