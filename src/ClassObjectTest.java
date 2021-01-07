class Student{
	int id = 2563;
	String name="Daniel Albert Agoya";
}


public class ClassObjectTest {
	int id; //declaring variable id
	String name; // declaring variable name
	
	public static void main(String args[]) {
		Student s=new Student(); // instantating an object from a class
		Student s2=new Student();
		Student s3 = new Student();
		
		//initializing
		s2.name="Makena Chix";
		s3.name="Anisa Archie";
		
		System.out.println(s.id);
		System.out.println(s.name);
		System.out.println(s3.name);
		
	}

}
