class Movie{

	 
	
		
		int year, rate  ;
		String title, PD;
		void print1()
		{
			System.out.println(" ��ȭ���� :  " +title +"\n ���� : "  +rate +"\n ����  : " +PD +"\n ��ǥ ���� : " +year);
		}
	
		
	}


public class MovieTest{
	public static void main(String[] args)
	{
		Movie myMovie = new Movie();
		myMovie.year = 2012;
		myMovie.rate = 7;
		myMovie.PD = "KIM";
		myMovie.title = "July";
		myMovie.print1();
	
		
	}
	
}
