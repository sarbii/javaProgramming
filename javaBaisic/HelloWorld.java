import java.util.Scanner;

public class HelloWorld {
public static void main(String args[]) {
	Scanner input = new Scanner(System.in); //new는 사용을위해 오브젝트를 만든거 >> input이라는 변수에 저장
	
	int x, y, sum = 0;
	
	System.out.print("Input data 1: ");
	x = input.nextInt();
	System.out.print("Input data 2: ");
	y = input.nextInt();

	sum = x + y;
	

	System.out.println("Data = " +sum);
}
}
