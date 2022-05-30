package OOP;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Data {

    public abstract void readFile(String filePath) throws FileNotFoundException;

    public abstract List<List<String>> convertDataToListString();

    public abstract void writeFile(String srcFilePath, List<List<String>> content) throws IOException;
}

class CSVData extends Data {
    //properties for Excel class??
    //

    private String filePath = "";
    private List<String[]> responseData = new ArrayList<>();

    @Override
    public void readFile(String filePath) throws FileNotFoundException {
        this.filePath = filePath;
        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            this.responseData = reader.readAll();
        } catch (IOException e) {
            e.printStackTrace();

        }
    }


    @Override
    public List<List<String>> convertDataToListString() {
        // logic to read csv file

        List<List<String>> convertData = new ArrayList<>();


        for (String[] strings : this.responseData) {
            List<String> value = Arrays.asList(strings);
            convertData.add(value);
        }


        return convertData;
    }


    @Override
    public void writeFile(String srcFilePath, List<List<String>> content) throws IOException {
        // logic to read csv file

        CSVWriter writer = new CSVWriter(new FileWriter(srcFilePath));

        for (List<String> stringList : content) {

            String[] strings = stringList.toArray(new String[0]);
            writer.writeNext(strings);
        }


        writer.close();
    }
}

class ExcelData extends Data {

    //properties for Excel class??


    @Override
    public void readFile(String filePath) {

    }

    @Override
    public List<List<String>> convertDataToListString() {
        // logic to read csv file
        return null;
    }

    @Override
    public void writeFile(String srcFilePath, List<List<String>> content) throws IOException {
        // logic to read csv file


    }
}
