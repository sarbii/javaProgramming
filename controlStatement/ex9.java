import java.util.Scanner;

import javax.print.DocFlavor.STRING;
public class ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a;
		double b, c;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է��ϼ���");
		b = input.nextDouble();
		
		System.out.println("���ڸ� �Է��ϼ���");
		c = input.nextDouble();
		
		System.out.println("������ �Է��ϼ���");
		a = input.next();
		
		if(a.equals("+"))
			System.out.println(b+c);
		else if(a.equals("-"))
			System.out.println(b-c);
		else if(a.equals("*"))
			System.out.println(b*c);
		else if(a.equals("/"))
			if(c==0)
			System.out.println("0���� ������ �����ϴ�.");
			else
			System.out.println(b/c);
				
	}

}
