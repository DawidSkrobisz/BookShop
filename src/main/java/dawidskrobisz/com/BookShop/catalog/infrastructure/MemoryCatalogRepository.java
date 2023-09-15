package dawidskrobisz.com.BookShop.catalog.infrastructure;

import dawidskrobisz.com.BookShop.catalog.domain.Book;
import dawidskrobisz.com.BookShop.catalog.domain.CatalogRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
@Repository
public class MemoryCatalogRepository implements CatalogRepository {
    private final Map<Long, Book> storage = new ConcurrentHashMap<>();

    public MemoryCatalogRepository() {
        storage.put(1L, new Book(1L, "Wladca Pierscieni", "Tolkien", 1975));
        storage.put(2L, new Book(1L, "Hobbit", "Tolkien", 1970));
        storage.put(3L, new Book(1L, "Pieśń Lodu i Ognia", "Martin", 1975));
        storage.put(4L, new Book(1L, "Hobbit 2", "Tolkien", 1970));
    }

    @Override
    public List<Book> listAll() {
        return new ArrayList<>(storage.values());
    }
}
