public class Book {
    private final int BookID;
//    private final long ISBN;
    private  String title;
    private String author;
    private String genre;
    private int publicationYear;
    private double price;
    private int quantityStock;

    public Book(int BookID,String title,String author,String genre
            ,int publicationYear,double price,int quantityStock){
        this.BookID = BookID;
//        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.publicationYear = publicationYear;
        this.price = price;
        this.quantityStock = quantityStock;
    }

    public int getBookID() {
        return BookID;
    }

//    public long getISBN() {
//        return ISBN;
//    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantityStock() {
        return this.quantityStock;
    }

    public void setQuantityStock(int quantityStock) {
        this.quantityStock = quantityStock;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Book{");
        sb.append("BookID=").append(BookID);
        sb.append(", title='").append(title).append('\'');
        sb.append(", author='").append(author).append('\'');
        sb.append(", genre='").append(genre).append('\'');
        sb.append(", publicationYear=").append(publicationYear);
        sb.append(", price=").append(price);
        sb.append(", quantityStock=").append(quantityStock);
        sb.append('}');
        return sb.toString();
    }

}
