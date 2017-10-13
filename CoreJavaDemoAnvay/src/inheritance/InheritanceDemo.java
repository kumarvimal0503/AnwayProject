package inheritance;

public class InheritanceDemo {
	public static void main(String[]args){
		
		A a = new A();
		
		a.foo();
		
		B b = new B();
		
		b.foo();
		b.bar();
		
		A a1 = new B();
		a1.foo();
		
	}
}



class A {
	
	public void foo(){
		System.out.println("IN Foo -> parent class");
	}
	
}


class B extends A {
	public void bar(){
		System.out.println("IN bar -> Child class");
	}
}