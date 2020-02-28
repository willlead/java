import java.io.*;
import java.net.*;


public class JsonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		URL url = null;
		BufferedReader input = null;
		String address = "http://jang.anymobi.kr/android/myinfo.php?name=ysr&age=34";
		String line;
		
		try {
			url = new URL(address);
			String name = "À±¼º·Ä";
			int age = 34;
			 input = new BufferedReader(new InputStreamReader(url.openStream()));
			
			while((line = input.readLine())!= null) {
				System.out.println(line);
			}
			input.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
