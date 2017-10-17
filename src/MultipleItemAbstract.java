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
        GeneralValue max = new GeneralValue("0");

        // for (int i = 0; i < getSize(); ++i)
        // {
        // if (getItem(i).getMaxLeftWrist(dim).isValid())
        // {
        // max = getItem(i).getMaxLeftWrist(dim);
        // }
        // }

        for (int i = 0; i < getSize(); ++i)
        {
            if (getItem(i).getMaxLeftWrist(dim).isGreaterThan(max))
            {

                max = getItem(i).getMaxLeftWrist(dim);
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

        GeneralValue min = new GeneralValue("NaN");
        for (int i = 0; i < getSize(); ++i)
        {
            if (getItem(i).getMinLeftWrist(dim).isValid())
            {
                min = getItem(i).getMinLeftWrist(dim);
            }
        }

        for (int i = 0; i < getSize(); ++i)
        {
            if (getItem(i).getMaxLeftWrist(dim).isValid()
                    && getItem(i).getMinLeftWrist(dim).isLessThan(min))
            {
                min = getItem(i).getMinLeftWrist(dim);
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
