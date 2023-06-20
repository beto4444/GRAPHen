package DataStructures;


import org.apache.commons.lang3.tuple.MutablePair;
import org.apache.commons.lang3.tuple.Pair;

import java.util.*;
import java.util.stream.Stream;


public class Graph {

    private List<Node> nodes; //@TODO: rozważyć czy nie zamienić na set
    private List<Edge> edges; //@TODO: rozważyć czy nie zamienić na set
    private HashMap<Pair<Node, Node>, Edge> relation_pairs;
    private HashMap<Node, List<Node>> relations;

    public boolean digraph = false;

    public Graph(){
        nodes = new ArrayList<>();
        edges = new ArrayList<>();
        relation_pairs = new HashMap<>();
        relations = new HashMap<>();
    }

    public Graph(boolean digraph){
        nodes = new ArrayList<>();
        edges = new ArrayList<>();
        relation_pairs = new HashMap<>();
        relations = new HashMap<>();
        this.digraph = digraph;
    }

    public Graph(Graph other){
        nodes = new ArrayList<>();
        edges = new ArrayList<>();
        relation_pairs = new HashMap<>();
        relations = new HashMap<>();
        this.copy(other);
    }

    public void addRelation(Node parent, Edge edge, List<Node> children){ //@TODO: zamienić na bool i dodać try catch żeby w razie niepowodzenia dawało false
        if (relations.containsKey(parent)){
            _add_children(parent, children);
        }
        else{
            relations.put(parent, children);
        }
        Edge e = new Edge(edge);
        e.setRelations(parent, children);
        edges.add(e);

        children.add(parent);
        for (Node n: children) {
            if(!nodes.contains(n)){
                nodes.add(n);
            }
        }
        for (int i=0; i< children.size(); i++)
            for (int j=0; j< children.size(); j++){
                if (i!=j){
                    Pair<Node, Node> pair = new MutablePair<>(children.get(i), children.get(j));
                    relation_pairs.put(pair, edge); //jeżeli już istnieje robi update @TODO: rozważyć czy nie wywalić wyjątku
                }
            }
    }

    private void _add_children(Node parent, List<Node> children){
        relations.put(parent, _uniq_concat(relations.get(parent), children)); //usuwa duplikaty
    }


    private <K> ArrayList<K> _uniq_concat(List<K> old, List<K> added){
        Set<K> present = new HashSet<>(old);
        present.addAll(added);
        return new ArrayList<>(present);
    }

    /**
     * Function acting as + operator overload, returning a new graph being a sum of this and other.
     * Based on set operations
     * @TODO: coś jest nie tak
     * @param other
     * @return
     */
    public Graph Add(Graph other){
        Graph sum = new Graph(this);
        for (Map.Entry<Node, List<Node>> entry : other.relations.entrySet())
        {
            if (sum.relations.containsKey(entry.getKey())){
               sum._add_children(entry.getKey(), entry.getValue());
            }else{
                sum.relations.put(entry.getKey(), new ArrayList<>(entry.getValue()));
            }
        }
        sum.nodes = _uniq_concat(this.nodes, other.nodes);
        sum.edges = _uniq_concat(this.edges, other.edges);
        for (Map.Entry<Pair<Node, Node>, Edge> entry : other.relation_pairs.entrySet()) {
            Pair<Node, Node> key = entry.getKey();
            Edge value = entry.getValue();
            Pair<Node, Node> copiedKey = Pair.of(new Node(key.getLeft()), new Node(key.getRight()));
            Edge copiedValue = new Edge(value);
            sum.relation_pairs.put(copiedKey, copiedValue);
        }

        return sum;
    }
    /**
     * Function acting as - operator overload, returning a new graph being a difference of this and other.
     * Based on set operations
     * @TODO co zrobić jeżeli edge są te same?
     * @param other
     * @return
     */
    public Graph Substract(Graph other){
        Graph difference = new Graph(this);
        difference.nodes.removeAll(other.nodes);
        difference.edges.removeAll(other.edges);
        difference.relation_pairs = _remove_pairs(this.relation_pairs, other.nodes);
        difference.relations = _remove_rels(this.relations, other.nodes);

        return difference;
    }

    private static HashMap<Pair<Node, Node>, Edge> _remove_pairs(HashMap<Pair<Node, Node>, Edge> first, List<Node> second){
        HashMap<Pair<Node, Node>, Edge> result = new HashMap<>(first);
        for(Node n: second){
            for(Map.Entry<Pair<Node, Node>, Edge> e: first.entrySet()){
                if (e.getKey().getLeft() == n || e.getKey().getRight() == n){
                    result.remove(e.getKey(), e.getValue());
                }
            }
        }
        return result;
    }

    private static HashMap<Node, List<Node>> _remove_rels(HashMap<Node, List<Node>> first, List<Node> second){
        HashMap<Node, List<Node>> result = new HashMap<>(first);
        for (Node n: second){
            result.remove(n);
            for (Map.Entry<Node, List<Node>> entry: result.entrySet()){
                entry.getValue().remove(n);
            }
        }
        return result;
    }

    //DEPRECATED
    private static <K, T> HashMap<K, T> _remove_map(HashMap<K, T> first, HashMap<K, T> second){
        HashMap<K, T> result = new HashMap<>(first);
        for (Map.Entry<K, T> entry : second.entrySet()){
           first.remove(entry.getKey());
        }
        return result;
    }

    /**
     * Function acting as && operator overload, returning a new graph being a union of this and other.
     * Based on set operations
     * @param other
     * @return
     */
    public Graph Union(Graph other){ //@TODO zamienić nazwę na intersect dlaczego union???
        Graph union = new Graph();
        union.nodes = _intersect_list(this.nodes, other.nodes);
        union.edges = _intersect_list(this.edges, other.edges);
        union.relations = _findIntersection(this.relations, other.relations);
        union.relation_pairs = _findIntersection(this.relation_pairs, other.relation_pairs);
        return union;
    }

    private static <K> List<K> _intersect_list(List<K> first, List<K> second){
        List<K> result = new ArrayList<>();
        for (K n: first){
            if (second.contains(n)){
                result.add(n);
            }
        }
        return result;
    }


    private static <K, V> HashMap<K, V> _findIntersection(HashMap<K, V> map1, HashMap<K, V> map2) {
        HashMap<K, V> intersection = new HashMap<>();

        // Iterate over map1 and check if each key exists in map2
        for (Map.Entry<K, V> entry : map1.entrySet()) {
            K key = entry.getKey();
            V value = entry.getValue();
            if (map2.containsKey(key)) {
                V value2 = map2.get(key);
                if (value.equals(value2)) {
                    intersection.put(key, value);
                }
                else {
                    intersection.put(key, null);
                }
            }
        }

        return intersection;
    }

    /**
     * Create a deep copy of another Graph
     * @param other
     */
    public void copy(Graph other){
        if (this != other) {
            this.nodes = new ArrayList<>(other.nodes);
            this.edges = new ArrayList<>(other.edges);
            for (Map.Entry<Node, List<Node>> entry : other.relations.entrySet())
            {
                this.relations.put(entry.getKey(), new ArrayList<>(entry.getValue()));
            }
            for (Map.Entry<Pair<Node, Node>, Edge> entry : other.relation_pairs.entrySet()) {
                Pair<Node, Node> key = entry.getKey();
                Edge value = entry.getValue();

                Pair<Node, Node> copiedKey = Pair.of(new Node(key.getLeft()), new Node(key.getRight()));

                Edge copiedValue = new Edge(value);

                this.relation_pairs.put(copiedKey, copiedValue);
            }
        }
    }

    /**
     * Color the edges properly @TODO
     */
    public void colorEdges(){
        int maxColors = this.edges.size();

        edges.sort(Comparator.comparingInt(edge -> edge.target.size()));

        // Initialize a list to store the available colors for each edge
        List<Set<String>> availableColors = new ArrayList<>();
        for (int i = 0; i < edges.size(); i++) {
            availableColors.add(new HashSet<>());
        }

        // Assign colors to each edge
        for (Edge edge : edges) {
            // Find the neighboring colors
            Set<String> neighboringColors = new HashSet<>();
            for (Node target : edge.target) {
                String color = target.getFillColor();
                if (color != null) {
                    neighboringColors.add(color);
                }
            }

            // Find the first available color
            String color = findAvailableColor(availableColors.get(edge.num_color), neighboringColors, maxColors);
            edge.assignColor(color);

            // Update the available colors for the neighboring edges
            for (Node target : edge.target) {
                for (Edge neighbor : getNeighbors(target)) {
                    if (neighbor != edge) {
                        availableColors.get(neighbor.num_color).add(color);
                    }
                }
            }
        }
    }

    private List<Edge> getNeighbors(Node target){
        return edges.stream()
                .filter(edge -> edge.getSource()==target)
                .toList();
    }

    private String findAvailableColor(Set<String> availableColors, Set<String> neighboringColors, int maxColors) {
        for (int i = 0; i < maxColors; i++) {
            String color = getRandomColor();
            if (!availableColors.contains(color) && !neighboringColors.contains(color)) {
                return color;
            }
        }
        return null; // No available color found
    }

    private String getRandomColor() {
        // Generate and return a random color
        // You can implement your own logic to generate colors
        return "#" + String.format("%06x", new Random().nextInt(0xFFFFFF + 1));
    }

    /**
     * Color the nodes properly
     */
    public void colorNodes(){
        Set<Node> vertices = relations.keySet();
        HashMap<Node, String> colors = new HashMap<>();
        List<String> colorsAvaliable = new ArrayList<>();

        Node firstVertex = vertices.iterator().next();
        colors.put(firstVertex, firstVertex.getFillColor());

        for (Node node: vertices){
            if (node != firstVertex)
                colors.put(node, "");
        }

        HashMap<String, Boolean> usedColors = new HashMap<>();

        for (Node node: vertices){
            usedColors.put(node.getFillColor(), false);
            colorsAvaliable.add(node.getFillColor());
        }

        for (Node vertex : vertices) {
            List<Node> children = relations.get(vertex);

            // Mark colors used by adjacent vertices
            for (Node adjacentVertex : children) {
                String color = colors.get(adjacentVertex);
                if (!color.equals("")) {
                    usedColors.put(color, true);
                }
            }

            String color = colorsAvaliable.get(colorsAvaliable.size()-1);
            for (String col: colorsAvaliable){
                if (!usedColors.get(col)){
                    color = col;
                    break;
                }
            }

            // Assign the found color to the current vertex
            colors.put(vertex, color);

            // Reset the usedColors array
            for (String c: colorsAvaliable){
                usedColors.put(c, false);
            }
        }

        for (Map.Entry<Node, String> entry: colors.entrySet()){
            entry.getKey().setFillColor(entry.getValue());
        }
    }

    /**
     * erase all edges
     */
    public void clearEdges(){
        edges.clear();
    }

    public List<Node> getNodes() {
        return nodes;
    }

    // Setter for nodes
    public void setNodes(List<Node> nodes) {
        this.nodes = nodes;
    }

    // Getter for edges
    public List<Edge> getEdges() {
        return edges;
    }

    // Setter for edges
    public void setEdges(List<Edge> edges) {
        this.edges = edges;
    }

    // Getter for relationPairs
    public HashMap<Pair<Node, Node>, Edge> getRelationPairs() {
        return this.relation_pairs;
    }

    // Setter for relationPairs
    public void setRelationPairs(HashMap<Pair<Node, Node>, Edge> relationPairs) {
        this.relation_pairs = relationPairs;
    }

    // Getter for relations
    public HashMap<Node, List<Node>> getRelations() {
        return relations;
    }

    // Setter for relations
    public void setRelations(HashMap<Node, List<Node>> relations) {
        this.relations = relations;
    }
}
