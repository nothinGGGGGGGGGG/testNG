package my.company.tests;

import io.qameta.allure.Step;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


/**
 * @author Dmitry Baev charlie@yandex-team.ru
 *         Date: 29.11.13
 */
public class TheoryTest {

    public static String USERNAME1 = "optimus";
    public static String USERNAME2 = "optimus-prime";


    public void usernameNotContainsSlash(String username)
    {
        checkUserName(username);
    }

    @Test
    public void checkUserName(String username) {
        Assert.assertEquals(USERNAME1, USERNAME2);
    }
}
