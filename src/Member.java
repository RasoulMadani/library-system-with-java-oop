public class Member {
    private String name;
    private int ID;
    private Address address;

    public Member(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }

    public Member(String name, int ID, Address address) {
        this.name = name;
        this.ID = ID;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    public int getNumBorrows(){
        return 0;
    }
    public void addBorrow(Borrow borrow){

    }
    public Borrow[] getTotalBorrows(){
        return null;
    }
    public Member getMember(int id){
        return null;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                ", address=" + address +
                '}';
    }
}
