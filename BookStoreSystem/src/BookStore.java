import java.util.Arrays;

public class BookStore {

    private Book[] books;
    private int currentBook = 0;

    public BookStore(int capacity) {
        if (capacity > 0);
        this.books = new Book[capacity];
    }


    public  boolean addBook(Book newBook) {
        if (newBook == null) return false;
        for (int i = 0; i < books.length; i++) {
            if (  this.books[i] != null  && this.books[i].getTitle().equals(newBook.getTitle())){
                int currentQuantity = this.books[i].getQuantityStock();
                int newQuantity = newBook.getQuantityStock();
                this.books[i].setQuantityStock(currentQuantity + newQuantity);
                return true;
            }
        }
       books[currentBook++] = newBook;
        return true;
    }
    public Book getByTitle(String title) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].getTitle().equals(title)) return books[i];
        }
        return null;
    }

    public Book[] getByAuthor (String author) {
        if (author == null) return null;
        int authorSize = 0;
        Book[] authorList = new Book[100];

        for(int i = 0; i < books.length; i++) {
            if (this.books[i] != null && this.books[i].getAuthor().equals(author)){
                authorList[authorSize] = books[i];
                authorSize++;
            }
        }
        authorList = Arrays.copyOf(authorList, authorSize);
        return authorList;
    }

    public Book[] getByAuthorOld (String author) {
        if (author == null) return null;
        int authorSize = 0;
        int currentIndex = 0;
        Book[] authorList;
        for(int i = 0; i < books.length; i++) {
            if (this.books[i] != null && this.books[i].getAuthor().equals(author)){
                authorSize++;
            }
        }

        authorList = new Book[authorSize];
        for (int i = 0; i < books.length; i++){
            if(this.books[i] != null && this.books[i].getAuthor().equals(author)){
                authorList[currentIndex++] = books[i];
            }
        }
        return authorList;
    }

    public int sellBooks(Book books, int quantity) {

        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i].getBookID() == books.getBookID()){
                int bookInStock = books.getQuantityStock();
                if (bookInStock < quantity) return -1;
                bookInStock -= quantity;
                books.setQuantityStock(bookInStock);
                this.books[i] = books;
                return bookInStock;
            }

        }
        return -1;
    }

    public boolean removeBooks(int id) {
       for (int i = 0; i < this.books.length; i++){
           if (this.books[i].getBookID() == id && this.books[i] != null){
               books[i] = null;
               return true;
           }
       }
       return false;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BookStore{");
        sb.append("books=").append(Arrays.toString(books));
        sb.append('}');
        return sb.toString();
    }
}
