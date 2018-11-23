
public class ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		b = 10;
				c = 10;
				int cnt=0;
		
		for(a=1;a<b;a++)
			for(b=a;b<c;b++)
				for(c=b;c<100;c++)
					if(c*c == a*a + b*b)
						{System.out.println(a +"  " +b +"  " +c);
						cnt++;
						}
					else
						continue;
		
		System.out.println(cnt);
	}

}
