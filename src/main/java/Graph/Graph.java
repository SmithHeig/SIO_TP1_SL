package Graph;

import java.io.*;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Graph {

    private static final Logger LOG = Logger.getLogger(Graph.class.getName());

    private LinkedList<Integer>[] adjList;
    private int nbNode;
    private int nbEdge;

    public Graph(File file){
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            String line = reader.readLine();
            String words[] = line.split(" ");
            nbNode = Integer.getInteger(words[0]) -1;
            nbEdge = Integer.getInteger(words[1]) -1;

            // initialisation du tableau d'adjacence
            adjList = new LinkedList[nbNode];

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

    public int getNbNode(){
        return nbNode;
    }

    public int getNbEdge(){
        return nbEdge;
    }

    public int getDegreMax(){
        int degreMax = 0;
        for(LinkedList<Integer> l : adjList){
            if(l.size() > degreMax){
                degreMax = l.size();
            }
        }
        return degreMax;
    }

    public int getDegreNode(int node){
        return adjList[node].size();
    }

    public LinkedList<Integer> getAdjList(int i) {
        return adjList[i];
    }
}
