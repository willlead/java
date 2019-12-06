package Exam;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExamNumberTest {

	@Test
	void testRound() {
		assertEquals(ExamNumber.round(3.141592, 1),3.1);
		assertEquals(ExamNumber.round(3.141592, 2),3.14);
		assertEquals(ExamNumber.round(3.14, 3),3.14);
		assertEquals(ExamNumber.round(3.14, 0),3);
		assertEquals(ExamNumber.round(3.14, 0),3.0);
		
	}

}
