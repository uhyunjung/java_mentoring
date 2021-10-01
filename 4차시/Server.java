import java.io.*;
import java.net.*;
import java.awt.event.*;

public class Server{
	static BufferedReader in = null;
	static BufferedWriter out = null;
	
	static Socket socket = null;
	static ServerSocket server = null;
	
	static String msg = null;                                                       // �޼���
	static GUI frame = new GUI("����");                                // Server_GUI frame ����

	public static void main(String[] args) {
		// ��ư ������
		frame.sendBtn.addActionListener(new ActionListener() {                          // send ��ư Ŭ���ϸ� �޼��� ����
			@Override
			public void actionPerformed(ActionEvent e) {
				sendMsg();
			}
		});

		try {
			server = new ServerSocket(9999);                                   // 1. ���� ���� ����
			frame.txtArea.append("������ ��ٸ��� ���Դϴ�.\n");

			socket = server.accept();                                          // 2. Ŭ���̾�Ʈ�κ��� ���� ��û ���
			frame.txtArea.append("����Ǿ����ϴ�.\n\n");
			
			// �����
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

			frame.txtArea.append("ä�ù��� ���Ƚ��ϴ�.\n");
			
			// �޽��� ����
			while(true) {
				frame.txtField.requestFocus(); 
				msg = in.readLine();                                        // 3. Ŭ���̾�Ʈ�� �Է� ����
				frame.txtArea.append("Ŭ���̾�Ʈ: "+msg+"\n");
				
				if (msg.equals("��")) {                  // Ŭ���̾�Ʈ���� �� �Է�
					frame.txtArea.append("Ŭ���̾�Ʈ���� ������ ������\n");
					System.exit(0);
				}
			}
		}
		catch (IOException e) {                                                // ����� ���� �߻�
			frame.txtArea.append(e.getMessage());
		}
		finally {
			try {
				socket.close();                                                // ��ſ� ���� �ݱ�
				server.close();                                                // ���� ���� �ݱ�
			} catch (IOException e) {
				frame.txtArea.append("Ŭ���̾�Ʈ�� ä�� �� ������ �߻��߽��ϴ�.\n");
			}
		}
	}

	public static void sendMsg() {                                             // Ŭ���̾�Ʈ�ְ� GUI�� �޼��� ����
		msg = frame.txtField.getText();
		
		frame.txtField.setText("");                                                // �޼��� ����
		frame.txtArea.append("������>> "+msg+"\n");
		frame.txtArea.setCaretPosition(frame.txtArea.getDocument().getLength());          // �ڵ� ��ũ�� ����

		try {
			out.write(msg+"\n");                                               // Ű���忡�� ���� ���ڿ� ���ۿ� ���
			out.flush();                                                       // out ��Ʈ�� ���ۿ� �ִ� ��� ���ڿ� ����
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
}
