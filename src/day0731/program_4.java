package day0731;

public class program_4 {
    public static void main(String[] args) {
        int n=1900;
        int m=2050;
        for (int year = n; year <= m; ++year) {
            if ((year%4==0 && year%100!=0)||(year%400==0)){
                System.out.println(year+"年是闰年");
            }
        }
    }
}
