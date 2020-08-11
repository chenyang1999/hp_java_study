# 电话簿管理系统

`陈扬_中国海洋大学`

## 实验要求

一、 电话本管理系统

主界面:

![img](https://cy-1256894686.cos.ap-beijing.myqcloud.com/cy/2020-08-11-145854.jpg)

1.添加

![img](https://cy-1256894686.cos.ap-beijing.myqcloud.com/cy/2020-08-11-145855.jpg)

 

2.删除

 2.1信息不存在

![img](https://cy-1256894686.cos.ap-beijing.myqcloud.com/cy/2020-08-11-145849.jpg)

 2.2信息存在

![img](https://cy-1256894686.cos.ap-beijing.myqcloud.com/cy/2020-08-11-145857.jpg)

再次选择4,查询所有，张三的信息已删除

![img](https://cy-1256894686.cos.ap-beijing.myqcloud.com/cy/2020-08-11-145847.jpg)

3.修改

  3.1信息不存在

![img](https://cy-1256894686.cos.ap-beijing.myqcloud.com/cy/2020-08-11-145858.jpg)

3.2信息存在

![img](https://cy-1256894686.cos.ap-beijing.myqcloud.com/cy/2020-08-11-145852.jpg)

 

4.查询所有

![img](https://cy-1256894686.cos.ap-beijing.myqcloud.com/cy/2020-08-11-145843.jpg)

5.根据姓名查找

   5.1信息不存在

![img](https://cy-1256894686.cos.ap-beijing.myqcloud.com/cy/2020-08-11-145853.jpg)

5.2信息存在

![img](https://cy-1256894686.cos.ap-beijing.myqcloud.com/cy/2020-08-11-145850.jpg)

0. 退出系统

---

## 代码结构

![image-20200811230034914](https://tva1.sinaimg.cn/large/007S8ZIlgy1ghn9nwlgruj30k60463yv.jpg)

### person

用于存储用户信息

![image-20200811230518671](https://tva1.sinaimg.cn/large/007S8ZIlgy1ghn9su73y7j30n20vead3.jpg)

### Phone_system

电话簿管理系统

![image-20200811230548466](https://tva1.sinaimg.cn/large/007S8ZIlgy1ghn9tc1339j30go0n476d.jpg)

### phonelist_management_System

主程序

```java
package day0806;

public class phonelist_management_System{

    public static void main(String[] args) {
        Phone_system phone_system = new Phone_system();
        phone_system.UI();
    }
}

```

### test_phone_system

测试文件

![image-20200811230612494](https://tva1.sinaimg.cn/large/007S8ZIlgy1ghn9tr1hh9j30lc09wjsc.jpg)

## 测试

```
Person{name='陈扬', sex='男', age='21', phone='13910572248', qq='123412354361', address='加拿大蒙特利尔省'}
添加成功
Person{name='张三', sex='男', age='20', phone='15622480412', qq='231512321342', address='山东省青岛市'}
添加成功
Person{name='李四', sex='女', age='19', phone='13422480412', qq='231512321342', address='山东省青岛市'}
添加成功
姓名:王五
性别:男
年龄:21
电话:12342341234123
QQ:12342341234
地址:山东省烟台市
Person{name='王五', sex='男', age='21', phone='12342341234123', qq='12342341234', address='山东省烟台市'}
添加成功
Person{name='李四', sex='女', age='19', phone='13422480412', qq='231512321342', address='山东省青岛市'}
Person{name='张三', sex='男', age='20', phone='15622480412', qq='231512321342', address='山东省青岛市'}
Person{name='陈扬', sex='男', age='21', phone='13910572248', qq='123412354361', address='加拿大蒙特利尔省'}
Person{name='王五', sex='男', age='21', phone='12342341234123', qq='12342341234', address='山东省烟台市'}
查询成功
确认吗? 1(是) 0(否)
1
删除成功
Person{name='李四', sex='女', age='19', phone='13422480412', qq='231512321342', address='山东省青岛市'}
Person{name='陈扬', sex='男', age='21', phone='13910572248', qq='123412354361', address='加拿大蒙特利尔省'}
Person{name='王五', sex='男', age='21', phone='12342341234123', qq='12342341234', address='山东省烟台市'}
查询成功
此人不存在
Person{name='李四', sex='女', age='19', phone='13422480412', qq='231512321342', address='山东省青岛市'}
查询成功
Person{name='李四', sex='女', age='19', phone='13422480412', qq='231512321342', address='山东省青岛市'}
Person{name='张三', sex='男', age='20', phone='15622480412', qq='231512321342', address='山东省青岛市'}
添加成功
Person{name='张三', sex='男', age='20', phone='15622480412', qq='231512321342', address='山东省青岛市'}
修改成功
Person{name='张三', sex='男', age='20', phone='15622480412', qq='231512321342', address='山东省青岛市'}
查询成功
此人不存在
Person{name='张三', sex='男', age='20', phone='15622480412', qq='231512321342', address='山东省青岛市'}
Person{name='陈扬', sex='男', age='21', phone='13910572248', qq='123412354361', address='加拿大蒙特利尔省'}
Person{name='王五', sex='男', age='21', phone='12342341234123', qq='12342341234', address='山东省烟台市'}
查询成功

Process finished with exit code 0

```

