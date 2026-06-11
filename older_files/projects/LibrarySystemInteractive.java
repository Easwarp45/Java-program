import java.util.Scanner;
class Author {
    String name;
    String biography;
    Author(String name, String biography) {
        this.name = name;
        this.biography = biography;
    }
    void displayInfo() {
        System.out.println("📘 Author: " + name + " | Bio: " + biography);
    }
}
class Book {
    String title;
    Author author;
    boolean isBorrowed;

    Book(String title, Author author) {
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }
    void displayInfo() {
        String status = isBorrowed ? "Borrowed ❌" : "Available ✅";
        System.out.println("📗 Title: " + title + " | Author: " + author.name + " | " + status);
    }
}
class User {
    String name;
    int id;
    Book[] borrowedBooks;
    int borrowedCount;

    User(String name, int id, int limit) {
        this.name = name;
        this.id = id;
        this.borrowedBooks = new Book[limit];
        this.borrowedCount = 0;
    }

    boolean borrowBook(Book book) {
        if (borrowedCount < borrowedBooks.length && !book.isBorrowed) {
            borrowedBooks[borrowedCount++] = book;
            book.isBorrowed = true;
            System.out.println("✅ '" + book.title + "' has been borrowed by " + name + ".");
            return true;
        }
        System.out.println("⚠️ Unable to borrow. Book might be already borrowed or limit exceeded.");
        return false;
    }
    boolean returnBook(Book book) {
        for (int i = 0; i < borrowedCount; i++) {
            if (borrowedBooks[i] == book) {
                book.isBorrowed = false;
                borrowedBooks[i] = borrowedBooks[--borrowedCount];
                System.out.println("✅ '" + book.title + "' has been returned by " + name + ".");
                return true;
            }
        }
        System.out.println("⚠️ That book isn't in your borrowed list.");
        return false;
    }

    void displayBorrowedBooks() {
        System.out.println("\n📚 " + name + "'s Borrowed Books:");
        if (borrowedCount == 0) {
            System.out.println("  (No books borrowed)");
        } else {
            for (int i = 0; i < borrowedCount; i++) {
                System.out.println("  • " + borrowedBooks[i].title);
            }
        }
    }
}

class RegularUser extends User {
    RegularUser(String name, int id) {
        super(name, id, 2);
    }
}

class PremiumUser extends User {
    PremiumUser(String name, int id) {
        super(name, id, 5);
    }
}
public class LibrarySystemInteractive {
    static Scanner sc = new Scanner(System.in);
    static Author[] authors = new Author[10];
    static Book[] books = new Book[20];
    static User[] users = new User[10];
    static int authorCount = 0, bookCount = 0, userCount = 0;
    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n======================");
            System.out.println("📖 Welcome to Library Menu");
            System.out.println("======================");
            System.out.println("1️⃣ Add an Author");
            System.out.println("2️⃣ Add a Book");
            System.out.println("3️⃣ Register New User");
            System.out.println("4️⃣ View All Authors");
            System.out.println("5️⃣ View All Books");
            System.out.println("6️⃣ Borrow a Book");
            System.out.println("7️⃣ Return a Book");
            System.out.println("8️⃣ Borrowed Books Report");
            System.out.println("0️⃣ Exit System");
            System.out.print("👉 Your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1 -> addAuthor();
                case 2 -> addBook();
                case 3 -> registerUser();
                case 4 -> displayAllAuthors();
                case 5 -> displayAllBooks();
                case 6 -> borrowBook();
                case 7 -> returnBook();
                case 8 -> generateReport();
                case 0 -> System.out.println("👋 Exiting Library System. See you next time!");
                default -> System.out.println("⚠️ That option doesn't exist. Please try again.");
            }
        } while (choice != 0);
    }
    static void addAuthor() {
        System.out.print("\n🖊️ Enter author's full name: ");
        String name = sc.nextLine();
        System.out.print("📝 Enter a short biography: ");
        String bio = sc.nextLine();

        if (authorCount < authors.length) {
            authors[authorCount++] = new Author(name, bio);
            System.out.println("✅ Author added successfully.");
        } else {
            System.out.println("⚠️ Cannot add more authors. List is full.");
        }
    }
    static void addBook() {
        if (authorCount == 0) {
            System.out.println("⚠️ Please add authors before adding books.");
            return;
        }
        System.out.print("\n📖 Enter the book title: ");
        String title = sc.nextLine();
        System.out.println("👤 Choose the author for this book:");
        for (int i = 0; i < authorCount; i++) {
            System.out.println("[" + i + "] " + authors[i].name);
        }
        System.out.print("🔢 Your choice: ");
        int index = sc.nextInt();
        sc.nextLine();
        if (bookCount < books.length && index >= 0 && index < authorCount) {
            books[bookCount++] = new Book(title, authors[index]);
            System.out.println("✅ Book added to the collection.");
        } else {
            System.out.println("⚠️ Invalid selection or book list is full.");
        }
    }
    static void registerUser() {
        System.out.print("\n🙋 Enter user name: ");
        String name = sc.nextLine();
        System.out.print("🆔 Enter user ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("✨ Choose user type (1 = Regular, 2 = Premium): ");
        int type = sc.nextInt();
        sc.nextLine();
        if (userCount < users.length) {
            if (type == 1) {
                users[userCount++] = new RegularUser(name, id);
                System.out.println("✅ Regular user registered.");
            } else if (type == 2) {
                users[userCount++] = new PremiumUser(name, id);
                System.out.println("✅ Premium user registered.");
            } else {
                System.out.println("⚠️ Invalid user type.");
            }
        } else {
            System.out.println("⚠️ User limit reached. Cannot register more.");
        }
    }
    static void displayAllAuthors() {
        System.out.println("\n📘 All Registered Authors:");
        for (int i = 0; i < authorCount; i++) authors[i].displayInfo();
    }
    static void displayAllBooks() {
        System.out.println("\n📗 Library Book Collection:");
        for (int i = 0; i < bookCount; i++) books[i].displayInfo();
    }
    static void borrowBook() {
        if (bookCount == 0 || userCount == 0) {
            System.out.println("⚠️ Make sure there are users and books before borrowing.");
            return;
        }
        User user = selectUser();
        Book book = selectBook();

        if (user != null && book != null) user.borrowBook(book);
    }
    static void returnBook() {
        User user = selectUser();
        Book book = selectBook();
        if (user != null && book != null) user.returnBook(book);
    }

    static void generateReport() {
        System.out.println("\n📊 Borrowed Books Summary:");
        for (int i = 0; i < userCount; i++) {
            users[i].displayBorrowedBooks();
        }
    }
    static User selectUser() {
        System.out.println("\n👤 Select a user:");
        for (int i = 0; i < userCount; i++) {
            System.out.println("[" + i + "] " + users[i].name);
        }
        System.out.print("🔢 Enter index: ");
        int index = sc.nextInt();
        sc.nextLine();
        if (index >= 0 && index < userCount) return users[index];
        System.out.println("⚠️ Invalid user selection.");
        return null;
    }
    static Book selectBook() {
        System.out.println("\n📖 Select a book:");
        for (int i = 0; i < bookCount; i++) {
            System.out.print("[" + i + "] ");
            books[i].displayInfo();
        }
        System.out.print("🔢 Enter index: ");
        int index = sc.nextInt();
        sc.nextLine();
        if (index >= 0 && index < bookCount) return books[index];
        System.out.println("⚠️ Invalid book selection.");
        return null;
    }
}