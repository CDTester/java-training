package trainingDataStructures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class Main {

  public static void main(String[] args) {
    System.out.println("DATA STRUCTURES");
    System.out.println("Data structures are a way of organizing and storing data so that it can be accessed and used efficiently.");
    System.out.println("Java provides built-in data structures such as arrays, ArrayList, LinkedList, HashMap, HashSet, and others in the java.util package.");

    separator();
    System.out.println("LIST: stores ordered elements, that allows duplicates");

    System.out.println("\nARRAY LIST: Use an ArrayList for storing and accessing data");
    System.out.println("An ArrayList is a resizable array that can grow as needed. It allows for dynamic memory allocation and provides methods to manipulate the list.");
    var carsArrayList = new ArrayList<String>();
    carsArrayList.add("Volvo");
    carsArrayList.add("BMW");
    carsArrayList.add("Ford");
    carsArrayList.add("BMW");  // duplicates are allowed
    carsArrayList.add("Mazda");
    System.out.println("Cars added in this order (volvo, bmw, ford, bmw, mazda). carsArrayList:" + carsArrayList);

    System.out.println("\nLINKED LIST: Use an LinkedList to manipulate data");
    System.out.println("A LinkedList is a list with fast insert and remove operations. It uses the same methods as ArrayList because it implements the List interface.");
    var carsLinkedList = new LinkedList<String>();
    carsLinkedList.add("Volvo");
    carsLinkedList.add("BMW");
    carsLinkedList.add("Ford");
    carsLinkedList.add("BMW");  // duplicates are allowed
    carsLinkedList.add("Mazda");
    System.out.println("Cars added in this order (volvo, bmw, ford, bmw, mazda).  carsLinkedList:" + carsLinkedList);

    System.out.println("\nLists have many useful methods:");
    carsArrayList.add(0, "Toyota"); // add element at specific index
    System.out.println(".add(0, \"Toyota\"); carsArrayList:" + carsArrayList);
    carsLinkedList.addFirst("Toyota"); // add element at specific index
    System.out.println(".addFirst(\"Toyota\"); carsLinkedList:" + carsLinkedList);   // can also use push("Toyota")
    carsLinkedList.addLast("Fiat"); // add element at specific index
    System.out.println(".addLast(\"Fiat\"); carsLinkedList:" + carsLinkedList + " (linkedList only)");
    System.out.println(".contains(\"BMW\"): " + carsArrayList.contains("BMW"));
    System.out.println(".get(1): " + (carsArrayList.get(1)));
    System.out.println(".getFirst();  carsLinkedList: " + carsArrayList.getFirst() + " (linkedList only)");
    System.out.println(".getLast();   carsLinkedList: " + carsArrayList.getLast() + " (linkedList only)");
    System.out.println(".indexOf(\"Ford\"): " + carsArrayList.indexOf("Ford") + ": carsArrayList:" + carsArrayList); // get index of first occurrence of element
    System.out.println(".indexOf(\"Ford\"): " + carsLinkedList.indexOf("Ford") + ": carsLinkedList:" + carsLinkedList); // get index of first occurrence of element
    System.out.println(".offer(\"Honda\");     carsLinkedList: " + carsLinkedList.offer("Honda") + ": carsLinkedList:" + carsLinkedList + " (linkedList only)"); // add element at the end of the list, returns true if the element was added successfully;
    System.out.println(".offerFirst(\"Kia\");  carsLinkedList: " + carsLinkedList.offerFirst("Kia") + ": carsLinkedList:" + carsLinkedList + " (linkedList only)"); // add element at the beginning of the list, returns true if the element was added successfully;
    System.out.println(".peek();     " + carsLinkedList.peek() + ": carsLinkedList: " + carsLinkedList + " (linkedList only)"); // Retrieves the first item in the list
    System.out.println(".peekLast(); " + carsLinkedList.peekLast() + ": carsLinkedList: " + carsLinkedList + " (linkedList only)"); // Retrieves the last item in the list
    System.out.println(".poll(); " + carsLinkedList.poll() + ": carsLinkedList: " + carsLinkedList + " (linkedList only)" + " (linkedList only)"); // Removes the first and last item in the list
    System.out.println(".pop(); " + carsLinkedList.pop() + ": carsLinkedList: " + carsLinkedList + " (linkedList only)"); // Removes the first item in the list
    carsLinkedList.push("Alpha Romeo"); // add item to the first item in the list
    System.out.println(".push(\"Alpha Romeo\"); carsLinkedList: " + carsLinkedList + " (linkedList only)"); // add item to the first item in the list
    System.out.println(".remove(3): " + carsArrayList.remove(3) + ": carsArrayList: " + carsArrayList); // remove element at specific index
    System.out.println(".removeIf(\"Volvo\"::equals): " + carsArrayList.removeIf("Volvo"::equals) + ": carsArrayList: " + carsArrayList); // remove all elements that match the condition
    System.out.println(".removeFirst(); " + carsLinkedList.removeFirst() + ": carsLinkedList: " + carsLinkedList + " (linkedList only)");  // can also use pop()
    System.out.println(".set(2, \"Skoda\"): " + carsArrayList.set(2, "Skoda") + ": carsArrayList: " + carsArrayList); // change element at specific index
    System.out.println(".size(): " + carsArrayList.size());
    carsArrayList.clear(); // remove all elements that match the condition
    System.out.println(".clear(): carsArrayList:" + carsArrayList);


    separator();
    System.out.println("SET: Use Set classes when you need to store unique values only.");

    System.out.println("\nHASH SET: does not keep order");
    System.out.println("A HashSet is a collection where every element where every element is unique (no duplicates allowed) and the elements are not stored in any particular order.");
    var carsHashset = new HashSet<String>();
    carsHashset.add("Volvo");
    carsHashset.add("BMW");
    carsHashset.add("Ford");
    carsHashset.add("BMW"); // will not be added because it's a duplicate
    carsHashset.add("Mazda");
    System.out.println("cars added in this order (volvo, bmw, ford, bmw, mazda). carsHashset : " + carsHashset);

    System.out.println("\nTREE SET: stores unique elements in sorted order");
    System.out.println("A TreeSet is Sorted set of unique elements (natural order).");
    var carsTreeSet = new TreeSet<>();
    carsTreeSet.add("Volvo");
    carsTreeSet.add("BMW");
    carsTreeSet.add("Ford");
    carsTreeSet.add("BMW");  // Duplicate
    carsTreeSet.add("Mazda");
    System.out.println("cars added in this order (volvo, bmw, ford, bmw, mazda). carsTreeSet : " + carsTreeSet);

    System.out.println("\nLINKED HASH SET: keeps order items were added");
    System.out.println("A LinkedHashSet maintains the order in which elements were inserted.");
    var carsLinkedHashSet = new LinkedHashSet<>();
    carsLinkedHashSet.add("Volvo");
    carsLinkedHashSet.add("BMW");
    carsLinkedHashSet.add("Ford");
    carsLinkedHashSet.add("BMW");  // Duplicate
    carsLinkedHashSet.add("Mazda");
    System.out.println("cars added in this order (volvo, bmw, ford, bmw, mazda). carsLinkedHashSet : " + carsLinkedHashSet);

    System.out.println("\nSets have many useful methods:");
    System.out.println(".contains(\"BMW\"); " + carsHashset.contains("BMW") + ": carsHashset: " + carsHashset);
    System.out.println(".remove(\"Mazda\"); " + carsHashset.remove("Mazda") + ": carsHashset: " + carsHashset);
    System.out.println(".size(); " + carsHashset.size());
    carsHashset.clear(); // remove all elements that match the condition
    System.out.println(".clear(); carsArrayList:" + carsHashset);
    System.out.println(".removeFirst(); " + carsTreeSet.removeFirst() + ": carsTreeSet: " + carsTreeSet + " (carsTreeSet only)");  // can also use pop()
    System.out.println(".removeLast(); " + carsTreeSet.removeLast() + ": carsTreeSet: " + carsTreeSet + " (carsTreeSet only)");  // can also use pop()

    separator();
    System.out.println("MAP: Use Map classes when you need to store pairs of keys and values, like a name and its phone number");

    System.out.println("\nHASH MAP: does not keep order, best for fast lookups by key");
    System.out.println("A HashMap stores key-value pairs, which are great when you want to store values and find them by a key (like a name or ID)");
    var capitalCitiesHash = new HashMap<String, String>();
    capitalCitiesHash.put("England", "London");
    capitalCitiesHash.put("Germany", "Berlin");
    capitalCitiesHash.put("Norway", "Oslo");
    capitalCitiesHash.put("USA", "Washington DC");
    System.out.println(capitalCitiesHash);

    System.out.println("\nTREE MAP: A sorted map based on the natural order of keys");
    var capitalCitiesTree = new TreeMap<>();
    capitalCitiesTree.put("England", "London");
    capitalCitiesTree.put("India", "New Dehli");
    capitalCitiesTree.put("Austria", "Wien");
    capitalCitiesTree.put("Norway", "Oslo");
    capitalCitiesTree.put("Norway", "Oslo"); // Duplicate
    capitalCitiesTree.put("USA", "Washington DC");
    System.out.println(capitalCitiesTree);

    System.out.println("\nLINKED HASH MAP: stores keys and values, and keeps them in the same order you put them in");
    var capitalCitiesLinkedHash = new LinkedHashMap<>();
    capitalCitiesLinkedHash.put("England", "London");
    capitalCitiesLinkedHash.put("India", "New Dehli");
    capitalCitiesLinkedHash.put("Austria", "Wien");
    capitalCitiesLinkedHash.put("Norway", "Oslo");
    capitalCitiesLinkedHash.put("Norway", "Oslo"); // Duplicate
    capitalCitiesLinkedHash.put("USA", "Washington DC");
    System.out.println(capitalCitiesLinkedHash);

    System.out.println("\nMaps have many useful methods:");
    System.out.println(".put(\"France\", \"Paris\"); " + capitalCitiesHash.put("France", "Paris") + ": capitalCitiesHash: " + capitalCitiesHash);
    System.out.println(".get(\"Norway\"); " + capitalCitiesHash.get("Norway"));
    System.out.println(".remove(\"Germany\"); " + capitalCitiesHash.remove("Germany") + ": capitalCitiesHash: " + capitalCitiesHash);
    System.out.println(".containsKey(\"USA\"); " + capitalCitiesHash.containsKey("USA"));
    System.out.println(".containsValue(\"Oslo\"); " + capitalCitiesHash.containsValue("Oslo"));
    System.out.println(".keySet(); " + capitalCitiesHash.keySet());
    System.out.println(".size(); " + capitalCitiesHash.size());

    capitalCitiesHash.clear();
    System.out.println(".clear(); " + capitalCitiesHash);


    separator();
    System.out.println("COLLECTIONS: java.util classes that can be used on data structures, like sorting and searching");
    var carsArrayList2 = new ArrayList<String>();
    carsArrayList2.add("Volvo");
    carsArrayList2.add("BMW");
    carsArrayList2.add("Ford");
    carsArrayList2.add("BMW");  // duplicates are allowed
    carsArrayList2.add("Mazda");
    System.out.println("carsArrayList2:" + carsArrayList2);
    Collections.sort(carsArrayList2);
    System.out.println("Collections.sort(carsArrayList2):" + carsArrayList2);
    Collections.sort(carsArrayList2, Collections.reverseOrder());
    System.out.println("Collections.sort(carsArrayList2, Collections.reverseOrder()):" + carsArrayList2);


    separator();
    System.out.println("You can loop through the elements of a data structure in different ways, here are some examples:");
    System.out.println("For loop: ");
    for (int i = 0; i < carsArrayList2.size(); i++) {
      System.out.print(carsArrayList2.get(i) + ", ");
    }
    System.out.println("\nFor each: ");
    for (String i : carsArrayList2) {
      System.out.print(i + ", ");
    }
    System.out.println("\nIterator: ");
    var it = carsArrayList2.iterator();
    while (it.hasNext()) {
      System.out.print(it.next() + ", ");
    }


    separator();
    System.out.println("ALGORITHMS: are used to solve problems by sorting, searching, and manipulating data structures.");
    System.out.println("In Java, many useful algorithms are already built into the Collections class (found in the java.util package), so you don't have to write them from scratch.");

    System.out.println("\nSORTING: Sorting is one of the most common algorithms. With ArrayList, you can use Collections.sort() to sort the elements");
    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(5);
    numbers.add(1);
    numbers.add(7);
    numbers.add(3);
    numbers.add(9);
    Collections.sort(numbers);
    System.out.println(numbers); // [1, 3, 5, 7, 9]

    System.out.println("You can also sort in reverse order with Collections.sort(list, Collections.reverseOrder()):");
    Collections.sort(numbers, Collections.reverseOrder());
    System.out.println(numbers); // [1, 3, 5, 7, 9]

    System.out.println("\nSEARCHING: To find elements in a list, Java provides helper methods. The most common is Collections.binarySearch(), which searches in a sorted list:");
    ArrayList<String> names = new ArrayList<>();
    names.add("Liam");
    names.add("Jenny");
    names.add("Kasper");
    names.add("Angie");

    Collections.sort(names); // must be sorted first
    int index = Collections.binarySearch(names, "Jenny");
    System.out.println("Jenny is at index: " + index);

    System.out.println("\nMAX: Collections.max() - find the largest element");
    ArrayList<Integer> numbersMM = new ArrayList<>();
    numbersMM.add(5);
    numbersMM.add(1);
    numbersMM.add(7);
    numbersMM.add(3);
    numbersMM.add(9);

    System.out.println("Max: " + Collections.max(numbersMM));

    System.out.println("\nMIN: Collections.min() - find the smallest element");
    System.out.println("Min: " + Collections.min(numbersMM));

    System.out.println("\nFREQUENCY: Collections.frequency() counts how many times an element appears in a list");
    ArrayList<String> fruits = new ArrayList<>();
    fruits.add("Apple");
    fruits.add("Banana");
    fruits.add("Orange");
    fruits.add("Banana");
    fruits.add("Mango");
    int count = Collections.frequency(fruits, "Banana");
    System.out.println("Banana appears: " + count + " times");

    System.out.println("\nSWAP: Collections.swap() swaps two elements in a list");
    Collections.swap(fruits, 0, 2); // Swap first and third element
    System.out.println(fruits);
  }

  public static void separator() {
    System.out.println("------------------------------------------------------------------------------------------------\n");
  }
}
