package Exercise7_26;

class Outer {
	static class Inner {
		int iv=200;
	}
}

class Exercise7_26 {
	public static void main(String[] args) {
		/*
			(1) �˸��� �ڵ带 �־� �ϼ��Ͻÿ�.
		*/
		Outer.Inner in = new Outer.Inner();
		System.out.println(in.iv);
	}
}