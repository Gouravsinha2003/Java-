import java.util.Date;
import java.util.HashMap;
import java.util.Map;

class LibraryItem {
    private String title;
    private int itemId;
    private boolean checkedOut;
    private Date dueDate;

    public LibraryItem(String title, int itemId) {
        this.title = title;
        this.itemId = itemId;
        this.checkedOut = false;
        this.dueDate = null;
    }

    public String getTitle() {
        return title;
    }

    public int getItemId() {
        return itemId;
    }

    public boolean isCheckedOut() {
        return checkedOut;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void checkOut() {
        if (!checkedOut) {
            checkedOut = true;
            // Set due date to 2 weeks from now (for simplicity)
            dueDate = new Date(System.currentTimeMillis() + 14 * 24 * 60 * 60 * 1000);
            System.out.println("Item checked out successfully. Due date: " + dueDate);
        } else {
            System.out.println("Item is already checked out.");
        }
    }

    public void returnItem() {
        if (checkedOut) {
            checkedOut = false;
            dueDate = null;
            System.out.println("Item returned successfully.");
        } else {
            System.out.println("Item is not checked out.");
        }
    }
}

class Book extends LibraryItem {
    private String author;

    public Book(String title, int itemId, String author) {
        super(title, itemId);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}

class DVD extends LibraryItem {
    private String director;

    public DVD(String title, int itemId, String director) {
        super(title, itemId);
        this.director = director;
    }

    public String getDirector() {
        return director;
    }
}

class Journal extends LibraryItem {
    private String publisher;

    public Journal(String title, int itemId, String publisher) {
        super(title, itemId);
        this.publisher = publisher;
    }

    public String getPublisher() {
        return publisher;
    }
}

class LibrarySystem {
    private Map<Integer, LibraryItem> catalog;

    public LibrarySystem() {
        this.catalog = new HashMap<>();
    }

    public void addItem(LibraryItem item) {
        catalog.put(item.getItemId(), item);
    }

    public LibraryItem getItem(int itemId) {
        return catalog.get(itemId);
    }
}

public class LibraryDemo {
    public static void main(String[] args) {
        LibrarySystem librarySystem = new LibrarySystem();

        Book book = new Book("Java Programming", 1, "John Doe");
        DVD dvd = new DVD("The Matrix", 2, "Wachowskis");
        Journal journal = new Journal("Scientific American", 3, "Nature Publishing Group");

        librarySystem.addItem(book);
        librarySystem.addItem(dvd);
        librarySystem.addItem(journal);

        // Check out and return items
        librarySystem.getItem(1).checkOut();
        librarySystem.getItem(2).checkOut();

        librarySystem.getItem(1).returnItem();
        librarySystem.getItem(2).returnItem();
    }
}
