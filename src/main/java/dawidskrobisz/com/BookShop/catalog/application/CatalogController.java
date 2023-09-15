package dawidskrobisz.com.BookShop.catalog.application;

import dawidskrobisz.com.BookShop.catalog.domain.Book;
import dawidskrobisz.com.BookShop.catalog.domain.CatalogService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

import java.util.List;
@Controller
@AllArgsConstructor
public class CatalogController {
    private final CatalogService service;

    public List<Book> findByTitle(String title) {
        return service.findByTitle(title);
    }
}