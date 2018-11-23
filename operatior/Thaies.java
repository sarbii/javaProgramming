import java.util.Scanner;

public class Thaies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Double Ac, Ae, Bc, De;
		
		System.out.print("AC를 입력하시오 : ");
		Ac = input.nextDouble();
		System.out.print("AE를 입력하세요  : ");
		Ae = input.nextDouble();
		System.out.print("DE를 입력하세요 : ");
		Bc = input.nextDouble();
		De = Ae*Bc/Ac;
		System.out.print("DE는 " +De +"입니다.");
		

	}

}
