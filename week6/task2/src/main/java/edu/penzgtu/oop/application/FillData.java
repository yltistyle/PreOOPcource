package edu.penzgtu.oop.application;

import edu.penzgtu.oop.application.objects.*;

import java.time.LocalDate;
import java.util.*;

public class FillData {
    public static Set<Order> generateOrders() {
        Set<Order> orders = new HashSet<>();
        Map<Integer, Product> productMap = generateProducts();
        ArrayList<Customer> customers = generateCustomers();

        orders.add(fillOrder(LocalDate.of(2019, 12, 13), customers.get(0), 12L, "valid",
                LocalDate.of(2019, 12, 16), randomProducts(productMap, 3)));

        orders.add(fillOrder(LocalDate.of(2020, 1, 1), customers.get(1), 13L, "valid",
                LocalDate.of(2020, 1, 4), randomProducts(productMap, 5)));

        orders.add(fillOrder(LocalDate.of(2020, 1, 2), customers.get(2), 14L, "valid",
                LocalDate.of(2020, 1, 6), randomProducts(productMap, 8)));

        orders.add(fillOrder(LocalDate.of(2020, 1, 22), customers.get(3), 15L, "valid",
                LocalDate.of(2020, 1, 27), randomProducts(productMap, 9)));

        return orders;
    }
    private static Map<Integer, Product> generateProducts() {
        Map<Integer, Product> products = new HashMap<>();
        products.put(0, fillProduct("Alcohol", "Bear Heineken", 0.72D, 1));
        products.put(1, fillProduct("Alcohol", "Wine Martini", 21D, 2));

        products.put(2, fillProduct("For children", "diapers", 15D, 3));
        products.put(3, fillProduct("For children", "Nutrilak milk mixture", 5D, 4));

        products.put(4, fillProduct("Sport", "Football ball", 24.99D, 5));
        products.put(5, fillProduct("Sport", "Tennis racket", 21.99D, 6));
        products.put(6, fillProduct("Sport", "Baseball bat", 32.17D, 7));
        products.put(7, fillProduct("Sport", "Sports skiing", 60.34D, 8));

        products.put(8, fillProduct("Kitchen", "Kitchen knife", 19.99D, 9));
        products.put(9, fillProduct("Kitchen", "Set of plates", 15.5D, 10));
        products.put(10, fillProduct("Kitchen", "Set of plates", 0.99D, 11));
        return products;
    }

    private static Set<Product> randomProducts(Map<Integer, Product> products, int n) {
        Set<Product> productSet = new HashSet<>();
        int length = products.size()-1;
        Random r = new Random();
        while (productSet.size() <= n) {
            int value = r.nextInt(length);
            if (productSet.contains(products.get(value))) {
            } else {
                productSet.add(products.get(value));
            }
        }
        return productSet;
    }


    private static ArrayList<Customer> generateCustomers() {
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(fillCustomer(1L, 1, "Nikolay"));
        customers.add(fillCustomer(2L, 2, "Gennadiy"));
        customers.add(fillCustomer(3L, 3, "Aleksey"));
        customers.add(fillCustomer(4L, 4, "Ivan"));
        return customers;
    }

    private static Order fillOrder(LocalDate date, Customer customer, Long id, String status,
                                   LocalDate deliveryDate, Set<Product> products) {
        Order order = new Order();
        order.setOrderDate(date);
        order.setCustomer(customer);
        order.setId(id);
        order.setStatus(status);
        order.setDeliveryDate(deliveryDate);
        order.setProducts(products);
        return order;
    }

    private static Product fillProduct(String category, String name, double price, long id) {
        Product product = new Product();
        product.setCategory(category);
        product.setId(id);
        product.setName(name);
        product.setPrice(price);
        return product;
    }
    private static Customer fillCustomer(long id, int tier, String name) {
        Customer user = new Customer();
        user.setId(id);
        user.setName(name);
        user.setTier(tier);
        return user;
    }
}
