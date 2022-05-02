package com.glc;

import java.util.ArrayList;
import java.util.List;

public class ReadingList {

    List<BookItem> readBooksList = new ArrayList<>();


    public ReadingList(){

    }

    public List<Book> getBooks()
    {
        return new ArrayList<>();
    }

    public void addBook(Book book, String dateRead,int rating){
        this.readBooksList.add(new BookItem(book,dateRead,rating));
    }

    public int numberRead() {
     return this.readBooksList.size();
    }
}
