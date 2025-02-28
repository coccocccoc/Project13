package innerclass;

// 일반적인 클래스 구조

class A {
	int num = 10;
}

class B {
	void method() {
		// A클래스의 속성 사용하기
		A a = new A();
		System.out.println(a.num);
	}
}

class C {
	
	int num = 10;
	
	// 내부 클래스
	class D {
		void method() {
			// 내부 클래스는 외부 클래스의 속성을 인스턴스 없이 사용 가능
			System.out.println(num);
		}
	}
}