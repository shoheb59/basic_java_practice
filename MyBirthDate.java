import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyBirthDate {
    public static void main(String[] args) throws ParseException {
        String bDate = "01/01/1995";
        SimpleDateFormat dformate = new SimpleDateFormat("dd/MM/yyyy");
        Date date1 = dformate.parse(bDate);

        Date date2 = new Date();
        System.out.println(date2);

        long d = date2.getTime() - date1.getTime();
        System.out.println(d);

        long year = d / (1000l * 60 * 60 * 24 * 365);
        long month =d / (1000l * 60 * 60 * 24 * 365 *30)%365;
        long day = d / (1000*60*60*24)%365;
        long hour = (d / (100*60*60))%24;


        System.out.println("Year " +year);
        System.out.println("Month " +month);

        System.out.println("Day " +day);
        System.out.println("hour " +hour);






    }
}
