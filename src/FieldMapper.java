import java.util.Iterator;
import java.util.TreeMap;

/**
 * FieldMapper.java
 * 
 * The FieldMapper class represents the set of ﬁelds that are contained within a
 * single CSV ﬁle.
 * 
 * @author Loi Huynh
 * @version Oct 20, 2017
 */

public class FieldMapper
{
    /** The data structure in the CSV file */
    private TreeMap<String, Field> fieldMap = new TreeMap<>();

    /**
     * The job of this constructor is to create the entire data structure
     * (including all component Fields).
     * 
     * @param columnNames
     */
    public FieldMapper(String[] columnNames)
    {
        for (String column : columnNames)
        {
            // If column is left_wrist_z. fieldName is left_wrist. subField is z
            if (column.charAt(column.length() - 2) == '_')
            {
                fieldMap.put(column.substring(0, column.length() - 2),
                        getField(column.substring(0, column.length() - 2)));
            }
            else
            {
                fieldMap.put(column, getField(column));
            }
        }
    }

    /**
     * getField() returns the Field that corresponds to the String ﬁeld name.
     * 
     * @param fieldName
     *            left_wrist, etc.
     * @return Field the Field that corresponds to the String ﬁeld name.
     */
    public Field getField(String fieldName)
    {
        return fieldMap.get(fieldName);
    }

    /**
     * takes as input the String array of values (all values from the
     * 
     * CSV row) and a String ﬁeld name. This method constructs and returns the
     * 
     * PointND object for the speciﬁed ﬁeld.
     * 
     * @param stringValues
     *            arrayof values
     * @param fieldName
     *            name
     * @return a PointND object for the field
     */
    public PointND extractPointND(String[] stringValues, String fieldName)
    {
        PointND nd = new PointND();
        Field field = getField(fieldName);
        Iterator<String> iterator = field.iterator();

        for (int i = 0; i < stringValues.length; ++i)
        {
            if (iterator.hasNext())
            {
                nd.add(iterator.next(), new GeneralValue(stringValues[i]));
            }
        }

        return nd;
    }

    /**
     * size() returns the number of ﬁelds.
     * 
     * @return returns the number of ﬁelds.
     */
    public int size()
    {
        return fieldMap.size();
    }

    /**
     *  iterator() returns a String iterator over all of the ﬁeld names.
     * 
     * @return  returns a String iterator over all of the ﬁeld names.
     */
    public Iterator<String> iterator()
    {
        return fieldMap.keySet().iterator();
    }
}
