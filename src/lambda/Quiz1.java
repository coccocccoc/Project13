package lambda;

public class Quiz1 {

	public static void main(String[] args) {

		// max 함수를 사용하여 5와 10 중 더 큰 값을 구하세요

		// 1. 구현체 정의 -> 인스턴스 생성
		MyNumber myNumber = new MyNumberImpl();
		System.out.println(myNumber.max(5, 10));

		// 2. 익명 클래스

		// 구현부에서 코드가 한 줄 이상일 때는 생략할 수 있는 부분 없음
		// 3. 람다식 함수
		MyNumber myNumber2 = (x, y) -> {
			if (x > y) {
				return x;
			} else {
				return y;
			}
		};

		System.out.println(myNumber2.max(5, 10));

	}
}

@FunctionalInterface
interface MyNumber {
	// 두 숫자 중에서 더 큰값을 반환하는 함수
	int max(int x, int y);
}

class MyNumberImpl implements MyNumber {

	@Override
	public int max(int x, int y) {
		if (x > y) {
			return x;
		} else {
			return y;
		}

	}
}