# homework_0730

` 陈扬_中国海洋大学`

练习1 （基础）:

简易计算器（只需要考虑加减乘除）

诸输入算式（逐个输入）45

+

6

result=51.0

```java
package day0730;
import	java.util.Scanner;

public class program_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入算式(逐个)");
        double a=in.nextDouble();
        String relop=in.next();
        double b=in.nextDouble();
        System.out.print("Result: ");
        if (relop.equals("+")){
            System.out.print(a+b);
        }
        if (relop.equals("-")) {
            System.out.print(a-b);
        }
        if (relop.equals("*")){
            System.out.print(a*b);
        }
        if (relop.equals("/")) {
            System.out.print(a/b);
        }
    }
}
```

![image-20200802164538426](https://cy-1256894686.cos.ap-beijing.myqcloud.com/cy/2020-08-02-084539.png)



练习2 （基础）: .

输入分数，打印等级（使用switch结构）

90-100 A

80-89 B

70-79  C

60-69 D

<60 E

```java
package day0730;

import java.util.Scanner;

public class program_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int grade= in.nextInt();
        switch((int)(grade)/10){
            case (10):
                System.out.println("A");
                break;
            case (9):
                System.out.println("A");
                break;
            case (8):
                System.out.println("B");
                break;
            case (7):
                System.out.println("C");
                break;
            case (6):
                System.out.println("D");
                break;
            default:
                System.out.println("E");
                break;
        }
    }
}
```

![image-20200802165605656](https://cy-1256894686.cos.ap-beijing.myqcloud.com/cy/2020-08-02-085606.png)



练习3 （基础）: .
某城市出租车计费问题:
➢每日06:00至21:00，起步价6元，当日22:00至次日05:00， 起步价7元。

➢起步价包含2公里，超出部分按照每公里1.5元收费。

➢每次乘车加收1元的燃油附加税。

输入打车的时间和距离，计算本次打车的费用。

```java
package day0730;
import java.text.ParseException;
import	java.util.Scanner;

import java.text.SimpleDateFormat;
import java.util.Date;

public class program_3 {
    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");//可以方便地修改日期格式
        String day_time_begin="6:00:00";
        String day_time_end="21:00:00";
        try {
            Date begin_time = dateFormat.parse(day_time_begin);
            Date end_time = dateFormat.parse(day_time_end);

            Scanner in = new Scanner(System.in);
            System.out.println("输入时间:HH:mm:ss ,打车距离:x km");
            String start_time=in.nextLine();
            int x=in.nextInt();
            Date now = dateFormat.parse(start_time);

            if (begin_time.before(now) && now.before(end_time)){
                if (x<2){
                    System.out.println("prices:"+7);
                }else {
                    System.out.println("prices:"+(7+(x-2)*1.5));
                }
            }else {
                if (x<2){
                    System.out.println("prices:"+8);
                }else {
                    System.out.println("prices:"+(8+(x-2)*1.5));
                }
            }

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
```

![image-20200802171856030](https://cy-1256894686.cos.ap-beijing.myqcloud.com/cy/2020-08-02-091856.png)

练习4（基础）：

已知判断闰年的规则是：能被4整除，但是不能被100整除。或者能被400整除。从控制台输入一个年份，并打印输入的年份是不是闰年。

```java
package day0730;

import java.util.Scanner;

public class program_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year=in.nextInt();
        if ((year%4==0 && year%100!=0)||(year%400==0)){
            System.out.println("是闰年");
        }else {
            System.out.println("不是闰年");
        }
    }
}
```

![image-20200802172342106](https://cy-1256894686.cos.ap-beijing.myqcloud.com/cy/2020-08-02-092342.png)

练习5（基础）：

由键盘输入三个整数分别存入变量num1、num2、num3，对它们进行排序,并且从小到大输出

```java
package day0730;
import java.util.Arrays;
import	java.util.Scanner;

public class program_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a=new int[3];
        for (int i=0;i<3;i++){
            a[i]=in.nextInt();
        }
        Arrays.sort(a);
        for (int i = 0; i < 3; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
```

![image-20200802172928195](https://cy-1256894686.cos.ap-beijing.myqcloud.com/cy/2020-08-02-092928.png)

