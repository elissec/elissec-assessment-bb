package questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Test2 {

    public static String strTest2Result = "";

    public static void printExpensiveProducts(List<HashMap<String, String>> lstProducts) {
        try {
            strTest2Result += "------------ Products with Price Greater than 100 and In Stock ------------\r\n";
            for (int i = 0; i < lstProducts.size(); i++) {

                if (lstProducts.get(i).get("InStock").equals("true") && // Get products that are in stock
                        Integer.parseInt(lstProducts.get(i).get("Price")) > 100) { // and if the price is greater than 100
                    // Print relevant products
                    strTest2Result += "Available product: " + lstProducts.get(i).get("ProductName") +
                            " | price: " + lstProducts.get(i).get("Price") + " | category: " + lstProducts.get(i).get("Category") + "\r\n";
                }
            }

            // Group products by category
            HashMap<String, List<HashMap<String, String>>> categoryMap = new HashMap<>();
            for (HashMap<String, String> product : lstProducts) {
                String category = product.get("Category");
                categoryMap.putIfAbsent(category, new ArrayList<>());
                categoryMap.get(category).add(product);
            }

            // Sort categories by the number of products in descending order
            List<String> sortedCategories = new ArrayList<>(categoryMap.keySet());
            for (int i = 0; i < sortedCategories.size() - 1; i++) {
                for (int j = i + 1; j < sortedCategories.size(); j++) {
                    if (categoryMap.get(sortedCategories.get(i)).size() < categoryMap.get(sortedCategories.get(j)).size()) {
                        String temp = sortedCategories.get(i);
                        sortedCategories.set(i, sortedCategories.get(j));
                        sortedCategories.set(j, temp);
                    }
                }
            }

            // Print all products after grouping per category
            for (int i = 0; i < sortedCategories.size(); i++) {
                String category = sortedCategories.get(i);
                List<HashMap<String, String>> products = categoryMap.get(category);
                strTest2Result += "------------ Category: " + category + " (" + products.size() + ") ------------\r\n";
                for (int k = 0; k < products.size(); k++) {
                    HashMap<String, String> product = products.get(k);
                    strTest2Result += "Product " + (k + 1) + ": " +
                            "\n \t ProductName: " + product.get("ProductName") +
                            "\n \t Price: " + product.get("Price") +
                            "\n \t InStock: " + product.get("InStock") + "\r\n";
                }
            }

        } catch (Exception e) {
            System.out.println("An error was encountered while trying to group the products: " + e.getLocalizedMessage());

        }

    }
}
