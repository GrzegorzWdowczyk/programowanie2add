package pl.sdacademy.intermediate.basic8;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.List;

public class BookStoreTest {
    private static final int NUMBER_OF_BOOK_AFTER_RUN = 36;
    private static final int NUMBER_OF_COBEN_BOOKS = 11;
    private static BookStore bookStore;
    private String harlan_coben = "Harlan Coben";

    @BeforeClass
    public static void setUpClass() {
        bookStore = new BookStore();
    }

    @Test
    public void testBookstoreInitialaizer () {
        Assert.assertEquals(NUMBER_OF_BOOK_AFTER_RUN,bookStore.getBooks().size());
    }

    @Test
    public void findBooksByTitle () {

        Book longLostBook = Book.builder()
                .title("Long Lost")
                .author("Harlan Coben")
                .yearPushlished(2009)
                .numberOfPages(195)
                .price(44.99)
                .genre(Genre.CRIME_STORY)
                .build();
        List<Book> booksByTitle = bookStore.findBooksByTitle("Long Lost");
        Assert.assertEquals(1,booksByTitle.size());
        Assert.assertEquals(longLostBook, booksByTitle.get(0));

    }

    @Test
    public void testfindBooksByAuthor () {
        harlan_coben = "Harlan Coben";
        List<Book> cobenBooks = bookStore.findBooksByAuthor(harlan_coben);
        Assert.assertEquals(NUMBER_OF_COBEN_BOOKS,cobenBooks.size());
        Assert.assertTrue(cobenBooks.stream()
            .allMatch(book -> book.getAuthor().equals(harlan_coben)));

    }

    @Test
    public void findBooksByYear () {
        int year = 1999;
        List<Book> booksByYear = bookStore.findBooksByYear(year);
        int expectedBooks = 3;
        Assert.assertEquals(expectedBooks, booksByYear.size());
        Assert.assertTrue(booksByYear.stream()
            .allMatch(book -> book.getYearPushlished() == year)
        );
    }

    @Test
    public void findBooksByNumberOfPages () {
        int pages = 384;
        List<Book> booksByPages = bookStore.findBooksByNumberOfPages(pages);
        int expectedBooks = 2;
        Assert.assertEquals(expectedBooks, booksByPages.size());
        Assert.assertTrue(booksByPages.stream()
                .allMatch(book -> book.getNumberOfPages() == pages)
        );
    }

    @Test
    public void findBooksByPrice () {
        double price = 44.99;
        List<Book> booksByPrice = bookStore.findBooksByPrice(price);
        double expectedPrice  =  44.99;
        Assert.assertTrue(booksByPrice.stream()
                .allMatch(book -> BigDecimal.valueOf(book.getPrice()).equals(BigDecimal.valueOf(price)))

        );
    }

    @Test
    public void findBooksByGenre () {
        Genre genre = Genre.FANTASY;
        List<Book> booksByPages = bookStore.findBooksByGenre(genre);
        int expectedGenre = 15;
        Assert.assertEquals(expectedGenre, booksByPages.size());
        Assert.assertTrue(booksByPages.stream()
                .allMatch(book -> book.getGenre() == genre)
        );
    }


}
