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
     * Get getMaxLeftWrist
     * 
     * @param dim
     *            x y or z
     * @return a GeneralValue
     */
    public GeneralValue getMaxLeftWrist(int dim)
    {
        GeneralValue max = new GeneralValue(Double.NEGATIVE_INFINITY);

        // Loops through each value and check if larger than max declared above.
        // If so replace max.
        for (int i = 0; i < getSize(); ++i)
        {
            if (getItem(i).getMaxLeftWrist(dim).isValid())
            {
                if (getItem(i).getMaxLeftWrist(dim).isGreaterThan(max))
                {

                    max = getItem(i).getMaxLeftWrist(dim);
                }
            }
        }
        return max;

    }

    /**
     * Get getMinLeftWrist
     * 
     * @param dim
     *            x y or z
     * @return a GeneralValue
     */
    public GeneralValue getMinLeftWrist(int dim)
    {

        // Initilizing min as a BIG number so other numbers can be compared to
        // it. If smaller, replace min.
        GeneralValue min = new GeneralValue(Double.POSITIVE_INFINITY);

        for (int i = 0; i < getSize(); ++i)
        {
            if (getItem(i).getMaxLeftWrist(dim).isValid())
            {
                if (getItem(i).getMinLeftWrist(dim).isLessThan(min))
                {
                    min = getItem(i).getMinLeftWrist(dim);
                }
            }
        }
        return min;

    }

    /**
     * Get averageLeftWrist
     * 
     * @param dim
     *            x y or z
     * @return a GeneralValue
     */
    public GeneralValue getAverageLeftWrist(int dim)
    {
        int size = 0;
        double sum = 0.0;
        double average = 0.0;
        String sumToString;

        for (int i = 0; i < getSize(); ++i)
        {
            if (getItem(i).getMaxLeftWrist(dim).isValid())
            {
                size++;
                sum += getItem(i).getAverageLeftWrist(dim).getDoubleValue();
            }

        }
        average = sum / size;
        sumToString = String.valueOf(average);
        return new GeneralValue(sumToString);

    }

}
