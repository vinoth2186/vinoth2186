package episode6;

public class RunsCategory {
	
	int extras=10;
	
	void runsscored(int a, int b, int c, int d) {
		int extras=5;
		System.out.println(a+b+c+d+extras);} //using the local variable
	
	void runsscored1(int a, int b, int c, int d) {
			int extras=6;
			System.out.println(a+b+c+d+this.extras); //Using the instance variable
	}
	
	public static void main(String[] args) {
		RunsCategory rs=new RunsCategory();
		rs.runsscored(1, 2, 4, 6);
		rs.runsscored1(2, 6, 6, 3);
		
			
	}

}
