package com.satish.collectionsapps;

public class Movie1 implements Comparable<Movie1> {
	private String movieName;
	private int year;
	private String actor;

	public Movie1() {

	}

	public Movie1(String movieName, int year, String actor) {

		this.movieName = movieName;
		this.year = year;
		this.actor = actor;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public int getYear() {
		return year;
	}

	public void setTicketPrise(int ticketPrise) {
		this.year = year;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	@Override
	public String toString() {
		return "Movie1 [movieName=" + movieName + ", year=" + year + ", actor=" + actor + "]";
	}

	@Override
	public int compareTo(Movie1 movie) {
		return this.year - movie.year;

	}

}
