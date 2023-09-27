/*
 * I am going to make a little ATM Project, so I needed to learn the GUI
 * This is just a click counter, but I decieded to post it to show my progress!
 */


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI implements ActionListener{

    int count = 0;
    JLabel label;
    JPanel panel;
    JFrame frame; 
    
    public GUI(){

        frame =  new JFrame();

        JButton button = new JButton("I am a BUTTON");
        button.addActionListener(this);
        button.setBackground(Color.white);

        label = new JLabel("Number of clicks");
        

        panel = new JPanel();
        panel.setBorder((BorderFactory.createEmptyBorder(350, 350, 350, 350)));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(label);
        panel.setBackground(Color.LIGHT_GRAY);


        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("I am a JAVA GUI");
        frame.pack();
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.BLACK);
    }

    public static void main (String[] args){
        new GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Number of clicks " + count);
    }


}