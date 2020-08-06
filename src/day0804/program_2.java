package day0804;
import	java.util.Scanner;

public class program_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = new int[10];
        int max=-1000000000;
        int min=1000000000;
        int avg=0;
        int sum=0;
        for (int i = 0; i < a.length; i++) {
            a[i]=in.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i]>max)max = a[i];
            if (a[i]<min)min = a[i];
            sum+=a[i];
        }
        avg=sum/a.length;
        System.out.println("max num of a[] is "+max);
        System.out.println("min num of a[] is "+min);
        System.out.println("avg of a[] is "+avg);
        System.out.println("sum of a[] is "+sum);
    }
}
