package org.example.Service.Implementation;

import org.example.Model.Book;
import org.example.Service.LibrarianService;

import java.util.ArrayList;

public class LibrarianServiceImpl implements LibrarianService {
    private ArrayList<ArrayList<Object>> bookArray = new ArrayList<>();


    public void addBook(Book book, int noOfBooks){
        ArrayList<Object> singleInventory = new ArrayList<>();
        singleInventory.add(book);
        singleInventory.add(noOfBooks);
        bookArray.add(singleInventory);

        System.out.println(bookArray);
    }
    @Override
    public ArrayList<ArrayList<Object>> bookInventory() {
        return null;
    }
}
