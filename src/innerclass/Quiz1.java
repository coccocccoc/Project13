package innerclass;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.RenderingHints.Key;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Quiz1 {

	public static void main(String[] args) {

		// 화면 생성
		Frame frame = new Frame();
		frame.setLayout(new FlowLayout());
		frame.setBounds(500, 300, 500, 300);
		frame.setVisible(true);

		// 키 이벤트
		// 키보드에서 아무키나 누르면 "키가 눌렸습니다!" 출력
		// 함수 사용법: 매개변수와 리턴값 체크
		// 매개변수: KeyListener (인터페이스)
		// KeyListener
		// KeyListener의 자식클래스로 인스턴스를 생성하여 대입
//		frame.addKeyListener(new MyKeyListener());

		// 익명 클래스로 이벤트 등록
		// new 인터페이스이름 () {}
		// 부모에게 물려받은 추상메소드 구현
		// 익명클래스 구현 -> 인스턴스 생성
		frame.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyPressed(KeyEvent e) {
				System.out.println("키가 눌렸습니다!");

			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub

			}
		});

	}
}

// KeyListener의 구현체
// 부모가 물려준 추상메소드 모두 구현
//class MyKeyListener implements KeyListener {
//
//	@Override
//	public void keyTyped(KeyEvent e) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void keyPressed(KeyEvent e) {
//		System.out.println("키가 눌렸습니다!");
//	}
//
//	@Override
//	public void keyReleased(KeyEvent e) {
//		// TODO Auto-generated method stub
//		
//	}
//	
//}