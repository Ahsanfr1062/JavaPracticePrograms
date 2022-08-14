import javax.swing.*;
import java.awt.event.*;
public class GuiDemo implements ActionListener{
    JButton b;
    JFrame f;
GuiDemo(){
f = new JFrame("Swing");
b = new JButton("Click Here");
b.addActionListener(this);
f.setLayout(null);
f.add(b);
b.setBounds(50,50,100,30);
f.setVisible(true);
f.setSize(200,200);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

public void actionPerformed(ActionEvent e) {
    b.setText("code here");
}
public static void main(String args[]){
new GuiDemo();

}
}