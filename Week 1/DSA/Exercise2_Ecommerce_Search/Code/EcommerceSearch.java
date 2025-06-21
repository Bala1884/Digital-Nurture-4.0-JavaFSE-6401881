import java.util.*;

public class EcommerceSearch {
    public static Product binarySearch(Product[] products, String targetName) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (products[mid].productName.compareToIgnoreCase(targetName) == 0) {
                return products[mid];
            } else if (products[mid].productName.compareToIgnoreCase(targetName) < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return null;
    }

    public static void sortProductsByName(Product[] products) {
        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Product[] products = {
            new Product(101, "Mouse", "Electronics"),
            new Product(102, "Keyboard", "Electronics"),
            new Product(103, "Monitor", "Electronics"),
            new Product(104, "Laptop", "Computers")
        };

        System.out.print("Enter product name to search: ");
        String searchTarget = sc.nextLine();

        System.out.println("\nUsing Linear Search:");
        Product foundLinear = LinearSearch.linearSearch(products, searchTarget);
        if (foundLinear != null) {
            System.out.println("Found: " + foundLinear);
        } else {
            System.out.println("Product not found.");
        }

        sortProductsByName(products);
        System.out.println("\nSorted Products:");
        for (Product p : products) {
            System.out.println(p);
        }

        System.out.println("\nUsing Binary Search:");
        Product foundBinary = binarySearch(products, searchTarget);
        if (foundBinary != null) {
            System.out.println("Found: " + foundBinary);
        } else {
            System.out.println("Product not found.");
        }

        sc.close();
    }
}