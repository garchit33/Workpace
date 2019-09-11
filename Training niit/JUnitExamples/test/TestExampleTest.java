

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestExampleTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testADDInts() {
		
		int a=1;
		int b=2;
		TestExample test1 = new TestExample();
		int result = test1.ADDInts(a,b);
		assertEquals(3,result);
	}

//		@Test
//		public void testADDString() {
//			
////			String str1;
////			String str2;
//			TestExample test2 = new TestExample();
//			String result1 = test2.ADDString("Archit", "Garg");
//			assertEquals("ArchitGarg", result1);
//		}
	
		@Test
		public void testADDChar() {
		
			char q = 'a';
			char w = 'b';
			TestExample test3 = new TestExample();
			int result2 = test3.ADDSChar(q, w);
			assertEquals(195, result2);
		}
}
