public class StaticDemo1 {
	
	public static void main(String[]args){
		Bar b1 = new Bar();
		Bar b2 = new Bar();
	}
	
}


class Bar {
	
	static {
		System.out.println("Class Loaded");
	}
	
	{
		System.out.println("Code Block Called");
		
	}
	
}