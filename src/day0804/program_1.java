package day0804;
public class program_1 {
    public static void main(String[] args) {
        int[] a = {4,2,0,-1,-8,23,9};
        int max=-1000000000;
        int min=1000000000;
        int avg=0;
        int sum=0;
        for (int i = 0; i < a.length; i++) {
            if (a[i]>max)max = a[i];
            if (a[i]<min)min = a[i];
            sum+=a[i];
        }
        avg=sum/a.length;
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; ++i) {
            b[a.length-i-1]=a[i];
        }
        System.out.println("max num of a[] is "+max);
        System.out.println("min num of a[] is "+min);
        System.out.println("avg of a[] is "+avg);
        System.out.println("sum of a[] is "+sum);
        System.out.println("revers of a[] is:");
        for (int i = 0; i < b.length; ++i) {
            System.out.print(b[i]+" ");
        }
    }
}
