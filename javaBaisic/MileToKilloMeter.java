import java.util.Scanner;

public class MileToKilloMeter {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		int x;
		double  y;
		System.out.print("마일을 입력하시오 : ");
		x = input.nextInt();
		y = x*1.609;
	    System.out.print(x + "마일은" +y +"킬로미터입니다.");
	}

}
