import java.util.Scanner;

public class Divide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int a, b, c, d;
		
		
		System.out.print("������ �Է��Ͻÿ� : ");
		b = input.nextInt();
		System.out.print("������ �Է��Ͻÿ� : ");
		a = input.nextInt();
		c = b/a;
		d= b%a;
		System.out.println(b +"��" +a +"���� ���� ����" +c +"�̰� �������� " +d +"�Դϴ�");
		
	}

}
