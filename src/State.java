
/**
 * Representation of the state of a single time step
 * 
 * @author Loi Huynh
 * @author Andrew H. Fagg
 * @version 2017-09-28
 *
 */
public class State extends SingleItemAbstract
{

    /** Position of the left Wrist */
    private Point3D leftWrist;
    /** Position of the right Wrist */
    private Point3D rightWrist;
    /** Timestamp of the current sample. */
    private double time;

    /**
     * Splits the string into 7 parts and save corresponding elements to either
     * left or right wrist.
     * 
     * @param strg
     *            from the line of comma separated values
     */
    public State(String strg)
    {
        String[] parts = strg.split(",");
        time = Double.parseDouble(parts[0]);
        leftWrist = new Point3D(new GeneralValue(parts[1]), new GeneralValue(parts[2]),
                new GeneralValue(parts[3]));
        rightWrist = new Point3D(new GeneralValue(parts[4]), new GeneralValue(parts[5]),
                new GeneralValue(parts[6]));

    }

    /**
     * get left wrist
     * 
     * @return leftWrist leftWrist
     */
    public Point3D getLeftWrist()
    {
        return leftWrist;

    }

    /**
     * get right wrist
     * 
     * @return rightWrist rightWrist
     */
    public Point3D getRightWrist()
    {
        return rightWrist;

    }

    /**
     * time of state
     * 
     * @return time of state
     */
    public double getTime()
    {
        return this.time;
    }

    /**
     * The timestamp and position of left and right wrists
     * 
     * @return formatted string of state
     */
    public String toString()
    {
        return String.format("%.2f: left_wrist=<%s>, right_wrist=<%s>", time,
                leftWrist.toString(), rightWrist.toString());

    }

    /**
     * Essentially a getter method for specified dimension of the left wrist
     * 
     * @param dim
     *            dimension of value
     * @return a general value of the specified dimension
     */
    @Override
    public GeneralValue getMaxLeftWrist(int dim)
    {
        return getLeftWrist().getDimValue(dim);
    }

    /**
     * Essentially a getter method for specified dimension of the left wrist
     * 
     * @param dim
     *            dimension of value
     * @return a general value of the specified dimension
     */
    @Override
    public GeneralValue getMinLeftWrist(int dim)
    {
        return getLeftWrist().getDimValue(dim);
    }

    /**
     * Essentially a getter method for specified dimension of the left wrist
     * 
     * @param dim
     *            dimension of value
     * @return a general value of the specified dimension
     */
    @Override
    public GeneralValue getAverageLeftWrist(int dim)
    {
        return getLeftWrist().getDimValue(dim);
    }

}
