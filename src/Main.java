import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter Command : ");
            String command = scanner.next();
            if (command.equals("terminate")) {
                break;
            } else if (command.equals("add")) {
                String entity = scanner.next();
                if (entity.equals("member")) {

                } else if (entity.equals("book")) {

                }
            } else if (command.equals("barrow")) {
                
            }else if (command.equals("item")){
                
            } else if (command.equals("report")) {
                String entity = scanner.next();
                if (entity.equals("customer")){

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
