
public class MethodOverloadDemo2 {
	
	
	//entry point 
	public static void main(String[]args) {
		foo("sfds");
		foo(10);
		foo(10L);
		foo(10.0f);
		
		//sum(20,20);//now ambiguity  
	}
	
	public static void foo(long a){
		System.out.println("long version");
	}
	
	public static void foo(double a){
		System.out.println("double version");
	}
	
	public static void foo(String a){
		System.out.println("String version");
	}
	
	//===============================================================
	
	
	static void sum(int a,long b){
		
		System.out.println("a method invoked");
	}
	
    static void sum(long a,int b){
    		System.out.println("b method invoked");
    }  
	
	
}
