package Options1;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;



public class Execerise {

    public static void main(String[] args) throws IOException {

        //List<List<String>> records = new ArrayList<List<String>>();

        String fileName = "/Users/lap12319/Desktop/SAOKE_7Final.csv";
        String fileName1 = "SAOKE_T8.csv";

        String[] path = new String[]{fileName, fileName1};

        CSVWriter writer = new CSVWriter(new FileWriter("test.csv"));

        for (String s : path) {
            //Key,Value --
            HashMap<String, Cash> groupCash = new HashMap<>();
//            HashMap<String,Integer> group = new HashMap();
//            HashMap<String,Integer> group1 = new HashMap();
//            HashMap<String,Integer> index = new HashMap<>();
//            int [] cashIn = new int[];
//            int [] cashOut = new int[];

            //HashMap<String,HashMap<String,Integer>> indexx = new HashMap<>();

            // HashMap<String, Integer> groupCashOut = new HashMap<String, Integer>();


            try (CSVReader csvReader = new CSVReader(new FileReader(s));) {
                String[] values = null;

                int index = 0;
                while ((values = csvReader.readNext()) != null) {

                    if (index == 0) {
                        index++;
                        continue;
                    }

                    String note = values[2]; //naptien

                    if (groupCash.containsKey(note)) {
                        Cash cash = groupCash.get(note);
                        cash.setIn(cash.getIn() + Integer.parseInt(values[0]));
                        cash.setOut(cash.getOut() + Integer.parseInt(values[1]));
                        groupCash.put(note, cash);
                    } else {
                        Cash cash = new Cash(Integer.parseInt(values[0]), Integer.parseInt(values[1]));
                        groupCash.put(note, cash);
                    }

//                if (groupCash.containsKey(note)) { // Key / Value  --> Key = null -->
//
//                    cashIn += groupCashIn.get(note); // cashIn = 5000
//
//                    groupCashIn.put(note, cashIn);
//                } else {
//
//                    groupCashIn.put(note, cashIn);
//                }
//                if (groupCashOut.containsKey(note)) {
//
//                    cashOut += groupCashOut.get(note);
//
//                    groupCashOut.put(note, cashOut);
//                } else {
//
//                    groupCashOut.put(note, cashOut);
//                }


//                    List<List<String>> listtt = new ArrayList<>();
//                    listtt.get(0).get(1);
//                    listtt.get(0).add("dasdad")
//                    List<String> arrList = listtt.get(0);
                    ///dasdsa
                    //dasdsd
                    //dasdsad

                    //Ba { con,con1 {con con con } }


                }


                for (String key : groupCash.keySet()) {
                    Cash cash = groupCash.get(key);
                    String[] arrString = new String[]{String.valueOf(cash.getIn()), String.valueOf(cash.getOut()), key};
                    writer.writeNext(arrString);
                }

//            for (String key : groupCashIn.keySet()) {
//                groupCashIn.get(key);
//                groupCashOut.get(key);
//
//                String[] arrString = new String[]{groupCashIn.get(key).toString(), groupCashOut.get(key).toString(), key};
//
//                writer.writeNext(arrString);
//
//            }


            }
        }
        writer.close();
    }

}
