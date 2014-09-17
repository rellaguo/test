package example;

import org.junit.Test;

public class HelloWorldUnitTest {
    
	@Test
    public void test() {
        assertEquals("coveredByUnitTest", new HelloWorld().coveredByUnitTest());
    }
	
}
