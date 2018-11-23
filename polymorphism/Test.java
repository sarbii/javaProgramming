import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Person[] person = new Person[3];
		 
		 person[0] = new Person("dd",170);
		 person[1] = new Person("aa",180);
		 person[2] = new Person("bb",160);
		 
		 
		
		 System.out.print(person[0].getMaximum(person));
		 
		
	}


}

