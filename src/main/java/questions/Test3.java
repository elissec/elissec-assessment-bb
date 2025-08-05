package questions;

import java.util.HashMap;
import java.util.List;

public class Test3 {

    public static String strTest3Result = "";

    public static void sortProducts(List<HashMap<String, String>> lstProducts) {
        strTest3Result += "------------ Sorted Item List by Price (High to Low) ------------\r\n";
        while (!lstProducts.isEmpty()) {
            int maxIdx = 0;
            int maxPrice = Integer.parseInt(lstProducts.get(0).get("Price"));
            for (int i = 1; i < lstProducts.size(); i++) {
                int price = Integer.parseInt(lstProducts.get(i).get("Price"));
                if (price > maxPrice) {
                    maxPrice = price;
                    maxIdx = i;
                }
            }
            HashMap<String, String> product = lstProducts.remove(maxIdx);
            strTest3Result += product.get("ProductName") + " | Price: " + product.get("Price") +
                    " | Category: " + product.get("Category") + " | InStock: " + product.get("InStock") + "\r\n";
        }
    }
}
