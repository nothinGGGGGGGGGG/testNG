package my.company.tests;

import io.qameta.allure.Attachment;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.testng.Assert;
import org.testng.annotations.Test;


import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.testng.Assert.fail;


/**
 * @author Dmitry Baev charlie@yandex-team.ru
 *         Date: 24.11.13
 */
public class SimpleTest {

    @Test
    public void simpleTest() throws Exception {
        Assert.assertEquals(2, 2);
    }

    @Step
    public void checkThat2is2() {
        Assert.assertEquals(2, 2);
    }

    @Test
    public void simpleTestWithSteps() throws Exception {
        checkThat2is2();
    }

    @Attachment
    public String makeAttach() {
        return "yeah, 2 is 2";
    }

    @Test
    public void simpleTestWithAttachments() throws Exception {
        Assert.assertEquals(2, 2);
        makeAttach();
    }

    @Description("Test shows CSV attachment")
    @Test
    public void csvAttachmentTest() throws Exception {
        saveCsvAttachment();
    }

    @Attachment(value = "Sample csv attachment", type = "text/csv")
    public byte[] saveCsvAttachment() throws URISyntaxException, IOException {
        URL resource = getClass().getClassLoader().getResource("sample.csv");
        if (resource == null) {
            fail("Couldn't find resource 'sample.csv'");
        }
        return Files.readAllBytes(Paths.get(resource.toURI()));
    }
}
