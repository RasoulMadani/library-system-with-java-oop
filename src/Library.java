public class Library {
    private String name;

    public Library(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addMember(Member m){

    }
    public Member[] getMembers(){
        return null;
    }

    public void addBook(Book b){

    }
    public Book[] getExistBook(){
        return null;
    }
    public Book[] getBorrowedBooks(){
        return  null;
    }
    public Book[] getAllBooks(){
        return null;
    }
    public Borrow[] getBorrows(){
        return null;
    }
    public Borrow getBorrow(int id){
        return null;
    }
}
