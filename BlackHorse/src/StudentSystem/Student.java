package StudentSystem;

import java.util.Scanner;

public class Student {
    private int stuID;  //学号
    private String name; //姓名
    private String gender; //性别
    private int age;  //年龄
    private long phoneNumber;  //手机号
    //设置信息
    public void setStuID(int stuID) {
        this.stuID = stuID;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setGender(String gender) {
            this.gender = gender;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setPhone(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    //获取信息
    public long getstuID() {
        return stuID;
    }
    public String getname() {
        return name;
    }
    public String getgender() {
        return gender;
    }
    public int getage() {
        return age;
    }
    public long getphone() {
        return phoneNumber;
    }
}
