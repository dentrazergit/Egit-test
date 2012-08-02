package kolejny;

import java.util.EnumSet;

public class BookTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for(Book book :Book.values()){
			System.out.printf("%-10s %-45s %s\n",book,book.getName(),book.getYear() );
		}
		System.out.println();
		for(Book book :EnumSet.range(Book.CHTP, Book.SF)){
			System.out.printf("%-10s %-45s %s\n",book,book.getName(),book.getYear() );
		}
	}

}
