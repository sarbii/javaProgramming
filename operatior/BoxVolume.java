import java.util.Scanner;

public class BoxVolume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		byte a, b, c;
		int d;
		
		
		System.out.print("������ ���� : ");
		a = input.nextByte();
		System.out.print("������ �ʺ� : ");
		b = input.nextByte();
		System.out.print("������ ���� : ");
		c = input.nextByte();
		
		d = a*b*c;
		System.out.println("������ ���Ǵ� " +d +"�Դϴ�.");
	}

}
