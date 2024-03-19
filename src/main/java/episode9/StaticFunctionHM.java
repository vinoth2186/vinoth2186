package episode9;

public class StaticFunctionHM {
	
	static int a;
	static int b;
	static int c;
	public static void sleep(){
		
		a=2;
		b=6;
		c=a+b;
		
	System.out.println("8hr sleep is required for a person");
	System.out.println("total sleep hours===>> :"+c);
		
	}
	
	public void eat() {
		
	System.out.println("good eating habit must be followed");
	a=5;
	System.out.println("eating hours===> : "+a);	
	}
	
	public static void main(String[] args) {
	StaticFunctionHM SFHM=new StaticFunctionHM();
	SFHM.sleep();
	SFHM.eat();
		
	}

}
