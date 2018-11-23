
public class Book {
	int number;
	String title, author;
	public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number =number;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    
    public boolean equals(Object otherObject) {
		Book other = (Book) otherObject;
		if(number==other.number)
			return true;
		
		else 
			return false;
	}
}
