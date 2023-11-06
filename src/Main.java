
public class Main {
    public static Boot createComposition(String name, String author, int year) {
        Boot book = new Boot();
        book.name = name;
        book.author = author;
        book.year = year;
        return book;
    }

    public static void main(String[] args) {
        Boot composition = createComposition("Белая берёза", "Сергей Есенин", 1913);
        System.out.println("Стихотворение: " + composition.name);
        System.out.println("Автор : " + composition.author);
        System.out.println("Год : " + composition.year);
    }
}








