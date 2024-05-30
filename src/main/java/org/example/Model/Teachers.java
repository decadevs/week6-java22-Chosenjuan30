package org.example.Model;

public class Teachers extends Person {
    private final String teacherId;
    private Book book;

    public Teachers(String firstName, String lastName, String emailAddress, String teacherId) {
        super(firstName, lastName, emailAddress);
        this.teacherId = teacherId;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public Book requestBook(Book book) {
        this.book = book;
        return this.book;
    }
        @Override
        public String toString () {
            return (getFirstName() + "," + getLastName() + "," + getTeacherId());
        }
    }
