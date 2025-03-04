package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// 스트림의 특징
public class Ex2 {

	public static void main(String[] args) {

		// asList: 리스트를 생성하고 목록을 초기화하는 함수
		List<Integer> list = Arrays.asList(5, 1, 2, 4, 3, 3);
		System.out.println(list);

		// list -> stream
		Stream<Integer> stream = list.stream();

		// 중간연산: 0 ~ n번
		// 최종연산: 1번
		// forEach: 최종연산자 / 스트림의 요소를 꺼내서 반복적인 작업을 수행
		stream.forEach(t -> System.out.println(t));
		
		// count: 최종연산자 / 요소의 개수를 반환하는 함수
//		long count = stream.count();
		// 스트림은 최종연산을 실행하면 닫힌다! 최종연산은 한번만 실행할 수 있다
		// 1. 한번 사용한 스트림을 재사용 할 수 없다
		
		// 2. 원본 데이터에는 영향이 없다
		// sorted : 정렬
		// collect : 다른 타입으로 변환 (스트림 -> 리스트)
		
		// 함수 체이닝: 함수의 반환값을 사용하여 다시 함수를 호출하는 형태
		List<Integer> sortedList = list.stream() // Stream
										.sorted() // Stream
										.collect(Collectors.toList());
		
		// 체이닝을 사용하는 이유
		Stream<Integer> stream1 = list.stream();
		Stream<Integer> stream2 = stream1.sorted();
		List<Integer> sortedList2 = stream2.collect(Collectors.toList());
		
		System.out.println(list); // 원본 데이터
		System.out.println(sortedList); // 정렬된 데이터
		
		// 3. 중간연산은 0~n번, 최종연산은 마지막에 1번만 가능
		// filter: 조건을 만족하는 요소만 추출
		// 함수형 인터페이스는 람다식 함수로 구현할 수 있다
		// 익명클래스 -> 람다식 함수
		list.stream() // list -> stream
			.filter(t -> t >= 3) // 중간연산
			.sorted() // 중간연산
			.forEach(t -> System.out.println(t)); // 최종연산
		
	}

}
