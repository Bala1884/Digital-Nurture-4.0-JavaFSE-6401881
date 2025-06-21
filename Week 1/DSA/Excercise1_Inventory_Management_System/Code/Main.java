public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        Product p1 = new Product(101, "Laptop", 10, 75000.0);
        Product p2 = new Product(102, "Mouse", 50, 500.0);

        inventory.addProduct(p1);
        inventory.addProduct(p2);

        inventory.showInventory();

        inventory.updateProduct(101, 8, 74000.0);
        inventory.deleteProduct(102);

        System.out.println("After update and delete:");
        inventory.showInventory();
    }
}