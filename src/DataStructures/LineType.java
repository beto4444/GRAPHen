package DataStructures;

public enum LineType {
    STRAIGHT("--"),
    DOTTED(".-");

    private final String value;

    private LineType(String value)
    {
        this.value = value;
    }

    public String toString()
    {
        return this.value; //will return , or ' instead of COMMA or APOSTROPHE
    }
}
