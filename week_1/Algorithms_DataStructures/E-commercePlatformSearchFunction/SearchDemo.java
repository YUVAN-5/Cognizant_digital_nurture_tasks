
import java.util.*;

public class SearchDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Product> products = ProductRepository.getAllProducts();
        SearchService service = new SearchService();

        System.out.print("Enter search keyword: ");
        String keyword = sc.nextLine();

        List<Product> results = service.search(products, keyword);

        System.out.println("\n🔍 Search Results:");
        if (results.isEmpty()) {
            System.out.println("No matching products found.");
        } else {
            for (Product product : results) {
                System.out.println("- " + product);
            }
        }
        
    }
}
