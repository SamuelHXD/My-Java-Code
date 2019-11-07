package TankWar;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.util.Vector;
@SuppressWarnings("all")
public class Tank1 extends JFrame implements ActionListener{
    MyPanel mp=null;
    GuankaPanel gkmp=null;
    JMenuBar cdl=null;
    JMenu cd1=null;
    JMenuItem cdxl=null;
    public static void main(String[] args) {
        Tank1 t1=new Tank1();

    }
    public Tank1(){

        cdl=new JMenuBar();
        cd1=new JMenu("游戏(G)");
        cd1.setMnemonic('G');
        cdxl=new JMenuItem("新游戏(N)");
        cdxl.addActionListener(this);
        cdxl.setActionCommand("xyx");
        cd1.add(cdxl);
        cdl.add(cd1);


        gkmp=new GuankaPanel();
        Thread t=new Thread(gkmp);
        t.start();
        this.setJMenuBar(cdl);
        this.add(gkmp);

        this.setTitle("坦克大战");
        this.setSize(600, 500);
        this.setLocation(300, 280);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);


    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getActionCommand().equals("xyx")) {

            mp=new MyPanel();
            this.remove(gkmp);//删除旧面板


            this.add(mp);
            //9,事件响应写完后，必须添加一个监听，否则坦克是动不起来的
            this.addKeyListener(mp);
            Thread t=new Thread(mp);//子弹可以自己运动，而不是随着坦克运动
            t.start();
            this.setVisible(true);

        }


    }
}
@SuppressWarnings("all")
class  GuankaPanel extends JPanel implements Runnable{
    int times=0;
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 400, 300);
        if(times%2==0) {
            g.setColor(Color.YELLOW);
            Font myFont=new Font("华文行楷",Font.BOLD,38);
            g.setFont(myFont);
            g.drawString("第一关", 140, 140);


        }

    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        while(true) {
            try {
                Thread.sleep(600);
            }catch(Exception e) {}
            times++;
            this.repaint();


        }

    }

}
@SuppressWarnings("all")
class MyPanel extends JPanel implements KeyListener,Runnable {//4
    MyTank mt = null;
    Vector<DiTank> dtk = new Vector<DiTank>();
    //下一行子弹击中爆炸的diamagnetic
    //Vector<Baozha> bzjh=new Vector<Baozha>();
    //这个集合类只能放敌方坦克，所以用了泛型，避免强转
    //敌方坦克是要编成坦克组的，所以需要集合类，Vector和ArrayList类似，但是ArrayList是单线程的
    //全部由用户可控制用单线程ArrayList,随机性用多线程Vector
    int tksl = 3;

    //下三行子弹击中爆炸的代码
//	Image tp1=null;
//	Image tp2=null;
//	Image tp3=null;
    //MyTank mt1=null;可以画第二个坦克，3，4，5，6，
    public MyPanel() {
        mt = new MyTank(140, 232);
        for (int i = 0; i < tksl; i++) {

            DiTank dt = new DiTank((i) * 55 + 5, 0);
            dt.setFangxiang(2);
            //下两行时为了敌人的坦克随机动而添加的代码，画出一辆坦克，启动一个线程，画出一辆，启动一个线程
            Thread t2 = new Thread(dt);
            t2.start();

            Zidan zd = new Zidan(dt.x + 10, dt.y + 30, 2);
            dt.dzd.add(zd);
            Thread t3 = new Thread(zd);
            t3.start();

            dtk.add(dt);//不是太懂

        }
    }

    public void tjsj(Graphics g) {
        this.drawTank(80, 330, g, 0, 0);
        g.setColor(Color.black);
        g.drawString(Jilu.getMtsl() + "", 116, 350);//整型数据再后面加上双引号以后，会把正i选哪个数据转换成字符串
        this.drawTank(150, 330, g, 0, 1);
        g.setColor(Color.black);
        g.drawString(Jilu.getDtsl() + "", 186, 350);

    }

    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 400, 300);
        this.tjsj(g);
        if (mt.shengming) {
            this.drawTank(mt.getX(), mt.getY(), g, mt.fangxiang, 0);//坦克的方向问题只需要在此传进去mt.fangxiang即可
        }


        //this.drawTank(mt1.getX(),mt1.getY(),g,0,1);
        //绘制敌方坦克
        for (int i = 0; i < dtk.size(); i++) {
            DiTank dt = dtk.get(i);//自己编的
            if (dt.shengming) {
                this.drawTank(dt.getX(), dt.getY(), g, dt.fangxiang, 1);
                for (int j = 0; j < dt.dzd.size(); j++) {
                    Zidan dtzd = dt.dzd.get(j);
                    if (dtzd.shengming) {
                        g.setColor(Color.white);
                        g.fill3DRect(dtzd.x, dtzd.y, 5, 5, false);


                    } else {
                        dt.dzd.remove(dtzd);
                    }

                }
            }


        }
        for (int i = 0; i < mt.aa.size(); i++) {//为了解决只能发射一个子弹的问题
            Zidan zd = mt.aa.get(i);
            if (zd != null && zd.shengming == true) {//这个子弹不用mt.zd,直接用for循环里面的子弹
                g.setColor(Color.RED);
                g.fill3DRect(zd.x, zd.y, 5, 5, false);
            }
            if (zd.shengming == false) {
                mt.aa.remove(zd);
            }
        }

    }

    public void jzwf() {
        for (int i = 0; i < this.dtk.size(); i++) {//敌方的坦克一个一个取出来
            DiTank dt = dtk.get(i);
            for (int j = 0; j < dt.dzd.size(); j++) {//敌方的子弹一个一个取出来
                Zidan zd = dt.dzd.get(j);
                this.jzdf(zd, mt);//子弹和我方的坦克
            }
        }
    }

    public void jzdf1() {
        for (int i = 0; i < mt.aa.size(); i++) {//每取出一颗子弹
            Zidan zd = mt.aa.get(i);
            if (zd.shengming) {//如果有子弹的话
                for (int j = 0; j < dtk.size(); j++) {//每取出一个敌人的坦克，就是让我方所有的子弹何敌方所有的坦克进行比较
                    DiTank dt = dtk.get(j);
                    if (dt.shengming) {

                        this.jzdf(zd, dt);


                    }

                }

            }
            this.repaint();

        }
    }

    private void jzdf(Zidan zd, Tank dt) {//必须放在MyPanel类中，因为如果没击中需要重绘
        // TODO Auto-generated method stub
        switch (dt.fangxiang) {
            //上和下是一样的
            case 0:
            case 2:
                if (zd.x > dt.x && zd.x < dt.x + 20 && zd.y > dt.y && zd.y < dt.y + 30) {
                    zd.shengming = false;
                    dt.shengming = false;
                    Jilu.dtjs();
//				Baozha bz=new Baozha(dt.x,dt.y);
//				bzjh.add(bz);
                }
                break;
            case 1:
            case 3:
                if (zd.x > dt.x && zd.x < dt.x + 30 && zd.y > dt.y && zd.y < dt.y + 20) {
                    zd.shengming = false;
                    dt.shengming = false;
                    Jilu.dtjs();
                }

        }
    }

    public void drawTank(int x, int y, Graphics g, int fangxiang, int leixing) {//5
        //参数中必须传一个画笔进来
        switch (leixing) {
            case 0://我的坦克
                g.setColor(Color.YELLOW);
                break;
            case 1://敌人的坦克
                g.setColor(Color.GREEN);
                break;

        }
        switch (fangxiang) {
            case 0://上
                g.fill3DRect(x, y, 5, 30, false);
                g.fill3DRect(x + 15, y, 5, 30, false);
                g.fill3DRect(x + 5, y + 5, 10, 20, false);
                g.fillOval(x + 5, y + 10, 10, 10);
                g.drawLine(x + 10, y + 15, x + 10, y - 3);
                break;
            case 1://左
                g.fill3DRect(x, y, 30, 5, false);
                g.fill3DRect(x, y + 15, 30, 5, false);
                g.fill3DRect(x + 5, y + 5, 20, 10, false);
                g.fillOval(x + 10, y + 5, 10, 10);
                g.drawLine(x + 15, y + 10, x - 3, y + 10);
                break;
            case 2://下
                g.fill3DRect(x, y, 5, 30, false);
                g.fill3DRect(x + 15, y, 5, 30, false);
                g.fill3DRect(x + 5, y + 5, 10, 20, false);
                g.fillOval(x + 5, y + 10, 10, 10);
                g.drawLine(x + 10, y + 15, x + 10, y + 33);
                break;
            case 3://右
                g.fill3DRect(x, y, 30, 5, false);
                g.fill3DRect(x, y + 15, 30, 5, false);
                g.fill3DRect(x + 5, y + 5, 20, 10, false);
                g.fillOval(x + 10, y + 5, 10, 10);
                g.drawLine(x + 15, y + 10, x + 33, y + 10);
                break;
        }
    }
    //8添加事件响应，只需要重写KeyPressed,其他两个方法不用管
    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
        if (e.getKeyCode() == KeyEvent.VK_W) {
            this.mt.setFangxiang(0);
            this.mt.xiangshang();
        } else if (e.getKeyCode() == KeyEvent.VK_A) {
            this.mt.setFangxiang(1);
            this.mt.xiangzuo();

        } else if (e.getKeyCode() == KeyEvent.VK_S) {
            this.mt.setFangxiang(2);
            this.mt.xiangxia();
        } else if (e.getKeyCode() == KeyEvent.VK_D) {
            this.mt.setFangxiang(3);
            this.mt.xiangyou();
        }
        if (e.getKeyCode() == KeyEvent.VK_J) {
            if (this.mt.aa.size() < 8) {//限制子弹的连发，不能一按就是一整串
                this.mt.fszd();
            }


        }
        this.repaint();

    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        while (true) {
            try {
                Thread.sleep(100);//隔着100毫秒之后再重新绘制子弹，而不是无间断的重绘
            } catch (Exception e) {
            }
            for (int i = 0; i < mt.aa.size(); i++) {//有子弹的情况下
                Zidan zd = mt.aa.get(i);//装进去
                if (zd.shengming) {//子弹的生命有效
                    //二层循环的意思就是让每一发子弹和每个敌人坦克进行比较
                    for (int j = 0; j < dtk.size(); j++) {//让子弹和坦克的坐标进行比较
                        DiTank dt = dtk.get(j);//把敌人的坦克装进去

                        if (dt.shengming) {
                            this.jzdf(zd, dt);//调用击中敌方这个函数
                        }
                    }
                }
                this.repaint();
            }
        }
    }
}

