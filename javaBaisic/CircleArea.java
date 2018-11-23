import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double x, y;
		System.out.print("구의 반지름을 입력하시오: ");
		x = input.nextDouble();
		y = 4* x* x* x/ 3;
		System.out.print("구의 부피는 " +y +"입니다.");
		
	}

}
