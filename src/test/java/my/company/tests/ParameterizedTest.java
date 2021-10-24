package my.company.tests;


import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParameterizedTest {

  @DataProvider(name = "Parameters")
  public Object[][] getData() {
    return new Object[][]{{1, 2, 2}, {2, 4, 8}};
  }

  @Test(dataProvider = "Parameters")
  public void testMultiplication(int first,int second, int result) {
    Assert.assertEquals(first * second, result);
  }

}
