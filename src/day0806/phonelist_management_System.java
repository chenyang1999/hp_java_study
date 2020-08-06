package day0806;

import java.util.HashMap;
import java.util.Map;

public class phonelist_management_System{

    public static void main(String[] args) {
        Phone_system phone_system = new Phone_system();
        Person person_1 =new Person("陈扬","男", "21", "15611111111", "12345678","广东省韶关市");
        phone_system.addPerson(person_1);
        phone_system.findAll();
    }
}
