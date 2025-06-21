public class Library {
    public static void linearSearch(Book[] books, String title) {
        for (Book book : books) {
            if (book.title.equalsIgnoreCase(title)) {
                System.out.println("Found: " + book);
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public static void binarySearch(Book[] books, String title) {
        int low = 0, high = books.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = books[mid].title.compareToIgnoreCase(title);
            if (cmp == 0) {
                System.out.println("Found: " + books[mid]);
                return;
            } else if (cmp < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println("Book not found.");
    }
}