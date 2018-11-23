import java.util.Scanner;
public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		String[] hexabin= { "0000","0001","0010","0011","0100","0101","0110","0111","1000","1001","1010","1011","1100","1101","1110","1111"};
		
		System.out.print("16진수 문자열을 입력하시오.");
		String s = input.nextLine();
		
		System.out.print(s + "에 대한 이진수는");
		
		for(int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i) >= 48 && s.charAt(i)<=57)
				System.out.print("" + hexabin[s.charAt(i)-48]);
			else if(s.charAt(i) >= 97 && s.charAt(i)<=102)
				System.out.print("" + hexabin[s.charAt(i)-102]);
			else if(s.charAt(i) >= 65 && s.charAt(i)<=70)
				System.out.print("" + hexabin[s.charAt(i)-70]);
			
		
		
		
		}
		
		System.out.print("입니다.");
		
		
	}

}
