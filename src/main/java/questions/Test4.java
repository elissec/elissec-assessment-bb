package questions;

import java.io.FileWriter;
import java.io.IOException;

public class Test4 {
    public static void printReport() throws IOException {
        String filePath = System.getProperty("user.dir") + "/src/test/java/testReport.txt";
        FileWriter printReport = new FileWriter(filePath, false);
        String strTestResults = "";

        strTestResults += "\n | ---------- Test #1 Results ---------- |" + "\n";
        strTestResults += Test1.strTest1Result;
        strTestResults += "\n | ---------- Test #2 Results ---------- |" + "\n";
        strTestResults += Test2.strTest2Result;
        strTestResults += "\n | ---------- Test #3 Results ---------- |" + "\n";
        strTestResults += Test3.strTest3Result;

        System.out.println(strTestResults);
        printReport.write(strTestResults);
        printReport.close();

    }
}
