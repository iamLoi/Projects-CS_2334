import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Infant.java
 * 
 * @author Loi Huynh
 * @version 2017-09-28
 */

public class Infant extends MultipleItemAbstract
{
    /**
     * List of trials for infant
     */
    private ArrayList<Trial> trialList;
    /**
     * ID of Infant
     */
    private String infantID;
    /**
     * Max week gathering data
     */
    private int maxWeek = 16;

    /**
     * Default contructor for Infant. Iterates through the possible weeks: 1 …
     * MAX_WEEKS Attempts to load the Trial When the Trial successfully loads,
     * add it to the list of Trials
     * 
     * @param directory
     *            of the file
     * @param infantID
     *            of the infant
     * @throws IOException
     *             in case file is not found
     */
    public Infant(String directory, String infantID) throws IOException
    {
        trialList = new ArrayList<>();

        this.infantID = infantID;

        for (int week = 0; week < maxWeek; ++week)
        {
            try
            {
                Trial trial = new Trial(this, directory, infantID, week);
                trialList.add(trial);
            }
            catch (FileNotFoundException e)
            {
            }

        }
    }

    /**
     * Get an item in the list of trials
     * 
     * @param index
     *            of item looking for
     * @return a trial
     * 
     */
    public Trial getItem(int index)
    {
        return trialList.get(index);
    }

    /**
     * Get size of trialList
     * 
     * @return the size
     */
    public int getSize()
    {
        return trialList.size();
    }

    /**
     * get infant
     * 
     * @return Infant
     */
    public Infant getInfant()
    {
        return this;
    }
}
