public class Person {
    private final String name;
    private String address;

    public Person(String name) {
        this.name = name;
        this.address = null;
    }

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString(){
        return this.name + "\n\t" + this.address;
    }
}
