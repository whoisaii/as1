public class Main {
    public static void main(String[] args) {
        Product product1 =new Product("Laptop", 450000);
        Product product2 =new Product("Phone", 250000);
        Shopper shopper =new Shopper("Aruzhan");
        Order order =new Order(product1,shopper);
        product1.printInfo();
        product2.printInfo();
        shopper.printInfo();
        order.printInfo();
        if (product1.getPrice()>product2.getPrice()) {
            System.out.println("Laptop is more expensive than Phone");
        } else {
            System.out.println("Phone is more expensive than Laptop");
        }
    }
}
