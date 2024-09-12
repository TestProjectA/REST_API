package com.codeWithAkshay.CRUDrestAPI.Entities;

public class Book {
    private int id;
    private String title;
    private String author;

    public String toString() {
        return "Book{author='" + this.author + "', id=" + this.id + ", title='" + this.title + "'}";
    }

    public Book() {
    }

    public Book(String author, int id, String title) {
        this.author = author;
        this.id = id;
        this.title = title;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
