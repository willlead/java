package junittest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Objects;

import org.junit.jupiter.api.Test;

class Stringtest {
	testString ts = new testString();

	@Test
	void testCount() {
		assertEquals( ts.count("Hello", "Good"), 0);
		assertEquals(ts.count("Good", "oo"), 1);
		assertEquals(ts.count("Good Afternoon", "a"), 0);
	}

	@Test
	void testFillZero() {
		testString t1 = new testString();
		testString t2 = new testString();
		
		//assertSame(t1, t2);
		assertTrue(Objects.deepEquals(t1, t2));
		assertEquals(null, ts.fillZero(null, 10));
		assertEquals("morning", ts.fillZero("morning", 7));
		assertEquals("mor", ts.fillZero("morning", 3));
		assertEquals("", ts.fillZero("morning", -1));
		assertEquals("000morning", ts.fillZero("morning", 10));
	}

	@Test
	void testContains() {
		assertEquals(true, ts.contains("Good morning", "morning"));
		assertEquals(false, ts.contains("Good morning", "afternoon"));
	}
	@Test
	void testDelChar() {
		assertEquals("01234567", ts.delChar("01234567", "!@#$%^&*()"));
		assertEquals("01234567", ts.delChar("01$234%5(67)", "!@#$%^&*()"));
		assertEquals(" mrning", ts.delChar("Good morning", "God"));
	}

}
