/*
 * I am going to make a little ATM Project, so I needed to learn the GUI
 * This is just a click counter, but I decieded to post it to show my progress!
 */


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class GUI implements ActionListener {

    String troll = ("Fuck the Browns");
    String championships = ("The steelers are 6 times SuperBowl Champs");
    private JLabel label;
    private JPanel panel;
    private JFrame frame;
    private Border border;
    private ImageIcon image;
    private JButton button;
    private JButton test;

    public GUI() {

        image = new ImageIcon("steelers.png");
        border = BorderFactory.createLineBorder(Color.gray, 3);
        panel = new JPanel();
        frame = new JFrame();
        label = new JLabel("Java GUI label");
        button = new JButton("Click Me");
        test = new JButton("Data");

        test.addActionListener(new TestButtonListener());
        test.setBackground(Color.LIGHT_GRAY);
        test.setBounds(0, 720, 100, 30);

        button.addActionListener(this);
        button.setBackground(Color.LIGHT_GRAY);
        button.setBounds(650, 720, 100, 30);

        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.BOTTOM);
        label.setIcon(image);
        label.setIconTextGap(20);
        label.setForeground(Color.gray);
        label.setFont(new Font("Times New Roman", Font.ITALIC, 20));
        label.setBackground(Color.BLACK);
        label.setBorder(border);
        label.setOpaque(false);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(115, 100, 500, 500);

        panel.setLayout(null); 
        panel.setBorder(BorderFactory.createEmptyBorder(400, 400, 400, 400));
        panel.add(label);
        panel.add(button);
        panel.add(test);
        panel.setBackground(Color.white);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("I am a JAVA GUI");
        frame.setSize(750, 750);
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.BLACK);
    }

    public static void main(String[] args) {
        new GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        label.setText(troll);
    }

    private class TestButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            label.setText(championships);
        }
    }
}
