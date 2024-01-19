package edu.penzgtu.oop.application;

import edu.penzgtu.oop.application.objects.Order;
import edu.penzgtu.oop.application.objects.Product;

import java.time.LocalDate;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

    public static void main( String[] args ) {
        LocalDate date = LocalDate.of(2020, 1, 1);
        System.out.printf("Result: %.4f", sumPeriod(date));
    }

    private static double sumPeriod(LocalDate date) {
        Set<Order> orders = FillData.generateOrders().stream()
                .filter(x -> x.getOrderDate().getYear() == date.getYear()
                && x.getOrderDate().getMonth() == date.getMonth())
                .collect(Collectors.toSet());

        double sum = 0.0D;
        for (Order o: orders) {
            for (Product product: o.getProducts()) {
                sum += product.getPrice();
            }
        }
        return sum;
    }
}
