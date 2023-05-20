package DataStructures;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest {

    @org.junit.jupiter.api.Test
    void testNode(){
        Node originalNode = new Node();
        originalNode.setNodeContents("Original Node");
        originalNode.setFillColor("Red");
        originalNode.setBorderColor("Black");
        originalNode.setNodeShape(NodeShape.CROSS);
        originalNode.setNodeSize(50);
        originalNode.setBorderWidth(2);
        originalNode.setBorderLineShape(LineType.STRAIGHT);

        // Copy the Node using the copy constructor
        Node copiedNode = new Node(originalNode);

        // Assert that all values are correct using getters
        assertEquals("Original Node", copiedNode.getNodeContents());
        assertEquals("Red", copiedNode.getFillColor());
        assertEquals("Black", copiedNode.getBorderColor());
        assertEquals(NodeShape.CROSS.toString(), copiedNode.getNodeShape());
        assertEquals(50, copiedNode.getNodeSize());
        assertEquals(2, copiedNode.getBorderWidth());
        assertEquals(LineType.STRAIGHT.toString(), copiedNode.getBorderLineShape());

    }

}