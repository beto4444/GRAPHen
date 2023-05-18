package DataStructures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;


public class Graph implements Variable {

    public List<Node> nodes;
    public List<Edge> edges;
    public HashMap<Node, List<Node>> relations;

    public boolean is_digraph;

    public Graph(){}

    public Graph(boolean is_d){
        is_digraph = is_d;
        nodes = new ArrayList<>();
        edges = new ArrayList<>();
        relations = new HashMap<>();
    }

    public void addRelation(Node parent, Edge edge, List<Node> children){
        if (relations.containsKey(parent)){
            List<Node> old = relations.get(parent);
            List<Node> nowy = Stream.concat(old.stream(), children.stream()).toList();
            relations.replace(parent, old, nowy);
        }
        else{
            relations.put(parent, children);
        }
        if(!nodes.contains(parent)){
            nodes.add(parent);
        }
        for (Node n: children) {
            if(!nodes.contains(n)){
                nodes.add(n);
            }
        }
        if (!edges.contains(edge)){
            edges.add(edge);
        }

    }

    public Graph Add(Graph other){
        return this; //@TODO
    }
    public Graph Substract(Graph other){
        return this; //@TODO
    }

    public Graph DiAdd(Graph other){ //@TODO: jakieś lepsze rozwiązanie??
        return this; //@TODO
    }
    public Graph DiSubstract(Graph other){
        return this; //@TODO
    }

    public void copy(Graph other){
        //@TODO
    }

    public void Dicopy(Graph other){
        //@TODO
    }

    public void exportToFile(){
        //@TODO
    }

    public void colorEdges(){
        //@TODO
    }

    public void colorNodes(){
        //@TODO
    }

    public void clearEdges(){
        edges.clear();
    }
}
