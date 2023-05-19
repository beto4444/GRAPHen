package DataStructures;

import org.apache.commons.lang3.tuple.Pair;

import java.util.*;
import java.util.stream.Stream;

//@TODO - wyczyścić niepotrzebne deklaracje pod dziedziczenie i zaimplementować, potem dodać do listenera
public class Digraph extends Graph{

    public List<Node> nodes;
    public List<Edge> edges;
    public HashMap<Node, List<Node>> relations;

    private HashMap<Pair<Node, Node>, Edge> relation_pairs;

    public Digraph(){
        nodes = new ArrayList<>();
        edges = new ArrayList<>();
        relations = new HashMap<>();
    }

    public void addRelation(Node parent, Edge edge, List<Node> children){
        if (relations.containsKey(parent)){
            List<Node> old = relations.get(parent);
            relations.replace(parent, old, Stream.concat(old.stream(), children.stream()).toList());
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

    public Digraph Add(Digraph other){
        return this; //@TODO
    }
    public Digraph Substract(Digraph other){
        return this; //@TODO
    }

    public void copy(Digraph other){ //@TODO
    }

    public void exportToFile(){
        //@TODO
    }

    @Override
    public void colorEdges(){
        super.colorEdges();
    }

    @Override
    public void colorNodes(){
        super.colorNodes();
    }

    @Override
    public void clearEdges(){
        super.clearEdges();
    }
}
