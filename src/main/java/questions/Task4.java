package questions;

import java.io.FileWriter;
import java.io.IOException;

public class Task4 {
    public static void printReport() throws IOException {
        // Use FileWriter to generate the test reports.
        String strFilePath = System.getProperty("user.dir") + "/src/test/java/testReport.txt";
        FileWriter fwPrintReport = new FileWriter(strFilePath, false);
        String strTestResults = "";

        // Generate the report header and content.
        strTestResults += "\n| ---------- Test #1 Results ---------- |" + "\n";
        strTestResults += "\n" + Task1.strTest1Result;
        strTestResults += "\n| ---------- Test #2 Results ---------- |" + "\n";
        strTestResults += "\n" + Task2.strTest2Result;
        strTestResults += "\n| ---------- Test #3 Results ---------- |" + "\n";
        strTestResults += "\n" + Task3.strTest3Result;

        System.out.println(strTestResults);
        fwPrintReport.write(strTestResults);
        fwPrintReport.close();

        String jsonReport = System.getProperty("user.dir") + "/src/test/java/testReport.json";
        FileWriter fwJsonReport = new FileWriter(jsonReport, false);

        // Generate JSON version of the test results.
        String strJsonResults = "{\n[" +
                "  \"Test1\": \"" + Task1.strTest1Result.replace("\r\n", "\\n") + "\",\n" +
                "  \"Test2\": \"" + Task2.strTest2Result.replace("\r\n", "\\n") + "\",\n" +
                "  \"Test3\": \"" + Task3.strTest3Result.replace("\r\n", "\\n") + "\"\n" +
                "]}";

        fwJsonReport.write(strJsonResults);
        fwJsonReport.close();

    }
}
