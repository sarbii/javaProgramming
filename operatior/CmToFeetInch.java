import java.util.Scanner;

public class CmToFeetInch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a;
		double b, c, d;
		
		
		System.out.print("키를 입력하시오 : ");
		a = input.nextInt();
		b = (a%30.48)/2.54;
		c = (int)(a/30.48);
				
		
		System.out.print(+a +"cm는 " +c +"피트" +b +"인치 입니다.");
		
	}

}
