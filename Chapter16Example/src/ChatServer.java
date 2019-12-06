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
			// 1. 서비소켓을 생성하여 7777번 포트와 결합시킨다.
			serverSocket = new ServerSocket(7777);
			// 2. ta에 "서버가 준비되었습니다."라고 보여준다.
			ta.setText("서버가 준비되었습니다.\n");
			// 3. 상대방의 연결을 기다린다.
			socket = serverSocket.accept();
			// 4. ta에 "상대방과 연결되었습니다."라고 보여준다.
			ta.append("\r\n" + "상대방과 연결되었습니다.");
			// 5. 연결된 상대방 소켓의 입력스트림과 출력스트립을 얻어온다.
			in = new DataInputStream(socket.getInputStream()); // 입력스트림
			out = new DataOutputStream(socket.getOutputStream()); // 출력스트림
			// 6. 반복문을 이용해서 입력스트림이 null이 아닌 동안
			// 입력스트림으로부터 데이터를 읽어서 변수 msg에 저장한다.
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

			if (out != null) {// start 2번 코드
				try {
					out.writeUTF(nickname + ">" + msg);

				} catch (IOException e) {
					e.printStackTrace();
				}
			} // end 2번 코드

			ta.append("\r\n" + nickname + ">" + msg);
			tf.setText("");
		}

		public void focusGained(FocusEvent e) {
			tf.requestFocus();
		}
	} // class EventHandler
} // class