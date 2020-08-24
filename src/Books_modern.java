
public class Books_modern implements Books_interface {
	
	private String author;
	private String title;
	private String address;
	
	Books_modern(String writer, String bookname, String address_input){
		this.author = writer;
		this.title = bookname;
		this.address = address_input;
	}
	
	
	public String getAuthor() {
		return author;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAddress() {
		return address;
	}
}
