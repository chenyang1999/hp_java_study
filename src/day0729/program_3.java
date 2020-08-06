package day0729;

public class program_3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int temp = 0;
        System.out.println("交换前:");
        System.out.println("a="+a);
        System.out.println("b="+b);

        temp=a;
        a=b;
        b=temp;

        System.out.println("交换后:");
        System.out.println("a="+a);
        System.out.println("b="+b);

    }
}