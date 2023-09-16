package dawidskrobisz.com.BookShop.catalog.infrastructure;

import dawidskrobisz.com.BookShop.catalog.domain.Book;
import dawidskrobisz.com.BookShop.catalog.domain.CatalogRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
@Repository
class SchoolCatalogRepository implements CatalogRepository {
    private final Map<Long, Book> storage = new ConcurrentHashMap<>();

    public SchoolCatalogRepository() {
        storage.put(1L, new Book(1L, "Ogniem i Mieczem", "Sienkiewicz", 1975));
        storage.put(2L, new Book(1L, "Krzyżacy", "Sienkiewicz", 1970));
        storage.put(3L, new Book(1L, "Pan Tadeusz", "Mickiewicz", 1975));
        storage.put(4L, new Book(1L, "Nad Niemnem", "Orzeszkowa", 1970));
    }

    @Override
    public List<Book> listAll() {
        return new ArrayList<>(storage.values());
    }
}
