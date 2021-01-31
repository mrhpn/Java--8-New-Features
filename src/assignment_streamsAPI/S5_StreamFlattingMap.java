package assignment_streamsAPI;

import java.util.List;
import java.util.stream.Stream;

public class S5_StreamFlattingMap {

	public static void main(String[] args) {
		Stream<List<Integer>> stream = Stream.of(List.of(1, 2, 3), List.of(4, 5, 6));
		
		stream
			.flatMap(list -> list.stream())
			.forEach(n -> System.out.println(n));
	}

}
