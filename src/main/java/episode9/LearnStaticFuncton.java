package episode9;

public class LearnStaticFuncton {
	
	static int b=10;
	int a =10;
	public static void displayName() {
		System.out.println("Vinoth");
		//System.out.println(a); //we can not call non static variable to a non static function/method 
		System.out.println(b); //we can call static variable to a static function/method 
	}
	
	public static void main(String[] args) {
		
		//We dont need the object to call the static function/method. we can just put the function name in the main method to call the function or method
		
		//LearnStaticFuncton ls = new LearnStaticFuncton();
		displayName();
	}
	
	
}




