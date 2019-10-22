package StudentSystem;

import java.util.Scanner;

public class Operate {
    Scanner s = new Scanner(System.in);
    //打印菜单
    public static void print() {
        System.out.println("1、添加学生信息");
        System.out.println("2、删除学生信息");
        System.out.println("3、修改学生信息");
        System.out.println("4、查询学生信息");
        System.out.println("5、显示所有信息");
        System.out.println("6、退出系统");
        System.out.printf("请输入选项:");
    }
    //添加信息
    public void add(Student[] stu, int size) {
        Student p = new Student();
        int length = index(stu); //获取已存储的学生个数
        if (length >= size) {
            System.out.println("储存空间已满!");
            return;
        }
        System.out.printf("请输入学号：");  //添加学号
        int id = s.nextInt();
        s.nextLine();  //消除回车的影响
        if (exist(stu, id)) {
            System.out.println("该学生的信息已存在！");
            return;
        }
        p.setStuID(id);
        System.out.printf("请输入姓名：");  //添加姓名
        p.setName(s.nextLine());
        System.out.printf("请输入性别："); //添加性别
        p.setGender(s.nextLine());
        System.out.printf("请输入年龄：");  //添加年龄
        p.setAge(s.nextInt());
        System.out.printf("请输入手机号码："); //添加手机号
        p.setPhone(s.nextLong());
        stu[length] = p;
        System.out.println("添加成功！");
    }
    //删除信息
    public void delete(Student[] stu) {
        int i, j;
        int length = index(stu); //获取学生个数
        System.out.println("请输入要删除学生的学号：");
        int deleteID = s.nextInt();
        if (!exist(stu, deleteID)) {
            System.out.println("该学生的信息不存在！");
            return;
        }
        for (i = 0; i < length; i++) {
            if (deleteID == stu[i].getstuID())
                break;
        }
        for (j = i; j < length; j++) {
            stu[j] = stu[j+1];
        }
        System.out.println("删除成功！");
    }
    //修改信息
    public void modify(Student[] stu) {
        int i;
        System.out.println("请输入要修改学生的学号：");
        int modifID = s.nextInt();
        int length = index(stu); //获取学生个数
        if (!exist(stu, modifID)) {
            System.out.println("该学生的信息不存在！");
            return;
        }
        for (i = 0; i < length; i++) {
            if (stu[i].getstuID() == modifID)
                break;
        }
        System.out.println("请输入要修改的内容：1、学号 2、姓名 3、性别 4、年龄 5、手机号：");
        int choose = s.nextInt();
        s.nextLine();
        switch (choose){
            case 1:{
                System.out.println("请输入新的学号：");
                stu[i].setStuID(s.nextInt());
                break;
            }
            case 2:{
                System.out.println("请输入新的姓名：");
                stu[i].setName(s.nextLine());
                break;
            }
            case 3:{
                System.out.println("请输入新的性别：");
                stu[i].setGender(s.nextLine());
                break;
            }
            case 4:{
                System.out.println("请输入新的年龄：");
                stu[i].setAge(s.nextInt());
                break;
            }
            default:{
                System.out.println("请输入新的手机号：");
                stu[i].setPhone(s.nextLong());
                break;
            }
        }
        System.out.println("修改完毕！");
    }
    //显示所有信息
    public void display(Student[] stu) {
        int length = index(stu);  //获取学生个数
        System.out.println("所有学生的信息如下：");
        for (int i = 0; i < length; i++) {
            System.out.printf("学号：%d     姓名：%s     性别：%s     年龄：%d     电话号码：%d\n",
                    stu[i].getstuID(), stu[i].getname(), stu[i].getgender(), stu[i].getage(), stu[i].getphone());
        }

    }

    //查询某个学生的信息
    public void search(Student[] stu) {
        int length = index(stu); //获取学生个数
        System.out.println("请输入要查询的学号:");
        int searchID = s.nextInt();
        for (int i = 0; i < length; i++)
            if (stu[i].getstuID() == searchID) {
                System.out.println("已找到该学生!");
                System.out.printf("学号：%d\n", stu[i].getstuID());
                System.out.printf("姓名：%s\n", stu[i].getname());
                System.out.printf("性别：%s\n", stu[i].getgender());
                System.out.printf("年龄：%d\n", stu[i].getage());
                System.out.printf("学号：%d\n", stu[i].getphone());
                return;
            }
        System.out.println("未找到该学生!");
        return;

    }

    //获取当前学生的个数
    private int index(Student[] stu) {
        int i;
        for (i = 0; i < stu.length; i++) {
            if(stu[i] == null)
                return i;
        }
        return i;
    }

    //检索学生信息是否存在
    private boolean exist(Student[] stu, int number) {
        for (int i = 0; i < index(stu); i++) {
            if (number == stu[i].getstuID())
                return true;
        }
        return false;
    }
}
