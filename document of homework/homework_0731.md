# homework_0731

` 陈扬_中国海洋大学`

![image-20200802173536439](https://cy-1256894686.cos.ap-beijing.myqcloud.com/cy/2020-08-02-093537.png)

```java
package day0731;
import	java.util.Scanner;

public class program_1 {
    public static void main(String[] args) {
        System.out.print("要求输入树的高度:");
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i*2-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
```

![image-20200802173521050](https://cy-1256894686.cos.ap-beijing.myqcloud.com/cy/2020-08-02-093521.png)

练习2（基础）：

循环录入5个人的年龄，并计算平均年龄，如果录入的数据出现负数或者大于130的数，立即停止输出报错（无需打印平均年龄）

```java
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
```

![image-20200802174249812](https://cy-1256894686.cos.ap-beijing.myqcloud.com/cy/2020-08-02-094250.png)

练习3（基础）：

要求用户输入用户名和密码，只要不是admin和111就提示用户名或密码不正确，请重新输入。正确时结束循环，提示登陆成功。

```java
package day0731;
import	java.util.Scanner;

public class program_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("please input username and password:");
            String admin= in.next();
            String password= in.next();
            if (admin.equals("admin") && password.equals("111")){
                System.out.println("登陆成功");
                break;
            }
        }
    }
}
```

![image-20200802174706717](https://cy-1256894686.cos.ap-beijing.myqcloud.com/cy/2020-08-02-094707.png)

练习4（基础）:

已知判断闰年的规则是：能被4整除，但是不能被100整除。或者能被400整除。打印从1900年至2050年期间所有的闰年。

```java
package day0731;

public class program_4 {
    public static void main(String[] args) {
        int n=1900;
        int m=2050;
        for (int year = n; year <= m; ++year) {
            if ((year%4==0 && year%100!=0)||(year%400==0)){
                System.out.println(year+"年是闰年");
            }
        }
    }
}
```

![image-20200802175101659](https://cy-1256894686.cos.ap-beijing.myqcloud.com/cy/2020-08-02-095101.png)

练习5（基础）：

输入序号选择不用的功能

效果如下:

![image-20200802175141101](https://cy-1256894686.cos.ap-beijing.myqcloud.com/cy/2020-08-02-095141.png)

```java
package day0731;
import	java.util.Scanner;

public class program_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true){
            System.out.println("****************************");
            System.out.println("1. 管理员    2. 顾客   3. 退出 ");
            System.out.println("****************************");
            System.out.println("请输入数字选择登入:");
            int a=in.nextInt();
            if (a == 1) {
                System.out.println("管理员登入过程省略");
            }
            if (a == 2) {
                System.out.println("顾客登入过程省略");
            }
            if (a == 3) {
                System.out.println("系统退出");
                break;
            }
        }
    }
}
```

![image-20200802175652176](https://cy-1256894686.cos.ap-beijing.myqcloud.com/cy/2020-08-02-095652.png)

练习6（基础）：

编写程序，设计一个图平面积计算，选择不同的图形输入数字计算面积，选择4退出程序。

效果如下:

![image-20200802180912459](https://cy-1256894686.cos.ap-beijing.myqcloud.com/cy/2020-08-02-100913.png)

```java
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
```



![image-20200802180849929](https://cy-1256894686.cos.ap-beijing.myqcloud.com/cy/2020-08-02-100850.png)