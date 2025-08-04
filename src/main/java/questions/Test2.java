package questions;

import com.opencsv.CSVReader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Test2 {
    public static void printExpensiveProducts(List<HashMap<String, String>> lstProducts) {
        try {
            List<HashMap<String, String>> lstCategoryHome = new ArrayList<>();
            List<HashMap<String, String>> lstCategoryElectronic = new ArrayList<>();
            List<HashMap<String, String>> lstCategoryFurniture = new ArrayList<>();
            int intHomeCount = 0;
            int intElectronicsCount = 0;
            int intFurnitureCount = 0;

            System.out.println("------------ Products with Price Greater than 100 and In Stock ------------");
            for (int i = 0; i < lstProducts.size(); i++) {

                if (lstProducts.get(i).get("InStock").equals("true") && // Get products that are in stock
                        Integer.parseInt(lstProducts.get(i).get("Price")) > 100) { // and if the price is greater than 100
                    // Print relevant products
                    System.out.println("Available product: " + lstProducts.get(i).get("ProductName") +
                            " | price: " + lstProducts.get(i).get("Price") + " | category: " + lstProducts.get(i).get("Category"));
                }
            }

            for (HashMap<String, String> lstProduct : lstProducts) {

                switch (lstProduct.get("Category")) {
                    case "Electronics":
                        intElectronicsCount++;
                        lstCategoryElectronic.add(new HashMap<>(lstProduct));
                        break;
                    case "Home":
                        intHomeCount++;
                        lstCategoryHome.add(new HashMap<>(lstProduct));
                        break;
                    case "Furniture":
                        intFurnitureCount++;
                        lstCategoryFurniture.add(new HashMap<>(lstProduct));
                        break;
                }
            }



            System.out.println();
            System.out.println("------------ Electronics Category Available: " + intElectronicsCount + " ------------");
            for (int i = 0; i < lstCategoryElectronic.size(); i++) {
                System.out.println("Electronics Category Product " + (i + 1) + ": " +
                        "\n \t ProductName: " + lstCategoryElectronic.get(i).get("ProductName") +
                        "\n \t Price: " + lstCategoryElectronic.get(i).get("Price") +
                        "\n \t InStock: " + lstCategoryElectronic.get(i).get("InStock"));
            }

            System.out.println("------------ Home Category Available: " + intHomeCount + " ------------");
            for (int i = 0; i < lstCategoryHome.size(); i++) {
                System.out.println("Home Category Product " + (i + 1) + ": " +
                        "\n \t ProductName: " + lstCategoryHome.get(i).get("ProductName") +
                        "\n \t Price: " + lstCategoryHome.get(i).get("Price") +
                        "\n \t InStock: " + lstCategoryHome.get(i).get("InStock"));
            }

            System.out.println("------------ Furniture Category Available: " + intFurnitureCount + " ------------");
            for (int i = 0; i < lstCategoryFurniture.size(); i++) {
                System.out.println("Furniture Category Product " + (i + 1) + ": " +
                        "\n \t ProductName: " + lstCategoryFurniture.get(i).get("ProductName") +
                        "\n \t Price: " + lstCategoryFurniture.get(i).get("Price") +
                        "\n \t InStock: " + lstCategoryFurniture.get(i).get("InStock"));
            }

        } catch (Exception e) {
            System.out.println("An error was encountered while trying to group the products: " + e.getLocalizedMessage());

        }

    }
}
