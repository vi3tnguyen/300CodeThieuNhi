package OOP;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Settlement {

    // properties for Settlement?

    private List<Long> cashIn = new ArrayList<>();
    private List<Long> cashOut = new ArrayList<>();
    private List<String> note = new ArrayList<>();


    private List<Long> cashInFinal = new ArrayList<>();
    private List<Long> cashOutFinal = new ArrayList<>();
    private List<String> noteFinal = new ArrayList<>();


    public Settlement(Data data) {

        List<List<String>> value = data.convertDataToListString();

        for (int i = 1; i < value.size(); i++) {

            List<String> temp = value.get(i);
            this.cashIn.add(Long.parseLong(temp.get(0)));
            this.cashOut.add(Long.parseLong(temp.get(1)));
            this.note.add(temp.get(2));

        }

    }


    public void calculateIntOut() {

        for (int i = 0; i < note.size(); i++) {


            int index = noteFinal.indexOf(note.get(i));
            if (index >= 0) {

                cashInFinal.set(index, cashInFinal.get(index) + cashIn.get(i));
                cashOutFinal.set(index, cashOutFinal.get(index) + cashOut.get(i));


            } else {

                noteFinal.add(note.get(i));
                cashInFinal.add(cashIn.get(i));
                cashOutFinal.add(cashOut.get(i));
            }


        }

        for (int i = 0; i < noteFinal.size(); i++) {


            String sss = String.valueOf(cashInFinal.get(i));
            String xxx = String.valueOf(cashOutFinal.get(i));
            System.out.println(noteFinal.get(i) + " \t\t\t\t\t\t " + sss + " \t\t\t\t\t\t\t" + xxx);

        }


    }

    public List<Long> getCashInFinal() {
        return cashInFinal;
    }

    public List<Long> getCashOutFinal() {
        return cashOutFinal;
    }

    public List<String> getNoteFinal() {
        return noteFinal;
    }


    public List<List<String>> convertorWriteData(){
        List<List<String>> convertFinalData = new ArrayList<>();

        for(int i = 0 ; i < noteFinal.size() ; i++){
            //String[] temp = new String[]{arrString2[i], arrString[i], arrString1[i]};
            //arrColumn.add(temp);

            List<String> temp = Arrays.asList(noteFinal.get(i),cashInFinal.get(i).toString(),cashOutFinal.get(i).toString());
            convertFinalData.add(temp);
        }
        return  convertFinalData;
    }


}
