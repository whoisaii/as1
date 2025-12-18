public class Order {

    private Product product;
    private Shopper shopper;
    public Order(Product product, Shopper shopper) {
        this.product = product;
        this.shopper = shopper;
    }
    public void printInfo() {
        System.out.println("Order info:");
        System.out.println("Product: " + product.getName());
        System.out.println("Shopper: " + shopper.getName());
        System.out.println("Price: " + product.getPrice());
    }
}
