import java.net.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;

class ChatClient extends Frame {
	String nickname = ""; // �̸�?
	String serverIp = ""; // ����������
	int serverPort = 0; // ������Ʈ

	DataOutputStream out;
	DataInputStream in;

	Panel p = new Panel();
	TextArea ta = new TextArea();
	TextField tf = new TextField();

	ChatClient(String nickname, String serverIp, String serverPort) {
		super("Chatting with " + serverIp + ":" + serverPort);
		this.nickname = nickname;
		this.serverIp = serverIp;
		this.serverPort = Integer.parseInt(serverPort);

		setBounds(600, 200, 300, 200);

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

		setVisible(true);
		tf.requestFocus();
	}

	void startClient() {
		try {

//            1. ������ �����Ͽ� serverIp�� serverPort�� �����Ѵ�.
			Socket socket = new Socket(serverIp, serverPort);
//            2. ta�� "����� ����Ǿ����ϴ�."��� �����ش�.
			ta.setText("����� ����Ǿ����ϴ�.");
//            3. ����� ���� ������ �Է½�Ʈ���� ��½�Ʈ���� ���´�.
			in = new DataInputStream(socket.getInputStream());
			out = new DataOutputStream(socket.getOutputStream());
//            4. �ݺ����� �̿��ؼ� �Է½�Ʈ���� null�� �ƴ� ����
//            �Է½�Ʈ�����κ��� �����͸� �о ���� msg�� �����Ѵ�.
			while (in != null) {
				try {
					String msg = in.readUTF();
					ta.append("\r\n" + msg);
				} catch (SocketException e) {
					ta.append("\r\n������ ������ ������ϴ�.");
					System.out.println("������ ������ ������ϴ�." + e.getMessage());
					return;
				}
			}

		} catch (ConnectException ce) {
			ta.setText("����� ������ �� �����ϴ�.");
			ce.printStackTrace();
		} catch (IOException ie) {
			ie.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		if (args.length != 3) {
			System.out.println("USAGE : java ChatClient NICKNAME SERVER_IP SERVER_PORT");
			System.exit(0);
		}

		ChatClient chatWin = new ChatClient(args[0], args[1], args[2]);
		chatWin.startClient();
	} // main

	class EventHandler extends FocusAdapter implements ActionListener {
		public void actionPerformed(ActionEvent ae) {
			String msg = tf.getText();

			if ("".equals(msg))
				return;
			if (out != null) {
				try {
					out.writeUTF(nickname + ">" + msg);

				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			ta.append("\r\n" + nickname + ">" + msg);
			tf.setText("");
		}

		public void focusGained(FocusEvent e) {
			tf.requestFocus();
		}
	} // class EventHandler
} // class