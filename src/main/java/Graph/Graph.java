package Graph;

import java.io.*;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Graph {

    private static final Logger LOG = Logger.getLogger(Graph.class.getName());

    private LinkedList<Integer>[] adjList;

    public Graph(File file){
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            String line = reader.readLine();
            String words[] = line.split(" ");

            // initialisation du tableau d'adjacence
            adjList = new LinkedList[Integer.getInteger(words[0]) - 1];

            // ajout des voisins dans le tableau d'adjacence
            while((line = reader.readLine()) != null){
                words = line.split(" ");
                int vertex = Integer.getInteger(words[0]) -1;
                int adj = Integer.getInteger(words[1]) -1;
                adjList[vertex].add(adj);
                LOG.log(Level.INFO, "Vertex " +vertex + " Adj " + adj);
            }

        } catch(IOException e){
            LOG.log(Level.SEVERE,e.getMessage());
        }
    }
}
