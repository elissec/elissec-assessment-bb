package org.example;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import com.opencsv.CSVReader;

import static questions.Test1.readCsvData;
import static questions.Test2.printExpensiveProducts;
import static questions.Test3.sortProducts;

public class Main {
    public static void main(String[] args) throws IOException {
        String csvFile = System.getProperty("user.dir") + "/src/main/resources/productData.csv";
        System.out.println("| ---------- Running Test #1 ---------- |");
        CSVReader csvProducts = readCsvData(csvFile); // Test #1
        System.out.println("| ---------- Running Test #2 ---------- |");
        List<HashMap<String, String>> lstProducts = printExpensiveProducts(csvProducts); // Test #2
        System.out.println("| ---------- Running Test #3 ---------- |");
        sortProducts(lstProducts); // Test #3
    }
}