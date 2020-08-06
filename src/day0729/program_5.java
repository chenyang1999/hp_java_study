package day0729;

import java.util.Scanner;

public class program_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int seconds=in.nextInt();
        int seconds=208653;
        int days=0;
        int hours=0;
        int minutes=0;
        int second=0;
        days=(int)seconds/(24*60*60);
        hours=(int)seconds/(60*60)%24;
        minutes=(int)seconds/60%(60);
        second=(int)seconds%(60);
        String ans= new String();
        ans=String.format("hours=%d,hours=%d,minutes=%d,secondes=%d",days,hours,minutes,second);
        System.out.println(ans);
    }
}
