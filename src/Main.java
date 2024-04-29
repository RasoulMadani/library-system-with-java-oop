import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library("toplearn");
        while (true) {
            System.out.println("Enter Command : ");
            String command = scanner.next();
            if (command.equals("terminate")) {
                break;
            } else if (command.equals("add")) {
                String entity = scanner.next();
                if (entity.equals("member")) {
                    System.out.println("Enter name :");
                    String name = scanner.next();
                    int id = (int) (Math.random() * 10000 + 1);
                    System.out.println("enter province Name :");
                    String pro = scanner.next();

                    System.out.println("enter town Name :");
                    String townName = scanner.next();

                    System.out.println("enter street name :");
                    String streetName = scanner.next();

                    System.out.println("enter plaque : ");
                    int plaque = scanner.nextInt();

                    Address address = new Address(pro, townName, streetName, plaque);
                    Member member = new Member(name, id, address);
                    library.addMember(member);
                    System.out.println("member add successfully");

                } else if (entity.equals("book")) {
                    int id = (int) (Math.random() * 10000 + 1);
                    System.out.println("Enter name :");
                    String name = scanner.next();

                    System.out.println("Enter number of writers :");
                    int n = scanner.nextInt();
                    Writer[] writers = new Writer[n];
                    for (int i = 0; i < n; i++) {
                        System.out.println("Enter first name :");
                        String first = scanner.next();
                        System.out.println("Enter last name :");
                        String last = scanner.next();

                        writers[i] = new Writer(first, last);
                    }
                    System.out.println("Enter Year : ");
                    int year = scanner.nextInt();
                    Book book = new Book(name, id, writers, year);
                    book.setIs_borrow(false);
                    library.addBook(book);
                    System.out.println("book add successfully ");
                }
            } else if (command.equals("barrow")) {

            } else if (command.equals("item")) {

            } else if (command.equals("report")) {
                String entity = scanner.next();
                if (entity.equals("customer")) {
                    Member[] members = library.getMembers();
                    for (Member m : members) {
                        if (m != null)
                            System.out.println(m.toString());
                    }

                } else if (entity.equals("book")) {
                    Book[] books = library.getExistBook();
                    for (Book b : books) {
                        if (b != null)
                            System.out.println(b.toString());
                    }
                } else if (entity.equals("borrow")) {

                }
            } else if (command.equals("remove")) {
                int id_request = scanner.nextInt();
                int id_book = scanner.nextInt();
            } else {
                System.out.println("invalid command");
            }
        }
    }
}
