import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a, b, c;
		Scanner input = new Scanner(System.in);
		
		System.out.println(" �Լ��� ���� ������ִ� ���α׷��Դϴ�. ���ڸ� �Է����ּ���");
		a = input.nextDouble();
		
		if(a> 0)
			b = 7*a +2;
		else
			b = a*a*a - 9*a +2;
		
		System.out.print("�Լ������� ��°���" +b +"�δϴ�");
		
	}

}
