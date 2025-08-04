package questions;

import com.opencsv.CSVReader;
import java.io.FileReader;

public class Test1 {
    public static CSVReader readCsvData(String strFilePath) {
        //Read files and return a CSVReader object.
        try {
            FileReader filereader = new FileReader(strFilePath);
            CSVReader csvFile = new CSVReader(filereader);
            csvFile.skip(1); // Skip the header row
            return csvFile;
        } catch (Exception e) {
            System.out.println("An error was encountered while trying to read the file: " + e.getLocalizedMessage());
            return null;
        }
    }
}
