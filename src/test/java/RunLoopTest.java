/**
 * Created by Nikolay on 11.07.2016.
 */


import junit.framework.TestCase;
import org.junit.Test;


public class RunLoopTest extends TestCase {


    @Test
    public void testRun() throws Exception {

            RunLoop runLoop = new RunLoop();
            int result = runLoop.run();
            assertEquals(19, result);

    }
}
