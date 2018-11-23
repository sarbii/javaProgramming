class Movie{

	 
	
		
		int year, rate  ;
		String title, PD;
		void print1()
		{
			System.out.println(" 영화제목 :  " +title +"\n 평점 : "  +rate +"\n 감독  : " +PD +"\n 발표 연도 : " +year);
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
