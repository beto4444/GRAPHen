package DataStructures;

public enum NodeShape {
    OVAL("()"),
    STAR("*"),
    CROSS("+"),
    DIAMOND("<>");

    private final String value;
    private NodeShape(String value)
    {
        this.value = value;
    }

    public String toString()
    {
        return this.value; //will return , or ' instead of COMMA or APOSTROPHE
    }
}
