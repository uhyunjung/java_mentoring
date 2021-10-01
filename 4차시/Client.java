import java.io.*;
import java.net.*;
import java.awt.event.*;                                                                // awt ��Ű��

public class Client{
	static BufferedReader in = null;
	static BufferedWriter out = null;
	
	static Socket socket = null;
	
	static String msg = null;                                                           // �޼���
	static GUI frame = new GUI("Ŭ���̾�Ʈ");                                         // Client_GUI frame

	public static void main(String[] args) {
		frame.sendBtn.addActionListener(new ActionListener() {                          // send ��ư Ŭ���ϸ� �޼��� ����
			@Override
			public void actionPerformed(ActionEvent e) {
				sendMsg();
			}
		});

		try {
			socket = new Socket("localhost", 9999);                                     // Ŭ���̾�Ʈ ���� ����, ������ ����
			
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

			frame.txtArea.append("ä�ù��� ���Ƚ��ϴ�.\n");
			
			while(true) {
				frame.txtField.requestFocus();                                          // �ؽ�Ʈ �ʵ忡 ��Ŀ�� ����
				msg = in.readLine();
				frame.txtArea.append("����: "+msg+"\n");

				if (msg.equals("��")) {                  // Ŭ���̾�Ʈ���� �� �Է�
					frame.txtArea.append("Ŭ���̾�Ʈ���� ������ ������\n");
					System.exit(0);
				}
			}
		}
		catch (IOException e) {                                                        // ����� ���� �߻�
			frame.txtArea.append(e.getMessage());
		}
		finally {
			try {
				socket.close();                                   // Ŭ���̾�Ʈ ���� �ݱ�
			} catch (IOException e) {
				frame.txtArea.append("������ ä�� �� ������ �߻��߽��ϴ�.");
			}
		}
	}

	public static void sendMsg() {                                                    // Ŭ���̾�Ʈ�ְ� GUI�� �޼��� ����
		msg = frame.txtField.getText();

		frame.txtField.setText("");                                                // �޼��� ����
		frame.txtArea.append("������>> "+msg+"\n");
		frame.txtArea.setCaretPosition(frame.txtArea.getDocument().getLength());

		try {
			out.write(msg+"\n");                                                // Ű���忡�� ���� ���ڿ� ����
			out.flush();                                                           // out ��Ʈ�� ���ۿ� �ִ� ��� ���ڿ� ����
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
}
