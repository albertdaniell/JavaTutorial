class Rectangle{
	
	int length;
	int width;
	int area;
	
	//initialize the variables here
	void insert(int l,int w) {
		length=l;
		width=w;
		area=l*w;
	}
	
	//display the area
	
	void display() {
		System.out.println("The area of the rectangle is "+ area);
	}
}


public class TestRectangle {
	

	public static void main(String args[]) {
		Rectangle r=new Rectangle(); // instantiate object
		Rectangle r2=new Rectangle(); // instantiate object
		
		r.insert(20,30);
		r2.insert(3,4);
		
		r.display();
		r2.display();
		
	}
	

}
