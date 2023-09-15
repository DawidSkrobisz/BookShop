package dawidskrobisz.com.BookShop.catalog.domain;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class CatalogService {


    private final CatalogRepository repository;

    public CatalogService(CatalogRepository repository) {
        this.repository = repository;
    }

    public List<Book> findByTitle(String title) {
        return repository.listAll()
                .stream()
                .filter(book -> book.title.startsWith(title))
                .collect(Collectors.toList());
    }
}
