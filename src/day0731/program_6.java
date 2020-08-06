package day0731;
import	java.util.Scanner;

public class program_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n,m;
        boolean tag=true;
        while (tag){
            System.out.println("计算面积");
            System.out.println("1.矩形    2.三角形   3.圆    4.退出");
            System.out.println("请选择数字对应的功能:");
            int a= in.nextInt();
            switch (a){
                case 1 :
                    System.out.println("你选择了矩形");
                    System.out.println("请输入矩形的长:");
                    n=in.nextDouble();
                    System.out.println("请输入矩形的宽:");
                    m=in.nextDouble();
                    System.out.println("矩形的面积为:"+n*m);
                    break;
                case 2 :
                    System.out.println("你选择了三角形");
                    System.out.println("请输入三角形的底:");
                    n=in.nextDouble();
                    System.out.println("请输入三角形的高:");
                    m=in.nextDouble();
                    System.out.println("三角形的面积为:"+n*m/2);
                    break;
                case 3 :
                    System.out.println("你选择了圆形");
                    System.out.println("请输入圆的半径");
                    n=in.nextDouble();
                    System.out.println("圆形的面积为:"+n*n*Math.PI);
                    break;
                case 4 :
                    System.out.println("计算系统退出");
                    tag=false;
                    break;
            }
        }
    }
}
