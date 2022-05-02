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
    public void sonFirstCallBookListShouldBeEmpty() {
        // SETUP
        ReadingList cut = new ReadingList();
        //Execute
        List<Book> books = cut.getBooks();
        //Assert
        assertEquals(0,books.size());
    }
}
