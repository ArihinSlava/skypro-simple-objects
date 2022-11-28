package Homework12;

import Homework12.Author;

import java.util.Objects;

public class Book {
    private final String name;
    private final Author authorName;
    private int yearPublisher;


    public Book(String name, Author authorName, int yearPublisher) {
        this.name = name;
        this.authorName = authorName;
        this.yearPublisher = yearPublisher;
    }

    public String getName() {
        return this.name;
    }

    public Author getAuthorName() {
        return this.authorName;
    }

    public int getYearPublisher() {
        return this.yearPublisher;
    }

    public void setYearPublisher(int yearPublisher) {
        this.yearPublisher = yearPublisher;
    }

    @Override
    public String toString() {
        return String.format("%s, '%s', %d", name, authorName, yearPublisher);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book3 = (Book) o;
        return yearPublisher == book3.yearPublisher && Objects.equals(name, book3.name) && Objects.equals(authorName, book3.authorName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, authorName, yearPublisher);
    }
}

