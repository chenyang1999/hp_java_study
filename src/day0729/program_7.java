package day0729;

import java.io.PrintStream;

public class program_7 {
    public static void main(String[] args) {
        int a = 1, b=1;
        boolean bb=false;
        boolean aa = (a != 1 && (bb=(b==0?false:true)));
        System.out.println("aa="+aa);
        System.out.println("bb="+bb);
    }
}
