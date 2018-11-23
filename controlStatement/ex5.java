import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a, b, c;
		Scanner input = new Scanner(System.in);
		
		System.out.println(" 함수의 값을 출력해주는 프로그램입니다. 숫자를 입력해주세요");
		a = input.nextDouble();
		
		if(a> 0)
			b = 7*a +2;
		else
			b = a*a*a - 9*a +2;
		
		System.out.print("함수에의한 출력값은" +b +"인니다");
		
	}

}
