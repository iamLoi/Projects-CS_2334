
/**
 * GeneralValue class
 * 
 * Captures both a double value and whether or not it is valid
 * 
 * @author Loi Huynh
 * @version 2017-09-28
 *
 */
public class GeneralValue
{
    /** Is the value valid? */
    private boolean valid;
    /** Double value stored. */
    private double doubleValue;

    /**
     * Default constructor, creates an invalid sample.
     */
    public GeneralValue()
    {
        valid = false;
    }

    /**
     * second constructor accepts a String. On construction, if this String is
     * “NaN”, then the GeneralValue is invalid. Otherwise, this String can be
     * safely interpreted as a double (the value of which is placed in
     * doubleValue).
     * 
     * @param strg
     *            string to be parsed
     */
    public GeneralValue(String strg)
    {
        if (strg.equals("NaN"))
        {
            valid = false;
        }
        else
        {
            valid = true;
            doubleValue = Double.parseDouble(strg);

        }

    }

    /**
     * This constructor thats a double value
     * 
     * @param doubleValue
     *            being created
     */
    public GeneralValue(double doubleValue)
    {
        if (Double.isNaN(doubleValue))
        {
            valid = false;
        }
        else
        {
            valid = true;
            this.doubleValue = doubleValue;
        }

    }

    /**
     * Returns Valid
     * 
     * @return Valid if its valid
     */
    public boolean isValid()
    {
        return valid;
    }

    /**
     * Returns the doubleValue.
     * 
     * This method now throws InvalidValueException if this method is called on
     * an invalid GeneralValue
     * 
     * @return doubleValue
     */
    public double getDoubleValue()
    {
        if (!this.isValid())
        {
            throw new InvalidValueException("Invalid value!");
        }
        return this.doubleValue;

    }

    /**
     * Compares different GeneralValues
     * 
     * @param value
     *            being compared
     * @return true if less than false otherwise
     */
    public boolean isLessThan(GeneralValue value)
    {
        if (!this.isValid())
        {
            return false;
        }
        else
        {
            if (!value.isValid())
            {
                return true;
            }
            return (value.getDoubleValue() > this.getDoubleValue());

        }

    }

    /**
     * Compares a GeneralValues to this GeneralValue and see if it is greater.
     * 
     * @param value
     *            being compared
     * @return true if greater than false otherwise
     */
    public boolean isGreaterThan(GeneralValue value)
    {
        if (!this.isValid() || !value.isValid())
        {
            if (this.isValid())
            {
                return true;
            }
            return false;
        }
        return (this.getDoubleValue() > value.getDoubleValue());
    }

    /**
     * return the String “invalid” if the GeneralValue is invalid; if valid, the
     * method will return a String that represents the value with exactly 3
     * digits after the decimal point (for example, “98.348”).
     * 
     * @return “invalid” if the GeneralValue is invalid or the value with
     *         exactly 3 digits after the decimal point (for example, “98.348”)
     *         if valid.
     */
    public String toString()
    {
        if (isValid())
        {
            return String.format("%.3f", doubleValue);
        }
        else
        {
            return "invalid";
        }
    }

}
