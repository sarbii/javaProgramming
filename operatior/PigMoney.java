import java.util.Scanner;

public class PigMoney {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		byte a, b, c;
		int d;
		
		
		System.out.print("500���� ���� : ");
		a = input.nextByte();
		System.out.print("100���� ���� : ");
		b = input.nextByte();
	
		
		d = 500*a+100*b;
		System.out.println("�������� �ѱݾ��� " +d +"�Դϴ�.");
	}

}
