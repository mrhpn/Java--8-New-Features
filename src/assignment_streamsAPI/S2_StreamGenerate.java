package assignment_streamsAPI;

import java.util.stream.Stream;

public class S2_StreamGenerate {

	public static void main(String[] args) {
		Stream<Double> stream = Stream.generate(() -> Math.random());
		stream.limit(5).forEach(n -> System.out.println(n));
	}
}
