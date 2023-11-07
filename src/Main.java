public class Main {
    public static Author author(String firstName, String lastName) {
        Author author = new Author();
        author.firstName = firstName;
        author.lastName = lastName;
        return author;
    }

    public Book book(String title, int publicationYear) {
        Book book = new Book();
        book.title = title;
        book.publicationYear = publicationYear;
        return book;
    }

    public static void main(String[] args) {

        Author eSeNiN = new Author("Сергей", "Есенин");
        Book whiteBirch = new Book("Белая берёза", 1914);
    }
}











