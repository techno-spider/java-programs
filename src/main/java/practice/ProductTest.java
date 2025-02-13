package practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProductTest {
    public static void main(String[] args) {

        List<Product> productList = Arrays.asList(new Product("Smartphone", "Electronics", 100),
                                                  new Product("TV", "Electronics", 30),
                                                  new Product("Shampoo", "Personal Care", 200),
                                                  new Product("Conditioner", "Personal Care", 180),
                                                  new Product("Bread", "Groceries", 500),
                                                  new Product("Milk", "Groceries", 300),
                                                  new Product("Car", "Automobile", 170),
                                                  new Product("Laptop", "Electronics", 220));


        Map<String, Integer> collect = productList.stream()
                                                  .collect(Collectors.groupingBy(Product::category,
                                                                                 Collectors.summingInt(Product::stockCount)));

        collect.forEach((p, c) -> System.out.println(p + " : " + c));
    }
}

/*
 * Electronics : 350
 * Personal Care : 380
 * Groceries : 800
 * Automobile : 170
 */
