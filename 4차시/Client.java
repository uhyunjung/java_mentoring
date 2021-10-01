import java.io.*;
import java.net.*;
import java.awt.event.*;                                                                // awt 패키지

public class Client{
	static BufferedReader in = null;
	static BufferedWriter out = null;
	
	static Socket socket = null;
	
	static String msg = null;                                                           // 메세지
	static GUI frame = new GUI("클라이언트");                                         // Client_GUI frame

	public static void main(String[] args) {
		frame.sendBtn.addActionListener(new ActionListener() {                          // send 버튼 클릭하면 메세지 전송
			@Override
			public void actionPerformed(ActionEvent e) {
				sendMsg();
			}
		});

		try {
			socket = new Socket("localhost", 9999);                                     // 클라이언트 소켓 생성, 서버에 연결
			
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

			frame.txtArea.append("채팅방이 열렸습니다.\n");
			
			while(true) {
				frame.txtField.requestFocus();                                          // 텍스트 필드에 포커스 맞춤
				msg = in.readLine();
				frame.txtArea.append("서버: "+msg+"\n");

				if (msg.equals("끝")) {                  // 클라이언트에서 끝 입력
					frame.txtArea.append("클라이언트에서 연결을 종료함\n");
					System.exit(0);
				}
			}
		}
		catch (IOException e) {                                                        // 입출력 오류 발생
			frame.txtArea.append(e.getMessage());
		}
		finally {
			try {
				socket.close();                                   // 클라이언트 소켓 닫기
			} catch (IOException e) {
				frame.txtArea.append("서버와 채팅 중 오류가 발생했습니다.");
			}
		}
	}

	public static void sendMsg() {                                                    // 클라이언트애게 GUI로 메세지 보냄
		msg = frame.txtField.getText();

		frame.txtField.setText("");                                                // 메세지 전송
		frame.txtArea.append("보내기>> "+msg+"\n");
		frame.txtArea.setCaretPosition(frame.txtArea.getDocument().getLength());

		try {
			out.write(msg+"\n");                                                // 키보드에서 읽은 문자열 전송
			out.flush();                                                           // out 스트림 버퍼에 있는 모든 문자열 전송
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
}
