package Lab_6;

public class LinkedList<T> {
    //Attributes
    //This needs to be static
    private static int size;
    private LinkedNode head;

    //Operations
    //Default Constructor
    public LinkedList() {}

    //Return size
    public int getSize() {
        return size;
    }

    //Add an element into the list
    public void add(int value) {
        //If this is the first element,
        if (head == null) {
            head = new LinkedNode(value);
        }

        else {
            LinkedNode newNode = new LinkedNode(value);
            LinkedNode currentNode = head;
    
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
            LinkedNode currentNode = head;
            
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
    public void addSort(LinkedList<Integer> list, int value) {
        LinkedNode newNode = new LinkedNode(value);
        LinkedNode currentNode = head;

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
    public void swapValues(LinkedList<Integer> list, int valueOne, int valueTwo) {
        LinkedNode currentNode = head;

        for (int i = 0; i < size && currentNode != null; i++) {
            //Find out where the first value is located
            if ((int) currentNode.getDataVal() == valueOne) {
                LinkedNode firstNode = currentNode;
                firstNode.setData(valueTwo);
            }
            //Find out where the second value is located
            else if ((int) currentNode.getDataVal() == valueTwo) {
                LinkedNode secondNode = currentNode;
                secondNode.setData(valueOne);
            }
            currentNode = currentNode.getNext();
        }
    }

    //Searching for a random value
    public int findValue(LinkedList<Integer> list, int searchVal) {
        LinkedNode currentNode = head;
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
