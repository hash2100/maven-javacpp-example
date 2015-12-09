package eu.atspace.hash;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


public class FooTest extends TestCase {
    public FooTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        return new TestSuite( FooTest.class );
    }

    public void testFoo() {
        FooLib.main(null);
        assertTrue(true);
    }
    
}
 