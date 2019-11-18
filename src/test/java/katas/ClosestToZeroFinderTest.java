package katas;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class ClosestToZeroFinderTest {
	private ClosestToZeroFinder underTest;

	@Before
	public void setup() {
		underTest = new ClosestToZeroFinder();
	}

	@Test
	public void givenAListOfIntsReturnsClosestToZero() throws Exception {
		expectClosestToZero(1, Arrays.asList(1, 2));
		expectClosestToZero(2, Arrays.asList(2, 3));
		expectClosestToZero(2, Arrays.asList(3, 2));
		expectClosestToZero(1, Arrays.asList(2, 3, 1));
		expectClosestToZero(1, Arrays.asList(-2, 1));
		expectClosestToZero(2, Arrays.asList(-2, 2, -2, -2, -2, 2, 4, 5, 2009));
		expectClosestToZero(0, Arrays.asList(0, 2, -2, 1));
		expectClosestToZero(Integer.MAX_VALUE, Arrays.asList(Integer.MIN_VALUE, Integer.MAX_VALUE));
		expectClosestToZero(Integer.MIN_VALUE, Arrays.asList(Integer.MIN_VALUE, Integer.MIN_VALUE));
		expectClosestToZero(Integer.MIN_VALUE, Arrays.asList( Integer.MIN_VALUE));
		


	}

	private void expectClosestToZero(int expectedValue, List<Integer> testData) {
		int result = underTest.findClosestToZero(testData);
		assertThat(result, equalTo(expectedValue));
	}

}
