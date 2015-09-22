package org.dimigo.exception;

public class AgeCheckException extends Exception{
	
	public AgeCheckException() {
	}

	public AgeCheckException(Movie movie) {
		super(movie.getTitle() + " can see above" + movie.getLimitAge() + " years OLD!");
	}
}
