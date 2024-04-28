public class Borrow {
    private int ID;
    private Member m;

    public Borrow(int ID, Member m) {
        this.ID = ID;
        this.m = m;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Member getM() {
        return m;
    }

    public void setM(Member m) {
        this.m = m;
    }
    public void addItem(Book book){

    }
    public void removeItem(Book book){

    }
    public Book[] getItem(){
        return null;
    }
    @Override
    public String toString() {
        return "Borrow{" +
                "ID=" + ID +
                ", m=" + m +
                '}';
    }
}
