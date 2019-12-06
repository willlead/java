import java.util.Objects;

public class SutdaCard {
	int num;
	boolean isKwang;
	
	SutdaCard() {
		this(1, true);
	}
	
	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	public boolean equals(Object obj) {
		/*
		 * if(Objects.equals(isKwang,((SutdaCard)obj).isKwang) &&
		 * Objects.equals(num,((SutdaCard)obj).num)) return true; return false;
		 */
		if(obj instanceof SutdaCard)
		{
			SutdaCard tmp = (SutdaCard)obj;
			return (this.num == tmp.num) && (this.isKwang == tmp.isKwang);				
		}
		return false;
	}
	
	public String toString() {
		return num + ( isKwang ? "K":"");
	}
}
