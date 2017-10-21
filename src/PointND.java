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
     * Access generalvalues in TreeMap
     * 
     * @param subFieldName
     *            title of value
     * @return a general value
     */
    public GeneralValue getValue(String subFieldName)
    {
        return values.get(subFieldName);

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
        // TODO: VERIFY IF CORRECT!
        String output = "";
        Iterator<String> keys = iterator();

        while (keys.hasNext())
        {
            output += keys.next() + " = " + values.get(keys.next()) + "; \n";
        }

        return output;
    }
}
