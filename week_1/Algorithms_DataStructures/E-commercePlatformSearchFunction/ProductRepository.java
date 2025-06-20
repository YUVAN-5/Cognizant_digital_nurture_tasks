
import java.util.*;

public class ProductRepository {
    public static List<Product> getAllProducts() {
        return Arrays.asList(
            new Product("Running Shoes", "Footwear", 2999),
            new Product("Formal Shoes", "Footwear", 3999),
            new Product("Leather Wallet", "Accessories", 1599),
            new Product("Smart Watch", "Electronics", 6999),
            new Product("T-Shirt", "Clothing", 999),
            new Product("Wireless Earbuds", "Electronics", 4999)
        );
    }
}
