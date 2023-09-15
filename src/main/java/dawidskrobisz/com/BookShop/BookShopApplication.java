package dawidskrobisz.com.BookShop;

import dawidskrobisz.com.BookShop.catalog.application.CatalogController;
import dawidskrobisz.com.BookShop.catalog.domain.Book;
import dawidskrobisz.com.BookShop.catalog.domain.CatalogService;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
@AllArgsConstructor
@SpringBootApplication
public class BookShopApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookShopApplication.class, args);
	}
}