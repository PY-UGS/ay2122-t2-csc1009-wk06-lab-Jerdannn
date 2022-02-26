package Lab_6;
import java.util.Random;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>();

        //Question 1
        ll.add(1);
        ll.add(3);
        ll.add(5);
        ll.add(7);
        ll.add(9);
        ll.add(11);
        ll.printList();
        ll.addSort(ll, 6);
        ll.printList();

        //Question 2
        ll.printList();
        ll.swapValues(ll, 3, 11);
        ll.printList();

        //Question 3
        LinkedList<Integer> lll = new LinkedList<Integer>();
        //Initialize a random object
        Random random = new Random();
        for (int i = 0; i < 500; i++) {
            //Range from 1000 - 9999
            int x = random.nextInt(1000, 9999);
            lll.add(x);
        }

        lll.printList();
        System.out.print("The position of the value is at: ");
        System.out.print(lll.findValue(lll, 9750));
    }
}
