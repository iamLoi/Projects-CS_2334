import java.util.Iterator;
import java.util.TreeMap;

/**
 * Field.java
 * 
 * The Field class captures the set of subﬁelds within one ﬁeld, and it
 * represents the column number in the CSV ﬁle that corresponds to each subﬁeld.
 * 
 * @author Loi Huynh
 * @version Oct 20, 2017
 */

public class Field
{
    /** TODO: Doc */
    private TreeMap<String, Integer> subFields;

    /** TODO: Doc */
    public Field()
    {
        subFields = new TreeMap<>();
    }

    /**
     * TODO: Doc
     * 
     * @param subFieldName
     * @param columnIndex
     */
    public void addSubField(String subFieldName, int columnIndex)
    {
        subFields.put(subFieldName, columnIndex);

    }

    /**
     * Returns the values associated with the subfield
     * 
     * @param subFieldName
     *            key
     * @return associated value
     */
    public Integer getIndex(String subFieldName)
    {
        return subFields.get(subFieldName);
    }

    /**
     * Access size of subField TreeMap
     * 
     * @return size
     */
    public int size()
    {
        return subFields.size();

    }

    /**
     * iterator() returns a String iterator over all of the subﬁeld names.
     * 
     * @return Iterator<String>
     */
    public Iterator<String> iterator()
    {
        return subFields.keySet().iterator();
    }

    /**
     * toString() returns a single line String with components for each subﬁeld
     * (ordered alphabetically by subﬁeld name).
     */
    public String toString()
    {
        String output = "";
        Iterator<String> keys = iterator();

        while (keys.hasNext())
        {
            String thisKey = keys.next();
            output += thisKey + "(" + subFields.get(thisKey).toString() + "); "; // Single
                                                                                 // line
                                                                                 // string
        }
        return output;
    }

}
