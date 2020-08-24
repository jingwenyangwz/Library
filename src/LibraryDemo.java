import java.util.ArrayList;

public class LibraryDemo {
	public static void main(String[] args) {
		
		ArrayList<Books_interface> Book_list = new ArrayList<Books_interface>();
		
		Books_interface book1 = new Books_modern("Marcel Proust","In Search of Lost Time","F01N09");
		Books_interface book2 = new Books_modern("James Joyce","Ulysses","F01N88");
		Books_interface book3 = new Books_modern("Miguel de Cervantes","Don Quixote","F05N54");
		Books_interface book4 = new Books_modern("F. Scott Fitzgerald","The Great Gatsby","F02N44");
		
		Books_old book5 = new Books_old("Herman Melville/Moby Dick/F02N16");
		Books_old book6 = new Books_old("Gabriel Garcia Marquez/One Hundred Years of Solitude/F06N82");
		Books_old book7 = new Books_old("Leo Tolstoy/War and Peace/F02N16");
		Books_old book8 = new Books_old("William Shakespeare/Hamlet/F08N62");
		
		Books_interface adapter5 = new Oldbooks_adapter(book5);
		Books_interface adapter6 = new Oldbooks_adapter(book6);
		Books_interface adapter7 = new Oldbooks_adapter(book7);		
		Books_interface adapter8 = new Oldbooks_adapter(book8);
		
		Book_list.add(book1);
		Book_list.add(book2);
		Book_list.add(book3);
		Book_list.add(book4);
		Book_list.add(adapter5);
		Book_list.add(adapter6);
		Book_list.add(adapter7);
		Book_list.add(adapter8);
	
		
		
		// search by author
		for(int i = 0; i < Book_list.size(); i ++){			
			if (Book_list.get(i).getAuthor().equalsIgnoreCase("james joyce")) {
				System.out.println("Author:: " + Book_list.get(i).getAuthor() + "; Title::' " + Book_list.get(i).getTitle() + "'; Location::" + Book_list.get(i).getAddress());
			}
		}
		
		// search by title
		for(int j = 0; j < Book_list.size(); j ++){			
				if (Book_list.get(j).getTitle().equalsIgnoreCase("Hamlet")) {
					System.out.println("Author:: " + Book_list.get(j).getAuthor() + "; Title::' " + Book_list.get(j).getTitle() + "'; Location::" + Book_list.get(j).getAddress());
			}
		}
		
		
		}
		
		
		
		
		 
		
	}

