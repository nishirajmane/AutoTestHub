package base;

import org.testng.annotations.Test;     // ✅ TestNG
import utils.MongoLogger;               // ✅ Mongo utility

public class DummyTest extends BaseTest {

    @Test                               // ❗ MISSING — Needed to mark it as a test
    public void testTitle() {
        try {
            String title = driver.getTitle();
            System.out.println("Title is: " + title);
            MongoLogger.logResult("testTitle", "PASSED");
        } catch (Exception e) {
            MongoLogger.logResult("testTitle", "FAILED");
        }
    }
}
