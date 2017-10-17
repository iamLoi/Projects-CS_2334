
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
        Infant infant = new Infant("data", "c1");
        Trial trial = new Trial("data", "c1", 1);

        System.out.println(trial.getAverageLeftWrist(0));
        System.out.println(trial.getMinLeftWrist(0));
        System.out.println(trial.getMaxLeftWrist(0));
    }
}
