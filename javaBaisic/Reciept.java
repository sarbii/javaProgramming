import java.util.Scanner;

public class Reciept {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
			int x, y, a, b;
			int z;
		
			System.out.print("���� ��: ");
			x = input.nextInt();
			System.out.print("��ǰ�� �Ѿ�: ");
			y = input.nextInt();
z = (int)(y*0.1);

System.out.println("�ΰ���: " +z);
a = x - y;
System.out.print("�ܵ�: " +a);

	}

}
