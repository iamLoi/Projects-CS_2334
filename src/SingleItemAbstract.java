/**
 * SingleItemAbstract.java
 * 
 * @author Loi Huynh
 * @version Sep 25, 2017
 */

public abstract class SingleItemAbstract
{
    /**
     * Access max state
     * 
     * @param fieldName
     *            title of value
     * @param subFieldName
     *            value
     * @return a state
     */
    public abstract State getMaxState(String fieldName, String subFieldName);

    /**
     * Access min state
     * 
     * @param fieldName
     *            title of value
     * @param subFieldName
     *            value
     * @return a state
     */
    public abstract State getMinState(String fieldName, String subFieldName);

    /**
     * Access average state
     * 
     * @param fieldName
     *            title of value
     * @param subFieldName
     *            value
     * @return a generalvalue
     */
    public abstract GeneralValue getAverageValue(String fieldName, String subFieldName);
}
