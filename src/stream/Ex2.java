package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

// 스트림의 특징
public class Ex2 {

	public static void main(String[] args) {

		// asList: 리스트를 생성하고 목록을 초기화하는 ㅎ마수
		List<Integer> list = Arrays.asList(5, 1, 2, 4, 3, 3);
		System.out.println(list);

		// list -> stream
		Stream<Integer> stream = list.stream();

		// 중간연산: 0 ~ n번
		// 최종연산: 1번
		// forEach: 최종연산자 / 스트림의 요소를 꺼내서 반복적인 작업을 수행
		stream.forEach(t -> System.out.println(t));
		// count: 최종연산자 / 요소의 개수를 반환하는 함수
		long count = stream.count();
		// 스트림은 최종연산을 실행하면 닫힌다! 최종연산은 한번만 실행할 수 있다
		// 1. 한번 사용한 스트림을 재사용 할 수 없다
		
	}

}
