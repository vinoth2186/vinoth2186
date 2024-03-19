package episode7;

public class LearnerHM {
	String LearnerName;
	int Age;
	Long Cellnum;
	
	public LearnerHM(String a,int b,long c) {
		this.LearnerName=a;
		this.Age=b;	
		this.Cellnum=c;
	}
	
	void display() {
		System.out.println(LearnerName+  Age  +  Cellnum);
	}
	
	
	public static void main(String[] args) {
		LearnerHM ls=new LearnerHM("Vinoth",37,67787878L);
		ls.display();
		LearnerHM ls1=new LearnerHM("Prema",37,67787878L);
		ls1.display();
		LearnerHM ls2=new LearnerHM("Lakshitha",37,67787878L);
		ls2.display();
		
		
		
	}
}
