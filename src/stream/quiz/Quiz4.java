package stream.quiz;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Quiz4 {

	public static void main(String[] args) {

		// 고객 리스트 생성
		List<Customer> list = new ArrayList<Customer>();
		
		list.add(new Customer("둘리", 40, 100));
		list.add(new Customer("또치", 13, 50));
		list.add(new Customer("도우너", 25, 70));

		// 고객 리스트를 사용하여 다음과 같은 정보 출력
		
		// 고객 명단
		Stream<Customer> stream1 = list.stream();
		stream1.forEach(n -> System.out.print(n.name + " ")); // 둘리 또치 도우너
		
		System.out.println();
		
		// 총 여행 비용
		Stream<Customer> stream2 = list.stream();
		int sum = stream2.mapToInt(n -> n.price).sum();
		System.out.println(sum); // 220
		
		// 20세 이상의 고객 명단
		Stream<Customer> stream3 = list.stream();
		stream3
				.filter(n -> n.age >= 20)
				.forEach(n -> System.out.print(n.name + " ")); // 둘리 도우너 
	
		// 나이가 많은 순으로 정렬
		Stream<Customer> stream4 = list.stream();
		// sorted: 정렬
		// 스트림 안에 있는 요소는 인스턴스로 값을 정렬할 수 없다
		stream4
				.sorted((o1, o2) -> {
						// 고객의 나이를 비교하여 양수 또는 음수를 반환
						if(o1.age > o2.age) {
							return -1; // o1의 age가 더 크면 o2을 뒤로 이동
						} else {
							return 1; // 그렇지 않으면 o1을 뒤로 이동
						}
					})
				.forEach(n -> System.out.println(n.name + " " + n.age)); 
				
				
		
	}

}

class Customer {
	String name;
	int age;
	int price;
	
	public Customer(String name, int age, int price) {
		super();
		this.name = name;
		this.age = age;
		this.price = price;
	}
	
}