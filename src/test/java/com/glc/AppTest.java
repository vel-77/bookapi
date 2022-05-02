package com.glc;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void onFirstCallBookListShouldBeEmpty() {
        // SETUP
        ReadingList cut = new ReadingList();
        //Execute
        List<BookItem> books = cut.getBooks();
        //Assert
        assertEquals(0, books.size());
    }

    @Test
    public void onFirstBookAddedNumberReadShouldReturnOne() {
        //SETUP
        ReadingList cut = new ReadingList();
        Book book = new Book("Harry Potter", "Joan Rowling", 478, 10);//title,author,length,year

        //Execute
        cut.addBook(book, "September 3", 5);

        //ASSERT
        assertEquals(1, cut.numberRead());
    }

    @Test
    public void afterAddingAdditionalBooksNumberReadShouldReturnCorrectNumberOfBooks() {
        //SETUP
        ReadingList cut = new ReadingList();

        Book book1 = new Book("Art of Loving", "Erich Fromm", 133, 4);
        Book book2 = new Book("Art of Loving", "Erich Fromm", 133, 4);
        Book book3 = new Book("Art of Loving", "Erich Fromm", 133, 4);
        Book book4 = new Book("Art of Loving", "Erich Fromm", 133, 4);

        cut.addBook(book1, "January 1", 4);
        cut.addBook(book2, "January 1", 4);
        cut.addBook(book3, "January 1", 4);
        cut.addBook(book4, "January 1", 4);

        //Execute
        int numberOfBooks = cut.numberRead();

        //ASSERT
        assertEquals(4, numberOfBooks);
    }

}
