
public class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	
	SutdaDeck() {
		
		for(int i = 0; i < cards.length; i++)
		{				
			int num = i%10+1;
			
			if(i == 1 || i == 3 || i ==8 )
				cards[i] = new SutdaCard(num,true);
			else
				cards[i] = new SutdaCard(num,false);
		}		
	}
	
	void shuffle() 
	{
		for(int i = 0; i< cards.length; i++)
		{
			int index = (int)(Math.random()*cards.length);
			SutdaCard tmp = null;
			tmp = cards[index];
			cards[index] = cards[i];
			cards[i]=tmp;
			
		}
	}
	
	SutdaCard pick(int index)
	{
		return cards[index];
	}
	
	SutdaCard pick()
	{
		return cards[(int)(Math.random()*cards.length)];
	}
	
}

