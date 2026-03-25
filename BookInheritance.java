/* Write a program has class Publisher, Book, Literature and Fiction. Read the information
and print the details of books from either the category, using inheritance' */


import java.util.Scanner;

class Publisher {
    String publisherName;

    Publisher(String publisherName) {
        this.publisherName = publisherName;
    }
}

class Book extends Publisher {
    String title;
    String author;

    Book(String publisherName, String title, String author) {
        super(publisherName);
        this.title = title;
        this.author = author;
    }
}

class Literature extends Book {
    Literature(String publisherName, String title, String author) {
        super(publisherName, title, author);
    }

    void display() {
        System.out.println("\n--- Literature Book ---");
        System.out.println("Publisher: " + publisherName);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

class Fiction extends Book {
    Fiction(String publisherName, String title, String author) {
        super(publisherName, title, author);
    }

    void display() {
        System.out.println("\n--- Fiction Book ---");
        System.out.println("Publisher: " + publisherName);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Literature Book Details:");
        System.out.print("Publisher: ");
        String pub1 = sc.nextLine();

        System.out.print("Title: ");
        String title1 = sc.nextLine();

        System.out.print("Author: ");
        String author1 = sc.nextLine();

        Literature l = new Literature(pub1, title1, author1);

        System.out.println("\nEnter Fiction Book Details:");
        System.out.print("Publisher: ");
        String pub2 = sc.nextLine();

        System.out.print("Title: ");
        String title2 = sc.nextLine();

        System.out.print("Author: ");
        String author2 = sc.nextLine();

        Fiction f = new Fiction(pub2, title2, author2);

        l.display();
        f.display();

        sc.close();
    }
}