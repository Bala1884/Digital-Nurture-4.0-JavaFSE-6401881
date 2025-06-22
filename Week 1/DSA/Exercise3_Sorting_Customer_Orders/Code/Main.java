public class Main {
    public static void main(String[] args) {
        Order[] orders = {
            new Order(1, "Alice", 300.0),
            new Order(2, "Bob", 150.0),
            new Order(3, "Charlie", 450.0)
        };

        SortOrders.quickSort(orders, 0, orders.length - 1);

        System.out.println("Sorted orders by total price (Quick Sort):");
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}