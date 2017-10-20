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
     * TODO: Doc
     * 
     * @param fieldName
     * @param subFieldName
     * @return State TODO: Doc
     */
    public State getMaxState(String fieldName, String subFieldName)
    {
        GeneralValue max = new GeneralValue();

        // Loops through each value and check if larger than max declared above.
        // If so replace max.
        for (int i = 0; i < getSize(); ++i)
        {
            // Check if value is valid first.
            if (getItem(i).getMaxLeftWrist(dim).isValid())
            {
                if (getItem(i).getMaxLeftWrist(dim).isGreaterThan(max))
                {
                    // Loops through each value. If larger, replace max.
                    max = getItem(i).getMaxLeftWrist(dim);
                }
            }
        }
        return null;

    }

    /**
     * TODO: Doc
     * 
     * @param fieldName
     * @param subFieldName
     * @return State TODO: Doc
     */
    public State getMinState(String fieldName, String subFieldName)
    {
        GeneralValue min = new GeneralValue();

        // Loops through each value. If smaller, replace min.
        for (int i = 0; i < getSize(); ++i)
        {
            // Check if value is valid first.
            if (getItem(i).getMaxLeftWrist(dim).isValid())
            {
                if (getItem(i).getMinLeftWrist(dim).isLessThan(min))
                {
                    min = getItem(i).getMinLeftWrist(dim);
                }
            }
        }
        return null;

    }

    /**
     * TODO: Doc
     * 
     * @param fieldName
     * @param subFieldName
     * @return GeneralValue TODO: Doc
     */
    public GeneralValue getAverageValue(String fieldName, String subFieldName)
    {
        int size = 0;
        double sum = 0.0;
        double average = 0.0;
        String sumToString;

        for (int i = 0; i < getSize(); ++i)
        {
            if (getItem(i).getMaxLeftWrist(dim).isValid())
            {
                sum += getItem(i).getAverageLeftWrist(dim).getDoubleValue();
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
