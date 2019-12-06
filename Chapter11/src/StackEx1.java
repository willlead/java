import java.util.*;

public class StackEx1 {
	
	public static Stack back = new Stack();
	public static Stack forward = new Stack();
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		goURL("1. Nate");
		goURL("2. Yahoo!");
		goURL("3. Naver");
		goURL("4. Daum");
		
		printStatus();
		
		goBack();
		printStatus();
		
		goBack();
		printStatus();
		
		goForward();
		printStatus();
		
		goURL("chobo.com");
		printStatus();
		
		
		

	}
	
	public static void printStatus()
	{
		System.out.println("back: "+back);
		System.out.println("forward: "+forward);
		System.out.println("현재화면은: "+back.peek());
		System.out.println();
	}
	
	public static void goURL(String url) {
		back.push(url);
		if(!forward.empty())
			forward.clear();
	}
	
	public static void goForward() {
		if(!forward.empty())
			back.push(forward.pop());
	}
	
	public static void goBack() {
		if(!back.empty())
			forward.push(back.pop());
	}

}

