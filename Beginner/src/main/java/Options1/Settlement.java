package Options1;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Settlement {

    public static int checkContain(String[] st, String string, int length) {

        if (length < 1)
            return -1;

        for (int i = 0; i < length; i++) {
            if (st[i].equals(string))
                return i;
        }

        return -1;
    }

    public static void main(String[] args) throws IOException, CsvException {


        List<String> summCashIn = new ArrayList<>();
        List<String> summCashOut = new ArrayList<>();
        List<String> isNote = new ArrayList<>();

        String fileName1 = "/Users/lap12319/Desktop/SAOKE_7Final.csv";
        String fileName = "SAOKE_T8.csv";
        //String fileName2 = "/Users/lap12319/Desktop/SAOKE_T9.csv";

        String[] path = new String[]{fileName1, fileName};
        int separate1 = 0;
        boolean isSeparate = false;

        for (String s : path) {

            try (CSVReader reader = new CSVReader(new FileReader(s))) {
                List<String[]> r = reader.readAll();


                String[] cashIn = new String[r.size()];
                String[] cashOut = new String[r.size()];
                String[] note = new String[r.size()];


                for (int i = 1; i < r.size(); i++) {

                    String[] temp = r.get(i);
                    cashIn[i] = temp[0];
                    cashOut[i] = temp[1];
                    note[i] = temp[2];

                }

                long[] sumCashIn = new long[note.length];
                long[] sumCashOut = new long[note.length];
                String[] isCount = new String[note.length];

                int lastIndex = 0;

                for (int i = 1; i < note.length; i++) {
                    int index = checkContain(isCount, note[i], lastIndex);
                    if (index >= 0) {
                        sumCashIn[index] = sumCashIn[index] + Long.parseLong(cashIn[i]);
                        sumCashOut[index] = sumCashOut[index] + Long.parseLong(cashOut[i]);
                    } else {

                        isCount[lastIndex] = note[i];
                        sumCashIn[lastIndex] = Long.parseLong(cashIn[i]);
                        sumCashOut[lastIndex] = Long.parseLong(cashOut[i]);
                        lastIndex++;
                    }
                }
                System.out.println("Total CashIn " + "\t\t\t\t" + "Total CashOut" + "\t\t\t\t\t" + " Note");


                for (int i = 0; i < lastIndex; i++) {


                    String sss = String.valueOf(sumCashIn[i]);
                    summCashIn.add(sss);
                    String xxx = String.valueOf(sumCashOut[i]);
                    summCashOut.add(xxx);
                    isNote.add(isCount[i]);
                    System.out.println(sumCashIn[i] + " \t\t\t\t\t\t " + sumCashOut[i] + " \t\t\t\t\t\t\t" + isCount[i]);

                }

                if (!isSeparate) {
                    separate1 = lastIndex;
                    System.out.println("----" + separate1);
                    isSeparate = true;
                }


                System.out.println("====================================================\n\n\n");
            }


        }

        List<String[]> arrColumn = new ArrayList<>();
        String[] arrString = summCashIn.toArray(new String[0]);
        String[] arrString1 = summCashOut.toArray(new String[0]);
        String[] arrString2 = isNote.toArray(new String[0]);
        for (int i = 0; i < isNote.size(); i++) {
            String[] temp = new String[]{arrString2[i], arrString[i], arrString1[i]};
            arrColumn.add(temp);
        }

        CSVWriter writer = new CSVWriter(new FileWriter("test1.csv"));

        //String [] arrString = new String[summCashIn.size()+summCashOut.size()];


        for (int i = 0; i < arrColumn.size(); i++) {
            if (i == separate1) {
                String[] addSeparate = new String[]{"=============", "==================="};
                writer.writeNext(addSeparate);

            }
            writer.writeNext(arrColumn.get(i));
        }


        writer.close();


    }


}


