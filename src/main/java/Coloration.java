import java.io.File;
import java.util.logging.Logger;
import Graph.Graph;
import SL.SLAlogorithm;

public class Coloration {

    private static final Logger LOG = Logger.getLogger(Coloration.class.getName());

    public static void main(String ... args){
        if(args.length != 1){
            LOG.severe("Wrong number of arguments");
            System.exit(-1);
        }
        File file = new File(args[0]);

        if(file.isFile()){
            run(file);
        } else if(file.isDirectory()){
            for(File f: file.listFiles()){
                run(f);
            }
        }
    }

    private static void run(File file){
        Graph g = new Graph(file);
        SLAlogorithm sl = new SLAlogorithm(g);
        sl.solve();
    }
}
