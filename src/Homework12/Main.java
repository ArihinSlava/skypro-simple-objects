package Homework12;

import Homework12.Author;
import Homework12.Book;

public class Main {
    public static void main(String[] args) {
        Author author = new Author("Юваль Ной", "Харари");
        Author author2 = new Author("Фредрик", "Бакман");
        Book book = new Book("Краткая история человечества",author ,2020);
        Book book2 = new Book("Вторая жизнь Уве", author2 ,2022);
        Book book3 = new Book("Вторая жизнь Уве", author2, 2022);
        book.setYearPublisher(2030);
        System.out.println(author.getFirstName() + " " + author.getLastName() + " " + book.getYearPublisher());
        System.out.println(author2.getFirstName() + " "  +  author2.getLastName() + " " + book2.getYearPublisher());
        System.out.println(book);
        System.out.println(author);
        System.out.println(book2.equals(book3));
        System.out.println(book.hashCode() + " " + book2.hashCode() + " " + book3.hashCode());
        System.out.println(author.equals(author2));
        System.out.println(author.hashCode() + " " + author2.hashCode());

    }
}
