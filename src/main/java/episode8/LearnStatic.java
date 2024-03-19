package episode8;

public class LearnStatic {
	
	int x=0 ; //Instance Variable or global variable and it will be initialized based on object and whenever the new object is written, it will get initiallized
	static int y=0; //Static Variable and it will be initialized once for the class
	
	void counter() {
		x++;
		y++;
		System.out.println("non-static==>"+x + "static===>"+y);
		
	}
	
	public static void main(String[] args) {
		LearnStatic ls = new LearnStatic();
		ls.counter();
		ls.counter();
		ls.counter();
		
		//creating the object again
		
		LearnStatic ls1=new LearnStatic();
		ls1.counter();
		ls1.counter();
		
		//creating the object again
		
		LearnStatic ls2=new LearnStatic();
		ls2.counter();
		ls2.counter();
	} 
		
}
