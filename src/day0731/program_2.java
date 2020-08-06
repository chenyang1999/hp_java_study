package day0731;

import java.util.Scanner;

public class program_2 {

    public static void main(String[] args) {
        int[] a=new int[5];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            a[i]=in.nextInt();
            if (a[i]<0 || a[i]>130){
                break;
            }
        }
        System.out.println("平均年龄:"+sum(a)/a.length);
    }

    public static int sum(int[] a){
        int ans=0;
        for (int i = 0; i <a.length; ++i ){
            ans+=a[i];
        }
        return ans;
    }
}
