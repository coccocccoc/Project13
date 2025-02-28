package lambda;

public class Quiz2 {

	public static void main(String[] args) {

		// helloPrint 함수를 사용해서 "안녕하세요"를 출력
		
		// 1. 구현클래스 > 인스턴스 생성
		Hello hello = new HelloImpl();
		hello.helloPrint();
		
		// 2. 익명클래스
		Hello hello2 = new Hello() {
			
			@Override
			public void helloPrint() {
				System.out.println("안녕하세요");
				
			}
		};
		
		// 3. 람다식함수
		Hello hello3 = () -> System.out.println("안녕하세요");
		hello3.helloPrint();
		
	}
}


@FunctionalInterface
interface Hello {
	// "안녕하세요"를 출력하는 함수
	void helloPrint();
}

class HelloImpl implements Hello {

	@Override
	public void helloPrint() {
		System.out.println("안녕하세요");
	}
	
}