package students.ruslan_k.lesson_10.level_3;

import java.util.Optional;

//Interface not functional
//@FunctionalInterface
interface ProductDatabase {

    void save(Product product);

    Optional<Product> findByTitle(String productTitle);
    //Product findByTitle(String productTitle);

}

