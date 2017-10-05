class Demo {
	
	public static void main(String[]args){
		A aObj = new A();
		
		aObj.setX(50);
		aObj.display();
		
		
		A aObj2 = new A();
		aObj2.setX(100);
		aObj2.display();
		
		
	}
	
}


public class A {
	int x;
	
	public void display(){
		System.out.println(x);
	}
	
	public void setX(int xVal){
		x = xVal;
	}
	
	
}