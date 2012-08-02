package testowy;

public class Song {

	private String songName;		//Name of the song
	private String bandName;		//Name of the band
	private double price;			//Price of one song
	
	//constructor of Song object
	public Song(String nameOfSong, String nameOfBand, double priceOfSong){
		songName = nameOfSong;
		bandName = nameOfBand;
		price = priceOfSong;
	}
	
	//getters and setters
	public String getSongName() {
		return songName;
	}

	public String getBandName() {
		return bandName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	public String toString(){
		return String.format("%s by %s cost: $%,.2f", getSongName(),getBandName(),getPrice());
	}
	
	
	

}
