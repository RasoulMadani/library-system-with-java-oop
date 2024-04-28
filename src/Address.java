public class Address {
    private String provinceName, townName, streetName;
    private int plaque;

    public Address(String provinceName, String townName, String streetName, int plaque) {
        this.provinceName = provinceName;
        this.townName = townName;
        this.streetName = streetName;
        this.plaque = plaque;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getTownName() {
        return townName;
    }

    public void setTownName(String townName) {
        this.townName = townName;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public int getPlaque() {
        return plaque;
    }

    public void setPlaque(int plaque) {
        this.plaque = plaque;
    }

    @Override
    public String toString() {
        return "Address{" +
                "provinceName='" + provinceName + '\'' +
                ", townName='" + townName + '\'' +
                ", streetName='" + streetName + '\'' +
                ", plaque=" + plaque +
                '}';
    }
}
