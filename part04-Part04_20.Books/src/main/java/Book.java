public class Book {
    
    private String title;
    private String page;
    private String year;

    public Book (String bookTitle, String pages, String publicationYear) {
        this.title = bookTitle;
        this.page = pages;
        this.year = publicationYear;
    }

    public String getTitle () {
        return this.title;
    }

    public String getPage () {
        return this.page;
    }

    public String getYear () {
        return this.year;
    }


}
