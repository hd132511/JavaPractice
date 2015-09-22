package org.dimigo.exception;

public class MovieTest {
	
	private static void buyTicket(Movie movie, int age) throws AgeCheckException{
		if(age <movie.getLimitAge())
			throw new AgeCheckException(movie);
		System.out.println("Enjoy " + movie.getTitle() +" PLZ!");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Movie[] movies = {
					new Movie("Ant Man", 12), new Movie("Sado", 12), new Movie("Veteran", 15)
			};
			
			int age = 13;
			
			for(Movie movie : movies) {
				buyTicket(movie, age);
			}
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
