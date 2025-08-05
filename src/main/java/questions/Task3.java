package questions;

import java.util.HashMap;
import java.util.List;

public class Task3 {

    public static String strTest3Result = "";

    public static void sortProducts(List<HashMap<String, String>> lstProducts, int intPriceThreshold) {
        strTest3Result += "------------ Sorted Item List by Price (High to Low) ------------\r\n";
        while (!lstProducts.isEmpty()) {
            int intMaxIndex = 0;
            int intMaxPrice = Integer.parseInt(lstProducts.get(0).get("Price"));
            for (int i = 1; i < lstProducts.size(); i++) {
                int price = Integer.parseInt(lstProducts.get(i).get("Price"));
                if (price > intMaxPrice) {
                    intMaxPrice = price;
                    intMaxIndex = i;
                }
            }

            HashMap<String, String> mapProducts = lstProducts.remove(intMaxIndex);
            if(intMaxPrice >= intPriceThreshold) { // Bonus question to support filtering products by price threshold
                strTest3Result += mapProducts.get("ProductName") + " | Price: " + mapProducts.get("Price") +
                        " | Category: " + mapProducts.get("Category") + " | InStock: " + mapProducts.get("InStock") + "\r\n";
            }
        }
    }
}
