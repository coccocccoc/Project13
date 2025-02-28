package innerclass;

// 내부 클래스의 종류
class Outer {
	
	// private 접근제어자: 클래스 내부에서만 변수 사용 가능
	private int a = 10; // 인스턴스 변수
	private static int b = 20; // static 변수
	
	// 내부 클래스
	class InClass {
		int i1 = a; // 내부 클래스는 외부 클래스의 private 변수도 사용 가능 (클래스 내부에 포함이 되기 때문)
		int i2 = b;
	}
	
	// static 내부 클래스
	static class InStaticClass{
		// static: 프로그램이 시작되면 바로 생성됨
		// non-static: 인스턴스를 생성해야 사용 가능
//		int i1 = a; // static 클래스 안에서 인스턴스 변수는 사용할 수 없다
		int i2 = b; // static 변수는 ㄱㅊ
	}
}