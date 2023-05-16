package printanotherhashmap;
import java.util.HashMap;


public class Program {
    public static void printValues(HashMap<String, Book> hashmap) {
        // Iterate over the values in the hashmap
        for (Book book : hashmap.values()) {
            // Print the value using the toString method of the Book object
            System.out.println(book);
        }
    }

    public static void printValueIfNameContains(HashMap<String, Book> hashmap, String text) {
        // Iterate over the values in the hashmap
        for (Book book : hashmap.values()) {
            // Check if the name of the book contains the specified text
            if (book.getName().contains(text)) {
                // Print the book
                System.out.println(book);
            }
        }
    }

}
