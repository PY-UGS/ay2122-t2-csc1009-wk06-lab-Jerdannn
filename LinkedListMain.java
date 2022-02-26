package Lab_6;
import java.util.Random;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>();

        //Initialize a random object
        Random random = new Random();
        for (int i = 0; i < 500; i++) {
            //Range from 1000 - 9999
            int x = random.nextInt(8999) + 1000;
            ll.add(x);
        }

        ll.printList();
        System.out.print("The position of the value is at: ");
        System.out.print(ll.findValue(ll, 9750));
    }
}
