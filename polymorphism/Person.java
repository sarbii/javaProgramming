


public class Person implements Comparable {
	
	String name;
	double height;
	
	public Person(String n, double u) {
		name = n;
		height = u;
	}
	
	public int compareTo(Object otherObject) {
		Person other = (Person) otherObject;
		if(height<other.height)
			return 1;
		else if(height>other.height)
			return -1;
		else 
			return 0;
	}

	 
	
	public String getMaximum(Person[] array) {
	 for(int i=0; i < array.length -1 ; i++) {
			
		 if(array[i].compareTo(array[i+1]) == 1) {
			 array[i] = array[i+1];
		 }
		 else
			 array[i] = array[i];
	 }
	 if(array[0].height>this.height)
		 return array[0].name;
	 else
		 return
				 this.name;
	}



}