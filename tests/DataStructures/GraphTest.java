package DataStructures;

import org.apache.commons.lang3.tuple.MutablePair;
import org.apache.commons.lang3.tuple.Pair;
import org.junit.Assert;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class GraphTest {

    @org.junit.jupiter.api.Test
    public void testGraphGettersAndSetters() {
        // Create a Graph object
        Graph graph = new Graph();

        // Create some nodes and edges
        List<Node> nodes = new ArrayList<>();
        nodes.add(new Node());
        nodes.add(new Node());
        List<Edge> edges = new ArrayList<>();
        edges.add(new Edge());
        edges.add(new Edge());

        // Create some relation pairs and relations
        HashMap<Pair<Node, Node>, Edge> relationPairs = new HashMap<>();
        Pair<Node, Node> pair1 = new MutablePair<>(nodes.get(0), nodes.get(1));
        Pair<Node, Node> pair2 = new MutablePair<>(nodes.get(1), nodes.get(0));
        relationPairs.put(pair1, edges.get(0));
        relationPairs.put(pair2, edges.get(1));
        HashMap<Node, List<Node>> relations = new HashMap<>();
        List<Node> node1Relations = new ArrayList<>();
        List<Node> node2Relations = new ArrayList<>();
        node1Relations.add(nodes.get(1));
        node2Relations.add(nodes.get(0));
        relations.put(nodes.get(0), node1Relations);
        relations.put(nodes.get(1), node2Relations);

        // Set the properties of the graph
        graph.setNodes(nodes);
        graph.setEdges(edges);
        graph.setRelationPairs(relationPairs);
        graph.setRelations(relations);

        // Assert that all values are correct using getters
        assertEquals(nodes, graph.getNodes());
        assertEquals(edges, graph.getEdges());
        assertEquals(relationPairs, graph.getRelationPairs());
        assertEquals(relations, graph.getRelations());
    }

    @org.junit.jupiter.api.Test
    void addRelation() {
        Graph graph = new Graph();
        Node parent = new Node();
        List<Node> children = new ArrayList<>();
        for (int i=0; i<10; i++){
            children.add(new Node());
        }
        List<Node> nodes = new ArrayList<>(children);
        nodes.add(parent);
        Edge edge = new Edge();
        List<Edge> edges = new ArrayList<>();
        edges.add(edge);
        HashMap<Pair<Node, Node>, Edge> relation_pairs = new HashMap<>();
        for (int i=0; i< nodes.size(); i++)
            for (int j=0; j< nodes.size(); j++){
                if (i!=j){
                    Pair<Node, Node> pair = new MutablePair<>(nodes.get(i), nodes.get(j));
                    relation_pairs.put(pair, edge);
                }
            }
        graph.addRelation(parent, edge, children);
        assertArrayEquals(nodes.toArray(), graph.getNodes().toArray());
        assertArrayEquals(edges.toArray(), graph.getEdges().toArray());
        assertArrayEquals(relation_pairs.entrySet().toArray(), graph.getRelationPairs().entrySet().toArray());

        Edge new_edge = new Edge();
        edges.add(new_edge);
        Node first = children.get(0);
        List<Node> new_children = new ArrayList<>();
        new_children.add(first);
        for(int i=0; i<5; i++){
            Node e = new Node();
            nodes.add(e);
            children.add(e);
            new_children.add(e);
        }
        HashMap<Node, List<Node>> rels = new HashMap<>();
        Set<Node> set = new HashSet<>(children);
        children = new ArrayList<>(set);
        rels.put(parent, children);
        graph.addRelation(parent, new_edge, new_children);
        assertArrayEquals(nodes.toArray(), graph.getNodes().toArray());
        assertArrayEquals(edges.toArray(), graph.getEdges().toArray());
        assertArrayEquals(rels.entrySet().toArray(), graph.getRelations().entrySet().toArray());

    }

    @org.junit.jupiter.api.Test
    void add() {
        Node common_node = new Node();
        List<Node> children1 = new ArrayList<>();
        List<Node> children2 = new ArrayList<>();
        for (int i=0; i<5; i++){
            children1.add(new Node());
            children2.add(new Node());
        }

        Graph Graph1 = new Graph();
        Graph Graph2 = new Graph();

        Edge edge = new Edge();
        List<Edge> edges = new ArrayList<>();
        edges.add(edge);

        Graph1.addRelation(common_node, edge, new ArrayList<>(children1));
        Graph2.addRelation(common_node,edge, new ArrayList<>(children2));

        Set<Node> pom = new HashSet<>(children1);
        pom.addAll(children2);
        List<Node> children = new ArrayList<>(pom);

        children1.add(common_node);
        children2.add(common_node);
        pom = new HashSet<>(children1);
        pom.addAll(children2);
        List<Node> all_nodes = new ArrayList<>(pom);

        HashMap<Node, List<Node>> rels = new HashMap<>();
        rels.put(common_node, children);
        Graph g = Graph1.Add(Graph2);
        assertArrayEquals(all_nodes.toArray(), g.getNodes().toArray());
        assertArrayEquals(edges.toArray(), g.getEdges().toArray());
        assertArrayEquals(rels.entrySet().toArray(), g.getRelations().entrySet().toArray()); //@TODO: w g.relations pojawił się jakoś na liście dzieci parent node????

    }

    @org.junit.jupiter.api.Test
    void union() {
    }

    @org.junit.jupiter.api.Test
    void copy() {
    }

    @org.junit.jupiter.api.Test
    void exportToFile() {
    }

    @org.junit.jupiter.api.Test
    void colorEdges() {
    }

    @org.junit.jupiter.api.Test
    void colorNodes() {
    }

    @org.junit.jupiter.api.Test
    void clearEdges() {
    }
}