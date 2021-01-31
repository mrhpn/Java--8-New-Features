package assignment_streamsAPI;

import java.util.List;

public class S7_StreamSlicing {

	public static void main(String[] args) {
		List<Movie> movies = List.of(
				new Movie("a", 10), 
				new Movie("b", 20), 
				new Movie("c", 30)
			);
		
		// limiting movies - limit
		movies
			.stream()
			.limit(2)
			.forEach(m -> System.out.println(m.getTitle()));
		
		// skiping movies - skip
		movies
			.stream()
			.skip(2)
			.forEach(m -> System.out.println(m.getTitle()));
		
		// filtering movies - takeWhile
		movies
			.stream()
			.takeWhile(m -> m.getLikes() < 30)
			.forEach(m -> System.out.println(m.getTitle()));
		
		// filtering movies - dropWhile
		movies
			.stream()
			.dropWhile(m -> m.getLikes() < 30)
			.forEach(m -> System.out.println(m.getTitle()));
	}

}
