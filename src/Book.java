import java.util.Arrays;

public class Book {
    private String name;
    private int ID,year;
    private Writer[] writers;
    private boolean is_borrow = false;
    public Book(String name, int ID,  Writer[] writers , int year) {
        this.name = name;
        this.ID = ID;
        this.year = year;
        this.writers = writers;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Writer[] getWriters() {
        return writers;
    }

    public void setWriters(Writer[] writers) {
        this.writers = writers;
    }

    public boolean isIs_borrow() {
        return is_borrow;
    }

    public void setIs_borrow(boolean is_borrow) {
        this.is_borrow = is_borrow;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                ", year=" + year +
                ", writers=" + Arrays.toString(writers) +
                ", is_borrow=" + is_borrow +
                '}';
    }
}
