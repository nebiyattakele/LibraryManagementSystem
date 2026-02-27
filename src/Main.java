import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n1.Add 2.Remove 3.Borrow 4.Return 5.List 6.Exit");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Title: ");
                    String title = sc.nextLine();
                    System.out.print("Author: ");
                    String author = sc.nextLine();
                    library.addBook(new Book(title, author));
                    break;
                case 2:
                    System.out.print("Title: ");
                    library.removeBook(sc.nextLine());
                    break;
                case 3:
                    System.out.print("Title: ");
                    library.borrowBook(sc.nextLine());
                    break;
                case 4:
                    System.out.print("Title: ");
                    library.returnBook(sc.nextLine());
                    break;
                case 5:
                    library.listBooks();
                    break;
                case 6:
                    running = false;
                    break;
            }
        }
        sc.close();
    }
}