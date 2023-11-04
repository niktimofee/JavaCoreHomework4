package Task2;

public class Main {
    public static void main(String[] args) {
        OnlineStore store = new OnlineStore(10, 10, 10);

        Customer Alice = new Customer("Alice");
        Product Laptop = new Product("Laptop", 1000.0);

        store.addCustomer(Alice);
        store.addProduct(Laptop);

        try {
            Order order1 = store.makePurchase("Alice", "Laptop", 1000.0, 2);
            Order order2 = store.makePurchase("Bob", "Smartphone", 500.0, 3);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }

        int totalPurchases = store.getTotalPurchases();
        System.out.println("Total purchases made: " + totalPurchases);
    }
}