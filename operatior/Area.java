import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		final double METERSQUARE = 3.3058;

		
	
		double a, d;
		
		
		System.out.print("당신의 집평수를 말해주세요 : ");
		a = input.nextDouble();
		
		
		d = a*METERSQUARE;
		System.out.println("당신의 집은" +d +"평 입니다.");
	}

}
