package Task2;

public class OnlineStore {
    private Customer[] customers;
    private Product[] products;
    private Order[] orders;
    private int customerCount;
    private int productCount;
    private int orderCount;

    public OnlineStore(int maxCustomers, int maxProducts, int maxOrders) {
        customers = new Customer[maxCustomers];
        products = new Product[maxProducts];
        orders = new Order[maxOrders];
        customerCount = 0;
        productCount = 0;
        orderCount = 0;
    }

    public void addCustomer(Customer customer) {
        if (customerCount < customers.length) {
            customers[customerCount] = customer;
            customerCount++;
        }
    }

    public void addProduct(Product product) {
        if (productCount < products.length) {
            products[productCount] = product;
            productCount++;
        }
    }

    public Order makePurchase(String customerName, String productName, double productPrice, int amount) {
        if (customerName.isEmpty() || productName.isEmpty() || productPrice <= 0 || amount <= 0) {
            throw new IllegalArgumentException("Invalid input data");
        }

        Customer customer = null;
        for (int i = 0; i < customerCount; i++) {
            if (customers[i].getName().equals(customerName)) {
                customer = customers[i];
                break;
            }
        }

        Product product = null;
        for (int i = 0; i < productCount; i++) {
            if (products[i].getName().equals(productName)) {
                product = products[i];
                break;
            }
        }

        if (customer == null || product == null) {
            throw new IllegalArgumentException("Task2.Customer or product not found");
        }

        Order order = new Order(customer, product, amount);
        if (orderCount < orders.length) {
            orders[orderCount] = order;
            orderCount++;
        }

        return order;
    }

    public int getTotalPurchases() {
        return orderCount;
    }
}