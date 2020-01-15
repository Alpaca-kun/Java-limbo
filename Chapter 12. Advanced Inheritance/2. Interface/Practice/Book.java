/**
 * Book
 */
public class Book extends TangibleAsset {
    /*
    private String name;
    private int price;
    private String color;
    */
    private String isbn;

    public Book (String name, int price, String color, String isbn) {
        /*
        this.name = name;
        this.price = price;
        this.color = color;
        */
        super(name, price, color);
        this.isbn = isbn;
    }

    /*
    public String getName() { return this.name; }
    public int getPrice() { return this.price; }
    public String getColor() { return this.color; }
    */
    public String getISBN() { return this.isbn; }
}