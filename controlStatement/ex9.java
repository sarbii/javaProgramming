import java.util.Scanner;

import javax.print.DocFlavor.STRING;
public class ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a;
		double b, c;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		b = input.nextDouble();
		
		System.out.println("숫자를 입력하세요");
		c = input.nextDouble();
		
		System.out.println("연산을 입력하세요");
		a = input.next();
		
		if(a.equals("+"))
			System.out.println(b+c);
		else if(a.equals("-"))
			System.out.println(b-c);
		else if(a.equals("*"))
			System.out.println(b*c);
		else if(a.equals("/"))
			if(c==0)
			System.out.println("0으로 나눌수 없습니다.");
			else
			System.out.println(b/c);
				
	}

}
