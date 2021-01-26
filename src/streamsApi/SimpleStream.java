package streamsApi;

import java.util.stream.Stream;

public class SimpleStream {

	public static void main(String[] args) {
		// Get the stream 
        Stream<String> stream 
            = Stream.of("One", "For", 
                        "One", "A", 
                        "Hero", 
                        "Section"); 
  
        // Print the stream 
        // using double colon operator 
        stream.forEach(System.out::println); 

	}

}
