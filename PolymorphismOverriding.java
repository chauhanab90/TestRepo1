package JavaRelatedTopics;

public class PolymorphismOverriding extends PolymorphismOverloading  {
	
	
	public void add(int z, int y){   // this is overriding as method from previous has been overridden
		int b= z+y;
		System.out.println(b);
		
	}

	public static void main(String[] args) {
		PolymorphismOverriding obj = new PolymorphismOverriding();
		obj.add(6, 8);
		obj.add(4, 5, 6);
		

	}

}


//-------------------------POLYMORPHISM_OVERRIDING---------------------------------
/*
Declaring same methods in subclass which is already present in parent class is know as
method overriding 
Static method cannot be overridden (because static method is bound with class whereas instance method
is bound with object. Static belongs to class area while instance belongs to heap area)
We cannot override main method as main method is static method



*/