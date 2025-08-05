package runtests;

import java.util.HashMap;
import java.util.List;

import static questions.Task1.readCsvData;
import static questions.Task2.printExpensiveProducts;
import static questions.Task3.sortProducts;
import static questions.Task4.printReport;

public class Main {
    public static void main(String[] args) throws Exception {
        int intPriceThreshold = 0; // Bonus: Price threshold for filtering expensive products
        List<HashMap<String, String>> lstProducts = readCsvData(); // Test #1
        printExpensiveProducts(lstProducts, intPriceThreshold); // Test #2
        sortProducts(lstProducts, intPriceThreshold); // Test #3
        printReport();
    }
}