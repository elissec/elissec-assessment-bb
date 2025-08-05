package org.example;

import java.util.HashMap;
import java.util.List;

import static questions.Test1.readCsvData;
import static questions.Test2.printExpensiveProducts;
import static questions.Test3.sortProducts;
import static questions.Test4.printReport;

public class Main {
    public static void main(String[] args) throws Exception {
        List<HashMap<String, String>> lstProducts = readCsvData(); // Test #1
        printExpensiveProducts(lstProducts); // Test #2
        sortProducts(lstProducts); // Test #3
        printReport();
    }
}