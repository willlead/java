class Qua8 {
	public static void main(String args[]) {
		SutdaDeck deck = new SutdaDeck();

		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		deck.shuffle();

		for(int i=0; i < deck.cards.length;i++)
			System.out.print(deck.cards[i]+",");

		System.out.println();
		System.out.println(deck.pick(0));
	}
}

class SutdaDeck
{
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	
	public SutdaDeck() {
		for(int i =0; i< cards.length; i++)
		{
			SutdaCard card = new SutdaCard();
			cards[i] = card;
			
			int num = i+1;			
			if(num == 1 || num == 3 | num ==8)
				card.isKwang = true;
			else
				card.isKwang = false;
				
			card.num = i%10+1;
			
		}
	}
	
	void shuffle()
	{
		for(int i = 0; i< cards.length; i++)
		{
			int index =(int)(Math.random()*cards.length); 
			SutdaCard tmp = cards[i];
			cards[i] = cards[index];
			cards[index] = tmp;			
		}
	}
	
	SutdaCard pick(int index) 
	{
		return cards[index];
	}
	
	SutdaCard pick() 
	{
		int index = (int)(Math.random()*cards.length);
		return cards[index];
	}
}

class SutdaCard
{
	int num;
	boolean isKwang;
	
	public SutdaCard() {
		// TODO Auto-generated constructor stub
	}
	
	public SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	public String toString() {
		
		if(isKwang)
			return num+"k";
		return ""+num;
	}
}