
/**
 * Point3D.java
 * 
 * @author Loi Huynh
 * @version 2017-09-28
 */

public class Point3D
{
    /**
     * representing three coordinates in X/Y/Z order
     */
    private GeneralValue[] values = new GeneralValue[3];

    /**
     * constructor takes as input three individual GeneralValue objects, in
     * X/Y/Z order
     * 
     * @param x
     *            x coordinate
     * @param y
     *            y coordinate
     * @param z
     *            z coordinate
     */
    public Point3D(GeneralValue x, GeneralValue y, GeneralValue z)
    {
        values[0] = x;
        values[1] = y;
        values[2] = z;
    }

    /**
     * method that returns the GeneralValue for the specified dimension (0=X,
     * 1=Y, 2=Z).
     * 
     * @param dimension
     *            the coordinate of sought for value
     * @return returns the GeneralValue for the specified dimension (0=X, 1=Y,
     *         2=Z).
     */
    public GeneralValue getDimValue(int dimension)
    {
        if (dimension == 0)
        {
            return values[0];
        }
        else if (dimension == 1)
        {
            return values[1];
        }
        else
        {
            return values[2];
        }
    }

    /**
     * method that returns the entire array of GeneralValues.
     * 
     * @return returns the entire array of GeneralValues.
     */
    public GeneralValue[] getValues()
    {
        return this.values;

    }

    /**
     * method that returns a String in the format: “x,y,z”, where each dimension
     * is the value of GeneralValue.toString() for the corresponding value.
     * 
     * @return returns a String in the format: “x,y,z”
     * 
     *         Ex: 4.321, 42.000, invalid
     */
    public String toString()
    {
        String output = "";

        for (GeneralValue gv : values)
        {
            output += gv + ",";
        }

        output = output.substring(0, output.length() - 1); // Removes the last
                                                           // comma since it's
                                                           // not necessary

        return output;
    }
}
