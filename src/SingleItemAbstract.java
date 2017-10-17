/**
 * SingleItemAbstract.java
 * 
 * @author Loi Huynh
 * @version Sep 25, 2017
 */

public abstract class SingleItemAbstract
{
    /**
     * Child classes must implement getMaxLeftWrist method to compute statistic
     * 
     * @param dim
     *            x,y,or z
     * @return a generalValue
     */
    public abstract GeneralValue getMaxLeftWrist(int dim);

    /**
     * Child classes must implement getMinLeftWrist method to compute statistic
     * 
     * @param dim
     *            x,y,or z
     * @return a generalValue
     */
    public abstract GeneralValue getMinLeftWrist(int dim);

    /**
     * Child classes must implement getAverageLeftWrist method to compute
     * statistic
     * 
     * @param dim
     *            x,y,or z
     * @return a generalValue
     */
    public abstract GeneralValue getAverageLeftWrist(int dim);
}
