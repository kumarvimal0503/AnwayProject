
public class StaticDemo {
	
	public static void main(String[]args){
		Foo f1 = new Foo();
		Foo f2 = new Foo();
		
		System.out.println(Foo.getObjectCount());
		
		
		
	}
	
}


class Foo {
	
	static int count;
	
	Foo(){
		count++;
	}
	
	
	public static int getObjectCount(){
		
		return count;
	}
	
	
}

