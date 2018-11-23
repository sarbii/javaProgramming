import java.util.Scanner;

public class Divide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int a, b, c, d;
		
		
		System.out.print("정수를 입력하시오 : ");
		b = input.nextInt();
		System.out.print("정수를 입력하시오 : ");
		a = input.nextInt();
		c = b/a;
		d= b%a;
		System.out.println(b +"를" +a +"으로 나눈 몫은" +c +"이고 나머지는 " +d +"입니다");
		
	}

}
