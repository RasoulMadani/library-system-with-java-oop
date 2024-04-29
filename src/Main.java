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

                    Address address = new Address(pro ,townName,streetName,plaque);
                    Member member = new Member(name, id,address);
                    library.addMember(member);
                    System.out.println("member add successfully");

                } else if (entity.equals("book")) {

                }
            } else if (command.equals("barrow")) {
                
            }else if (command.equals("item")){
                
            } else if (command.equals("report")) {
                String entity = scanner.next();
                if (entity.equals("customer")){
                    Member [] members = library.getMembers();
                    for (Member m:members){
                        if(m != null)
                            System.out.println(m.toString());
                    }

                }else if(entity.equals("book")){

                }else if(entity.equals("borrow")){

                }
            }else if(command.equals("remove")){
                int id_request = scanner.nextInt();
                int id_book = scanner.nextInt();
            }else {
                System.out.println("invalid command");
            }
        }
    }
}
