package day0730;

import java.util.Scanner;

public class program_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int grade= in.nextInt();
        switch((int)(grade)/10){
            case (10):
                System.out.println("A");
                break;
            case (9):
                System.out.println("A");
                break;
            case (8):
                System.out.println("B");
                break;
            case (7):
                System.out.println("C");
                break;
            case (6):
                System.out.println("D");
                break;
            default:
                System.out.println("E");
                break;
        }
    }
}
