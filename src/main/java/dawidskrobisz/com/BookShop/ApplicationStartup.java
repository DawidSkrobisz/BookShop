package dawidskrobisz.com.BookShop;

import dawidskrobisz.com.BookShop.catalog.application.CatalogController;
import dawidskrobisz.com.BookShop.catalog.domain.Book;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@AllArgsConstructor
public class ApplicationStartup implements CommandLineRunner {

    private final CatalogController catalogController;

    @Override
    public void run(String... args) {
        List<Book> books = catalogController.findByTitle("Hobbit");
        books.forEach(System.out::println);

    }
}