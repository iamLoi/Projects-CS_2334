import java.util.Iterator;
import java.util.TreeMap;

/**
 * Field.java
 * 
 * @author Loi Huynh
 * @version Oct 20, 2017
 */

public class Field
{
    /** TODO: Doc */
    private TreeMap<String, Integer> subFields = new TreeMap<>();

    /** TODO: Doc */
    public Field()
    {
        // TODO Auto-generated constructor stub
    }

    /**
     * TODO: Doc
     * 
     * @param subFieldName
     * @param columnIndex
     */
    public void addSubField(String subFieldName, int columnIndex)
    {
        // TODO Auto-generated method stub

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
     * TODO: Doc
     * 
     * @return
     */
    public Iterator<String> iterator()
    {
        return null;

    }

    /**
     * TODO: Doc
     */
    public String toString()
    {
        return null;
    }

}
