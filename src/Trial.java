import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Representation of a single trial
 * 
 * @author Loi Huynh
 * @author Andrew H. Fagg
 * @version 2017-09-28
 *
 */
public class Trial extends MultipleItemAbstract
{
    /** Sequence of states. */
    private ArrayList<State> stateList;
    /** Week index. */
    private int week;
    /** File name that was loaded. */
    private String fileName;
    /** Infant */
    private Infant infant;

    /**
     * Trial constructor
     * 
     * • Takes as input a directory, an infant ID and a week • Loads the
     * corresponding file • Throws FileNotFoundException if the file does not
     * exists
     * 
     * @param infant
     *            working with
     * @param directory
     * @param infantID
     * @param week
     * @throws IOException
     */
    public Trial(Infant infant, String directory, String infantID, int week)
            throws IOException
    {
        this.infant = infant;
        this.week = week;
        this.fileName = String.format("%s/subject_%s_w%02d.csv", directory, infantID,
                week);
        this.stateList = new ArrayList<>();

        BufferedReader br = new BufferedReader(new FileReader(this.fileName));
        String strg;

        strg = br.readLine();
        strg = br.readLine();

        while (strg != null)
        {
            stateList.add(new State(strg));
            strg = br.readLine();
        }
        br.close();

    }

    /**
     * Access size of ArrayList
     * 
     * @return returns the number of States in stateList.
     */
    public int getSize()
    {
        return stateList.size();
    }

    /**
     * Access Infant
     * 
     * @return infant
     */
    public Infant getInfant()
    {
        return infant;
    }

    /**
     * Access week
     * 
     * @return week
     */
    public int getWeek()
    {
        return week;
    }

    /**
     * Access filename
     * 
     * @return filename
     */
    public String getFileName()
    {
        return fileName;
    }

    /**
     * Implementing parent class's getItem method. Accessor for stateList
     * 
     * @param index
     *            index of value wanted
     * @return a State
     */
    public State getItem(int index)
    {
        return this.stateList.get(index);

    }
}
