package stream.quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Quiz3 {

	public static void main(String[] args) {
		
		// Order 클래스 타입으로 list 생성
		List<Order> list = new ArrayList<Order>();
		
		list.add(new Order(1001, 2022, 300));
		list.add(new Order(1002, 2022, 150));
		list.add(new Order(1003, 2022, 200));
		list.add(new Order(1004, 2023, 500));
		list.add(new Order(1005, 2023, 400));
		list.add(new Order(1006, 2023, 600));
		list.add(new Order(1007, 2023, 650));
		
		// 1. 모든 거래번호를 한줄에 나열하세요
		// 리스트 -> 스트림
		Stream<Order> stream1 = list.stream();
		stream1.forEach(n -> System.out.print(n.orderNo + " "));
		// 1001 1002 1003 1004 1005 1006 1007 
		
		System.out.println();
		
		// 2. 2022년도의 거래 총금액과 건수를 출력하세요
		Stream<Order> stream2 = list.stream();
		// mapToInt: Order객체 (Object) -> Order의 price (int)
		// 기본형 스트림 -> 정수형 스트림
		// sum: 스트림 요소의 합 구하기 (거래금액의 합계) (정수형 스트림으로 변환해서 sum 사용가능)
		int sum1 = stream2
						.filter(n -> n.year == 2022)
						.mapToInt(n -> n.price)
						.sum();
		Stream<Order> stream3 = list.stream();
		long count1 = stream3
							.filter(n -> n.year == 2022)
							.count();
		System.out.println("총금액: " + sum1 + ", 거래건수: " + count1);
		// 총금액: 650, 거래건수: 3

		// 3. 2023년도의 거래 총금액과 건수를 출력하세요
		Stream<Order> stream4 = list.stream();
		int sum2 = stream4
							.filter(n -> n.year == 2023)
							.mapToInt(n -> n.price)
							.sum();
		Stream<Order> stream5 = list.stream();
		long count2 = stream5
							.filter(n -> n.year == 2023)
							.count();
		System.out.println("총금액: " + sum2 + ", 거래건수: " + count2); 
		// 총금액: 2150, 거래건수: 4

	}

}

class Order {
	int orderNo; // 주문번호
	int year; // 주문년도
	int price; // 거래내역(만원단위)
	
	public Order(int orderNo, int year, int price) {
		super();
		this.orderNo = orderNo;
		this.year = year;
		this.price = price;
	}
}