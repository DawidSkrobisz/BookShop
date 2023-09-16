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
    private final String title;
    private final String author;

    @Override
    public void run(String... args) {
        List<Book> books = catalogController.findByTitle(title);
        List<Book> authors = catalogController.findByAuthor(author);

        System.out.println("Książki o tytule zawierającym '" + title + "':");
        books.forEach(book -> System.out.println("Tytuł: " + book.getTitle() + ", Autor: " + book.getAuthor()));

        System.out.println("\nKsiążki autorstwa '" + author + "':");
        authors.forEach(book -> System.out.println("Tytuł: " + book.getTitle() + ", Autor: " + book.getAuthor()));
    }

}