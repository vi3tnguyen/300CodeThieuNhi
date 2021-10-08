package OOP;

import java.io.IOException;

public class DebugRunner {


    public static void main(String[] args) throws IOException {
        //ExcelData excelData = new ExcelData();
        CSVData csvData = new CSVData();
        csvData.readFile("SAOKE_T8.csv");


        //Settlement settlementWithExcelData = new Settlement(excelData);
        Settlement settlementWithCsvData = new Settlement(csvData);

        //settlementWithExcelData.calculateCR();
        settlementWithCsvData.calculateIntOut();

        csvData.writeFile("testtt.csv", settlementWithCsvData.convertorWriteData());

    }
}
