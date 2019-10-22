package StudentSystem;

import java.util.Scanner;

public class StudentSystem {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.printf("******欢迎进入学生管理系统******\n请输入班级的学生总数:");
        int size = s.nextInt();  //学生数量
        Student[] stu = new Student[size];
        Operate op = new Operate(); //实例化operate
        while(true) {
            Operate.print(); //打印菜单
            int option = s.nextInt();
            switch(option) {
                case 1: op.add(stu, size); break;  //添加
                case 2: op.delete(stu); break;   //删除
                case 3: op.modify(stu); break;   //修改
                case 4: op.search(stu); break; //查询
                case 5: op.display(stu); break; //显示全部学生信息
                case 6:System.out.println("退出系统，再见。"); System.exit(0);
                default: System.out.println("输入错误，请重新输入:");
            }
        }
    }
}
