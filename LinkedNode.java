package Lab_6;

public class LinkedNode {
    //Attributes
    private LinkedNode next; //What the node is pointing to
    private Object dataValue; //Data stored in the node

    //Operations
    //Default Constructor
    public LinkedNode(Object val) {
        this.next = null; //Points to nothing initially
        this.dataValue = val;
    }

    //Used if the next node needs to be specified
    public LinkedNode(LinkedNode next, Object val) {
        this.next = next;
        this.dataValue = val;
    }

    //Get
    public LinkedNode getNext() {
        return this.next;
    }

    public Object getDataVal() {
        return this.dataValue;
    }

    //Set
    public void setNext(LinkedNode next) {
        this.next = next;
    }

    public void setData(Object val) {
        this.dataValue = val;
    }
}