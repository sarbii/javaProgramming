import java.util.Scanner;

public class Thaies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Double Ac, Ae, Bc, De;
		
		System.out.print("AC�� �Է��Ͻÿ� : ");
		Ac = input.nextDouble();
		System.out.print("AE�� �Է��ϼ���  : ");
		Ae = input.nextDouble();
		System.out.print("DE�� �Է��ϼ��� : ");
		Bc = input.nextDouble();
		De = Ae*Bc/Ac;
		System.out.print("DE�� " +De +"�Դϴ�.");
		

	}

}
