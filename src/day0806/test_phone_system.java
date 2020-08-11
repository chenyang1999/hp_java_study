package day0806;

public class test_phone_system {
    public static void main(String[] args) {
        Phone_system ps = new Phone_system();
        Person p1 = new Person("陈扬", "男", "21", "13910572248", "123412354361", "加拿大蒙特利尔省");
        Person p2 = new Person("张三", "男", "20", "15622480412", "231512321342", "山东省青岛市");
        Person p3 = new Person("李四", "女", "19", "13422480412", "231512321342", "山东省青岛市");
        test_add(ps, p1);
        test_add(ps, p2);
        test_add(ps, p3);
        test_add(ps);
        ps.findAll();
        String pname = "张三";
        test_delete(ps, pname);
        ps.findAll();
        ps.findByName(pname);
        ps.findByName("李四");

        String edit_name = "李四";
        test_edit(ps, edit_name, p2);
        ps.findByName(p2.getName());
        ps.findByName("李四");
        ps.findAll();

    }

    private static void test_edit(Phone_system ps, String edit_name, Person p) {
        ps.editPerson(edit_name, p);
    }

    private static void test_delete(Phone_system ps, String pname) {
        ps.deletePerson(pname);
    }

    private static void test_add(Phone_system ps, Person person) {
        ps.addPerson(person);
    }

    private static void test_add(Phone_system ps) {
        ps.addPerson(ps.newAperson());
    }


}
