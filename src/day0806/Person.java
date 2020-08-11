package day0806;

public class Person{
    private String name,sex,age,phone,qq,address;

    public Person(String name, String sex, String age, String phone, String qq, String address) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.phone = phone;
        this.qq = qq;
        this.address = address;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age='" + age + '\'' +
                ", phone='" + phone + '\'' +
                ", qq='" + qq + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

}