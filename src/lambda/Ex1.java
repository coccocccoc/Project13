package lambda;

// 객체 없이 함수 사용하기
public class Ex1 {

	public static void main(String[] args) {

		// 구현체로 인스턴스 생성
		StringConcat concat1 = new StringConcatImpl();
		concat1.makeString("Hello", "World");
		
		// 람다식 함수
		// 부모 타입 변수 = 람다식 메소드
		StringConcat concat2 = (s1, s2) -> System.out.println(s1 + " " + s2);
		concat2.makeString("Hello", "World");

		//
		
	}

}

// 함수형 인터페이스 + 람다식 함수

// 1. 함수형 인터페이스
// 함수형 인터페이스는 추상메소드를 하나만 가질 수 있다
interface StringConcat {
	void makeString(String s1, String s2);
}

// StringConcat의 구현체
class StringConcatImpl implements StringConcat {

	@Override
	public void makeString(String s1, String s2) {
		System.out.println(s1 + ", " + s2);
	}
	
}




