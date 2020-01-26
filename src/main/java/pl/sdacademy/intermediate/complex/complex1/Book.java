package pl.sdacademy.intermediate.complex.complex1;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.util.List;
import java.util.Objects;
import java.util.UUID;

/**
 * @author Piotr Zietek
 */
@Builder
@ToString
@Getter
class Book {

    @Builder.Default
    private UUID id = UUID.randomUUID();
    @Builder.Default
    int amount = 3;
    private String title;
    private String author;
    private int yearPushlished;
    private int numberOfPages;
    private double price;
    Genre genre;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id.equals(book.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    BookShortInfo toBookShortInfo() {
        return BookShortInfo.builder()
                .title(this.title)
                .author(this.author)
                .yearPushlished (this.yearPushlished)
                .build();
    }

}
