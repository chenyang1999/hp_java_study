### Homework_0804

`陈扬_中国海洋大学`

1、定义一个int[] a =｛4，2，0，-1，-8，23，9｝求数组元素的最大值、最小值、平均数、总和、反转

```java
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
```

![image-20200805231352515](https://cy-1256894686.cos.ap-beijing.myqcloud.com/cy/2020-08-05-151353.png)

2、从键盘输入10个整数存入在一个数组中，计算所有元素之和及平均值，并找出最大值和最小值。

```java
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
```

![image-20200805231808117](https://cy-1256894686.cos.ap-beijing.myqcloud.com/cy/2020-08-05-151808.png)

3、已知数组为小学课程:(语文、数学、自然、社会),使用foreach循环遍历输出。

```java
package day0804;

public class program_3 {
    public static void main(String[] args) {
        String[] str={"语文","数学","自然","社会"};
        for (String s : str) {
            System.out.println(s);
        }
    }
}
```

![image-20200805232125481](https://cy-1256894686.cos.ap-beijing.myqcloud.com/cy/2020-08-05-152125.png)

4、将数组{10,9,1,0,3,100,60}使用冒泡排序从小到大排序。

```java
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
```

![image-20200805232641039](https://cy-1256894686.cos.ap-beijing.myqcloud.com/cy/2020-08-05-152641.png)

5、声明一个二维数组int[][] arr = { {11,12,13,14}, {21,22,23,24}, {31,32,33,34} };

(要求：使用二重for循环输出所有元素。)

```java
package day0804;

public class program_5 {
    public static void main(String[] args) {
        int[][] arr = { {11,12,13,14}, {21,22,23,24}, {31,32,33,34} };
        for(int[] row : arr){
            for(int col:row) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}
```

![image-20200805232922947](https://cy-1256894686.cos.ap-beijing.myqcloud.com/cy/2020-08-05-152923.png)

