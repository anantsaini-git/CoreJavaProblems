package test.check.number;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.check.number.PrimeTestExample;

@RunWith(Parameterized.class)
public class TestPrimeNumberExample {

	private PrimeTestExample primeTestExample;
	private Integer testNumber;
	private Boolean expectedOutcome;
	
	@Before
	public void setUpBeforeClass() throws Exception {
		primeTestExample = new PrimeTestExample();
	}

	public TestPrimeNumberExample(Integer testNumber, Boolean expectedOutcome) {
		this.testNumber = testNumber;
		this.expectedOutcome = expectedOutcome;
	}
	
	@Parameters
	public static Collection<Object[]> testNumbers() {
		return Arrays.asList(new Object[][] {
			{10, false},
			{11, true},
			{17, true},
			{21, false},
			{23, true},
		});
	}

	@Test
	public void testIsPrimeNumber() {
		System.out.println("Number to be tested: " + testNumber);
		assertEquals(expectedOutcome, primeTestExample.isPrimeNumber(testNumber));
	}

}
