package day0731;
import	java.util.Scanner;

public class program_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("please input username and password:");
            String admin= in.next();
            String password= in.next();
            if (admin.equals("admin") && password.equals("111")){
                System.out.println("登陆成功");
                break;
            }
        }
    }
}
