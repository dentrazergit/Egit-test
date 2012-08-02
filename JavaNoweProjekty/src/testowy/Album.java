package testowy;

import java.util.ArrayList;
import java.util.Iterator;

public class Album {

	private String albumName;			//Name of the album
	private ArrayList <Song> songList = new ArrayList<Song>();	//List of songs
	private String bandName;
	
	public Album(String nameOfAlbym, String nameOfBand){
		albumName = nameOfAlbym;
		bandName = nameOfBand;
		
	}

	
	//getters and setters
	public String getBandName(){
		return bandName;
	}
	public String getAlbumName() {
		return albumName;
	}


	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}


	public ArrayList<Song> getSongList() {
		return songList;
	}


	public void setSongList(ArrayList<Song> songList) {
		this.songList = songList;
	}
	
	public void addSongToAlbym(Song song){
		getSongList().add(song);
	}
	
	public Iterator<Song> getSongs(){
		return songList.iterator();
	}

	public String toString(){
		String s = "";
		for(Song song: songList){
			s = song.toString() + "\n";
		}
		return s;
	}
	
}
