import junit.framework.TestCase;

public class GradeBookTest extends TestCase {
	private GradeBook x1;
	private GradeBook x2;
	public void setUp() throws Exception {
		x1 = new GradeBook(5);
		x2 = new GradeBook(5);
		x1.addScore(95.7);
		x1.addScore(71.5);
		x1.addScore(99.8);
		x2.addScore(76.4);
		x2.addScore(99.9);
		x2.addScore(67.1);
		x2.addScore(89.5);
		super.setUp();
	}

	public void tearDown() throws Exception {
		x1 = null;
		x2 = null;
		super.tearDown();
	}

	public void testGetScoreSize() {
		fail("Not yet implemented");
	}

	public void testAddScore() {
		assertTrue(x1.toString().equals("95.7 71.5 99.8 "));
		assertTrue(x2.toString().equals("76.4 99.9 67.1 89.5 "));
		assertEquals(3, x1.getScoreSize(), .001);
		assertEquals(4, x2.getScoreSize(), .001);
	}

	public void testSum() {
		assertEquals(267, x1.sum(), .001);
		assertEquals(332.9, x2.sum(), .001);
	}

	public void testMinimum() {
		assertEquals(71.5, x1.minimum(), .001);
		assertEquals(67.1, x2.minimum(), .001);
	}

	public void testFinalScore() {
		assertEquals(195.5, x1.finalScore(), .001);
		assertEquals(265.8, x2.finalScore(), .001);
	}

	public void testToString() {
		fail("Not yet implemented");
	}

}
