import java.util.Scanner;

public class HelloWorld {
public static void main(String args[]) {
	Scanner input = new Scanner(System.in); //new�� ��������� ������Ʈ�� ����� >> input�̶�� ������ ����
	
	int x, y, sum = 0;
	
	System.out.print("Input data 1: ");
	x = input.nextInt();
	System.out.print("Input data 2: ");
	y = input.nextInt();

	sum = x + y;
	

	System.out.println("Data = " +sum);
}
}
