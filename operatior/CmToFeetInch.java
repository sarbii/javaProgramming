import java.util.Scanner;

public class CmToFeetInch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a;
		double b, c, d;
		
		
		System.out.print("Ű�� �Է��Ͻÿ� : ");
		a = input.nextInt();
		b = (a%30.48)/2.54;
		c = (int)(a/30.48);
				
		
		System.out.print(+a +"cm�� " +c +"��Ʈ" +b +"��ġ �Դϴ�.");
		
	}

}
