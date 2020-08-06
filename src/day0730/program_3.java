package day0730;
import java.text.ParseException;
import	java.util.Scanner;

import java.text.SimpleDateFormat;
import java.util.Date;

public class program_3 {
    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");//可以方便地修改日期格式
        String day_time_begin="6:00:00";
        String day_time_end="21:00:00";
        try {
            Date begin_time = dateFormat.parse(day_time_begin);
            Date end_time = dateFormat.parse(day_time_end);

            Scanner in = new Scanner(System.in);
            System.out.println("输入时间:HH:mm:ss ,打车距离:x km");
            String start_time=in.nextLine();
            int x=in.nextInt();
            Date now = dateFormat.parse(start_time);

            if (begin_time.before(now) && now.before(end_time)){
                if (x<2){
                    System.out.println("prices:"+7);
                }else {
                    System.out.println("prices:"+(7+(x-2)*1.5));
                }
            }else {
                if (x<2){
                    System.out.println("prices:"+8);
                }else {
                    System.out.println("prices:"+(8+(x-2)*1.5));
                }
            }

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
