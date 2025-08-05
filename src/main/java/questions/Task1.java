package questions;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Task1 {

    public static String strTest1Result = "";

    public static List<HashMap<String, String>> readCsvData() throws Exception {
        //Read files by using a CSVReader object
        List<HashMap<String, String>> lstItemList = new ArrayList<>();
        String csvFile = System.getProperty("user.dir") + "/src/main/resources/productData.csv";

        try {
            HashMap<String, String> mapProductDetails = new HashMap<>();
            String[] strNextRecord;

            FileReader filereader = new FileReader(csvFile);
            CSVReader csvData = new CSVReader(filereader);
            csvData.skip(1);

            while ((strNextRecord = csvData.readNext()) != null) {

                for (String data : strNextRecord) {
                    mapProductDetails.put("ProductName", strNextRecord[0]);
                    mapProductDetails.put("Price", strNextRecord[1]);
                    mapProductDetails.put("Category", strNextRecord[2]);
                    mapProductDetails.put("InStock", strNextRecord[3]);
                }
                lstItemList.add(new HashMap<>(mapProductDetails));
            }
        } catch (IOException e) {
            System.out.println("An error was encountered while trying to read the file: " + e.getLocalizedMessage());
            return null;
        }

        for (HashMap<String, String> item : lstItemList) {
            strTest1Result += "Product: " + item.get("ProductName") + " | Price: " + item.get("Price") +
                    " | Category: " + item.get("Category") + " | In Stock: " + item.get("InStock") + "\r\n";
        }

        return lstItemList;
    }
}
