package com.satish.collectionsapps;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableDemo1 {

	public static void main(String[] args) {
		ArrayList<Movie1> movieList = new ArrayList<>();
		movieList.add(new Movie1("3 idts", 2012, "amir"));
		movieList.add(new Movie1("Rockstar", 2009, "ranbir"));
		movieList.add(new Movie1("kabil", 2000, "hritik"));
		movieList.add(new Movie1("rajababu", 1998, "govinda"));
		movieList.add(new Movie1("uri", 2021, "vicky"));
		Collections.sort(movieList);
		for(Movie1 movie:movieList) {
			System.out.println(movie);
		}
		

	}

}
