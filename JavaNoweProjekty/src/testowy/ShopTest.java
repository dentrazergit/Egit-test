package testowy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ShopTest {
	private static ArrayList<Song> songList = new ArrayList<Song>();
	private static HashMap<String, Album> albums = new HashMap<String, Album>();
	private static Scanner in = new Scanner(System.in);
	

	/**
	 * A program to test shop, albums, songs
	 */
	public static void main(String[] args) {

		setup();

	}

	/* Prints switch statment and ask user to select his choice */
	private static void setup() {
		int choice = 1;
		while (choice != 0) {
			printMsg();

			choice = in.nextInt();
			switch (choice) {

			case 1: {
				listAllSongs();
				break;
			}
			case 2: {
				listAllAlbums();
				break;
			}
			case 3: {
				addSong();
				break;
			}
			case 4: {
				addAlbum();
				break;
			}
			case 5: {
				listAllSongsInAlbum();
				break;
			}
			case 6: {
				updateSongPrice();
				break;
			}
			case 0: {

				break;
			}
			default: {
				break;
			}

			}
		}
	}

	/* Prints welcome msg in console */
	private static void printMsg() {
		System.out.println("-------Welcome in the Shop------\n");
		System.out.println("1 - to list all songs : ");
		System.out.println("2 - to list all albums album : ");
		System.out.println("3 - to add Song : ");
		System.out.println("4 - to add an Album : ");
		System.out.println("5 - to list songs on album : ");
		System.out.println("6 - to update song price : ");
		System.out.println("0 - to QUIT : ");
	}

	/* List all avalible songs */
	private static void listAllSongs() {
		System.out.println("List of all songs");
		for (Song s : songList) {
			System.out.println(s.toString() + "\n");
		}
	}

	/* List all avalible albums */
	private static void listAllAlbums() {
		System.out.println("List of all albums: ");
		for (String a : albums.keySet()) {
			System.out.println(albums.get(a).getAlbumName());
		}
	}

	/* add song */
	private static Song addSong() {
		
		while (true) {
			
			System.out.print("Enter song name: ");
			String name = in.next();
			System.out.print("Enter band name: ");
			String band = in.next();
			System.out.print("Enter price of the Song: ");
			double price = in.nextDouble();
			if (name.equals("0") || band.equals("0") || (price ==0)) {
				return null;

			}
			if (findSong(name, band) == true) {
				System.out.println("Already there");
			} else {
				Song newSong = new Song(name, band, price);
				songList.add(newSong);
				return newSong;
			}
			
		
		}

	}

	private static boolean findSong(String name, String band) {
		boolean contain = false;
		for(Song s : songList){
			if(s.getBandName().equals(band) && s.getSongName().equals(name))
				return true;
		}
		
		return false;
	}

	/* Add song to the album */
	private static boolean addAlbum() {
		Album album;
		String nameOfAlbum="";
		String bandName="";
		if(nameOfAlbum.equals("0")||bandName.equals("0")){
			return false;
		}else{
		while(true){
			//ask for name of album			
			System.out.print("Enter the name of album: ");
			nameOfAlbum = in.next();			
			System.out.print("Enter the bandName of album: ");
			bandName = in.next();
			if(albums.containsKey(nameOfAlbum)){
				System.out.println("It already has that album");
				break;
			}else{
				album = new Album(nameOfAlbum,bandName);
				albums.put(nameOfAlbum, album);
				while(true){
					Song song = addSong();
					if(song==null)break;
					album.addSongToAlbym(song);
				}
			}
			
		}
		return true;
		}

	}

	/* List all songs in album */
	private static void listAllSongsInAlbum() {
		System.out.print("List of songs in Album: ");
		String name = in.next();
		Album searchedAlbum = albums.get(name);

		ArrayList<Song> nowaLista = searchedAlbum.getSongList();
		for (Song s : nowaLista) {
			System.out.println(s.toString());
		}
	}

	/* Update price of specific song */
	private static void updateSongPrice() {
		System.out.print("Enter song name: ");
		String name = in.next();
		System.out.print("Enter the bandName of album: ");
		String bandName = in.next();
		if (findSong(name, bandName)) {
			System.out.println("Enter price:");
			double price = in.nextDouble();
			for (Song s : songList) {
				s.setPrice(price);
			}
		}

	}

}
