package stream.quiz;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Quiz1 {

	public static void main(String[] args) {

		// String타입 배열 생성
		String[] arr = { "aaa", "aaa", "b", "b", "ccccc" };

		// 1. 문자열 목록 중에서 길이가 2보다 큰 요소의 개수 구하기
		Stream<String> stream1 = Arrays.stream(arr);
		long count = stream1.filter(n -> n.length() > 2) // 길이가 2보다 큰 요소만 추출
							.count(); // 개수
		System.out.println(count + "개"); // 3개
		
		// 2. 모든 문자열의 길이를 더한 합 구하기
		Stream<String> stream2 = Arrays.stream(arr);
		// mapToInt: 문자열(String) -> 문자열의 길이(int)
		int sum = stream2.mapToInt(n -> n.length())
							.sum();
		System.out.println(sum); // 13
		
		// 3. 가장 길이가 짧은 문자열의 길이 구하기
		Stream<String> stream3 = Arrays.stream(arr);
		IntStream intStream = stream3.mapToInt(n -> n.length());
		OptionalInt optionalInt = intStream.min();
		System.out.println(optionalInt.getAsInt()); // 1
		
		
		// 4. 중복을 제거한 리스트 만들기
		Stream<String> stream4 = Arrays.stream(arr);
		List<String> list = stream4.distinct()
									.collect(Collectors.toList());
		System.out.println(list); // [aaa, b, ccccc]
		// { "aaa", "aaa", "b", "b", "ccccc" } => { "aaa", "b", "ccccc" }
		// { "aaa", "b", "ccccc" } => [aaa, b, ccccc]
		
	}

}
