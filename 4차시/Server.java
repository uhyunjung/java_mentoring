import java.io.*;
import java.net.*;
import java.awt.event.*;

public class Server{
	static BufferedReader in = null;
	static BufferedWriter out = null;
	
	static Socket socket = null;
	static ServerSocket server = null;
	
	static String msg = null;                                                       // 메세지
	static GUI frame = new GUI("서버");                                // Server_GUI frame 생성

	public static void main(String[] args) {
		// 버튼 리스너
		frame.sendBtn.addActionListener(new ActionListener() {                          // send 버튼 클릭하면 메세지 전송
			@Override
			public void actionPerformed(ActionEvent e) {
				sendMsg();
			}
		});

		try {
			server = new ServerSocket(9999);                                   // 1. 서버 소켓 생성
			frame.txtArea.append("연결을 기다리는 중입니다.\n");

			socket = server.accept();                                          // 2. 클라이언트로부터 연결 요청 대기
			frame.txtArea.append("연결되었습니다.\n\n");
			
			// 입출력
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

			frame.txtArea.append("채팅방이 열렸습니다.\n");
			
			// 메시지 수신
			while(true) {
				frame.txtField.requestFocus(); 
				msg = in.readLine();                                        // 3. 클라이언트의 입력 받음
				frame.txtArea.append("클라이언트: "+msg+"\n");
				
				if (msg.equals("끝")) {                  // 클라이언트에서 끝 입력
					frame.txtArea.append("클라이언트에서 연결을 종료함\n");
					System.exit(0);
				}
			}
		}
		catch (IOException e) {                                                // 입출력 오류 발생
			frame.txtArea.append(e.getMessage());
		}
		finally {
			try {
				socket.close();                                                // 통신용 소켓 닫기
				server.close();                                                // 서버 소켓 닫기
			} catch (IOException e) {
				frame.txtArea.append("클라이언트와 채팅 중 오류가 발생했습니다.\n");
			}
		}
	}

	public static void sendMsg() {                                             // 클라이언트애게 GUI로 메세지 보냄
		msg = frame.txtField.getText();
		
		frame.txtField.setText("");                                                // 메세지 전송
		frame.txtArea.append("보내기>> "+msg+"\n");
		frame.txtArea.setCaretPosition(frame.txtArea.getDocument().getLength());          // 자동 스크롤 내림

		try {
			out.write(msg+"\n");                                               // 키보드에서 읽은 문자열 버퍼에 출력
			out.flush();                                                       // out 스트림 버퍼에 있는 모든 문자열 전송
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
}
