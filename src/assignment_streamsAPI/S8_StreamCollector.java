package assignment_streamsAPI;

import java.util.List;
import java.util.stream.Collectors;

public class S8_StreamCollector {

	public static void main(String[] args) {
		List<Movie> movies = List.of(
				new Movie("a", 10), 
				new Movie("b", 20), 
				new Movie("c", 30)
			);
		
		// Collect stream into some data structure
		List<Movie> result = movies
				.stream()
				.filter(m -> m.getLikes() > 20)
				.collect(Collectors.toList());
	
		// Output: ArrayList
		System.out.println(result.getClass()); 
	}

}
