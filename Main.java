package Lab_6;
import java.util.Random;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        //Question 1
        JLinkedList<Integer> ll = new JLinkedList<Integer>();
        ll.add(1);
        ll.add(3);
        ll.add(5);
        ll.add(7);
        ll.add(9);
        ll.add(11);
        System.out.println("Question 1: ");
        ll.printList();
        ll.addSort(ll, 6);
        ll.printList();

        //Question 2
        System.out.println("Question 2: ");
        ll.printList();
        ll.swapValues(ll, 3, 11);
        ll.printList();

        //Question 3
        JLinkedList<Integer> lll = new JLinkedList<Integer>();
        //Initialize a random object
        Random random = new Random();
        for (int i = 0; i < 500; i++) {
            //Range from 1000 - 9999
            int listRand = random.nextInt(1000, 9999);
            lll.add(listRand);
        }

        System.out.println("Question 3: ");
        //lll.printList();
        System.out.print("The position of the value is at: ");
        System.out.println(lll.findValue(lll, 9750));

        //Question 4
        JHashMap hm = new JHashMap();
        HashMap<Integer, Integer> hmQ4 = new HashMap<Integer, Integer>();
        hmQ4.put(1, 1);
        hmQ4.put(3, 3);
        hmQ4.put(5, 5);
        hmQ4.put(7, 7);
        hmQ4.put(9, 9);
        hmQ4.put(11, 11);
        System.out.println("Question 4: ");
        System.out.println(hmQ4);
        hm.addSort(hmQ4, 6);

        //Question 5
        System.out.println("Question 5: ");
        System.out.println(hmQ4);
        hm.swapValues(hmQ4, 6, 7);

        //Question 6
        HashMap<Integer, Integer> hmQ6 = new HashMap<Integer, Integer>();
        for (int i = 1; i <= 500; i++) {
            //Range from 1000 - 9999
            int hashRand = random.nextInt(1000, 9999);
            hmQ6.put(i, hashRand);
        }
        System.out.println("Question 6: ");
        hm.searchValue(hmQ6, 9750);
    }
}
