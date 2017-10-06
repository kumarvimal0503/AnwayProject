
public class MethodOverloadDemo {
	public void add(int a, int b){
		System.out.println((a + b));
	}
	
	
	public void add(int a, int b, int c){
		System.out.println((a + b + c));
	}
	
	
	public void add(int a, float b){
		System.out.println((a + b));
	}
}
