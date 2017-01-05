package co.com.examples.java8.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Luis Wilmer Forero Romero<luisforero.wr@gmail.com>
 */
public class LinkedListCollections {

    public static void printNames(List list) {
        for (int i = 0; i < list.size(); i++) {
            String name = (String) list.get(i);
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        Integer[] array = {9, 3, 1, 7, 5, 6, 12, 13};
        Arrays.sort(array);

        List l = new LinkedList(Arrays.asList(array));
        Collections.sort(l);
        System.out.println(l);
        System.out.println("Binary Search" + Collections.binarySearch(l, 7));
        System.out.println("Binary Search" + Collections.binarySearch(l, 11));

        // Error ClassCastException in the method printNames
        List names = new LinkedList();
        names.add(new StringBuilder("Hola"));
        try {
            printNames(names);
        } catch (ClassCastException ex) {
            System.err.println(ex.getClass());
            System.err.println(ex.getMessage());
//            ex.printStackTrace();
        }

        List<String> birds = new LinkedList<>();
        birds.add("hawk");
        birds.add("owl");
        birds.add("hawk");
        System.out.println(birds.remove("cardinal"));
        System.out.println(birds.remove("hawk"));
        System.out.println(birds);
        try {
            System.out.println(birds.remove(5));
        } catch (IndexOutOfBoundsException ex) {
            System.out.println(ex.getClass());
//            ex.printStackTrace();
        }

        List<String> list = new LinkedList<>();
        list.add("OH");
        list.add("ZO");
        list.add("NJ");
        list.add("NA");
        list.add("NJ");
        list.add("XJ");
        list.add("NJ");
        System.out.println("Linked List Strings: " + list);
        System.out.println("Index of NJ: " + list.indexOf("NJ"));
        System.out.println("Last index of NJ: " + list.lastIndexOf("NJ"));
        System.out.println("Binary Search of NJ: " + Collections.binarySearch(list, "NJ"));
        Collections.sort(list);
        System.out.println("Ordered Linked List Strings: " + list);
        System.out.println("Binary Search of NJ: " + Collections.binarySearch(list, "NJ"));

    }
}
