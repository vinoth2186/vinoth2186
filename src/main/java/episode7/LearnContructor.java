package episode7;

//we can create our own constructor like method/function. and the format is AccessModifier, Constructor (note: we dont have return type here)
//Constructor name has to be as same as class name
//We are using the constructor to change the value for the instance variable
//We can do the constructor overloading like method or function to pass multiple values
//Default constructor is 'Public', Public is public and private can not be called out side the class

public class LearnContructor {
	
	/*public LearnContructor() {
		this.X=1000;
	}*/
	
	public LearnContructor(int x) {
		this.X=x;
	}
	
	public LearnContructor(int x, String s) {
		this.X=x;
		this.name=s;
	}
	
	int X;
	String name;
	
	void display(){
		System.out.println(X+ "->"+ name);
	}
	
	public static void main(String[] args) {
		LearnContructor ls=new LearnContructor(1000); //Constructor will initialize the default value for instance/global variables here x and name are instance variable and it is setting the dedault for int default value is 0 and for string the default value is null
		ls.display(); 
		LearnContructor ls1=new LearnContructor(100,"newname");		
		ls1.display(); 
	}

}
