import java.awt.*;                       // awt ��Ű��
import javax.swing.*;                    // ���� ��Ű��

// ���� GUI
public class GUI extends JFrame{
	JScrollPane scrollPane;              // ��ũ�� �г�
	JTextArea txtArea;                   // ä�� ��� ����
	
	JPanel chatting;
	JTextField txtField;                 // ä�� �Է� �ʵ�
	JButton sendBtn;                     // ���� ��ư
	
	public GUI (String str) {
		setTitle(str);
		setSize(600, 600);

		txtArea = new JTextArea();                                       // ä�� ��� ����, �Է� ����, ���� ��ư��ü ����
		
		Font font = new Font("����", Font.BOLD, 15);                       // �۲� ����
		Font inputFont = new Font("����", Font.BOLD, 30);
		txtArea.setFont(font);
		txtArea.setEditable(false);                                        // ä�� ��� ������ ä�� ����
		
		scrollPane = new JScrollPane(txtArea);                             // ��ũ���г�
		scrollPane.setSize(600, 400);
		
		add(scrollPane, BorderLayout.CENTER);
		
		txtField = new JTextField();
		sendBtn = new JButton("����");
		chatting = new JPanel();                                         // ä���г�
		
		txtField.setFont(inputFont);

		chatting.setLayout(new BorderLayout());
		chatting.add(txtField, BorderLayout.CENTER);
		chatting.add(sendBtn, BorderLayout.EAST);
		
		add(chatting, BorderLayout.SOUTH);

		setVisible(true);
		txtField.requestFocus();                                         // ä�� �Է� �ʵ忡 Ŀ�� ��ġ
	}
}
