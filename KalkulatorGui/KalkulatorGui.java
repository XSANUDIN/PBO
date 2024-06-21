import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.*;

public class KalkulatorGui implements ActionListener {
    JFrame frame;
    JTextField tf, tfh;
    JButton[] btA = new JButton[10];
    JButton[] btF = new JButton[10];
    JButton tbBt, bgBt, krBt, klBt, modBt, negBt;
    JButton hpsBt, hslBt, clrBt, dsBt;
    JPanel panel;


    double num1=0, num2=0, result=0;
    char opr;

    KalkulatorGui(){

        frame = new JFrame("Kalkulator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 540);
        frame.setLayout(null);
        frame.setBackground(new Color(25,25,25));
        frame.setForeground(Color.BLACK);


        tf = new JTextField();
        tf.setBounds(5,49,375,50);
        tf.setEditable(false);
        tf.setBackground(new Color(25, 25, 25 ));
        tf.setForeground(Color.WHITE);
        tf.setFont(new Font("Arial", Font.BOLD, 24));

        tfh = new JTextField();
        tfh.setBounds(5,25,375,25);
        tfh.setEditable(false);
        tfh.setBackground(new Color(25, 25, 25  ));
        tfh.setForeground(Color.LIGHT_GRAY);
        tfh.setFont(new Font("Arial", Font.PLAIN, 15));


        tbBt = new JButton("+");
        bgBt = new JButton("/");
        krBt = new JButton("-");
        klBt = new JButton("*");
        hpsBt = new JButton("<x");
        clrBt = new JButton("C");
        hslBt = new JButton("=");
        dsBt = new JButton(".");
        modBt = new JButton("%");
        negBt = new JButton("- / +");

        btF[0]=tbBt;
        btF[1]=bgBt;
        btF[2]=krBt;
        btF[3]=klBt;
        btF[4]=hpsBt;
        btF[5]=clrBt;
        btF[6]=hslBt;
        btF[7]=dsBt;
        btF[8]=modBt;
        btF[9]=negBt;

        for (int i = 0; i < 10; i++) {
            btF[i].addActionListener(this);
            btF[i].setBackground(Color.BLACK);
            btF[i].setForeground(Color.WHITE);
            btF[i].setOpaque(false);
            btF[i].setContentAreaFilled(false);
            btF[i].setBorderPainted(true);
        }

        for (int i = 0; i < 10; i++) {
            btA[i] = new JButton(String.valueOf(i));
            btA[i].addActionListener(this);
            btA[i].setBackground(Color.BLACK);
            btA[i].setForeground(Color.WHITE);
            btA[i].setOpaque(false);
            btA[i].setContentAreaFilled(false);
            btA[i].setBorderPainted(true);

        }

        panel = new JPanel();
        panel.setBounds(5, 145, 375, 350);
        panel.setLayout(new GridLayout(5,4,5,5));
        panel.setBackground(new Color(25,25,25));



        panel.add(modBt);
        panel.add(clrBt);
        panel.add(hpsBt);
        panel.add(bgBt);
        panel.add(btA[1]);
        panel.add(btA[2]);
        panel.add(btA[3]);
        panel.add(klBt);
        panel.add(btA[4]);
        panel.add(btA[5]);
        panel.add(btA[6]);
        panel.add(tbBt);
        panel.add(btA[7]);
        panel.add(btA[8]);
        panel.add(btA[9]);
        panel.add(krBt);
        panel.add(negBt);
        panel.add(btA[0]);
        panel.add(dsBt);
        panel.add(hslBt);

        frame.add(panel);
        frame.add(tfh);
        frame.add(tf);
        frame.setVisible(true);
    }





    public static void main(String[] args){
        KalkulatorGui kalkulator = new KalkulatorGui();
    }



    @Override
    public void actionPerformed(ActionEvent e) {

        for (int i = 0; i < 10; i++) {
            if(e.getSource() == btA[i]){
                tf.setText(tf.getText().concat(String.valueOf(i)));
            }
        }

        if (e.getSource()==dsBt){
            tf.setText(tf.getText().concat(String.valueOf(".")));
        }
        if (e.getSource()==tbBt){
            num1 = Double.parseDouble(tf.getText());
            opr = '+';
            tf.setText("");
            tfh.setText(num1 + " + ");
        }
        if (e.getSource()==klBt){
            num1 = Double.parseDouble(tf.getText());
            opr = '*';
            tf.setText("");
            tfh.setText(num1 + " * ");
        }
        if (e.getSource()==bgBt){
            num1 = Double.parseDouble(tf.getText());
            opr = '/';
            tf.setText("");
            tfh.setText(num1 + " / ");
        }
        if (e.getSource()==krBt){
            num1 = Double.parseDouble(tf.getText());
            opr = '-';
            tf.setText("");
            tfh.setText(num1 + " - ");
        }
        if (e.getSource()==modBt){
            num1 = Double.parseDouble(tf.getText());
            opr = '%';
            tf.setText("");
            tfh.setText(num1 + " % ");
        }
        if (e.getSource()==negBt){
            num1 = Double.parseDouble(tf.getText());
            opr = '-';
        }

        if (e.getSource()==hslBt){
            num2 = Double.parseDouble(tf.getText());
            try {
                num2 = Double.parseDouble(tf.getText());
                switch (opr) {
                    case '+':
                        result = num1 + num2;
                        break;
                    case '-':
                        result = num1 - num2;
                        break;
                    case '*':
                        result = num1 * num2;
                        break;
                    case '/':
                        if (num2 != 0) {
                            result = num1 / num2;
                        } else {
                            throw new ArithmeticException("Division by zero");
                        }
                        break;
                    case '%':
                        result = num1 % num2;
                        break;
                }
                if (result % 1 == 0) {
                    tf.setText(String.valueOf((int) result));
                    tfh.setText(tfh.getText() +  num2 + " = " + (int) result);
                } else {
                    tf.setText(String.valueOf(result));
                    tfh.setText(tfh.getText() + num2 + " = " + result);
                }
                num1 = result;
            } catch (NumberFormatException ex) {
                tf.setText("Error");
            } catch (ArithmeticException ex) {
                tf.setText("Error: Division by zero");
            }
        }

        if (e.getSource()==clrBt){
            tf.setText("");
            tfh.setText("");
        }
        if (e.getSource()==hpsBt){
            String x = tf.getText();
            tf.setText("");
            for (int i = 0; i < x.length()-1; i++) {
                tf.setText(tf.getText()+x.charAt(i));
            }
        }
        if (e.getSource()==negBt){
            double temp = Double.parseDouble(tf.getText());
            temp *= -1;
            tf.setText(String.valueOf(temp));
        }
    }
}