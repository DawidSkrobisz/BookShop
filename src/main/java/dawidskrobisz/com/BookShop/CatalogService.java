package dawidskrobisz.com.BookShop;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
@Service
public class CatalogService {
    private final Map<Long, Book> storage = new ConcurrentHashMap<>();

    public CatalogService() {
        storage.put(1L, new Book(1L,"Wladca Pierscieni", "Tolkien",1975));
        storage.put(2L, new Book(1L,"Hobbit", "Tolkien",1970));
        storage.put(3L, new Book(1L,"Pieśń Lodu i Ognia", "Martin",1975));
    }

    List<Book> findByTitle(String title) {
        return storage.values()
                .stream()
                .filter(book -> book.title.startsWith(title))
                .collect(Collectors.toList());

    }
}
