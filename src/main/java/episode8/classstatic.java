package episode8;

public class classstatic {
	int a=1;
	static int b=1;
	
	void increment() {
	a++;
	b++;
	System.out.println("NON STATIC VARIABLE==>> " + a + "STATIC VARIABLE==>> "+b);
		
	}
	
	public static void main(String[] args) {
		
		classstatic cs=new classstatic();
		cs.increment();
		cs.increment();
		
		classstatic cs1=new classstatic();
		cs1.increment();
		
		
	}
	

}
