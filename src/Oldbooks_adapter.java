public class Oldbooks_adapter implements Books_interface{

	private Books_old book;
	Oldbooks_adapter(Books_old oldbook_input){
		this.book = oldbook_input;
	}

	public String getAuthor() {
		String[] parts1 = book.getIndexCard().split("/");
		return parts1[0];
	}

	public String getTitle() {
		String[] parts2 = book.getIndexCard().split("/");
		return parts2[1];
	}

	public String getAddress() {
		String[] parts3 = book.getIndexCard().split("/");
		return parts3[2];	
	}

}
