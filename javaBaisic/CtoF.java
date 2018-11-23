import java.util.Scanner;

public class CtoF {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double x, y;
		System.out.print("¼·¾¾¿Âµµ¸¦ ÀÔ·ÂÇÏ½Ã¿À : ");
		x = input.nextDouble();
		y = 5*(x-32)/ 9;
		System.out.print(y);

	}

}
