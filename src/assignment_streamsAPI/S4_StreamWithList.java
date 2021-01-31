package assignment_streamsAPI;

import java.util.List;

public class S4_StreamWithList {

	public static void main(String[] args) {
		List<Movie> movies = List.of(
				new Movie("a", 10), 
				new Movie("b", 20), 
				new Movie("c", 30)
			);
		
		movies
			.stream()
			.map(movie -> movie.getTitle())
			.forEach(name -> System.out.println(name));
	}

}
