import java.util.Scanner;

public class Reciept {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
			int x, y, a, b;
			int z;
		
			System.out.print("¹ÝÀº µ·: ");
			x = input.nextInt();
			System.out.print("»óÇ°ÀÇ ÃÑ¾×: ");
			y = input.nextInt();
z = (int)(y*0.1);

System.out.println("ºÎ°¡¼¼: " +z);
a = x - y;
System.out.print("ÀÜµ·: " +a);

	}

}
