class Car{
	String color;
	int speed, gear;
	void print() {
				System.out.println("(" +color +"," +speed +"," +gear +")");
				
	}
}
public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		myCar.color = "red";
		myCar.speed = 1;
		myCar.gear = 2;
		myCar.print();

	}

}
