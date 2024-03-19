package episode6;

public class LearnThisAndInstance {
	
	int c=15; // global variable/instance variable and it can be used anywhere within the class
	int num() {
	return 1;}
	
	void addTwoNumbers(int a,int b) {
		int c=20; //Local Variable and it can be used only within the function or method
		System.out.println(a+b+this.num()); //'this' is used to refer the global variable available within the class. Using 'this' we can call variable or function/method
	
	}
	
	public static void main(String[] args) {
		LearnThisAndInstance ls= new LearnThisAndInstance();
		ls.addTwoNumbers(10, 5);
		
	}
}