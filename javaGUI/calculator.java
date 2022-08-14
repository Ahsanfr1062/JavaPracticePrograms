import java.awt.*;
import java.awt.event.*;

public class calculator implements ActionListener {
    int c,n;
    String s1,s2,s3,s4,s5;
    Frame F;
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,badd,bsub,bdiv,bmul,beq,bclr;
    Panel p;
    GridLayout g;
    TextField txt;
    

    calculator() {
        F = new Frame("calculator");
        F.setLayout(new FlowLayout());
        p = new Panel();
        b0 = new Button("0");
        b0.addActionListener(this);
        b1 = new Button("1");
        b1.addActionListener(this);
        b2 = new Button("2");
        b2.addActionListener(this);
        b3 = new Button("3");
        b3.addActionListener(this);
        b4 = new Button("4");
        b4.addActionListener(this);
        b5 = new Button("5");
        b5.addActionListener(this);
        b6 = new Button("6");
        b6.addActionListener(this);
        b7 = new Button("7");
        b7.addActionListener(this);
        b8 = new Button("8");
        b8.addActionListener(this);
        b9 = new Button("9");
        b9.addActionListener(this);
        badd = new Button("+");
        badd.addActionListener(this);
        bsub = new Button("-");
        bsub.addActionListener(this);
        bdiv = new Button("/");
        bdiv.addActionListener(this);
        bmul = new Button("*");
        bmul.addActionListener(this);
        bclr = new Button("clr");
        bclr.addActionListener(this);
        beq = new Button("=");
        beq.addActionListener(this);

        txt = new TextField(20);
        F.add(txt);
        g = new GridLayout(4,4,5,5);
        p.setLayout(g);

        p.add(b0);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(b7);
        p.add(b8);
        p.add(b9);
        p.add(badd);
        p.add(bsub);
        p.add(bdiv);
        p.add(bmul);
        p.add(beq);
        p.add(bclr);
        F.add(p);
        F.setSize(300,300);
        F.setVisible(true);
        F.setBackground(Color.DARK_GRAY);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b0) {
            s3 = txt.getText();
            s4 = "0";
            s5 = s3+s4;
            txt.setText(s5);
            txt.setBackground(Color.BLUE);

        }
        if(e.getSource() == b1) {
            s3 = txt.getText();
            s4 = "1";
            s5 = s3+s4;
            txt.setText(s5);
            txt.setBackground(Color.BLUE);
            
        }
        if(e.getSource() == b2) {
            s3 = txt.getText();
            s4 = "2";
            s5 = s3+s4;
            txt.setText(s5);
            txt.setBackground(Color.BLUE);
            
        }
        if(e.getSource() == b3) {
            s3 = txt.getText();
            s4 = "3";
            s5 = s3+s4;
            txt.setText(s5);
            txt.setBackground(Color.BLUE);
            
        }
        if(e.getSource() == b4) {
            s3 = txt.getText();
            s4 = "4";
            s5 = s3+s4;
            txt.setText(s5);
            txt.setBackground(Color.BLUE);
            
        }
        if(e.getSource() == b5) {
            s3 = txt.getText();
            s4 = "5";
            s5 = s3+s4;
            txt.setText(s5);
            txt.setBackground(Color.BLUE);
            
        }
        if(e.getSource() == b6) {
            s3 = txt.getText();
            s4 = "6";
            s5 = s3+s4;
            txt.setText(s5);
            txt.setBackground(Color.BLUE);
            
        }
        if(e.getSource() == b7) {
            s3 = txt.getText();
            s4 = "7";
            s5 = s3+s4;
            txt.setText(s5);
            txt.setBackground(Color.BLUE);
            
        }
        if(e.getSource() == b8) {
            s3 = txt.getText();
            s4 = "8";
            s5 = s3+s4;
            txt.setText(s5);
            txt.setBackground(Color.BLUE);
            
        }
        if(e.getSource() == b9) {
            s3 = txt.getText();
            s4 = "9";
            s5 = s3+s4;
            txt.setText(s5);
            txt.setBackground(Color.BLUE);
            
        }
        if(e.getSource() == badd) {
            s1 = txt.getText();
            txt.setText("+");
            txt.setBackground(Color.BLUE);
            c = 1;
            
        }
        if(e.getSource() == bsub) {
            s1 = txt.getText();
            txt.setText("-");
            txt.setBackground(Color.BLUE);
            c = 2;
            
        }
        if(e.getSource() == bmul) {
            s1 = txt.getText();
            txt.setText("*");
            txt.setBackground(Color.BLUE);
            c = 3;
            
        }
        if(e.getSource() == bdiv) {
            s1 = txt.getText();
            txt.setText("/");
            txt.setBackground(Color.BLUE);
            c = 4;
            
        }
        if(e.getSource() == beq) {
            s2 = txt.getText();
            if(c==1) {
                n = Integer.parseInt(s1) + Integer.parseInt(s2);
                txt.setText(String.valueOf(n));

            }
            if(c==2) {
                n = Integer.parseInt(s1) - Integer.parseInt(s2);
                txt.setText(String.valueOf(n));
                
            }
            if(c==3) {
                n = Integer.parseInt(s1) * Integer.parseInt(s2);
                txt.setText(String.valueOf(n));
                
            }
            if(c==4) {
                n = Integer.parseInt(s1) / Integer.parseInt(s2);
                txt.setText(String.valueOf(n));
                
            }
            
        }
        if(e.getSource() == bclr) {
            txt.setText("");
        }

        
    }
    public static void main(String[] args) {

        calculator c = new calculator();
        
    }


}