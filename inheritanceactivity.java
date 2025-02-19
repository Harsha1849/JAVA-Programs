import java.util.Date;

class LibraryItem {
    String title, author;
    int itemID;

    LibraryItem() {
        title = "Java Programming";
        author = "xxx";
        itemID = 101;
    }

    void displayDetails() {
        System.out.println("Title = " + title);
        System.out.println("Author = " + author);
        System.out.println("ItemID = " + itemID);
    }
}

class Book extends LibraryItem {
    int pages;

    Book() {
        super();
        pages = 500;
    }

    void displayBookDetails() {
        displayDetails();
        System.out.println("No. of Pages = " + pages);
    }
}

class Magazine extends LibraryItem {
    Date issueDate;

    Magazine(Date issue) {
        super(); 
        issueDate = issue;
    }

    void displayMagazineDetails() {
        displayDetails();
        System.out.println("Issue Date = " + issueDate);
    }
}

public class inheritanceactivity {
    public static void main(String args[]) {
        Book b1 = new Book();
        b1.displayBookDetails();

        
        Date issueDate = new Date();
        Magazine m1 = new Magazine(issueDate);
        m1.displayMagazineDetails();
    }
}
