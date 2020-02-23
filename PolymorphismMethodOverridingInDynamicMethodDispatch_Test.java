package JavaRelatedTopics;

public class PolymorphismMethodOverridingInDynamicMethodDispatch_Test {

	public static void main(String[] args) {
		PolymorphismMethodOverridingInDynamicMethodDispatch_Parent obj = new PolymorphismMethodOverridingInDynamicMethodDispatch_Child();
		  obj.car();
		  obj.start();
		  obj.stop();
		  
		}

	}

// here we are assigning parent class reference to child class object hence one of the method
// in child class that is public void wash() is not getting displayed with obj reference above.
// This is called Method Overriding In Dynamic Method Dispatch.

/*
Dynamic method dispatch is a technique which enables us to assign the base class reference to a child
class object. As you can see in the above example that the base class reference is assigned to child
class object




*/