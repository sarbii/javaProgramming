import java.util.Scanner;

public class PigMoney {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		byte a, b, c;
		int d;
		
		
		System.out.print("500원의 개수 : ");
		a = input.nextByte();
		System.out.print("100원의 개수 : ");
		b = input.nextByte();
	
		
		d = 500*a+100*b;
		System.out.println("저금통의 총금액은 " +d +"입니다.");
	}

}
