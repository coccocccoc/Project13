package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.IntBinaryOperator;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// 스트림의 최종연산
public class Ex4 {

	public static void main(String[] args) {

		// int형 배열 생성
		int[] arr = { 1, 2 ,3 ,4, 5, 6, 7, 8, 9, 10 };
		
		// 배열 -> 스트림
		// 정수형 스트림: 숫자만 취급하는 스트림으로 sum, max, min 등을 가지고 있음
		IntStream intStream = Arrays.stream(arr);
		
		// forEach: 반복적인 작업을 하는 연산자 (람다식 for문과 비슷한 구조)
		intStream.forEach(n -> System.out.print(n + " "));
		
		// 새로운 스트림 생성
		IntStream intStream2 = Arrays.stream(arr);
		
		// count: 요소의 개수
		// 정수타입: byte, short, int, long
		long count = intStream2.count(); // count 함수의 리턴타입이 long
		System.out.println(count); // 10
		
		// sum: 요소들의 합
		// sum은 정수형 스트림에서만 사용 가능!
		IntStream intStream3 = Arrays.stream(arr);
		int sum = intStream3.sum();
		System.out.println(sum); // 55
		
		// reduce: 초기값 설정 후, 반복 작업
		// 초기값을 설정하고 누적값 구하기
		IntStream intStream4 = Arrays.stream(arr);
		int result = intStream4.reduce(10, (total, n) -> total - n);
		System.out.println("결과: " + result);
		
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		// list -> stream
		Stream<Integer> stream = list.stream();
		// collect: 자료구조를 바꾸는 함수
		// 인자: 바꾸고 싶은 자료구조
		// Collectors.toSet(): set
		// Collectors.toList(): list
		
		// stream -> set
		Set<Integer> set = stream.collect(Collectors.toSet());
		System.out.println(set);
		
		// stream -> list
		Stream<Integer> stream2 = list.stream();
		List<Integer> list2 = stream2.collect(Collectors.toList());
		System.out.println(list2);
		
	}

}
