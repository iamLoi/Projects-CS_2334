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
        // TODO Auto-generated constructor stub
    }

    /**
     * Add to treeMap
     * 
     * @param subFieldName
     *            title of value
     * @param value
     *            value itself
     */
    public void add(String subFieldName, GeneralValue value)
    {
        // TODO Auto-generated method stub

    }

    /**
     * Accessor value in TreeMap
     * 
     * @param subFieldName
     *            title of value
     * @return a general value
     */
    public GeneralValue getValue(String subFieldName)
    {
        return null;

    }

    /**
     * Access size of TreeMap
     * 
     * @return size
     */
    public int size()
    {
        return values.size();
    }

    /**
     * TODO: Doc
     * 
     * @return
     */
    public Iterator<String> iterator()
    {
        return null;
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
        // TODO Auto-generated method stub
        return null;
    }
}
