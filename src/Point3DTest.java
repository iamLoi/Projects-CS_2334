
import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;

/**
 * Point3DTest.java
 * 
 * @author Loi Huynh (completed Trial, TrialTest, Point3D, Point3DTest,
 *         GeneralValue, GeneralValueTest)
 * 
 * @version 2017-09-28
 */

public class Point3DTest
{
    /**
     * Test default constructor
     */
    @Test
    public void testConstructor()
    {
        double value = Math.random();

        String valueFormatted = String.format("%.3f", value);

        GeneralValue x = new GeneralValue();
        GeneralValue y = new GeneralValue(String.valueOf(value));
        GeneralValue z = new GeneralValue("NaN");

        Point3D p3d = new Point3D(x, y, z);

        Assert.assertEquals("invalid", p3d.getDimValue(0).toString());
        Assert.assertEquals(valueFormatted, p3d.getDimValue(1).toString());
        Assert.assertEquals("invalid", p3d.getDimValue(2).toString());
    }

    /**
     * Passes if returns whole array of GeneralValues.
     */
    @Test
    public void testGetValues()
    {
        double value = Math.random();

        GeneralValue x = new GeneralValue();
        GeneralValue y = new GeneralValue(String.valueOf(value));
        GeneralValue z = new GeneralValue("NaN");

        GeneralValue[] gv = new GeneralValue[3];
        Point3D p = new Point3D(x, y, z);

        gv[0] = x;
        gv[1] = y;
        gv[2] = z;

        Assert.assertTrue(Arrays.equals(gv, p.getValues()));
    }

    /**
     * Passes if output matches expected string
     */
    @Test
    public void testToString()
    {

        // double value = Math.random();
        GeneralValue x = new GeneralValue("4.321");
        GeneralValue y = new GeneralValue("42.000");
        GeneralValue z = new GeneralValue("NaN");

        Point3D p = new Point3D(x, y, z);

        String expected = "4.321,42.000,invalid";

        Assert.assertEquals(expected, p.toString());

    }
}
