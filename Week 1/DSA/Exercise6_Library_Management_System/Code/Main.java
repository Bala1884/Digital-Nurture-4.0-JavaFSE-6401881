import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Book[] books = {
            new Book(1, "Java", "James"),
            new Book(2, "C++", "Bjarne"),
            new Book(3, "Python", "Guido")
        };

        System.out.println("Linear search:");
        Library.linearSearch(books, "Python");

        Arrays.sort(books, Comparator.comparing(b -> b.title));
        System.out.println("Binary search:");
        Library.binarySearch(books, "C++");
    }
}