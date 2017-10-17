
import java.io.IOException;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * TrialTest.java
 * 
 * @author Loi Huynh
 * @version 2017-09-28
 */

public class TrialTest
{
    /**
     * Directory folder
     */
    public static String directory = "data";
    /**
     * infantID
     */
    public static String infantID = "c1";
    /**
     * Week
     */
    public static int week = 1;

    /**
     * fileName for matching
     */
    public static String fileName = String.format("%s/subject_%s_w%02d.csv", directory,
            infantID, week);
    /**
     * Trial object to be used
     */
    public static Trial trial;

    /**
     * initialize the objects
     * 
     * @throws IOException
     *             in case something isn't found
     */
    @BeforeClass
    public static void initialize() throws IOException
    {

        trial = new Trial(directory, infantID, week);
    }

    /**
     * Test if output matches expected output
     * 
     */
    @Test
    public void testDefaultConstructor()
    {

        Assert.assertEquals(fileName, trial.getFileName());
        Assert.assertEquals(infantID, trial.getInfantID());
        Assert.assertEquals(week, trial.getWeek());
    }

    /**
     * Test getState and getSize
     * 
     * @throws IOException
     *             in case file isn't found
     */
    @Test
    public void testGetStateAndGetSize() throws IOException
    {
        String leftWrist = "0.153,0.183,-0.207";
        Assert.assertEquals(15000, trial.getSize());
        Assert.assertEquals(leftWrist, trial.getItem(0).getLeftWrist().toString());
    }

    /**
     * Test getting max, min, average
     */
    @Test
    public void testMaxMinAvg()
    {
        double maxValueLeftWrist = 0.424;
        double minValueLeftWrist = 0.009;
        double avgVal = .183;
        Assert.assertEquals(maxValueLeftWrist, trial.getMaxLeftWrist(0).getDoubleValue(),
                0.01);
        Assert.assertEquals(minValueLeftWrist, trial.getMinLeftWrist(0).getDoubleValue(),
                0.01);
        Assert.assertEquals(avgVal, trial.getAverageLeftWrist(0).getDoubleValue(), 0.01);

    }
}
