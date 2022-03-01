package Lab_6;

public class JLinkedList<T> {
    //Attributes
    private int size;
    private JLinkedNode head;

    //Operations
    //Default Constructor
    public JLinkedList() {}

    //Return size
    public int getSize() {
        return size;
    }

    //Add an element into the list
    public void add(int value) {
        //If this is the first element,
        if (head == null) {
            head = new JLinkedNode(value);
        }

        else {
            JLinkedNode newNode = new JLinkedNode(value);
            JLinkedNode currentNode = head;
    
            while (currentNode.getNext() != null) {
                //Insertion at the end
                currentNode = currentNode.getNext();
            }
    
            currentNode.setNext(newNode);
        }
        size++;
    }

    //Prints out the entire list
    public void printList() {
        String s = "[";

        if (head != null) {
            JLinkedNode currentNode = head;
            
            while (currentNode.getNext() != null) {
                s += currentNode.getDataVal().toString() + ", ";
                currentNode = currentNode.getNext();
            }
            s += currentNode.getDataVal().toString();
        }
        s += "]";
        System.out.println(s);
    }

    //This assumes the list is populated
    //Adds and sorts an element in the list
    public void addSort(JLinkedList<Integer> list, int value) {
        JLinkedNode newNode = new JLinkedNode(value);
        JLinkedNode currentNode = head;

        int compareVal = (int) currentNode.getDataVal();
        //First node checking
        if (compareVal > value) {
            newNode.setNext(currentNode);
            currentNode = newNode;
        }
        else {
            //Less than the total amount of elements in the list
            //AND
            //the next node must exist
            for (int i = 0; i < size && currentNode.getNext() != null; i++) {
                compareVal = (int) currentNode.getNext().getDataVal();
                if (compareVal > value) {
                    newNode.setNext(currentNode.getNext());
                    currentNode.setNext(newNode);
                    break;
                }
                currentNode = currentNode.getNext();
            }
        }
        size++;
    }

    //Swappppppp
    //This assumes the list is populated
    public void swapValues(JLinkedList<Integer> list, int valueOne, int valueTwo) {
        JLinkedNode currentNode = head;

        for (int i = 0; i < size && currentNode != null; i++) {
            //Find out where the first value is located
            if ((int) currentNode.getDataVal() == valueOne) {
                JLinkedNode firstNode = currentNode;
                firstNode.setData(valueTwo);
            }
            //Find out where the second value is located
            else if ((int) currentNode.getDataVal() == valueTwo) {
                JLinkedNode secondNode = currentNode;
                secondNode.setData(valueOne);
            }
            currentNode = currentNode.getNext();
        }
    }

    //Searching for a random value
    public int findValue(JLinkedList<Integer> list, int searchVal) {
        JLinkedNode currentNode = head;
        int position = -1;

        for (int i = 0; i < size && currentNode != null; i++) {
            if ((int) currentNode.getDataVal() == searchVal) {
                position = i + 1; //More intuitive
                //This means the first instance is considered (if there are duplicates)
                break;
            }
            currentNode = currentNode.getNext();
        }
        return position;
    }
}