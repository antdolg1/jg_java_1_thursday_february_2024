package students.ruslan_k.lesson_10.level_3;

import java.util.Optional;

public class ProductDatabaseDemo {
    public static void main(String[] args) {
        InMemoryDatabase stock = new InMemoryDatabase();
        Product[] assortment = {new Product("Fish"), new Product("Meat"),
                new Product("Water"), new Product("Wine")};

        for (Product assortElement : assortment) {
            stock.save(assortElement);
        }

        Optional<Product> result;
        String title = "Fish";
        result = stock.findByTitle(title);
        isProductWasFound(result, title);
        title = "Meat";
        result = stock.findByTitle(title);
        isProductWasFound(result, title);
        title = "Chicken";
        result = stock.findByTitle(title);
        isProductWasFound(result, title);
        title = "Water";
        result = stock.findByTitle(title);
        isProductWasFound(result, title);
        title = "Wine";
        result = stock.findByTitle(title);
        isProductWasFound(result, title);

    }

    static void isProductWasFound(Optional<Product> result, String title) {
        if (result.isPresent()) {
            System.out.println("Product with title \"" + result.get().getTitle() + "\" is present");
        } else {
            System.out.println("Product with title \"" + title + "\" is absent");
        }
    }
}

