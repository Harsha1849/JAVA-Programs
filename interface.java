import java.io.*;
import java.util.Date;
import java.util.Scanner;
interface DigitalResource
{
void accessOnline();
}

class EBook implements DigitalResource
{
    accessOnline()
{
system.out.printn("Interface:we can acess book through online");
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
        System.out.println("Writer = " + author);
        System.out.println("ItemID = " + itemID);
    }
}

class Book extends LibraryItem {
    int pages;

    Book() {
        pages = 500;
    }

    void book1() {
        System.out.println("No. of Pages = " + pages);
    }
}

class Magazine extends LibraryItem {
    Date issueDate;

    Magazine(Date issue) {
        issueDate = issue;
    }

    void magazine1() {
        System.out.println("Issue Date = " + issueDate);
    }
}

class Inheritance {
    public static void main(String args[]) {
        Book b1 = new Book();
        b1.LibraryItem1();
        b1.book1();
        magazine m1=new magazine(19/2/2025);
        m1=magazine1
        EBook eb1 = new EBook();
        eb1.accessOnline
    }
}