import java.util.Arrays;

public class ChapterExample 
{

	public static void main(String[] args) {
		
		/*
		 * MyPoint p = new MyPoint(1, 1); System.out.println(p.getDistance(2, 2));
		 */
		
//		System.out.println(getDistance(1,1,2,2));
		
		
		/*
		 * Student s = new Student("ȫ�浿",1,1,100,60,76);
		 * 
		 * System.out.println(s.info());
		 */
		
		
		/*
		 * SutdaCard card1 = new SutdaCard(3,false); SutdaCard card2 = new SutdaCard();
		 * 
		 * System.out.println(card1.info()); System.out.println(card2.info());
		 */
		
		
		/*
		 * int[] original = {1,2,3,4,5,6,7,8,9};
		 * System.out.println(Arrays.toString(original)); int[] result =
		 * shuffle(original); System.out.println(Arrays.toString(result));
		 */
		
		/*
		 * MyTv t = new MyTv(); t.channel = 100; t.volume = 0; System.out.println("CH: "
		 * + t.channel+", Vol" + t.volume);
		 * 
		 * t.channelDown(); t.volumeDown(); System.out.println("CH:" +
		 * t.channel+", Vol:" + t.volume);
		 * 
		 * t.volume = 100; t.channelUp(); t.volumeUp();
		 * System.out.println("CH:"+t.channel+", Vol:"+t.volume);
		 */
		
	}
	
	static int[] shuffle(int[] arr) {
		
		for(int i = 0; i< arr.length; i++)
		{
			int rand = (int)(Math.random()*arr.length);
			int tmp;
			
			tmp = arr[rand];
			arr[rand] = arr[i];
			arr[i] = tmp;			
		}
		
		return arr;
	}
	
	static double getDistance(int x, int y, int x1, int y1) {
		return Math.sqrt(Math.pow(Math.abs(x1-x),2) + Math.pow(Math.abs(y1-y), 2));
	}
}

class MyTv
{
	boolean isPowerOn;
	int channel;
	int volume;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	void turnOnOff() { isPowerOn =!isPowerOn; }	
	void volumeUp() { if(volume < MAX_VOLUME) volume++; }
	void volumeDown() { if(volume > MIN_VOLUME) volume--; }
	void channelUp() { channel++; }
	void channelDown() { channel--; }
}

class MyPoint
{
	int x;
	int y;
	
	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	double getDistance(int x1, int y1) {
		return Math.sqrt(Math.pow(Math.abs(x1-x),2) + Math.pow(Math.abs(y1-y), 2));
}

class Student
{
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(String name, int ban, int no, int kor, int eng, int math) {
		 this.name = name;
		 this.ban = ban;
		 this.no = no;
		 this.kor = kor;
		 this.eng = eng;
		 this.math = math;
	}
	
	int getTotal() {
		return kor + eng + math;
	}
	
	float getAverage() {
		int total = getTotal();
		float average = (int)((total/3.0f+ 0.05f)*10);
		return average/10;		
	}
	
	String info()
	{
		return 
				name + "," + ban + ","+ no + "," +
				kor + ","+ eng + ","+ math +
				getTotal() + ","+ getAverage();
	}	
}


class SutdaCard
{
	int num = 1 ;
	boolean isKwang = true;
	public SutdaCard() {
		// TODO Auto-generated constructor stub
	}
	public SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	String info()
	{
		String result = "";
		if(this.isKwang)
		{
			result = this.num +"K"; 
			return result; 
		}
		else
		{
			result = ""+this.num;
			return result;
		}
			
					
	}
}
}
