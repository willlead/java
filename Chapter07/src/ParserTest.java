
public class ParserTest {

	public static void main(String[] args) {
		Parseable parser = ParserManager.getParser("XML");
		parser.parse("document.xml");
		
		parser = ParserManager.getParser("HTML");
		parser.parse("document2.html");
		
		char ch = 'a';
		System.out.println(ch+1);
	}

}
