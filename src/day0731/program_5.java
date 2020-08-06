package day0731;
import	java.util.Scanner;

public class program_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true){
            System.out.println("****************************");
            System.out.println("1. 管理员    2. 顾客   3. 退出 ");
            System.out.println("****************************");
            System.out.println("请输入数字选择登入:");
            int a=in.nextInt();
            if (a == 1) {
                System.out.println("管理员登入过程省略");
            }
            if (a == 2) {
                System.out.println("顾客登入过程省略");
            }
            if (a == 3) {
                System.out.println("系统退出");
                break;
            }
        }
    }
}
