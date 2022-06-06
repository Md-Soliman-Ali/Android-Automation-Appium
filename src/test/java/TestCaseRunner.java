import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestCaseRunner {

    TestCase objTest;

    @Test
    public void runApp() throws IOException, InterruptedException {
        objTest = new TestCase();
        String result = objTest.doSum();
        Assert.assertEquals(result, "12");
    }

    @Test
    public void runApp2() throws IOException, InterruptedException {
        objTest = new TestCase();
        String result = objTest.doMul();
        Assert.assertEquals(result, "35");
    }
}

