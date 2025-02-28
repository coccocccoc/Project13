package lambda;

public class Ex2 {

	public static void main(String[] args) {
		
		// 부모 인터페이스 타입 변수 = 람다식 함수
		Calc calc2 = (num1, num2) -> num1 + num2;
		System.out.println(calc2.add(10, 20));
		
		// 객체 없이 함수 사용하기!
		
	}

}

// 함수형 인터페이스
// 함수형 인터페이스는 추상메소드를 하나만 가질 수 있다
// @~~~ : 어노테이션
@FunctionalInterface // 인터페이스 안에 추상메소드가 하나 이상 들어오면 에러남
interface Calc {
	int add(int num1, int num2);
	// 추상 메소드가 여러개면 람다식 함수를 대입할 때 대상을 찾을 수 없다
//	int add2(int num1, int num2);
}
	
