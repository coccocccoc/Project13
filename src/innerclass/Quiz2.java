package innerclass;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class Quiz2 {

	public static void main(String[] args) {

		Frame frame = new Frame();
		frame.setLayout(new FlowLayout());
		frame.setBounds(500, 300, 500, 300);

		// 텍스트 상자 추가
		TextArea area = new TextArea("텍스트상자", 10, 50);
		frame.add(area);

		frame.setVisible(true);

		// 포커스 이벤트 등록
		// 창을 열면 "포커스가 되었습니다" 출력
		// 창을 닫으면 "포커스가 벗어났습니다" 출력
		area.addFocusListener(new FocusListener() {

			@Override
			public void focusGained(FocusEvent e) {
				System.out.println("포커스가 되었습니다");

			}

			@Override
			public void focusLost(FocusEvent e) {
				System.out.println("포커스가 벗어났습니다");

			}
		});
		
//		area.addFocusListener(new MyFocusListener());

	}
}


//class MyFocusListener implements FocusListener {
//
//	@Override
//	public void focusGained(FocusEvent e) {
//		System.out.println("포커스가 되었습니다!");
//		
//	}
//
//	@Override
//	public void focusLost(FocusEvent e) {
//		System.out.println("포커스가 벗어났습니다!");
//		
//	} 
//	
//}