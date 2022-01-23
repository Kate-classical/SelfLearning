package by.alexrom.pavel.DZ17.p7.library.model;

import java.util.StringJoiner;

public class Book {
    private String author;
    private String Title;
    private Integer productionYear;

    public Book(String author, String title, Integer productionYear) {
        this.author = author;
        Title = title;
        this.productionYear = productionYear;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return Title;
    }

    public Integer getProductionYear() {
        return productionYear;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Book.class.getSimpleName() + "[", "]")
                .add("author='" + author + "'")
                .add("Title='" + Title + "'")
                .add("productionYear=" + productionYear)
                .toString();
    }
}
