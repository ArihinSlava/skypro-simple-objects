
public class Main {
    public static void main(String[] args) {
        Author author = new Author("Юваль Ной", "Харари");
        Author author2 = new Author("Фредрик", "Бакман");
        Book book = new Book("Краткая история человечества",author ,2020);
        Book book2 = new Book("Вторая жизнь Уве", author2 ,2022);
        book.setYearPublisher(2030);
        System.out.println(author.getFirstName() + " " + author.getLastName() + " " + book.getYearPublisher());
        System.out.println(author2.getFirstName() + " "  +  author2.getLastName() + " " + book2.getYearPublisher());
    }
}
