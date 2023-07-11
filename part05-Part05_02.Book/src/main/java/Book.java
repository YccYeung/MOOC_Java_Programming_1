public class Book {
    
    private String author;
    private String bookName;
    private int bookPages;

    public Book (String author, String name, int pages) {
        this.author = author;
        this.bookName = name;
        this.bookPages = pages;
    }

    public String getAuthor () {
        return this.author;
    }

    public String getName() {
        return this.bookName;
    }

    public int getPages() {
        return this.bookPages;
    }

    public String toString () {
        return this.author + ", " + this.bookName + ", " + this.bookPages + " pages";
    }

}
