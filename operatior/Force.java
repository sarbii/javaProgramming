import java.util.Scanner;

public class Force {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		double a, c, b;
		
		
		System.out.print("힘을 입력하세요 : ");
		a = input.nextDouble();
		System.out.print("면적을 입력하세요 : ");
		b = input.nextDouble();
		
		c = a/ b;
				
		
		System.out.print("압력의 세기는 " +c +" 입니다.");
	}

}
