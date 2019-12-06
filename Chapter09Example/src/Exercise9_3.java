import java.util.StringJoiner;

public class Exercise9_3 {

	public static void main(String[] args) {
		String fullPath = "c:\\jdk1.8\\work\\PathSeparateTest.java";
		String path = "";
		String fileName = "";
		
		/*
		 * String[] str = fullPath.split("\\\\"); StringJoiner sj = new
		 * StringJoiner("\\"); for(int i = 0; i<str.length-1; i++) sj.add(str[i]);
		 * 
		 * path = sj.toString(); fileName = str[str.length-1];
		 */
		int pos = fullPath.lastIndexOf("\\");
		path = fullPath.substring(0,pos);
		fileName = fullPath.substring(pos+1);
		
		System.out.println("fullPath: "+fullPath);
		System.out.println("path: "+path);
		System.out.println("fileName: "+fileName);
	}

}
