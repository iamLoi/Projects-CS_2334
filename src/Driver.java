
/**
 * Value class
 * 
 * Captures both a double value and whether or not it is valid
 * 
 * @author Andrew H. Fagg and Loi Huynh
 * @version 2017-09-03
 *
 */

import java.io.IOException;

public class Driver
{
    public static void main(String[] args) throws IOException
    {

        Infant infant = new Infant("mydata", "c1");
        //
        // System.out.println(trial.getAverageLeftWrist(1));
        // System.out.println(trial.getMinLeftWrist(1));
        // System.out.println(trial.getMaxLeftWrist(0));
        //
        System.out.println(infant.getAverageValue("left_wrist", "x"));
    }
}
