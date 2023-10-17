import java.util.LinkedList;

class linkedlist {
    public static void main(String[] args) {

        // create linkedlist
        LinkedList<String> animals = new LinkedList<>();

        // Add elements to LinkedList
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Cow");
        // after cretaing ll
        System.out.println("After Adding Elemnet at first");
        animals.add(0, "gadha");
        System.out.println("LinkedList: " + animals);
        System.out.println("After Adding Element at last : ");
        animals.addLast("Tommy");
        System.out.println("LinkedList: " + animals);
        // get the element from the linked list
        System.out.println("LinkedList: " + animals.get(2));
    }
}

// // Java Program to Demonstrate
// // Implementation of LinkedList
// // class

// // Importing required classes
// import java.util.*;

// // Main class
// public class linkedlist{

// // Driver code
// public static void main(String args[])
// {
// // Creating object of the
// // class linked list
// LinkedList<String> ll = new LinkedList<String>();

// // Adding elements to the linked list
// ll.add("A ->");
// ll.add("B->");
// ll.addLast("C");
// ll.addFirst("D->");
// ll.add(2, "E");

// System.out.println(ll);

// ll.remove("B");
// ll.remove(3);
// ll.removeFirst();
// ll.removeLast();

// System.out.println(ll);
// }
// }
