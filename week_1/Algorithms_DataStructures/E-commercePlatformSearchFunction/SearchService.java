
import java.util.*;
import java.util.stream.Collectors;

public class SearchService {

    public List<Product> search(List<Product> products, String keyword) {
        String word = keyword.toLowerCase();

        // 1. Filter products that contain the keyword
        List<Product> matches = products.stream()
            .filter(p -> p.getName().toLowerCase().contains(word)
                      || p.getCategory().toLowerCase().contains(word))
            .collect(Collectors.toList());

        // 2. Sort by how early the keyword appears in product name
        matches.sort(Comparator.comparingInt(p ->
            p.getName().toLowerCase().indexOf(word)
        ));

        return matches;
    }
}
