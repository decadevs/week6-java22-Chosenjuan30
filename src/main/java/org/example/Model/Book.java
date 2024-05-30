package org.example.Model;

public record Book(String name,String author,int isbn) {
    @Override
    public String toString(){
        return (name+","+author+","+isbn);
    }
}
