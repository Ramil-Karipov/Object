public class Main {

    public static void main(String[] args) {

        Author eSeNiN = new Author("Сергей", "Есенин");
        Book whiteBirch = new Book("Белая берёза", 1914);
        System.out.println("Автор: " + eSeNiN.getLastName() + " " + eSeNiN.getFirstName());
        System.out.println("Произведение: " + whiteBirch.getTitle() + " " + whiteBirch.getPublicationYear());

        Author mayaKovSky = new Author("Владимир", "Маяковский");
        Book listeUp = new Book("Послушайте!", 1913);
        System.out.println("Автор: " + mayaKovSky.getLastName() + " " + mayaKovSky.getFirstName());
        System.out.println("Произведение: " + listeUp.getTitle() + " " + listeUp.getPublicationYear());
        listeUp.setPublicationYear(2023);
        System.out.println("Произведение: " + listeUp.getTitle() + " " + listeUp.getPublicationYear());

    }
}











