package Lab_6;
import java.util.HashMap;
import java.util.TreeMap;

public class JHashMap {
    //Operations
    //Default Constructor
    public JHashMap() {}

    //Assumes that no duplicate values are added
    //Adds and sorts an element in the map
    public void addSort(HashMap<Integer, Integer> hm, int value) {
        //Since the key is the same as the value,
        hm.put(value, value);

        //Initializes a TreeMap and store all values from the HashMap
        TreeMap<Integer, Integer> sortedTree = new TreeMap<>();
        sortedTree.putAll(hm);

        //A TreeMap is naturally sorted, therefore,
        System.out.println(sortedTree);
    }

    //Swap values
    //(Super simple way to do it, definitely not proper)
    public void swapValues(HashMap<Integer, Integer> hm, int firstValue, int secondValue) {
        //Check to see if these two values exist
        if (hm.get(firstValue) != null && hm.get(secondValue) != null) {
            hm.replace(firstValue, secondValue);
            hm.replace(secondValue, firstValue);
            System.out.println(hm);
        }
        else {
            System.out.println("One or both values do not exist in the HashMap!");
        }
    }

    //Search values
    public void searchValue(HashMap<Integer, Integer> hm, int value) {
        //Iterate through all keys
        for (int i : hm.keySet()) {
            //There exist a key with said value
            if (value == hm.get(i)) {
                System.out.println("The position of the value is at: " + i);
                return;
            }
        }
        //This prints if the value was not found
        System.out.println("The position of the value is at: " + -1);
    }
}
