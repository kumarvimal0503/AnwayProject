
public class MethodOverloadDemo {
	public static void add(int a, int b){
		
		System.out.println("Add Integer 2 param");
		System.out.println((a + b));
	}
	
	
	public static void add(int a, int b, int c){
		System.out.println("Add Integer 3 param");
		System.out.println((a + b + c));
	}
	
	
	public static void add(float a, float b){
		System.out.println("Add float 2 param");
		System.out.println((a + b));
	}
	
	
	public static void main(String[]args) {
		
		add(10, 20);
		add(10, 20, 30);
		add(10.1f, 20.2f);
	}
}
