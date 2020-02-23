package JavaRelatedTopics;

public class PolymorphismOverloading {

       public void add(int a, int b){
    	   int c= a+b;
    			   System.out.println(c);
       }
       public void add (int a, int b, int c){
    	   int d= a+b+c;
    	   System.out.println(d);
       }
       public static void main(String[] args) {
		
	}
}
	
// ---------------- ABOUT POLYMORPHISM_OVERLOADING -------------//
/*
 * When one task is performed in different ways i,e.know as polymorphism. In
 * Java we use method overloading and method overriding to achieve polymorphism.
 * 1--> Compile time Polymorphism (Static binding or method overloading)-- In
 * this we used to write a program in such a way , that flow of control is
 * decided in compile time itself and this is achieved using method
 * overloading.In Java it is possible to define two or more methods of same name
 * in a class or subclass provided that there argument list or parameter are
 * different.
 * -- Method overloading can take place in same class or its subclass
 * -- Constructor in JAVA can be overloaded
 * -- Overloaded methods can be of same class or subclass, with same name but different parameters
 * -- It can have different access modifiers
 * 
 * 
 * 
 * 
 * 
 */

