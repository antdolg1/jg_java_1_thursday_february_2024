package students.ruslan_k.lesson_10.level_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class InMemoryDatabase implements ProductDatabase {

    List<Product> productList = new ArrayList<>();

    @Override
    public void save(Product product) {
        productList.add(product);

    }

    @Override
    public Optional<Product> findByTitle(String productTitle) {
        for (Product prodElement : productList) {
            if (prodElement.getTitle().equals(productTitle)) {
                return Optional.of(prodElement);
            }
        }
        return Optional.empty();
    }

}
