class Rectangle{

	int w, h, area, perimeter;
	void print() {
		System.out.println("(" +w +"," +h +"," +area +"," +perimeter +")");
		
	}
	

}

public class RectangleTest{

	public static void main(String args[]) {
		Rectangle myRectangle = new Rectangle();
		
	
		myRectangle.w = 2;
		myRectangle.h = 3;
		myRectangle.area = myRectangle.w*myRectangle.h;
		myRectangle.perimeter = 2*myRectangle.w + 2*myRectangle.h;
		
		myRectangle.print();
		
		
	}
}