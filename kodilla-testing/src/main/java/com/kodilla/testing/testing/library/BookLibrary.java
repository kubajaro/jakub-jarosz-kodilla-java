package com.kodilla.testing.testing.library;

import java.util.ArrayList;
import java.util.List;

public class BookLibrary {
    private LibraryDatabase libraryDatabase;

    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }

    public List<Book> listBooksWithCondition(String titleFragment){
        List<Book> bookList = new ArrayList<>();
        if(titleFragment.length()<3) return bookList;
        List<Book> result = libraryDatabase.listBooksWithCondition(titleFragment);
        if(result.size()>20) return bookList;
        return result;
    }

    public List<Book> listBooksInHandsOf(LibraryUser libraryUser){
        List<Book> listOfBooks = libraryDatabase.listBooksInHandsOf(libraryUser);
        return listOfBooks;
    }

}
