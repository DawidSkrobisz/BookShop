package dawidskrobisz.com.BookShop.catalog.domain;

import java.util.List;

public interface CatalogRepository {
    List<Book> listAll();
}
