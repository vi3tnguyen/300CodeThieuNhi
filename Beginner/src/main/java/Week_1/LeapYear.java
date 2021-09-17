package Week_1;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LeapYear {
     int year;

    /*LeapYear(int year){
        this.year = year;*/
public void Update(String year) {

    int a = Integer.parseInt(year);
    this.year = a;
}

public void Updatee(int year){
    this.year = year;
}

public void checkLeapYear(){
    boolean isLeap = false;
        if(this.year % 4 == 0)//chia hết cho 4 là năm nhuận
    {
        if( this.year % 100 == 0)
        //nếu vừa chia hết cho 4 mà vừa chia hết cho 100 thì không phải năm nhuận
        {
            if ( this.year % 400 == 0)//chia hết cho 400 là năm nhuận
                isLeap = true;
            else
                isLeap = false;//không chia hết cho 400 thì không phải năm nhuận
        }
        else//chia hết cho 4 nhưng không chia hết cho 100 là năm nhuận
            isLeap = true;
    }
        else {
        isLeap = false;
    }
        if(isLeap==true)
            System.out.println(year + " là năm nhuận.");
        else
                System.out.println(year + " không phải là năm nhuận.");

    }


    public static void main(String[] args) {

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy");
        Date date = new Date();
        System.out.println(formatter.format(date));

        String yr = formatter.format(date);
        int i=Integer.parseInt(yr);

        LeapYear yrr = new LeapYear();
        yrr.Update(yr);
        yrr.Updatee(1000);
        System.out.println(yrr.year);


    }
}
