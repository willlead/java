import java.net.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;

class ChatServer extends Frame {
	String nickname = "";

	DataOutputStream out;
	DataInputStream in;

	Panel p = new Panel();
	TextArea ta = new TextArea();
	TextField tf = new TextField();

	ChatServer(String nickname) {
		super("Chatting");
		this.nickname = nickname;

		p.setLayout(new BorderLayout());
		p.add(tf, "Center");

		add(ta, "Center");
		add(p, "South");

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		EventHandler handler = new EventHandler();
		ta.addFocusListener(handler);
		tf.addFocusListener(handler);
		tf.addActionListener(handler);

		ta.setEditable(false);
		setBounds(200, 200, 300, 200);
		setVisible(true);
		tf.requestFocus();
	}

	void startServer() {
		ServerSocket serverSocket = null;
		Socket socket = null;

		try {
			// 1. ���������� �����Ͽ� 7777�� ��Ʈ�� ���ս�Ų��.
			serverSocket = new ServerSocket(7777);
			// 2. ta�� "������ �غ�Ǿ����ϴ�."��� �����ش�.
			ta.setText("������ �غ�Ǿ����ϴ�.\n");
			// 3. ������ ������ ��ٸ���.
			socket = serverSocket.accept();
			// 4. ta�� "����� ����Ǿ����ϴ�."��� �����ش�.
			ta.append("\r\n" + "����� ����Ǿ����ϴ�.");
			// 5. ����� ���� ������ �Է½�Ʈ���� ��½�Ʈ���� ���´�.
			in = new DataInputStream(socket.getInputStream()); // �Է½�Ʈ��
			out = new DataOutputStream(socket.getOutputStream()); // ��½�Ʈ��
			// 6. �ݺ����� �̿��ؼ� �Է½�Ʈ���� null�� �ƴ� ����
			// �Է½�Ʈ�����κ��� �����͸� �о ���� msg�� �����Ѵ�.
			while (in != null) {					
					String msg = in.readUTF();
					ta.append("\r\n" + msg);				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("USAGE : java ChatServer NICKNAME");
			System.exit(0);
		}

		ChatServer chatWin = new ChatServer(args[0]);
		chatWin.startServer();
	} // main

	class EventHandler extends FocusAdapter implements ActionListener {
		public void actionPerformed(ActionEvent ae) {
			String msg = tf.getText();

			if ("".equals(msg))
				return;

			if (out != null) {// start 2�� �ڵ�
				try {
					out.writeUTF(nickname + ">" + msg);

				} catch (IOException e) {
					e.printStackTrace();
				}
			} // end 2�� �ڵ�

			ta.append("\r\n" + nickname + ">" + msg);
			tf.setText("");
		}

		public void focusGained(FocusEvent e) {
			tf.requestFocus();
		}
	} // class EventHandler
} // class