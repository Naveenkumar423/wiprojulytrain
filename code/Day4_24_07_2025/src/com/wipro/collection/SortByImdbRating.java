package com.wipro.collection;

import java.util.Comparator;

public class SortByImdbRating implements Comparator<Movie> {

	@Override
	public int compare(Movie o1, Movie o2) {
		// TODO Auto-generated method stub
		Double d1=Double.valueOf(o1.getImdbRaing());
		Double d2=Double.valueOf(o2.getImdbRaing());
		return d1.compareTo(d2);
	}

}
