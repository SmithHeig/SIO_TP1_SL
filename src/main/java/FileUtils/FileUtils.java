/**
 *
 * @author James Smith
 */

package FileUtils;

import java.util.logging.Logger;

public class FileUtils {

    private static String LINUX = "\n";
    private static String WINDOWS = "\r\n";
    private static String OSX = "\r";

    private static final Logger LOG = Logger.getLogger(FileUtils.class.getName());

    public static String[] getNextLine(String lines) {
        String arr[] = {"",lines};

        if(lines.indexOf(WINDOWS) != -1){
            arr = lines.split(WINDOWS);
        }else if(lines.indexOf(LINUX) != -1){
            arr = lines.split(LINUX);
        } else if(lines.indexOf(OSX) != -1){
            arr = lines.split(OSX);
        } else {
            arr[0] = lines;
            arr[1] = "";
        }

        return arr;
    }

    public static String[] getNextWord(String line){
        String arr[] = line.split(" ");
        return arr;
    }

}
