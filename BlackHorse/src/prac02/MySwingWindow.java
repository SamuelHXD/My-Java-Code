package prac02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MySwingWindow extends JFrame {
    public MySwingWindow(){
        //在窗体的构造方法中设置窗体的各项属性

        super();
        //使用 super() 来引用父类的成分，用 this 来引用当前对象

        this.add(getJLabel(),null);
        this.add(getJTextField(), null);
        this.add(getJButton(),null);
//在自定义的JFrame构造方法中使用add()方法来添加控件
//add()方法可以将指定组件添加到此容器的给定位置上
//第一个参数为待添加的组件，这里的组件来自我们的返回值
//第二个参数为描述组件的布局限制的对象，我们不加限制，所以填null
        this.setSize(400, 400);
        //设置窗体的大小

        this.getContentPane().setLayout(null);
        //返回此窗体的 contentPane 对象，设置其布局
        //这一句不太懂的话也不用担心，先写着

        this.setTitle("My First Swing Window");
        //设置窗体的标题
    }

    private JLabel myLabel;
    private JTextField myTextField;
    private JButton myButton0;
    private JButton myButton1;

    private JButton getJButton() {
        //此处的返回值类型为JButton

        if(myButton0 == null) {

            myButton0 = new JButton();
            //实例化myTextField对象
            myButton0.setBounds(5, 80, 100, 40);
            //设置它的位置和尺寸
            myButton0.setText("Click me!");
            //设定它要显示的字符串
            myButton0.addActionListener(new ActionListener() {
                //为其添加一个事件监听，从而使这个按钮可以响应用户的点击操作
                //ActionListener是用于接收操作事件的侦听器接口。
                //对处理操作事件感兴趣的类可以实现此接口，而使用该类创建的对
                //可使用组件的 addActionListener 方法向该组件注册。
                //在发生操作事件时，调用该对象的 actionPerformed 方法。

                public void actionPerformed(ActionEvent e) {
                    //该方法会在发生操作时被调用，我们要做的事情就可以写在这里面
                    //比如我们下面要做的事情就是改变之前两个控件里面的文字颜色和背景色

                    myLabel.setForeground(Color.RED);
                    //设置此组件的前景色。

                    myTextField.setBackground(Color.BLUE);
                    //设置此组件的背景色。
                }
            });
        }


        return myButton0;
        //返回这个实例
    }
    private JTextField getJTextField() {
        //此处的返回值类型为JTextField

        if(myTextField == null) {
            //加上这个判断是为了防止出错

            myTextField = new JTextField();
            //实例化myTextField对象

            myTextField.setBounds(5, 45, 200, 30);
            //设置它的位置和尺寸

            myTextField.setText("Shi Yan Lou");
            //设定它要显示的字符串

        }

        return myTextField;
        //返回这个实例
    }
    private JLabel getJLabel() {
        //此处的返回值类型为JLabel

        if(myLabel == null) {

            myLabel = new JLabel();
            //实例化myLabel对象

            myLabel.setBounds(5, 10, 250, 30);
            //使用setBounds()方法设置尺寸
            //四个参数的分别是x,y,width,height
            //代表了横向、纵向的位置，以及标签自身的宽和高

            myLabel.setText("Hello! Welcome to shiyanlou.com");
            //使用setText()方法设置要显示的文本
        }

        return myLabel;
        //返回创建的实例
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        MySwingWindow window = new MySwingWindow();
        //声明一个窗体对象 window

        window.setVisible(true);
        //设置这个窗体是可见的
    }
}
