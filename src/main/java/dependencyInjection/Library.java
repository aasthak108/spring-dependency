package dependencyInjection;

public class Library {
    private String books;

    public Library(String books) {
        this.books = books;
    }
    public String getName() {
        return books;
    }
    }
