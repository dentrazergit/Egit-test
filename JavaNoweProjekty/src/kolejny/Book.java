package kolejny;

public enum Book {

	JHTP("Java how to program ","2012"),
	CHTP("C++ how to program ","2012"),
	IW3HTP("Internet World and wide how to program ","1999"),
	SF("Science Fiction ","2005");
	
	private  final String nameOfBook;
	private  final String yearOfCopyright;
	
	Book(String name, String year){
		nameOfBook = name;
		yearOfCopyright = year;
	}
	
	public String getName(){
		return nameOfBook;
	}
	public String getYear(){
		return yearOfCopyright;
	}
}
