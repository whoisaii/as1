public class Shopper {

    private String name;
    public Shopper(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void printInfo() {
        System.out.println("Shopper: " + name);
    }
}
