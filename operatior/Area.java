import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		final double METERSQUARE = 3.3058;

		
	
		double a, d;
		
		
		System.out.print("����� ������� �����ּ��� : ");
		a = input.nextDouble();
		
		
		d = a*METERSQUARE;
		System.out.println("����� ����" +d +"�� �Դϴ�.");
	}

}
