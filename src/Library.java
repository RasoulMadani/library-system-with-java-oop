public class Library {
    static MyArrayList members = new MyArrayList();
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
        members.add(m);
    }
    public Member[] getMembers(){
        Member[] mem = new Member[members.data.length];
        for (int i = 0; i < members.data.length; i++) {
            try {
                if (members.get(i) != null)
                    mem[i] = (Member) members.get(i);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        return mem;
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
