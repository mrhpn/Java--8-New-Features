package assignment_streamsAPI;

import java.util.Arrays;
import java.util.stream.Stream;

public class S1_SampleStreamDemo {
	public static void main(String[] args) {
		// Define the stream
		String[] fruits = { "Apple", "Banana", "Cherries", "Dragon Fruit" };

		// Print the stream
		Arrays.stream(fruits).forEach(fruit -> System.out.println(fruit));
	}
}
