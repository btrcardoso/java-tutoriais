package Operators;

public class InstanceofDemo {
	
	public static void main(String[] args) {
		Parent obj1 = new Parent();
		Child obj2 = new Child();
		
		System.out.println("obj1 instanceof Parent: " + (obj1 instanceof Parent));           // T
		System.out.println("obj1 instanceof Child: " + (obj1 instanceof Child));             // F
		System.out.println("obj1 instanceof MyInterface: " + (obj1 instanceof MyInterface)); // F
		
		System.out.println("obj2 instanceof Parent: " + (obj2 instanceof Parent));           // T
		System.out.println("obj2 instanceof Child: " + (obj2 instanceof Child));             // T
		System.out.println("obj2 instanceof MyInterface: " + (obj2 instanceof MyInterface)); // T
	}
	

}

class Parent{}
class Child extends Parent implements MyInterface{}
interface MyInterface{}