import java.util.Iterator;
import java.util.TreeMap;

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
    private TreeMap<String, PointND> variables = new TreeMap<>();
    private Trial trial;

    /**
     * The default constructor creates an object with no ﬁelds
     */
    public State()
    {

    }

    /**
     * The main (non-default) constructor takes as input the Trial to which the
     * State belongs, a FieldMapper that will inform the constructor about how
     * to create ﬁelds from the data (described below) and a String that
     * describes all of the values associated with the State (a CSV row).
     * 
     * @param trial
     *            Trial to which the State belongs
     * @param fieldMapper
     *            will inform the constructor about how to create ﬁelds from the
     *            data
     * @param values
     *            describes all of the values associated with the State (a CSV
     *            row).
     */
    public State(Trial trial, FieldMapper fieldMapper, String values)
    {
        String[] parts = strg.split(",");
        time = Double.parseDouble(parts[0]);
        leftWrist = new Point3D(new GeneralValue(parts[1]), new GeneralValue(parts[2]),
                new GeneralValue(parts[3]));
        rightWrist = new Point3D(new GeneralValue(parts[4]), new GeneralValue(parts[5]),
                new GeneralValue(parts[6]));

    }

    /**
     * Accessing this trial
     * 
     * @return this trial
     */
    public Trial getTrial()
    {
        return trial;

    }

    /**
     * returns the PointND object corresponding to a ﬁeld name. If the ﬁeld is
     * not a component of the State, then null is returned.
     * 
     * @param fieldName
     * @return returns the PointND object corresponding to a ﬁeld name. If the
     *         ﬁeld is not a component of the State, then null is returned.
     */
    public PointND getPoint(String fieldName)
    {
        return null;

    }

    /**
     * returns the GeneralValue that corresponds to the ﬁeld and subﬁeld names.
     * If the State does not contain the ﬁeld/subﬁeld, then this method returns
     * an invalid GeneralValue.
     * 
     * @param fieldName
     *            fieldname
     * @param subFieldName
     *            value
     * @return returns the GeneralValue that corresponds to the ﬁeld and subﬁeld
     *         names. If the State does not contain the ﬁeld/subﬁeld, then this
     *         method returns an invalid GeneralValue.
     */
    public GeneralValue getValue(String fieldName, String subFieldName)
    {
        return null;
    }

    /**
     * return the State that contains the speciﬁed maximum value.
     * 
     * @param fieldName
     *            key
     * @param subFieldName
     *            value
     * @return return the State that contains the speciﬁed minimum/maximum
     *         value.
     */
    @Override
    public State getMaxState(String fieldName, String subFieldName)
    {
        return null;
    }

    /**
     * return the State that contains the speciﬁed minimum value.
     * 
     * @param fieldName
     *            key
     * @param subFieldName
     *            value
     * @return return the State that contains the speciﬁed minimum/maximum
     *         value.
     */
    @Override
    public State getMinState(String fieldName, String subFieldName)
    {
        return null;
    }

    /**
     * TODO: Doc
     * 
     * @param fieldName
     * @param subFieldName
     * @return
     */
    public GeneralValue getAverageValue(String fieldName, String subFieldName)
    {
        return null;
    }

    /**
     * returns an Iterator over the ﬁeld names.
     * 
     * @return returns an Iterator over the ﬁeld names.
     */
    public Iterator<String> iterator()
    {
        return null;

    }

    /**
     * returns a multi-line String (one line for each ﬁeld, in alphabetical
     * order of the ﬁeld names).
     * 
     * @return returns a multi-line String (one line for each ﬁeld, in
     *         alphabetical order of the ﬁeld names).
     */
    public String toString()
    {
        return null;

    }

}
