package dawidskrobisz.com.BookShop;

import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
@AllArgsConstructor
@SpringBootApplication
public class BookShopApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BookShopApplication.class, args);
	}

	private final CatalogService catalogService;

	@Override
	public void run(String... args) {
		List<Book> books = catalogService.findByTitle("Hobbit");
		books.forEach(System.out::println);

	}
}
