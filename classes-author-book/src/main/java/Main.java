public class Main
{
    public static void main(String[] args) {
        Book book = new Book("Война и мир, том 1", new Author("Л. Н. Толстой", "tolstoy1828", 'м'), 1000.0, 1);
        System.out.println(book.toString());
    }
}
