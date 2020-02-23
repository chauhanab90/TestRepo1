package JavaRelatedTopics;

public class InheritanceChild extends InheritanceParent  {

	public static void main(String[] args) {
		
		InheritanceChild a = new InheritanceChild();
		a.add();
		a.substract(10, 5);
		a.multiplication(50, 20);
	}

}


//ABOUT INHERITANCE
//Inheritance in java is a mechanism in which child class acquires all the properties
//(variables,function) of parent class.
//Inheritance provides code re-usability. When you inherit from an existing class, you 
//can reuse methods and fields of parent class, and you can add new methods and field also.
//The class which inherits the properties of other is known as subclass(derived class,child class)
//and the class whose properties are inherited is known as super class(base class, parent class).
// Extends is the keyword used to inherit the properties of a class.
// Types of inheritance are:- 1- Single, 2- Multilevel and 3- Hierarchical