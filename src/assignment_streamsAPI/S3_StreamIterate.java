package assignment_streamsAPI;

import java.util.stream.Stream;

public class S3_StreamIterate {
	public static void main(String[] args) {
		Stream.iterate(1, n -> n + 1).limit(10).forEach(n -> System.out.println(n));
	}
}
