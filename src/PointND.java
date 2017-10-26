import java.util.Iterator;
import java.util.TreeMap;

/**
 * PointND.java
 * 
 * @author Loi Huynh
 * @version Oct 20, 2017
 */

public class PointND
{
    /** Stores key and values of each PointND **/
    private TreeMap<String, GeneralValue> values = new TreeMap<>();

    /**
     * Default constructor
     */
    public PointND()
    {
        PointND nd = new PointND();
    }

    /**
     * Add new data set to TreeMap
     * 
     * @param subFieldName
     *            title of value
     * @param value
     *            value itself
     */
    public void add(String subFieldName, GeneralValue value)
    {
        values.put(subFieldName, value);
    }

    /**
     * getValue(String subFieldName) will return the GeneralValue that
     * corresponds to the subfield. If subFieldName does not exist in the map,
     * then this method must return an invalid GeneralValue.
     * 
     * @param subFieldName
     *            title of value
     * @return a general value
     */
    public GeneralValue getValue(String subFieldName)
    {
        if (values.containsKey(subFieldName))
        {
            return values.get(subFieldName);
        }
        return new GeneralValue();

    }

    /**
     * Access size of TreeMap
     * 
     * @return size of values
     */
    public int size()
    {
        return values.size();
    }

    /**
     * Returns the collection of data sets in values
     * 
     * @return an iterator of string of data sets in values
     */
    public Iterator<String> iterator()
    {
        // TODO: VERIFY IF CORRECT!
        return values.keySet().iterator();

    }

    /**
     * returns a single line String with one component for each subﬁeld (the
     * subﬁeld strings are appended together).
     * 
     * @return returns a single line String with one component for each subﬁeld
     *         (the subﬁeld strings are appended together).
     */
    public String toString()
    {
        String output = "";
        Iterator<String> keys = iterator();

        while (keys.hasNext())
        {
            String thisKey = keys.next();
            // Single line string
            output += thisKey + " = " + values.get(thisKey) + "; ";
        }

        return output;
    }
}
