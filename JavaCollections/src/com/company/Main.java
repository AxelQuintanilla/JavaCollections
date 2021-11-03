package com.company;
import java.util.*;
import java.util.concurrent.TimeUnit;


public class Main {

    public static void main(String[] args) {
	// write your code here
        int b = 1, option;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Welcome to the Java Collection project.");
        try {
            while (b == 1){
                System.out.println("1: HashSet, 2: LinkedHashSet, 3: TreeSet, 4: ArrayList, 5: Vector, 6: LinkedList, " +
                        "7: PriorityQueue, 8: HashTable, \n9: HashMap, 10:LinkedHashMap, 11: TreeMap," +
                        "\nor enter any other number to exit the program");
                System.out.println("Please select an option: ");
                option = myObj.nextInt();
                switch (option){
                    case 1:
                        //HashSet
                        HashSet<String> colors = new HashSet<>(); //HashSet creation.
                        System.out.println("\nA HashSet has been created.");
                        System.out.println("Adding elements to the HashSet:");
                        //Adding elements to the HashSet.
                        colors.add("Black");
                        colors.add("White");
                        colors.add("Red");
                        colors.add("Yellow");
                        colors.add("Green");
                        //Iterating the elements in the HashSet and printing them.
                        for (String i : colors) {
                            System.out.println(i);
                            TimeUnit.SECONDS.sleep(1);
                        }
                        //Deleting some elements from the HashSet and printing it again.
                        System.out.println("\nDeleting elements from the HashSet:");
                        colors.remove("Red");
                        colors.remove("Green");
                        for (String i : colors) {
                            System.out.println(i);
                            TimeUnit.SECONDS.sleep(1);
                        }
                        break;

                    case 2:
                        //LinkedHashSet
                        LinkedHashSet<String> set=new LinkedHashSet<>();    //LinkedHashSet creation
                        System.out.println("\nA LinkedHashSet has been created.");
                        System.out.println("Adding elements to the LinkedHashSet:");
                        //Adding elements to the LinkedHashSet
                        set.add("One");
                        set.add("Two");
                        set.add("Three");
                        set.add("Four");
                        set.add("Five");
                        //Iterating the elements in the LinkedHashSet and printing them.
                        for (String s : set) {
                            System.out.println(s);
                            TimeUnit.SECONDS.sleep(1);
                        }
                        //Deleting some elements from the LinkedHashSet and printing it again.
                        System.out.println("\nDeleting elements from the LinkedHashSet:");
                        set.remove("Two");
                        set.remove("Four");
                        for (String s : set) {
                            System.out.println(s);
                            TimeUnit.SECONDS.sleep(1);
                        }
                        break;

                    case 3:
                        //TreeSet
                        TreeSet<Integer> numbers=new TreeSet<>();   //TreeSet creation
                        //Adding elements to the TreeSet.
                        System.out.println("\nA TreeSet has been created.");
                        System.out.println("Adding elements to the TreeSet:");
                        numbers.add(24);
                        numbers.add(66);
                        numbers.add(12);
                        numbers.add(15);
                        //Iterating the elements in the TreeSet and printing them.
                        for (int s : numbers) {
                            System.out.println(s);
                            TimeUnit.SECONDS.sleep(1);
                        }
                        //Deleting some elements from the LinkedHashSet and printing it again.
                        System.out.println("\nDeleting the lowest and highest elements from the TreeSet.");
                        TimeUnit.SECONDS.sleep(1);
                        System.out.println("Highest Value: "+numbers.pollFirst());
                        System.out.println("Lowest Value: "+numbers.pollLast());
                        System.out.println("Remaining elements:");
                        for (int s : numbers) {
                            System.out.println(s);
                            TimeUnit.SECONDS.sleep(1);
                        }
                        break;

                    case 4:
                        //ArrayList
                        ArrayList<String> cars = new ArrayList<>(); //ArrayList creation.
                        //Adding elements to the ArrayList.
                        System.out.println("\nAn ArrayList has been created.");
                        System.out.println("Adding elements to the ArrayList:");
                        cars.add("Toyota");
                        cars.add("BMW");
                        cars.add("Ford");
                        cars.add("Mazda");
                        //Iterating the elements in the ArrayList and printing them.
                        for (String s : cars) {
                            System.out.println(s);
                            TimeUnit.SECONDS.sleep(1);
                        }
                        //Updating an element in the ArrayList
                        System.out.println("\nUpdating \"Mazda\" value to \"Mitsubishi\"...");
                        TimeUnit.SECONDS.sleep(1);
                        cars.set(3, "Mitsubishi");
                        for (String s : cars) {
                            System.out.println(s);
                            TimeUnit.SECONDS.sleep(1);
                        }
                        //Deleting some elements from the ArrayList and printing it again.
                        cars.remove(0);
                        System.out.println("\nRemoving the first element in the ArrayList...");
                        for (String s : cars) {
                            System.out.println(s);
                            TimeUnit.SECONDS.sleep(1);
                        }
                        break;

                    case 5:
                        //Vector
                        Vector<String> vec = new Vector<>();    //Vector creation
                        //Adding elements to the Vector.
                        System.out.println("\nA Vector has been created.");
                        System.out.println("Adding elements to the Vector:");
                        vec.addElement("Rat");
                        vec.addElement("Cat");
                        vec.addElement("Dog");
                        vec.addElement("Parrot");
                        for (String s : vec) {
                            System.out.println(s);
                            TimeUnit.SECONDS.sleep(1);
                        }
                        //Deleting some elements from the Vector and printing it again.
                        vec.remove("Rat");
                        System.out.println("\nRemoving the first element in the Vector...");
                        for (String s : vec) {
                            System.out.println(s);
                            TimeUnit.SECONDS.sleep(1);
                        }
                        break;

                    case 6:
                        //LinkedList
                        LinkedList<String> people=new LinkedList<>();   //LinkedList creation
                        System.out.println("\nA LinkedList with the name of your friends has been created.");
                        System.out.println("These are your current friends:");
                        //Adding elements to the LinkedList.
                        people.add("Elmer");
                        people.add("Jorge");
                        people.add("Erika");
                        people.add("Gabriela");
                        //Iterating the elements in the LinkedList and printing them.
                        for (String s : people) {
                            System.out.println(s);
                            TimeUnit.SECONDS.sleep(1);
                        }
                        System.out.println("\nBut you've met some new friends along the way! So let's add them to your friend list:");
                        people.add("Katherine");
                        people.add("Brenda");
                        people.add("Daniel");
                        for (String s : people) {
                            System.out.println(s);
                            TimeUnit.SECONDS.sleep(1);
                        }
                        System.out.println("\nSadly, life takes us different ways, so some of these people aren't your friends anymore...");
                        System.out.println("This is your new friend list:");
                        //Deleting some elements from the LinkedList and printing it again.
                        people.remove("Gabriela");
                        people.remove("Brenda");
                        for (String s : people) {
                            System.out.println(s);
                            TimeUnit.SECONDS.sleep(1);
                        }
                        break;

                    case 7:
                        PriorityQueue<String> games=new PriorityQueue<>(); //PriorityQueue creation
                        //Adding new elements to the PriorityQueue
                        System.out.println("\nA PriorityQueue with your favorite games has been created.");
                        System.out.println("These are your favorite games:");
                        games.add("Xenoblade Chronicles");
                        games.add("The Elder Scrolls V: Skyrim");
                        games.add("Genshin Impact");
                        games.add("Fate/Grand Order");
                        //Iterating the elements in the PriorityQueue and printing them.
                        for (String s : games) {
                            System.out.println(s);
                            TimeUnit.SECONDS.sleep(1);
                        }
                        System.out.println("\nIf you had to erase one game from your memories so you could play it again, which would it be?");
                        System.out.println(games.remove());
                        System.out.println("\nYour wish is my command, so these are your new favorite games:");
                        for (String s : games) {
                            System.out.println(s);
                            TimeUnit.SECONDS.sleep(1);
                        }
                        break;

                    case 8:
                        //HashTable
                        Hashtable<String,String> countries=new Hashtable<>();   //HashTable creation
                        //Adding elements to the HashTable.
                        System.out.println("\nA HashTable has been created.");
                        System.out.println("Adding elements to the HashTable:");
                        countries.put("El Salvador", "San Salvador");
                        countries.put("Japan", "Tokyo");
                        countries.put("United States", "Washington");
                        countries.put("England","London");
                        //Iterating the elements in the HashTable and printing them.
                        for (String i : countries.keySet()) {
                            System.out.println("Key: " + i + ", Value: " + countries.get(i));
                            TimeUnit.SECONDS.sleep(1);
                        }
                        //Deleting some elements from the HashTable and printing it again.
                        countries.remove("United States");
                        countries.remove("England");
                        System.out.println("\nDeleting some elements from the HashTable...");
                        for (String i : countries.keySet()) {
                            System.out.println("Key: " + i + ", Value: " + countries.get(i));
                            TimeUnit.SECONDS.sleep(1);
                        }
                        break;

                    case 9:
                        //HashMap
                        HashMap<Integer, String> programmingLanguages = new HashMap<>(); //HashMap creation.
                        //Adding elements to the HashMap.
                        System.out.println("\nA HashMap has been created.");
                        System.out.println("Adding elements to the HashMap.");
                        programmingLanguages.put(1, "Java");
                        programmingLanguages.put(2, "NodeJS");
                        programmingLanguages.put(3, "PHP");
                        programmingLanguages.put(4, "JavaScript");
                        programmingLanguages.put(5, "JQuery");
                        //Iterating the elements in the HashMap and printing them.
                        for (int i : programmingLanguages.keySet()) {
                            System.out.println("key: " + i + " value: " + programmingLanguages.get(i));
                            TimeUnit.SECONDS.sleep(1);
                        }
                        //Deleting some elements from the HashMap and printing it again.
                        System.out.println("\nDeleting some elements from the HashMap...");
                        programmingLanguages.remove(3);
                        programmingLanguages.remove(5);
                        for (int i : programmingLanguages.keySet()) {
                            System.out.println("key: " + i + " value: " + programmingLanguages.get(i));
                            TimeUnit.SECONDS.sleep(1);
                        }
                        break;

                    case 10:
                        //LinkedHashMap
                        LinkedHashMap<Integer,String> food=new LinkedHashMap<>();     //LinkedHashMap creation.
                        //Adding elements to the LinkedHashMap.
                        System.out.println("\nA LinkedHashMap has been created.");
                        System.out.println("Adding elements to the LinkedHashMap...");
                        food.put(1, "Pizza");
                        food.put(2, "Hamburger");
                        food.put(3, "Sushi");
                        food.put(4, "Fried Chicken");
                        food.put(5, "Ramen");
                        //Iterating the elements in the LinkedHashMap and printing them.
                        for (int i : food.keySet()) {
                            System.out.println("key: " + i + " value: " + food.get(i));
                            TimeUnit.SECONDS.sleep(1);
                        }
                        //Deleting some elements from the LinkedHashMap and printing it again.
                        System.out.println("\nDeleting some elements from the LinkedHashMap...");
                        food.remove(3);
                        food.remove(4);
                        for (int i : food.keySet()) {
                            System.out.println("key: " + i + " value: " + food.get(i));
                            TimeUnit.SECONDS.sleep(1);
                        }
                        break;

                    case 11:
                        //TreeMap
                        TreeMap<Integer,String> familyTree=new TreeMap<>();    //TreeMap creation
                        //Adding elements to the TreeMap.
                        System.out.println("\nA TreeMap has been created.");
                        System.out.println("Adding elements to the TreeMap...");
                        familyTree.put(1, "Grandfather");
                        familyTree.put(2, "Grandmother");
                        familyTree.put(3, "Father");
                        familyTree.put(4, "Mother");
                        familyTree.put(5, "Son");
                        familyTree.put(6, "Daughter");
                        familyTree.put(7, "Uncle");
                        familyTree.put(8, "Aunt");
                        //Iterating the elements in the TreeMap and printing them.
                        for (int i : familyTree.keySet()) {
                            System.out.println("key: " + i + " value: " + familyTree.get(i));
                            TimeUnit.SECONDS.sleep(1);
                        }
                        //Deleting some elements from the TreeMap and printing it again.
                        System.out.println("\nDeleting some elements from the TreeMap...");
                        familyTree.remove(1);
                        familyTree.remove(3);
                        familyTree.remove(5);
                        familyTree.remove(7);
                        for (int i : familyTree.keySet()) {
                            System.out.println("key: " + i + " value: " + familyTree.get(i));
                            TimeUnit.SECONDS.sleep(1);
                        }
                        break;

                    default:
                        b = 0;
                        break;
                }
                if (b == 0) {
                    System.out.println("See you!");
                    break;
                }
                System.out.println("\nDo you wish to do any other demonstration? 1: Yes, 0: No");
                b = myObj.nextInt();
                while (b > 2 || b < 0){
                    System.out.println("\nTry again. Please enter either 1 or 0: ");
                    b = myObj.nextInt();
                }
                System.out.println("See you!");
            }
        } catch (Exception ie){
            Thread.currentThread().interrupt();
            System.out.println("\nInvalid input type! Exiting now...");
        }

    }
}
