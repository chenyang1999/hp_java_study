# homework_0729
` 陈扬_中国海洋大学`

1. 定义4个变量分别存储学生的姓名、年龄、性别、成绩，然后在屏幕上显示学生信息。

    ```java
    package day0729;
    
    public class program_1 {
    
        public static void main(String[] args) {
            // write your code here
            String Sname="陈扬";
            int Sage=21;
            String Ssex="男";
            float Sgrade=100;
            System.out.println("姓名:"+Sname);
            System.out.println("年龄:"+Sage);
            System.out.println("性别:"+Ssex);
            System.out.println("成绩:"+Sgrade);
    
        }
    }
    ```

    ![image-20200802154218682](https://cy-1256894686.cos.ap-beijing.myqcloud.com/cy/2020-08-02-074219.png)

2. 请用户输入学生信息，然后在屏幕上显示学生信息。（ 姓名、性别、年龄、专业）

    ```java
    package day0729;
    import	java.util.Scanner;
    
    public class program_2 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("姓名:");
            String Sname=in.nextLine();
            System.out.print("性别:");
            String Ssex=in.nextLine();
            System.out.print("年龄:");
            int Sage=in.nextInt();
            System.out.print("专业:");
            String Sdept=in.next();
    
            System.out.println("显示学生信息:");
            System.out.println("姓名:"+Sname);
            System.out.println("性别:"+Ssex);
            System.out.println("年龄:"+Sage);
            System.out.println("专业:"+Sdept);
        }
    }
    ```

    ![image-20200802155130135](https://cy-1256894686.cos.ap-beijing.myqcloud.com/cy/2020-08-02-075130.png)

3. 定义两个变量如:a、b分别赋值为10和20，写程序交换两个变量的值。控制台输出交换前、后a、b值。

    ```java
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
    ```

    ![image-20200802160430002](https://cy-1256894686.cos.ap-beijing.myqcloud.com/cy/2020-08-02-080430.png)

4. 计算圆的面积并打印出来 ，半径由控制台输入

    ```java
    package day0729;
    import	java.util.Scanner;
    
    public class program_4 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("输入圆的半径:");
            double rad=in.nextDouble();
            double area=rad*rad*Math.PI;
            System.out.print("圆的面积:"+area);
        }
    }
    ```

    ![image-20200802160819631](https://cy-1256894686.cos.ap-beijing.myqcloud.com/cy/2020-08-02-080819.png)

5. 实现 208653秒是几天几小时几分钟几秒？

    ```java
    package day0729;
    
    import java.util.Scanner;
    
    public class program_5 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
    //        int seconds=in.nextInt();
            int seconds=208653;
            int days=0;
            int hours=0;
            int minutes=0;
            int second=0;
            days=(int)seconds/(24*60*60);
            hours=(int)seconds/(60*60)%24;
            minutes=(int)seconds/60%(60);
            second=(int)seconds%(60);
            String ans= new String();
            ans=String.format("hours=%d,hours=%d,minutes=%d,secondes=%d",days,hours,minutes,second);
            System.out.println(ans);
        }
    }
    ```

    ![image-20200802162315899](https://cy-1256894686.cos.ap-beijing.myqcloud.com/cy/2020-08-02-082316.png)

6. int a,b=10问执行 : a=b++；和a=++b;后a,b分别是几。

    ```java
    package day0729;
    
    public class program_6 {
        public static void main(String[] args) {
            int a,b=10;
            a=b++;
            System.out.println("a="+a);
            a=++b;
            System.out.println("a="+a);
        }
    }
    ```

    ![image-20200802162525947](https://cy-1256894686.cos.ap-beijing.myqcloud.com/cy/2020-08-02-082526.png)

7.  int a = 1, b=1;

  bool bb=false;

  bool aa = (a != 1 && (bb=(b==0?false:true)));

  以上语句执行后aa和bb的值？

  ```java
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
  ```

  ![image-20200802162714757](https://cy-1256894686.cos.ap-beijing.myqcloud.com/cy/2020-08-02-082715.png)

