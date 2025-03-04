package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalInt;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// 스트림의 중간연산
public class Ex3 {

	public static void main(String[] args) {

		// asList: 리스트를 생성하고 초기화하는 함수
		List<Integer> list = Arrays.asList(1, 1, 2, 3, 5, 4);
		System.out.println(list);
		
		// list -> stream
		Stream<Integer> stream = list.stream();
		
		// 중간연산 0~n번, 최종연산 마지막에 1번
		// distinct: 중복 제거
//		stream.distinct().forEach(n -> System.out.print(n + " "));	
		
		// stream은 재사용할 수 없다
//		stream.distinct();
		
		// 스트림 재생성
		// filter: 조건을 만족하는 요소만 남기고 나머지는 제거
		// 조건을 만족하면 남고 그렇지 않으면 제거됨
//		list.stream()
//			.filter(n -> n % 2 == 0) // 2의 배수면 true
//			.forEach(n -> System.out.print(n + " ")); 
		
		// limit: n개만 추출
//		list.stream()
//			.limit(3)
//			.forEach(n -> System.out.print(n + " "));
		
		// sorted: 정렬 / 정렬 기준이 없을 때는 작은값 -> 큰값 순서
//		list.stream()
//			.sorted()
//			.forEach(n -> System.out.print(n + " "));
		
		// Comparator.reverseOrder(): 정렬 기준(반대로)
		list.stream()
			.sorted(Comparator.reverseOrder())
			.forEach(n -> System.out.print(n + " "));
		
		// 기본형 스트림
		// 제네릭 타입을 사용하여 int, char, String, class 모두 넣을 수 있다
		Stream<Integer> stream2 = list.stream();
		
		// 정수형 스트림
		// 숫자만 담을 수 있는 스트림
		// mapToInt: 스트림 안에 있는 요소를 int 타입으로 변환
		// 기본형 스트림 -> 정수형 스트림
		IntStream intStream = stream2.mapToInt(n -> n.intValue());
		
		// 정수형 스트림이 가지고 있는 함수:
		// sum min max avg 타입변환함수(다른타입 -> 숫자)
		int sum = intStream.sum();
		System.out.println("합계: " + sum); // 16
		
		// Optional~ : 값을 담고 있는 클래스
		// 값이 존재하는지 확인하는 함수, 값을 꺼내는 함수를 가지고 있음
		// 왜 사용할까? 값을 안전하게 사용하기 위해서
		IntStream intStream2 = list.stream().mapToInt(n -> n.intValue());
		OptionalInt optionalInt = intStream2.max();
		System.out.println(optionalInt.getAsInt()); // 5
		
		// String 리스트 생성
		List<String> strList = Arrays.asList("aa", "bb", "cc");
		
		// list -> stream
		// map: 스트림 안에 있는 값을 다른 값으로 바꾸는 연산자
		strList.stream()
				.map(t -> t.length())
				.forEach(t -> System.out.print(t + " "));
		
		// Book 타입의 리스트 생성
		List<Book> books = new ArrayList<Book>();
		books.add(new Book("자바 프로그래밍", 10000));
		books.add(new Book("스프링 프로젝트", 20000));
		
		// list -> stream
		// map: 스트림 안에 있는 값을 다른 값으로 바꾸는 연산자
		// 원본 데이터: Book
		// 새로운 값: Book의 title
		books.stream()
				.map(book -> book.price + "원")
				.forEach(t -> System.out.print(t + " "));;
	}

}

// 도서 클래스
class Book {
	String title;
	int price;
	
	public Book(String title, int price) {
		super();
		this.title = title;
		this.price = price;
	}
}

