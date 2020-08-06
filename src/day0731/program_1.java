package day0731;
import	java.util.Scanner;

public class program_1 {
    public static void main(String[] args) {
        System.out.print("要求输入树的高度:");
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i*2-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
