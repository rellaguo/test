package example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HelloWorldIntegrationTest {

    @Test
    public void test() {
        assertEquals("coveredByIntegrationTest", new HelloWorld().coveredByIntegrationTest());
    }
	
}
