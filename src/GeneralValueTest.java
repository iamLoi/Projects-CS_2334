
import org.junit.Assert;
import org.junit.Test;

/**
 * GeneralValueTest.java
 * 
 * @author Loi Huynh
 * @version 2017-09-28
 */

public class GeneralValueTest
{
    /**
     * test both Construtors
     */
    @Test
    public void testConstrutors()
    {
        GeneralValue gv = new GeneralValue();

        Assert.assertEquals(false, gv.isValid());

        GeneralValue gv1 = new GeneralValue("NaN");
        Assert.assertEquals(false, gv1.isValid());

        GeneralValue gv2 = new GeneralValue("15.42342343245");
        Assert.assertEquals(true, gv2.isValid());
        Assert.assertEquals(15.42342343245, gv2.getDoubleValue(), 0.0);

        GeneralValue gv3 = new GeneralValue(4.2);
        Assert.assertEquals(true, gv2.isValid());
        Assert.assertEquals(4.2, gv3.getDoubleValue(), 0.0);

        GeneralValue gv4 = new GeneralValue("0");
        boolean flag = false;
        try
        {
            gv4 = new GeneralValue(Double.NaN);
        }
        catch (InvalidValueException e)
        {
            flag = true;
        }
        Assert.assertEquals(gv4, gv4);
        Assert.assertTrue(flag);

    }

    /**
     * test toString for match
     */
    @Test
    public void testToString()
    {
        GeneralValue gv = new GeneralValue();
        Assert.assertEquals("invalid", gv.toString());

        GeneralValue gv1 = new GeneralValue("NaN");
        Assert.assertEquals("invalid", gv1.toString());

        GeneralValue gv2 = new GeneralValue("15.42342343245");
        Assert.assertEquals("15.423", gv2.toString());

    }

    /**
     * Test other methods
     */
    @Test
    public void testOtherMethods()
    {
        GeneralValue v1 = new GeneralValue(0);
        GeneralValue v2 = new GeneralValue(5);
        GeneralValue v3 = new GeneralValue(); // invalid

        // Assert.assertEquals(false, v1.isGreaterThan(v2));
        Assert.assertFalse(v1.isGreaterThan(v2));

        // Assert.assertEquals(false, v1.isGreaterThan(v2));
        Assert.assertTrue(v1.isLessThan(v2));

        // Assert.assertEquals(false, v2.isLessThan(v1));
        Assert.assertFalse(v2.isLessThan(v1));

        // Assert.assertEquals(false, v3.isLessThan(v2));
        Assert.assertFalse(v3.isLessThan(v2));

        // Assert.assertEquals(false, v3.isGreaterThan(v2));
        Assert.assertFalse(v3.isGreaterThan(v2));
        // Assert.assertEquals(true, v2.isGreaterThan(v1));
        Assert.assertTrue(v2.isGreaterThan(v1));

        // Assert.assertEquals(false, v2.isGreaterThan(v3));
        Assert.assertFalse(v2.isGreaterThan(v3));
        Assert.assertTrue(v2.isLessThan(v3));
    }
}
