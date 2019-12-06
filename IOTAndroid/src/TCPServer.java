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
				//System.out.println("클라이언트 요청 대기중...");
				socket = sSocket.accept();
				System.out.println("접속한 클라이언트 주소=> " + socket.getInetAddress());
				
				is = socket.getInputStream(); // 클라에서 받는 거
				os = socket.getOutputStream(); //서버가 보낼거
				
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
