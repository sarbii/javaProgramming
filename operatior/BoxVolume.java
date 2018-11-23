import java.util.Scanner;

public class BoxVolume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		byte a, b, c;
		int d;
		
		
		System.out.print("상자의 깅이 : ");
		a = input.nextByte();
		System.out.print("상자의 너비 : ");
		b = input.nextByte();
		System.out.print("상자의 높이 : ");
		c = input.nextByte();
		
		d = a*b*c;
		System.out.println("상자의 부피는 " +d +"입니다.");
	}

}
