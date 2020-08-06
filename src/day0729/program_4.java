package day0729;
import	java.util.Scanner;

public class program_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("输入圆的半径:");
        double rad=in.nextDouble();
        double area=rad*rad*Math.PI;
        System.out.print("圆的面积:"+area);
    }
}
