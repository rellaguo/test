package example;

import org.junit.Test;

public class HelloWorldIntegrationTest {

    @Test
    public void test() {
        assertEquals("coveredByIntegrationTest", new HelloWorld().coveredByIntegrationTest());
    }
	
}
