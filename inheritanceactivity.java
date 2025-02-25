interface DigitalResource {
    int a = 20;
    void accessOnline();
}

class EBook implements DigitalResource {
    public void accessOnline() {
        System.out.println(a);
        System.out.println("Interface: We can access book through Online");
    }
}

class LibraryItem {
    String title, author;
    int itemID;
    
    LibraryItem() {
        title = "Java Programming";
        author = "xxx";
        itemID = 101;
    }
    
    void LibraryItem1() {
        System.out.println("Title = " + title);
        System.out.println("Author = " + author);
        System.out.println("Item ID = " + itemID);
    }
}

class Book extends LibraryItem {
    int pages;
    
    Book() {
        pages = 500;
    }
    
    void Book1() {
        System.out.println("No. of Pages = " + pages);
    }
}

class Magazine extends LibraryItem {
    String issueDate;
    
    Magazine(String issue) {
        issueDate = issue;
    }
    
    void Magazine1() {
        System.out.println("Issue Date = " + issueDate);
    }
}

class inheritanceactivity {
    public static void main(String args[]) {
        Book b1 = new Book();
        b1.LibraryItem1();
        b1.Book1();
        
        Magazine m1 = new Magazine("19/2/2025");
        m1.Magazine1();
        
        EBook eb1 = new EBook();
        eb1.accessOnline();
    }
}