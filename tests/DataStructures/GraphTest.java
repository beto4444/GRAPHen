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
        /*Node common_node = new Node();
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
        */
        Graph graph1 = new Graph();
        List<Node> nodes1 = new ArrayList<>();
        nodes1.add(new Node());
        nodes1.add(new Node());
        List<Edge> edges1 = new ArrayList<>();
        edges1.add(new Edge());
        edges1.add(new Edge());
        HashMap<Pair<Node, Node>, Edge> relationPairs1 = new HashMap<>();
        relationPairs1.put(new MutablePair<>(nodes1.get(0), nodes1.get(1)), edges1.get(0));
        relationPairs1.put(new MutablePair<>(nodes1.get(1), nodes1.get(0)), edges1.get(1));
        HashMap<Node, List<Node>> relations1 = new HashMap<>();
        List<Node> node1Relations = new ArrayList<>();
        List<Node> node2Relations = new ArrayList<>();
        node1Relations.add(nodes1.get(1));
        node2Relations.add(nodes1.get(0));
        relations1.put(nodes1.get(0), node1Relations);
        relations1.put(nodes1.get(1), node2Relations);
        graph1.setNodes(nodes1);
        graph1.setEdges(edges1);
        graph1.setRelationPairs(relationPairs1);
        graph1.setRelations(relations1);

        // Create the second Graph object
        Graph graph2 = new Graph();
        List<Node> nodes2 = new ArrayList<>();
        nodes2.add(nodes1.get(0));
        nodes2.add(new Node());
        List<Edge> edges2 = new ArrayList<>();
        edges2.add(new Edge());
        edges2.add(new Edge());
        HashMap<Pair<Node, Node>, Edge> relationPairs2 = new HashMap<>();
        relationPairs2.put(new MutablePair<>(nodes2.get(0), nodes2.get(1)), edges2.get(0));
        relationPairs2.put(new MutablePair<>(nodes2.get(1), nodes2.get(0)), edges2.get(1));
        HashMap<Node, List<Node>> relations2 = new HashMap<>();
        List<Node> node3Relations = new ArrayList<>();
        List<Node> node4Relations = new ArrayList<>();
        node3Relations.add(nodes2.get(1));
        node4Relations.add(nodes2.get(0));
        relations2.put(nodes2.get(0), node3Relations);
        relations2.put(nodes2.get(1), node4Relations);
        graph2.setNodes(nodes2);
        graph2.setEdges(edges2);
        graph2.setRelationPairs(relationPairs2);
        graph2.setRelations(relations2);

        // Calculate the union of graph1 and graph2
        Graph union = graph1.Add(graph2);

        // Assert that the union is calculated correctly
        assertEquals(3, union.getNodes().size());
        assertEquals(4, union.getEdges().size());
        assertEquals(4, union.getRelationPairs().size());
        assertEquals(3, union.getRelations().size());
    }

    @org.junit.jupiter.api.Test
    void substract() {
        // Create the first Graph object
        Graph graph1 = new Graph();
        List<Node> nodes1 = new ArrayList<>();
        nodes1.add(new Node());
        nodes1.add(new Node());
        List<Edge> edges1 = new ArrayList<>();
        edges1.add(new Edge());
        edges1.add(new Edge());
        HashMap<Pair<Node, Node>, Edge> relationPairs1 = new HashMap<>();
        relationPairs1.put(new MutablePair<>(nodes1.get(0), nodes1.get(1)), edges1.get(0));
        relationPairs1.put(new MutablePair<>(nodes1.get(1), nodes1.get(0)), edges1.get(1));
        HashMap<Node, List<Node>> relations1 = new HashMap<>();
        List<Node> node1Relations = new ArrayList<>();
        List<Node> node2Relations = new ArrayList<>();
        node1Relations.add(nodes1.get(1));
        node2Relations.add(nodes1.get(0));
        relations1.put(nodes1.get(0), node1Relations);
        relations1.put(nodes1.get(1), node2Relations);
        graph1.setNodes(nodes1);
        graph1.setEdges(edges1);
        graph1.setRelationPairs(relationPairs1);
        graph1.setRelations(relations1);

        // Create the second Graph object
        Graph graph2 = new Graph();
        List<Node> nodes2 = new ArrayList<>();
        nodes2.add(new Node());
        nodes2.add(nodes1.get(0));
        List<Edge> edges2 = new ArrayList<>();
        edges2.add(new Edge());
        HashMap<Pair<Node, Node>, Edge> relationPairs2 = new HashMap<>();
        relationPairs2.put(new MutablePair<>(nodes2.get(0), nodes2.get(1)), edges2.get(0));
        relationPairs2.put(new MutablePair<>(nodes2.get(1), nodes2.get(0)), edges2.get(0));
        HashMap<Node, List<Node>> relations2 = new HashMap<>();
        List<Node> node3Relations = new ArrayList<>();
        node3Relations.add(nodes2.get(0));
        relations2.put(nodes2.get(1), node3Relations);
        graph2.setNodes(nodes2);
        graph2.setEdges(edges2);
        graph2.setRelationPairs(relationPairs2);
        graph2.setRelations(relations2);

        // Calculate the difference between graph1 and graph2
        Graph difference = graph1.Substract(graph2);

        // Assert that the difference is calculated correctly
        assertEquals(1, difference.getNodes().size());
        assertEquals(2, difference.getEdges().size());
        assertEquals(0, difference.getRelationPairs().size());
        assertEquals(1, difference.getRelations().size());
    }


    @org.junit.jupiter.api.Test
    void union() {
        Graph graph1 = new Graph();
        List<Node> nodes1 = new ArrayList<>();
        nodes1.add(new Node());
        nodes1.add(new Node());
        List<Edge> edges1 = new ArrayList<>();
        edges1.add(new Edge());
        edges1.add(new Edge());
        HashMap<Pair<Node, Node>, Edge> relationPairs1 = new HashMap<>();
        relationPairs1.put(new MutablePair<>(nodes1.get(0), nodes1.get(1)), edges1.get(0));
        relationPairs1.put(new MutablePair<>(nodes1.get(1), nodes1.get(0)), edges1.get(1));
        HashMap<Node, List<Node>> relations1 = new HashMap<>();
        List<Node> node1Relations = new ArrayList<>();
        List<Node> node2Relations = new ArrayList<>();
        node1Relations.add(nodes1.get(1));
        node2Relations.add(nodes1.get(0));
        relations1.put(nodes1.get(0), node1Relations);
        relations1.put(nodes1.get(1), node2Relations);
        graph1.setNodes(nodes1);
        graph1.setEdges(edges1);
        graph1.setRelationPairs(relationPairs1);
        graph1.setRelations(relations1);

        // Create the second Graph object
        Graph graph2 = new Graph();
        List<Node> nodes2 = new ArrayList<>();
        nodes2.add(nodes1.get(0));
        nodes2.add(new Node());
        List<Edge> edges2 = new ArrayList<>();
        edges2.add(new Edge());
        edges2.add(new Edge());
        HashMap<Pair<Node, Node>, Edge> relationPairs2 = new HashMap<>();
        relationPairs2.put(new MutablePair<>(nodes2.get(0), nodes2.get(1)), edges2.get(0));
        relationPairs2.put(new MutablePair<>(nodes2.get(1), nodes2.get(0)), edges2.get(1));
        HashMap<Node, List<Node>> relations2 = new HashMap<>();
        List<Node> node3Relations = new ArrayList<>();
        List<Node> node4Relations = new ArrayList<>();
        node3Relations.add(nodes2.get(1));
        node4Relations.add(nodes2.get(0));
        relations2.put(nodes2.get(0), node3Relations);
        relations2.put(nodes2.get(1), node4Relations);
        graph2.setNodes(nodes2);
        graph2.setEdges(edges2);
        graph2.setRelationPairs(relationPairs2);
        graph2.setRelations(relations2);

        // Calculate the union of graph1 and graph2
        Graph union = graph1.Union(graph2);

        // Assert that the union is calculated correctly
        assertEquals(1, union.getNodes().size());
        assertEquals(0, union.getEdges().size());
        assertEquals(0, union.getRelationPairs().size());
        assertEquals(1, union.getRelations().size());
    }

    @org.junit.jupiter.api.Test
    void copy() {
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

        Graph graph2 = new Graph();
        graph2.copy(graph);

        // Assert that all values are correct using getters
        assertEquals(nodes.size(), graph2.getNodes().size());
        assertEquals(edges.size(), graph2.getEdges().size());
        assertEquals(relationPairs.size(), graph2.getRelationPairs().size());
        assertEquals(relations.size(), graph2.getRelations().size());

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
        Graph g = new Graph();
        List<Edge> edges = new ArrayList<>();
        for (int i=0; i<5; i++){
            edges.add(new Edge());
        }
        g.setEdges(edges);
        g.clearEdges();
        assertEquals(0, g.getEdges().size());
    }
}