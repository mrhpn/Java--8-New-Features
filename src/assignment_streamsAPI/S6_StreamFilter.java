package assignment_streamsAPI;

import java.util.List;
import java.util.function.Predicate;

/**
 * Predicates and Stream
 * @author Htet Phyo Naing
 *
 */
public class S6_StreamFilter {

	public static void main(String[] args) {
		List<Movie> movies = List.of(
				new Movie("a", 10), 
				new Movie("b", 20), 
				new Movie("c", 30)
			);
		
		Predicate<Movie> isPopular = m -> m.getLikes() > 10;
		
		movies
			.stream()
			.filter(isPopular)
			.forEach(m -> System.out.println(m.getTitle()));
	}

}
