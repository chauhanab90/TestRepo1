package JavaRelatedTopics;

public class InheritanceParent {
	
	public int add(){
		
		int a = 10;
		int b = 20;
		int c = a+b;
		
		return c;
		
		
	}
	
	public void substract(int x, int y){
		
		int z= x-y;
		System.out.println(z);
	}
	
	public void multiplication(int x, int y){
		
		int z= x*y;
		System.out.println(z);
	}

	public static void main(String[] args) {
		
		InheritanceParent obj = new InheritanceParent();
		obj.substract(30,20);
		System.out.println(obj.add());
		

	}

}

