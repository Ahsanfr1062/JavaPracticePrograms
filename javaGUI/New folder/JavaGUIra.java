
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class JavaGUIra implements ActionListener{
    JLabel lbl;
    JFrame frm;
    JButton btn1,btn2,btn3,btn4;
    Container con;
    FlowLayout flw;
    int count;

    void myGUI(){
        frm = new JFrame();
        con = frm.getContentPane();
        flw = new FlowLayout();
        con.setLayout(flw);
        lbl = new JLabel("count me in");
       lbl.setBounds(300,200,100,70);
        btn1 = new JButton("click me 1");
        btn2 = new JButton("click me 2");
        btn3 = new JButton("click me 3");
        btn4 = new JButton("click me 4");
        btn1.addActionListener(this);
        con.add(btn1);
        con.add(btn2);
        con.add(btn3);
        con.add(btn4);
        con.add(lbl);
        frm.setSize(300,400);
		frm.setVisible(true);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String args[]){
        JavaGUIra o= new JavaGUIra();
		o.myGUI();
    }

    public void actionPerformed(ActionEvent e){
        String x;
        x = e.getActionCommand();
        ++count;
        lbl.setText(count + "");


    }
}