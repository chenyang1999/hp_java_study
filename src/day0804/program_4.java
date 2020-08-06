package day0804;

public class program_4 {
    public static void main(String[] args) {
        int[] a={10,9,1,0,3,100,60};
        for(int i=0; i<a.length; i++) {//表示n次排序过程。
            for (int j = 1; j < (a.length - i); j++) {
                if (a[j - 1] > a[j]) {//前面的数字大于后面的数字就交换
                    //交换a[j-1]和a[j]
                    int temp;
                    temp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int i = 0; i < a.length; ++i) System.out.print(a[i]+" ");
    }
}
