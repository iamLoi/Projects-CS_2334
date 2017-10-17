import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.Assert;

/**
 * InfantTest.java
 * 
 * @author Loi Huynh
 * @version Oct 10, 2017
 */

public class InfantTest
{
    /**
     * infantID
     */
    public static String infantID = "c1";

    /**
     * fileName for matching
     */
    public static String directory = "data";

    /**
     * Object for testing
     */
    public static Infant infant;

    /**
     * initialize the objects
     * 
     * @throws IOException
     *             in case something isn't found
     */
    @BeforeClass
    public static void initialize() throws IOException
    {
        infant = new Infant(directory, infantID);
    }

    /**
     * Test Infant methods
     */
    @Test
    public void testMethods()
    {
        String leftWrist = "0.153,0.183,-0.207";
        Assert.assertEquals(infantID, infant.getInfantID().toString());
        Assert.assertEquals(5, infant.getSize());
        Assert.assertEquals(leftWrist,
                infant.getItem(0).getItem(0).getLeftWrist().toString());

    }
}
