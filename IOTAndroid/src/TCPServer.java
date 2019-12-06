import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer extends Thread{

	InputStream is;
	OutputStream os;
	ServerSocket sSocket;
	ObjectInputStream ois;
	ObjectOutputStream oos;
	Socket socket;

	//192.168.2.62
	public void run() {
		try {
			sSocket = new ServerSocket(7000);
			while (true) {
				//System.out.println("Ŭ���̾�Ʈ ��û �����...");
				socket = sSocket.accept();
				System.out.println("������ Ŭ���̾�Ʈ �ּ�=> " + socket.getInetAddress());
				
				is = socket.getInputStream(); // Ŭ�󿡼� �޴� ��
				os = socket.getOutputStream(); //������ ������
				
				ois = new ObjectInputStream(is);
				oos = new ObjectOutputStream(os);
				
				String msg = (String)ois.readObject();
				System.out.println(msg);
				oos.writeObject(msg);
				socket.close();				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public static void main(String[] args) {
		new TCPServer().start();
		
	}

}
