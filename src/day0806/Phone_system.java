package day0806;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Phone_system {
    private Map<String, Person> person_list = new HashMap<String, Person>();
    private int sumofperson = 0;
    private String delatename;

    public Person newAperson() {
        Person p = new Person();
        Scanner in = new Scanner(System.in);
        System.out.print("姓名:");
        p.setName(in.next());
        System.out.print("性别:");
        p.setSex(in.next());
        System.out.print("年龄:");
        p.setAge(in.next());
        System.out.print("电话:");
        p.setPhone(in.next());
        System.out.print("QQ:");
        p.setQq(in.next());
        System.out.print("地址:");
        p.setAddress(in.next());
        return p;
    }

    public void addPerson(Person person) {
        this.person_list.put(person.getName(), person);
        System.out.println(person.toString());
        System.out.println("添加成功");
    }

    public void deletePerson() {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入删除的姓名:");
        String temp_name = in.next();
        boolean isIn = person_list.containsKey(temp_name);
        if (isIn) {
            System.out.println("确认吗? 1(是) 0(否)");
            if (in.nextInt() == 1) {
                person_list.remove(temp_name);
                System.out.println("删除成功");
            } else {
                System.out.println("放弃删除");
            }

        } else {
            System.out.println("此人不存在");
        }
    }

    public void editPerson() {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入修改的姓名:");
        String temp_name = in.next();
        boolean isIn = person_list.containsKey(temp_name);
        if (isIn) {
            System.out.println(person_list.get(temp_name).toString());
            person_list.remove(temp_name);
            Person temp_person = newAperson();
            addPerson(temp_person);
            System.out.println(temp_person.toString());
            System.out.println("修改成功");
        } else {
            System.out.println("此人不存在");
        }
    }

    public void findByName() {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入查询的姓名:");
        String temp_name = in.next();
        boolean isIn = person_list.containsKey(temp_name);
        if (isIn) {
            System.out.println(person_list.get(temp_name).toString());
            System.out.println("查询成功");
        } else {
            System.out.println("此人不存在");
        }
    }

    public void findAll() {
        for (Map.Entry<String, Person> entry : person_list.entrySet()) {
            System.out.println(entry.getValue().toString());
        }
        System.out.println("查询成功");
    }

    public void UI() {
        int action = -1;
        new Person();

        while (action != 0) {
            ShowUI();
            action = getAction();
            switch (action) {
                case 0: {
                    System.out.println("退出系统");
                    break;
                }
                case 1: {
//                    System.out.println("1.添加");
                    System.out.println("-------添加电话簿-------");
                    addPerson(newAperson());
                    break;
                }
                case 2: {
//                    System.out.println("2.删除");
                    System.out.println("-------删除电话簿-------");
                    deletePerson();
                    break;
                }
                case 3: {
//                    System.out.println("3.修改");
                    System.out.println("-------修改电话簿-------");
                    editPerson();
                    break;
                }
                case 4: {
//                    System.out.println("4.查询所有");
                    System.out.println("------打印所有电话簿------");
                    findAll();
                    break;
                }
                case 5: {
//                    System.out.println("5.按照姓名查询");
                    System.out.println("------查找电话簿------");
                    findByName();
                    break;
                }
                default:
                    throw new IllegalStateException("Unexpected value: " + action);
            }
        }

    }

    public void ShowUI() {
        System.out.println("--------------------电话本管理系统----------------------");
        System.out.println("1. 添加  2.删除  3.修改  4.查询所有  5.根据姓名查询  0.退出");
        System.out.println("--------------------电话本管理系统----------------------");
        System.out.println("请选择业务");

    }

    public int getAction() {
        Scanner in = new Scanner(System.in);
        int action = in.nextInt();
        return action;
    }

    public void deletePerson(String temp_name) {
        Scanner in = new Scanner(System.in);
        boolean isIn = person_list.containsKey(temp_name);
        if (isIn) {
            System.out.println("确认吗? 1(是) 0(否)");
            if (in.nextInt() == 1) {
                person_list.remove(temp_name);
                System.out.println("删除成功");
            } else {
                System.out.println("放弃删除");
            }

        } else {
            System.out.println("此人不存在");
        }
    }

    public void findByName(String temp_name) {
        boolean isIn = person_list.containsKey(temp_name);
        if (isIn) {
            System.out.println(person_list.get(temp_name).toString());
            System.out.println("查询成功");
        } else {
            System.out.println("此人不存在");
        }
    }

    public void editPerson(String edit_name, Person temp_person) {
        String temp_name = edit_name;
        boolean isIn = person_list.containsKey(temp_name);
        if (isIn) {
            System.out.println(person_list.get(temp_name).toString());
            person_list.remove(temp_name);
//            Person temp_person=newAperson();
            addPerson(temp_person);
            System.out.println(temp_person.toString());
            System.out.println("修改成功");
        } else {
            System.out.println("此人不存在");
        }
    }
}