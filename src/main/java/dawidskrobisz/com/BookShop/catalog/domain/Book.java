package dawidskrobisz.com.BookShop.catalog.domain;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Book {
    Long id;
    String title;
    String author;
    Integer year;
}
