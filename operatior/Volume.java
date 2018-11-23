import java.util.Scanner;

public class Volume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double a, b, c, d;
		
		
		System.out.print("원기둥 밑면읜 반지름을 입력하시오 : ");
		a = input.nextInt();
		System.out.print("원기둥 높이를 입력하시오 : ");
		b = input.nextInt();
		
		d= a*a*3.14*b;
		System.out.println("원기둥의 부피는" +d +"입니다");

	}

}
