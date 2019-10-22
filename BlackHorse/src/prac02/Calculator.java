package prac02;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Vector;
import java.math.BigDecimal;

public class Calculator {

    // 鎿嶄綔鏁�1锛屼负浜嗙▼搴忕殑瀹夊叏锛屽垵鍊间竴瀹氳缃紝杩欓噷鎴戜滑璁剧疆涓�0銆�
    String str1 = "0";

    // 鎿嶄綔鏁�2
    String str2 = "0";

    // 杩愮畻绗�
    String signal = "+";

    // 杩愮畻缁撴灉
    String result = "";

    // 浠ヤ笅k1鑷砶2涓虹姸鎬佸紑鍏�

    // 寮€鍏�1鐢ㄤ簬閫夋嫨杈撳叆鏂瑰悜锛屽皢瑕佸啓鍏tr1鎴杝tr2
    int k1 = 1;
    // 寮€鍏�2鐢ㄤ簬璁板綍绗﹀彿閿殑娆℃暟锛屽鏋� k2>1 璇存槑杩涜鐨勬槸 2+3-9+8 杩欐牱鐨勫绗﹀彿杩愮畻
    int k2 = 1;
    // 寮€鍏�3鐢ㄤ簬鏍囪瘑 str1 鏄惁鍙互琚竻0 锛岀瓑浜�1鏃跺彲浠ワ紝涓嶇瓑浜�1鏃朵笉鑳借娓�0
    int k3 = 1;
    // 寮€鍏�4鐢ㄤ簬鏍囪瘑 str2 鏄惁鍙互琚竻0
    int k4 = 1;
    // 寮€鍏�5鐢ㄤ簬鎺у埗灏忔暟鐐瑰彲鍚﹁褰曞叆锛岀瓑浜�1鏃跺彲浠ワ紝涓嶄负1鏃讹紝杈撳叆鐨勫皬鏁扮偣琚涪鎺�
    int k5 = 1;
    // store鐨勪綔鐢ㄧ被浼间簬瀵勫瓨鍣紝鐢ㄤ簬璁板綍鏄惁杩炵画鎸変笅绗﹀彿閿�
    JButton store;

    @SuppressWarnings("rawtypes")
    Vector vt = new Vector(20, 10);

    // 澹版槑鍚勪釜UI缁勪欢瀵硅薄骞跺垵濮嬪寲
    JFrame frame = new JFrame("Calculator");
    JTextField result_TextField = new JTextField(result, 20);
    JButton clear_Button = new JButton("Clear");
    JButton button0 = new JButton("0");
    JButton button1 = new JButton("1");
    JButton button2 = new JButton("2");
    JButton button3 = new JButton("3");
    JButton button4 = new JButton("4");
    JButton button5 = new JButton("5");
    JButton button6 = new JButton("6");
    JButton button7 = new JButton("7");
    JButton button8 = new JButton("8");
    JButton button9 = new JButton("9");
    JButton button_Dian = new JButton(".");
    JButton button_jia = new JButton("+");
    JButton button_jian = new JButton("-");
    JButton button_cheng = new JButton("*");
    JButton button_chu = new JButton("/");
    JButton button_dy = new JButton("=");

    // 璁＄畻鏈虹被鐨勬瀯閫犲櫒
    public Calculator() {

        // 涓烘寜閽缃瓑鏁堥敭锛屽嵆鍙互閫氳繃瀵瑰簲鐨勯敭鐩樻寜閿潵浠ｆ浛鐐瑰嚮瀹�
        button0.setMnemonic(KeyEvent.VK_0);
        // 鍏跺畠绛夋晥閿渷鐣ワ紝浣犲彲浠ヨ嚜琛岃ˉ鍏呭畬鏁�

        // 璁剧疆鏂囨湰妗嗕负鍙冲榻愶紝浣胯緭鍏ュ拰缁撴灉閮介潬鍙虫樉绀�
        result_TextField.setHorizontalAlignment(JTextField.RIGHT);

        // 灏哢I缁勪欢娣诲姞杩涘鍣ㄥ唴
        JPanel pan = new JPanel();
        pan.setLayout(new GridLayout(4, 4, 5, 5));
        pan.add(button7);
        pan.add(button8);
        pan.add(button9);
        pan.add(button_chu);
        pan.add(button4);
        pan.add(button5);
        pan.add(button6);
        pan.add(button_cheng);
        pan.add(button1);
        pan.add(button2);
        pan.add(button3);
        pan.add(button_jian);
        pan.add(button0);
        pan.add(button_Dian);
        pan.add(button_dy);
        pan.add(button_jia);
        pan.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

        JPanel pan2 = new JPanel();
        pan2.setLayout(new BorderLayout());
        pan2.add(result_TextField, BorderLayout.WEST);
        pan2.add(clear_Button, BorderLayout.EAST);

        // 璁剧疆涓荤獥鍙ｅ嚭鐜板湪灞忓箷涓婄殑浣嶇疆
        frame.setLocation(300, 200);
        // 璁剧疆绐椾綋涓嶈兘璋冨ぇ灏�
        frame.setResizable(false);
        frame.getContentPane().setLayout(new BorderLayout());
        frame.getContentPane().add(pan2, BorderLayout.NORTH);
        frame.getContentPane().add(pan, BorderLayout.CENTER);

        frame.pack();
        frame.setVisible(true);

        // 浜嬩欢澶勭悊绋嬪簭

        // 鏁板瓧閿�
        class Listener implements ActionListener {
            @SuppressWarnings("unchecked")
            public void actionPerformed(ActionEvent e) {
                String ss = ((JButton) e.getSource()).getText();
                store = (JButton) e.getSource();
                vt.add(store);
                if (k1 == 1) {
                    if (k3 == 1) {
                        str1 = "";

                        // 杩樺師寮€鍏砶5鐘舵€�
                        k5 = 1;
                    }
                    str1 = str1 + ss;

                    k3 = k3 + 1;

                    // 鏄剧ず缁撴灉
                    result_TextField.setText(str1);

                } else if (k1 == 2) {
                    if (k4 == 1) {
                        str2 = "";

                        // 杩樺師寮€鍏砶5鐘舵€�
                        k5 = 1;
                    }
                    str2 = str2 + ss;
                    k4 = k4 + 1;
                    result_TextField.setText(str2);
                }

            }
        }

        // 杈撳叆鐨勮繍绠楃鍙风殑澶勭悊
        class Listener_signal implements ActionListener {
            @SuppressWarnings("unchecked")
            public void actionPerformed(ActionEvent e) {
                String ss2 = ((JButton) e.getSource()).getText();
                store = (JButton) e.getSource();
                vt.add(store);

                if (k2 == 1) {
                    // 寮€鍏� k1 涓� 1 鏃跺悜鏁� 1 鍐欒緭鍏ュ€硷紝涓�2鏃跺悜鏁�2鍐欒緭鍏ュ€笺€�
                    k1 = 2;
                    k5 = 1;
                    signal = ss2;
                    k2 = k2 + 1;// 鎸夌鍙烽敭鐨勬鏁�
                } else {
                    int a = vt.size();
                    JButton c = (JButton) vt.get(a - 2);

                    if (!(c.getText().equals("+"))
                            && !(c.getText().equals("-"))
                            && !(c.getText().equals("*"))
                            && !(c.getText().equals("/")))

                    {
                        cal();
                        str1 = result;
                        // 寮€鍏� k1 涓� 1 鏃讹紝鍚戞暟 1 鍐欏€硷紝涓�2鏃跺悜鏁�2鍐�
                        k1 = 2;
                        k5 = 1;
                        k4 = 1;
                        signal = ss2;
                    }
                    k2 = k2 + 1;

                }

            }
        }

        // 娓呴櫎閿殑閫昏緫锛圕lear锛�
        class Listener_clear implements ActionListener {
            @SuppressWarnings("unchecked")
            public void actionPerformed(ActionEvent e) {
                store = (JButton) e.getSource();
                vt.add(store);
                k5 = 1;
                k2 = 1;
                k1 = 1;
                k3 = 1;
                k4 = 1;
                str1 = "0";
                str2 = "0";
                signal = "";
                result = "";
                result_TextField.setText(result);
                vt.clear();
            }
        }

        // 绛変簬閿殑閫昏緫
        class Listener_dy implements ActionListener {
            @SuppressWarnings("unchecked")
            public void actionPerformed(ActionEvent e) {

                store = (JButton) e.getSource();
                vt.add(store);
                cal();

                // 杩樺師鍚勪釜寮€鍏崇殑鐘舵€�
                k1 = 1;
                k2 = 1;
                k3 = 1;
                k4 = 1;

                str1 = result;
            }
        }

        // 灏忔暟鐐圭殑澶勭悊
        class Listener_xiaos implements ActionListener {
            @SuppressWarnings("unchecked")
            public void actionPerformed(ActionEvent e) {
                store = (JButton) e.getSource();
                vt.add(store);
                if (k5 == 1) {
                    String ss2 = ((JButton) e.getSource()).getText();
                    if (k1 == 1) {
                        if (k3 == 1) {
                            str1 = "";
                            // 杩樺師寮€鍏砶5鐘舵€�
                            k5 = 1;
                        }
                        str1 = str1 + ss2;

                        k3 = k3 + 1;

                        // 鏄剧ず缁撴灉
                        result_TextField.setText(str1);

                    } else if (k1 == 2) {
                        if (k4 == 1) {
                            str2 = "";
                            // 杩樺師寮€鍏砶5鐨勭姸鎬�
                            k5 = 1;
                        }
                        str2 = str2 + ss2;

                        k4 = k4 + 1;

                        result_TextField.setText(str2);
                    }
                }

                k5 = k5 + 1;
            }
        }

        // 娉ㄥ唽鍚勪釜鐩戝惉鍣紝鍗崇粦瀹氫簨浠跺搷搴旈€昏緫鍒板悇涓猆I缁勪欢涓�
        Listener_dy jt_dy = new Listener_dy();

        // 鐩戝惉鏁板瓧閿�
        Listener jt = new Listener();
        // 鐩戝惉绗﹀彿閿�
        Listener_signal jt_signal = new Listener_signal();
        // 鐩戝惉娓呴櫎閿�
        Listener_clear jt_c = new Listener_clear();
        // 鐩戝惉灏忔暟鐐归敭
        Listener_xiaos jt_xs = new Listener_xiaos();

        button7.addActionListener(jt);
        button8.addActionListener(jt);
        button9.addActionListener(jt);
        button_chu.addActionListener(jt_signal);
        button4.addActionListener(jt);
        button5.addActionListener(jt);
        button6.addActionListener(jt);
        button_cheng.addActionListener(jt_signal);
        button1.addActionListener(jt);
        button2.addActionListener(jt);
        button3.addActionListener(jt);
        button_jian.addActionListener(jt_signal);
        button0.addActionListener(jt);
        button_Dian.addActionListener(jt_xs);
        button_dy.addActionListener(jt_dy);
        button_jia.addActionListener(jt_signal);
        clear_Button.addActionListener(jt_c);

        // 绐椾綋鍏抽棴浜嬩欢鐨勫搷搴旂▼搴�
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }

    // 璁＄畻閫昏緫
    public void cal() {
        // 鎿嶄綔鏁�1
        double a2;
        // 鎿嶄綔鏁�2
        double b2;
        // 杩愮畻绗�
        String c = signal;
        // 杩愮畻缁撴灉
        double result2 = 0;

        if (c.equals("")) {
            result_TextField.setText("Please input operator");

        } else {
            // 鎵嬪姩澶勭悊灏忔暟鐐圭殑闂
            if (str1.equals("."))
                str1 = "0.0";
            if (str2.equals("."))
                str2 = "0.0";
            a2 = Double.valueOf(str1).doubleValue();
            b2 = Double.valueOf(str2).doubleValue();

            if (c.equals("+")) {
                result2 = a2 + b2;
            }
            if (c.equals("-")) {
                result2 = a2 - b2;
            }
            if (c.equals("*")) {
                BigDecimal m1 = new BigDecimal(Double.toString(a2));
                BigDecimal m2 = new BigDecimal(Double.toString(b2));
                result2 = m1.multiply(m2).doubleValue();
            }
            if (c.equals("/")) {
                if (b2 == 0) {
                    result2 = 0;
                } else {
                    result2 = a2 / b2;
                }

            }

            result = ((new Double(result2)).toString());

            result_TextField.setText(result);
        }
    }

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        // 璁剧疆绋嬪簭鏄剧ず鐨勭晫闈㈤鏍硷紝鍙互鍘婚櫎
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }
        Calculator cal = new Calculator();
    }

}

