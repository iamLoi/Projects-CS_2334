import java.io.IOException;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * MultipleItemAbstractTest.java
 * 
 * @author Loi Huynh
 * @version Oct 10, 2017
 */

public class MultipleItemAbstractTest
{
    /**
     * Directory folder
     */
    public static String directory = "origdata";
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
     * Infant object to be used
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

        trial = new Trial(directory, infantID, week);
        // infant = new Infant(directory, infantID);
    }

    /**
     * test minMaxAverageMethods
     */
    @Test
    public void minMaxAverageMethods()
    {
        double maxValueLeftWrist = 0.423647;
        double minValueLeftWrist = 0.008596;
        double avgVal = .1834453218;
        Assert.assertEquals(maxValueLeftWrist, trial.getMaxLeftWrist(0).getDoubleValue(),
                0.0001);
        Assert.assertEquals(minValueLeftWrist, trial.getMinLeftWrist(0).getDoubleValue(),
                0.0001);
        Assert.assertEquals(avgVal, trial.getAverageLeftWrist(0).getDoubleValue(), 0.001);

    }
}
