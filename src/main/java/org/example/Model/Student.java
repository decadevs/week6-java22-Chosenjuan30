package org.example.Model;

public class Student extends Person {

    private final String studentId;
    private Book book;


    public Student(String firstName, String lastName, String emailAddress, String studentId) {
        super(firstName, lastName, emailAddress);
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;

    }
    public Book requestBook(Book book){
        this.book = book;
        return this.book;
    }
    @Override
    public String toString(){
        return(getFirstName()+","+getLastName()+","+getStudentId());
    }
}
