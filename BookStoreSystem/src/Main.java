import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        testBookStore();
    }
    private static void testBookStore(){
        Book book1 = new Book(1,"Kong","Kong","action",2004,234.12,12);
        Book book2 = new Book(2,"Bomb","Bomb","horror",1998,500.00,5);
        Book book3 = new Book(3,"nine","Bomb","comedy",2023,1000.00,20);

        BookStore books = new BookStore(5);

        books.addBook(book1);
        books.removeBooks(1);
        books.addBook(book2);
        books.addBook(book3);
//        books.sellBooks(book1,2);
        long start = System.currentTimeMillis();
        System.out.println(Arrays.toString(books.getByAuthorOld("Bomb")));
        System.out.println(System.currentTimeMillis() - start + " ms");

        start = System.currentTimeMillis();
        System.out.println(Arrays.toString(books.getByAuthor("Bomb")));
        System.out.println(System.currentTimeMillis() - start + " ms");


    }

}
