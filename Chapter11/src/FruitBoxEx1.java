import java.util.ArrayList;

class Fruit{ public String toString() {return "F";}}
	class Apple extends Fruit { public String toString() {return "A";}}
	class Grape extends Fruit { public String toString() {return "G";}}
	class Toy { public String toString() {return "T";}}
	
public class FruitBoxEx1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<Fruit> fruitBox = new Box<Fruit>();
		Box<Apple> appleBox = new Box<Apple>();
		Box<Grape> grapeBox = new Box<Grape>();
		Box<Toy> toyBox = new Box<Toy>();
		
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple());
		
		appleBox.add(new Apple());
		appleBox.add(new Apple());
		//appleBox.add(new Toy());
		
		toyBox.add(new Toy());
		//toyBox.add(new Apple());
		
		System.out.println(fruitBox);
		System.out.println(appleBox);
		System.out.println(toyBox);
	}

}

class Box<T> 
{
	
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) { list.add(item); }
	T get(int i ) {return list.get(i);}
	int size() { return list.size();}
	public String toString() {return list.toString();}
	
	
}
