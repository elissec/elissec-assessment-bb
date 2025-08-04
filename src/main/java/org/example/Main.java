package org.example;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import com.opencsv.CSVReader;

import static questions.Test1.readCsvData;
import static questions.Test2.printExpensiveProducts;
import static questions.Test3.sortProducts;
import static questions.Test4.printReport;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("\n | ---------- Running Test #1 ---------- |" + "\n");
        List<HashMap<String, String>> lstProducts = readCsvData(); // Test #1
        System.out.println("\n | ---------- Running Test #2 ---------- |" + "\n");
        printExpensiveProducts(lstProducts); // Test #2
        System.out.println("\n | ---------- Running Test #3 ---------- |" + "\n");
        sortProducts(lstProducts); // Test #3
        System.out.println("\n | ---------- Running Test #4 ---------- |" + "\n");
        printReport();
    }
}