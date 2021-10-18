package oop.basic;

public class Movie {
	private String title;
	private String genre;
	
	public void setTitle(String title) {
		this.title = title;
	}
	public void setGenre(String gerne) {
		this.genre = gerne;
	}
	public void play() {
		System.out.println(this.title+"("+this.genre+") 상영중입니다.");
	}

}
