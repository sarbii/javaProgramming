import java.util.Scanner;

public class Volume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double a, b, c, d;
		
		
		System.out.print("����� �ظ��� �������� �Է��Ͻÿ� : ");
		a = input.nextInt();
		System.out.print("����� ���̸� �Է��Ͻÿ� : ");
		b = input.nextInt();
		
		d= a*a*3.14*b;
		System.out.println("������� ���Ǵ�" +d +"�Դϴ�");

	}

}
