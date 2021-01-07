class Farmer{
	
	String name;
	int age;
	
	//constructor initializing variables
	Farmer(String name,int age){
		this.name=name;
		this.age=age;
		System.out.println("name is "+ name + " and age is "+age);
				
	}
}

public class ConstructorTutorial {
	public static void main(String args[]) {
	 Farmer s=new Farmer("Dan",30);
	}

}
