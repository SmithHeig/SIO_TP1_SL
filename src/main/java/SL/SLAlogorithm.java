package SL;

import Graph.Graph;

import java.util.LinkedList;

public class SLAlogorithm {
    Graph g;
    Integer[][] coloredNode;
    LinkedList<Integer>[] nodesDegre;
    LinkedList<Integer> orderColoration;
    LinkedList

    public SLAlogorithm(Graph g){
        this.g = g;
        coloredNode = new Integer[g.getNbNode()][2];
        nodesDegre = new LinkedList[g.getDegreMax()];
        orderColoration = new LinkedList();
        init();
    }

    public void init(){
        for(int i = 0; i < g.getNbNode(); i++){
            nodesDegre[g.getDegreNode(i)].add(i);
        }
    }

    public void solve(){
        for(int degre = 0; degre < nodesDegre.length; ++degre){
            for(int node: nodesDegre[degre]){
                orderColoration.add(node);
                nodesDegre[degre].pop();
                for(int adj: g.getAdjList(node)){

                }
            }
        }
    }
}
