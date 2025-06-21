import java.util.HashMap;

public class Inventory {
    private HashMap<Integer, Product> products;

    public Inventory() {
        products = new HashMap<>();
    }

    public void addProduct(Product product) {
        products.put(product.getProductId(), product);
    }

    public void updateProduct(int productId, int quantity, double price) {
        Product product = products.get(productId);
        if (product != null) {
            product.setQuantity(quantity);
            product.setPrice(price);
        } else {
            System.out.println("Product not found.");
        }
    }

    public void deleteProduct(int productId) {
        if (products.containsKey(productId)) {
            products.remove(productId);
        } else {
            System.out.println("Product not found.");
        }
    }

    public void showInventory() {
        for (Product product : products.values()) {
            System.out.println(product);
        }
    }
}