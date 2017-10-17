
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * State Test class
 * 
 * @author Loi Huynh
 * @version 2017-09-28
 */
public class StateTest
{
    /**
     * Initializes TIME
     */
    private static final double TIME = 0.000000;
    /**
     * Creates an object for class State
     */
    private static State state;

    /**
     * Initialize objects needed for testing
     */
    @BeforeClass
    public static void initialize()
    {
        state = new State("0,1,2,3,0.157862,-0.273852,-0.055263");
    }

    /**
     * Method that tests the get rightWrist method in class State
     */
    @Test
    public void stateGetRightWristTest()
    {
        Point3D rightWrist = state.getRightWrist();
        Assert.assertEquals(rightWrist, state.getRightWrist());
    }

    /**
     * Method that tests the get leftWrist method in class State
     */
    @Test
    public void stateGetLeftWristTest()
    {
        Point3D leftWrist = state.getLeftWrist();

        Assert.assertEquals(leftWrist, state.getLeftWrist());
    }

    /**
     * Method that tests the get time method in class State
     */
    @Test
    public void stateGetTimeTest()
    {
        // double time = 0.000000;
        Assert.assertEquals(TIME, state.getTime(), 0.0001);
    }

    /**
     * test toString for match
     */
    @Test
    public void testToString()
    {
        String expected = String.format("%.2f: left_wrist=<%s>, right_wrist=<%s>", TIME,
                state.getLeftWrist().toString(), state.getRightWrist().toString());
        Assert.assertEquals(expected, state.toString());
    }

    /**
     * test min,max,average
     */
    @Test
    public void testMinMaxAverage()
    {
        Assert.assertEquals(1.000, state.getMaxLeftWrist(0).getDoubleValue(), .00001);
        Assert.assertEquals(2.000, state.getMinLeftWrist(1).getDoubleValue(), .00001);
        Assert.assertEquals(3.000, state.getAverageLeftWrist(2).getDoubleValue(), .00001);
    }
}
