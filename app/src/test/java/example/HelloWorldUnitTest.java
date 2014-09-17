package example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HelloWorldUnitTest {
    
	@Test
    public void test() {
        assertEquals("coveredByUnitTest", new HelloWorld().coveredByUnitTest());
    }
	
}
