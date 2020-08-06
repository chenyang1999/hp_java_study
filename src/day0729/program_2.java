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
