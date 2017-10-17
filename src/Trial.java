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
    /** ID for the infant */
    private String infantID;
    /** Week index. */
    private int week;
    /** File name that was loaded. */
    private String fileName;

    /**
     * Trial constructor
     * 
     * • Takes as input a directory, an infant ID and a week • Loads the
     * corresponding file • Throws FileNotFoundException if the file does not
     * exists
     * 
     * @param directory
     *            String representing the directory containing the data files
     * @param infantID
     *            String representing the infant ID
     * @param week
     *            int week for the data file.
     * @throws IOException
     *             if file not found
     */
    public Trial(String directory, String infantID, int week) throws IOException
    {
        this.infantID = infantID;
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
     * Access InfantID
     * 
     * @return infantID
     */
    public String getInfantID()
    {
        return infantID;
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
