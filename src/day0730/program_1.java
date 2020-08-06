package day0730;
import	java.util.Scanner;

public class program_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入算式(逐个)");
        double a=in.nextDouble();
        String relop=in.next();
        double b=in.nextDouble();
        System.out.print("Result: ");
        if (relop.equals("+")){
            System.out.print(a+b);
        }
        if (relop.equals("-")) {
            System.out.print(a-b);
        }
        if (relop.equals("*")){
            System.out.print(a*b);
        }
        if (relop.equals("/")) {
            System.out.print(a/b);
        }
    }
}
