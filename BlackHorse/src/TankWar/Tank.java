package TankWar;


import java.util.Vector;
@SuppressWarnings("all")
class Tank{//2
    //6充实坦克类
    int x=0,y=0;//x为横坐标，y为纵坐标
    //选中，右键-source-Generate Getters and Setters,生成下面的这些封装方法
    //为坦克添加方向和速度，并且将方向和速度也封装起来
    int fangxiang=0;
    int sudu=5;
    int Color;
    boolean shengming=true;

    public int getColor() {
        return Color;
    }

    public void setColor(int color) {
        Color = color;
    }

    public int getFangxiang() {
        return fangxiang;
    }

    public void setFangxiang(int fangxiang) {
        this.fangxiang = fangxiang;
    }

    public int getSudu() {
        return sudu;
    }

    public void setSudu(int sudu) {
        this.sudu = sudu;
    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    //然后写一个构造方法
    public Tank(int x,int y) {
        //初始化横纵坐标
        this.x=x;
        this.y=y;

    }
}
@SuppressWarnings("all")
class DiTank extends Tank implements Runnable{
    int sudu=7;//为了让敌人的坦克比自己的坦克快
    int time=0;
    Vector<Zidan> dzd=new Vector<Zidan>();
    Vector<DiTank> dtk=new Vector<DiTank>();




    public DiTank(int x, int y) {
        super(x, y);
        // TODO Auto-generated constructor stub
    }
    public void dtkxl(Vector<DiTank> dxl) {//避免敌方坦克的重叠
        this.dtk=dxl;


    }
    public boolean huxiangpengzhuang() {
        boolean b=false;
        switch(this.fangxiang) {
            case 0:
                for(int i=0;i<dtk.size();i++) {//取出每一辆敌坦克
                    DiTank dt=dtk.get(i);
                    if(dt!=this) {//如果敌人的坦克不等于自己
                        if(dt.fangxiang==0||dt.fangxiang==2) {
                            if(this.x>=dt.x && this.x<=dt.x+20 && this.y>=dt.y && this.y<=dt.y+30) {
                                return true;

                            }
                            if(this.x+20>=dt.x && this.x+20<dt.x+20 && this.y>=dt.y && this.y<=dt.y+30) {
                                return true;

                            }

                        }
                        if(dt.fangxiang==1||dt.fangxiang==3) {
                            if(this.x>=dt.x && this.x<=dt.x+20 && this.y>=dt.y && this.y<=dt.y+30) {
                                return true;

                            }
                            if(this.x+20>=dt.x && this.x+20<dt.x+30 && this.y>=dt.y && this.y<=dt.y+20) {
                                return true;

                            }

                        }

                    }

                }
                break;
            case 1:
                for(int i=0;i<dtk.size();i++) {//取出每一辆敌坦克
                    DiTank dt=dtk.get(i);
                    if(dt!=this) {//如果敌人的坦克不等于自己
                        if(dt.fangxiang==0||dt.fangxiang==2) {
                            if(this.x>=dt.x && this.x<=dt.x+20 && this.y>=dt.y && this.y<=dt.y+30) {
                                return true;

                            }
                            if(this.x+20>=dt.x && this.x+20<dt.x+20 && this.y>=dt.y && this.y<=dt.y+30) {
                                return true;

                            }

                        }
                        if(dt.fangxiang==1||dt.fangxiang==3) {
                            if(this.x>=dt.x && this.x<=dt.x+20 && this.y>=dt.y && this.y<=dt.y+30) {
                                return true;

                            }
                            if(this.x+20>=dt.x && this.x+20<dt.x+30 && this.y>=dt.y && this.y<=dt.y+20) {
                                return true;

                            }

                        }

                    }

                }
                break;
            case 2:
                for(int i=0;i<dtk.size();i++) {//取出每一辆敌坦克
                    DiTank dt=dtk.get(i);
                    if(dt!=this) {//如果敌人的坦克不等于自己
                        if(dt.fangxiang==0||dt.fangxiang==2) {
                            if(this.x>=dt.x && this.x<=dt.x+20 && this.y>=dt.y && this.y<=dt.y+30) {
                                return true;

                            }
                            if(this.x+20>=dt.x && this.x+20<dt.x+20 && this.y>=dt.y && this.y<=dt.y+30) {
                                return true;

                            }

                        }
                        if(dt.fangxiang==1||dt.fangxiang==3) {
                            if(this.x>=dt.x && this.x<=dt.x+20 && this.y>=dt.y && this.y<=dt.y+30) {
                                return true;

                            }
                            if(this.x+20>=dt.x && this.x+20<dt.x+30 && this.y>=dt.y && this.y<=dt.y+20) {
                                return true;

                            }

                        }

                    }

                }
                break;
            case 3:
                for(int i=0;i<dtk.size();i++) {//取出每一辆敌坦克
                    DiTank dt=dtk.get(i);
                    if(dt!=this) {//如果敌人的坦克不等于自己
                        if(dt.fangxiang==0||dt.fangxiang==2) {
                            if(this.x>=dt.x && this.x<=dt.x+20 && this.y>=dt.y && this.y<=dt.y+30) {
                                return true;

                            }
                            if(this.x+20>=dt.x && this.x+20<dt.x+20 && this.y>=dt.y && this.y<=dt.y+30) {
                                return true;

                            }

                        }
                        if(dt.fangxiang==1||dt.fangxiang==3) {
                            if(this.x>=dt.x && this.x<=dt.x+20 && this.y>=dt.y && this.y<=dt.y+30) {
                                return true;

                            }
                            if(this.x+20>=dt.x && this.x+20<dt.x+30 && this.y>=dt.y && this.y<=dt.y+20) {
                                return true;

                            }

                        }

                    }

                }
                break;


        }
        return b;//因为上面所有的return 都在循环里面，所以编译器会认为不一定会有return被执行


    }
    @Override
    public void run() {
        // TODO Auto-generated method stub
        //修改后让敌人的坦克可以运动一段时间再换方向，而不是随意的改变方向
        while(true) {
            switch(this.fangxiang) {
                case 0:
                    for(int i=0;i<30;i++) {
                        if(y>0&& !huxiangpengzhuang()) {
                            y-=sudu;}
                        try {
                            Thread.sleep(50);
                        }catch(Exception e) {}

                    }
                    break;
                case 1:
                    for(int i=0;i<30;i++) {//30这个数越大，它向着一个方向走的时间就越长
                        if(x>0 && !huxiangpengzhuang()) {//限制边界
                            x-=sudu;}
                        try {
                            Thread.sleep(50);
                        }catch(Exception e) {}

                    }
                    break;
                case 2:
                    for(int i=0;i<30;i++) {
                        if(y<250  && !huxiangpengzhuang()) {//限制边界
                            y+=sudu;}
                        try {
                            Thread.sleep(50);
                        }catch(Exception e) {}

                    }
                    break;
                case 3:
                    for(int i=0;i<30;i++) {
                        if(x<360  && !huxiangpengzhuang()) {
                            x+=sudu;}
                        try {
                            Thread.sleep(50);
                        }catch(Exception e) {}

                    }
                    break;

            }

            this.fangxiang=(int)(Math.random()*4);//随机出现0-3之间的数字
            if(this.shengming==false) {//只有生命为假时，才能没有，不能坦克自己飞着就没了
                break;

            }
            this.time++;
            if(time%2==0) {//减慢子弹的发射速度，这样就是偶数发子弹，奇数就不发子弹了
                if(shengming) {//先判断生命是否为假
                    if(dzd.size()<5) {//应许发五个子弹
                        Zidan zd=null;
                        switch(fangxiang) {//坦克方向，
                            case 0:
                                zd=new Zidan(x+10,y,0);//输入的坐标 new一个，添加进去
                                dzd.add(zd);
                                break;
                            case 1:
                                zd=new Zidan(x,y+10,1);
                                dzd.add(zd);
                                break;
                            case 2:
                                zd=new Zidan(x+10,y+30,2);
                                dzd.add(zd);
                                break;
                            case 3:
                                zd=new Zidan(x+30,y+10,3);
                                dzd.add(zd);
                                break;


                        }
                        Thread t5=new Thread(zd);
                        t5.start();

                    }

                }

            }
        }


    }

}
//公共属性放在Tank类中，然后再建立一个MyTank和敌人的Tank,并且对Tank类进行继承，使用公共属性
class MyTank extends Tank{//子弹发射必须写进MyTank类里，因为子弹发射是需要随着我的坦克走的,子弹的功能大多和坦克有关
    Vector<Zidan>aa=new Vector<Zidan>();//集合类要存就存，要取就取
    //创建集合类是为了解决一次只能发送一颗子弹的问题

    Zidan zd=null;
    //3
    //增加一个构造方法
    public MyTank(int x, int y) {
        super(x, y);
    }

    //7增加上下左右功能
    public void xiangshang() {
        y-=sudu;
    }
    public void xiangxia() {
        y+=sudu;

    }
    public void xiangzuo() {
        x-=sudu;
    }
    public void xiangyou() {
        x+=sudu;
    }
    public void fszd() {
        // TODO Auto-generated method stub
        switch(this.fangxiang) {
            //下面的左标就是画子弹的位置，不是子弹射出来，实质上是在相应的位置连续画出子弹，达到射击的效果
            case 0://上
                zd= new Zidan(x+10,y, 0);
                aa.add(zd);//子弹只有一颗，为保证其连续性
                break;
            case 1://左
                zd=new Zidan(x,y+10, 1);
                aa.add(zd);
                break;
            case 2://下
                zd=new Zidan(x+10,y+30, 2);
                aa.add(zd);
                break;
            case 3://右
                zd=new Zidan(x+30,y+10, 3);
                aa.add(zd);
                break;

        }
        //线程启动必须在Tank类中，因为子弹是随着坦克移动和发出的
        Thread t=new Thread(zd);
        t.start();

    }



}
class Zidan implements Runnable{
    int x;
    int y;
    int fangxiang;
    int sudu=5;
    boolean shengming=true;//这个参数就是为了防止子弹穿墙而过的

    public Zidan(int x,int y,int fangxiang) {
        this.x=x;
        this.y=y;
        this.fangxiang=fangxiang;
    }
    @Override
    public void run() {
        // TODO Auto-generated method stub
        while(true) {//死循环下面一般都需要异常处理
            try{
                Thread.sleep(50);

            }catch(Exception e) {}
            switch(fangxiang) {
                case 0://上
                    y-=sudu;
                    break;
                case 1://左
                    x-=sudu;
                    break;
                case 2://下
                    y+=sudu;
                    break;
                case 3://右
                    x+=sudu;
                    break;

            }
            if(x<0||x>400||y<0||y>300) {//画布边界
                this.shengming=false;
                break;//如果超出边界，就停止绘制子弹

            }

        }

    }



}

class Jilu{
    private static int dtsl=10;
    private static int mtsl=2;
    public static int getDtsl() {
        return dtsl;
    }
    public static void setDtsl(int dtsl) {
        Jilu.dtsl = dtsl;
    }
    public static int getMtsl() {
        return mtsl;
    }
    public static void setMtsl(int mtsl) {
        Jilu.mtsl = mtsl;
    }
    public static void dtjs() {//敌人坦克减少
        dtsl--;
    }

}

