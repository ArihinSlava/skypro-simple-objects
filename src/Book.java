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
    }
