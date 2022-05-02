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
        List<Book> books = cut.getBooks();
        //Assert
        assertEquals(0,books.size());
    }

    @Test
    public void onFirstBookAddedNumberReadShouldReturnOne()
    {
        //SETUP
        ReadingList cut = new ReadingList();
        Book book = new Book("Harry Potter","Joan Rowling",478,10);//title,author,length,year

        //Execute
        cut.addBook(book,"September 3", 5);

        //ASSERT
        assertEquals(1, cut.numberRead());
    }
}
