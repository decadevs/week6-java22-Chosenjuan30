package org.example.Service;

import org.example.Model.Book;
import org.example.Model.Student;
import org.example.Model.Teachers;
import org.example.Service.Implementation.LibrarianServiceImpl;

public class SchoolLibrarySystem {
    public static void main(String[] args) {
        Book book = new Book("name","author",290);
        Student student = new Student("John","Agene","John@yahoo","Jnr346145");
        Teachers teacher = new Teachers("Ebuka","Agbo","Sunnybobo@ymail","Tch15420");

        LibrarianServiceImpl librarianService = new LibrarianServiceImpl();
        librarianService.addBook(book,15);

        System.out.println(student);
        System.out.println(book);
        System.out.println(teacher);
    }
}