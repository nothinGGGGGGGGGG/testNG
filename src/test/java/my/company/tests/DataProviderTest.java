package my.company.tests;


import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.zip.DataFormatException;

public class DataProviderTest {

    @DataProvider (name = "Test1")
    public static Object[][] dataProviderAdd() {
        return new Object[][]{
                {0, 0, 0},
                {1, 1, 2},
        };
    }

    @Test (dataProvider = "Test1")
    public void testAdd(int first, int second, long result) {
        Assert.assertEquals(first + second, result);
    }
}
