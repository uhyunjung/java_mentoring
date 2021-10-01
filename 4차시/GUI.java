import java.awt.*;                       // awt 패키지
import javax.swing.*;                    // 스윙 패키지

// 서버 GUI
public class GUI extends JFrame{
	JScrollPane scrollPane;              // 스크롤 패널
	JTextArea txtArea;                   // 채팅 출력 영역
	
	JPanel chatting;
	JTextField txtField;                 // 채팅 입력 필드
	JButton sendBtn;                     // 전송 버튼
	
	public GUI (String str) {
		setTitle(str);
		setSize(600, 600);

		txtArea = new JTextArea();                                       // 채팅 출력 영역, 입력 영역, 전송 버튼객체 생성
		
		Font font = new Font("굴림", Font.BOLD, 15);                       // 글꼴 지정
		Font inputFont = new Font("굴림", Font.BOLD, 30);
		txtArea.setFont(font);
		txtArea.setEditable(false);                                        // 채팅 출력 영역에 채팅 금지
		
		scrollPane = new JScrollPane(txtArea);                             // 스크롤패널
		scrollPane.setSize(600, 400);
		
		add(scrollPane, BorderLayout.CENTER);
		
		txtField = new JTextField();
		sendBtn = new JButton("전송");
		chatting = new JPanel();                                         // 채팅패널
		
		txtField.setFont(inputFont);

		chatting.setLayout(new BorderLayout());
		chatting.add(txtField, BorderLayout.CENTER);
		chatting.add(sendBtn, BorderLayout.EAST);
		
		add(chatting, BorderLayout.SOUTH);

		setVisible(true);
		txtField.requestFocus();                                         // 채팅 입력 필드에 커서 위치
	}
}
