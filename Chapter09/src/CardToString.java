class Card
{
	String kind;
	int num;
	public Card() {
		// TODO Auto-generated constructor stub
		this("space",1);
	}
	Card (String kind, int num)
	{
		this.kind = kind;
		this.num = num;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getClass().getName()+" [kind="+kind+"]"+", [num="+num+"]";
	}
}


public class CardToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card c1 = new Card();
		Card c2 = new Card();
		
		System.out.println(c1);
		System.out.println(c2);

	}

}
