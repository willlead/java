package Exercise7_25;

class Outer {
	class Inner {
		int iv=100;
	}
}

class Exercise7_25 {
	public static void main(String[] args) {
		/*
			(1) �˸��� �ڵ带 �־� �ϼ��Ͻÿ�.
		*/
		Outer outer = new Outer();
		Outer.Inner inner  = outer.new Inner();
		System.out.println(inner.iv);
	}
}