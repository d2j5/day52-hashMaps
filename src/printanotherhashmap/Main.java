package printanotherhashmap;

import java.util.HashMap;



public class Main {
    public static void main(String[] args) {
            // Create a new HashMap and add key-value pairs
            HashMap<String, Book> hashmap = new HashMap<>();
            hashmap.put("sense", new Book("Sense and Sensibility", 1811, "asd"));
            hashmap.put("prejudice", new Book("Pride and prejudice", 1813, "asdf"));

            // Print all the values in the hashmap
            Program.printValues(hashmap);
            System.out.println("---");

            // Print the books whose names contain the string "prejud"
        Program.printValueIfNameContains(hashmap, "prejud");
    }

}
