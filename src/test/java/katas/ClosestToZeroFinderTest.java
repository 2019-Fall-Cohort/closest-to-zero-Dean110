package katas;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class ClosestToZeroFinderTest {
  @Test
  public void givenAListWithOneAndTwo_ReturnsOne() throws Exception {
    //Arrange
    ClosestToZeroFinder underTest = new ClosestToZeroFinder();
    List<Integer> testData = Arrays.asList(1,2);
    //Act
    int result = underTest.findClosestToZero(testData);
    //Assert
    assertThat(result, equalTo(1));
  }
}
