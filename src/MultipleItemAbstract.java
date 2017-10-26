/**
 * MultipleItemAbstract.java
 * 
 * @author Loi Huynh
 * @version Sep 25, 2017
 */

public abstract class MultipleItemAbstract extends SingleItemAbstract
{
    /**
     * All classes inplementing MultipleItemAbstract must have a getSize method
     * 
     * @return size of the list
     */
    public abstract int getSize();

    /**
     * All classes inplementing MultipleItemAbstract must have a getItem method
     * 
     * @param index
     *            of item
     * @return a SingleItemAbstract
     */
    public abstract SingleItemAbstract getItem(int index);

    /**
     * get max State
     * 
     * @param fieldName
     *            name of column
     * @param subFieldName
     *            x y or z
     * @return State a state
     */
    public State getMaxState(String fieldName, String subFieldName)
    {
        GeneralValue min = new GeneralValue();
        State state = new State();

        // Loops through each value. If smaller, replace min.
        for (int i = 0; i < getSize(); ++i)
        {
            GeneralValue value = getItem(i).getMaxState(fieldName, subFieldName)
                    .getValue(fieldName, subFieldName);

            if (value.isGreaterThan(min))
            {
                // Loops through each value. If larger, replace max.
                min = value;
                state = getItem(i).getMaxState(fieldName, subFieldName);
            }

        }
        return state;

    }

    /**
     * get min State
     * 
     * @param fieldName
     *            name of column
     * @param subFieldName
     *            x y or z
     * @return State a state
     */
    public State getMinState(String fieldName, String subFieldName)
    {
        GeneralValue min = new GeneralValue();
        State state = new State();

        // Loops through each value. If smaller, replace min.
        for (int i = 0; i < getSize(); ++i)
        {
            GeneralValue value = getItem(i).getMinState(fieldName, subFieldName)
                    .getValue(fieldName, subFieldName);

            if (value.isLessThan(min))
            {
                // Loops through each value. If larger, replace max.
                min = value;
                state = getItem(i).getMinState(fieldName, subFieldName);
            }

        }
        return state;

    }

    /**
     * Average value
     * 
     * @param fieldName
     *            column name
     * @param subFieldName
     *            x y z
     * @return GeneralValue associated with it
     */
    public GeneralValue getAverageValue(String fieldName, String subFieldName)
    {
        int size = 0;
        double sum = 0.0;
        double average = 0.0;
        String sumToString;

        for (int i = 0; i < getSize(); ++i)
        {
            GeneralValue value = getItem(i).getAverageValue(fieldName, subFieldName);
            if (value.isValid())
            {
                sum += value.getDoubleValue();
                size++;
            }
        }

        if (size > 0)
        {
            average = sum / size;
            sumToString = String.valueOf(average);
            return new GeneralValue(sumToString);
        }
        else
        {
            // No items to compute average
            return new GeneralValue();
        }

    }

}
