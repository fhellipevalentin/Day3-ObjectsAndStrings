package EncapsulationAbstraction;

public class program {
    public static void main(String[] args) {
        Book book = new Book("Lord of Rings", new Author("J.R.R.Tolkien", "thebest@lordofrings.com",
                'm'), 52.00, 100);
        System.out.printf("BOOK: %s\nPrice: %.2f\nQuantity in stock: %d\nAuthor: %s\nE-mail: %s\nGender: %c", book.getName(), book.getPrice(), book.getQtyInStock(), book.getAuthor().getName(), book.getAuthor().getEmail(), book.getAuthor().getGender());
    }
}