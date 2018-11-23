class Date{

	 
	
		
		int year, month, day ;
		String month1;
		void print1()
		{
			System.out.println(" \" " +year +"."  +month +"." +day +" \" ");
		}
		void print2()
		{
			System.out.println(" \" " +month1 +"."  +day +"." +year +" \" ");
		}
		
	}


public class DateTest{
	public static void main(String[] args)
	{
		Date myDate = new Date();
		myDate.year = 2012;
		myDate.month = 7;
		myDate.day = 2;
		myDate.month1 = "July";
		myDate.print1();
		myDate.print2();
		
	}
	
}
