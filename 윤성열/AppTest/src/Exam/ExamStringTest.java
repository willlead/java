package Exam;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExamStringTest {

	@Test
	void testCount() {
		assertEquals(ExamString.count("GOod", "o"),1);
		assertEquals(ExamString.count("Good Morning", " "),1);
		assertEquals(ExamString.count("Good Morning", "rn"),1);
		
	}

	@Test
	void testFillZero() {
		assertEquals(ExamString.fillZero("GOod", 2),"GO");
		assertEquals(ExamString.fillZero("Good",5),"0Good");
		assertEquals(ExamString.fillZero("Good00",10),"0000Good00");
		assertEquals(ExamString.fillZero("Good00",-1),"");
		assertEquals(ExamString.fillZero(null, 10),null);
	}

	@Test
	void testContains() {
		assertEquals(ExamString.contains("Good", "g"), false);
		assertEquals(ExamString.contains("Good", "f"), false);
		assertEquals(ExamString.contains("Good", "o"), true);
		assertEquals(ExamString.contains("Good", "od"), true);
		assertEquals(ExamString.contains("Good", "GoodGood"), false);
	}

	@Test
	void testDelChar() {
		
		assertEquals(ExamString.delChar("Good", "g"), "Good");
		assertEquals(ExamString.delChar("Good", "f"), "Good");
		assertEquals(ExamString.delChar("Good", "o"), "Gd");
		assertEquals(ExamString.delChar("Good", "od"), "G");
		assertEquals(ExamString.delChar("Good", "god"), "G");
		
		
	}

}
