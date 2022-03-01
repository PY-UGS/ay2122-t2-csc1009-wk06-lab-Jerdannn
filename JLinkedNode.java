package Lab_6;

public class JLinkedNode {
    //Attributes
    private JLinkedNode next; //What the node is pointing to
    private Object dataValue; //Data stored in the node

    //Operations
    //Default Constructor
    public JLinkedNode(Object val) {
        this.next = null; //Points to nothing initially
        this.dataValue = val;
    }

    //Used if the next node needs to be specified
    public JLinkedNode(JLinkedNode next, Object val) {
        this.next = next;
        this.dataValue = val;
    }

    //Get
    public JLinkedNode getNext() {
        return this.next;
    }

    public Object getDataVal() {
        return this.dataValue;
    }

    //Set
    public void setNext(JLinkedNode next) {
        this.next = next;
    }

    public void setData(Object val) {
        this.dataValue = val;
    }
}