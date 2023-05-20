package DataStructures;

import org.junit.Assert;

import static org.junit.jupiter.api.Assertions.*;

class EdgeTest {

    @org.junit.jupiter.api.Test
    void testEdge(){
        Edge edge1 = new Edge(3, 3, "#ffffff", LineType.DOTTED);
        Edge edge2 = new Edge(edge1);

        assertEquals(edge1.getNumColor(), edge2.getNumColor(), ()->"getNumColor() failed");
        assertEquals(edge1.getLineWidth(), edge2.getLineWidth(), ()->"getLineWidth() failed");
        assertEquals(edge1.getColor(), edge2.getColor(), ()->"getColor() failed");
        assertEquals(edge1.getLineType(), edge2.getLineType(), ()->"getLineType() failed");
    }

}