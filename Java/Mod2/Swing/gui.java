package Mod2.Swing;

import javax.swing.*;
import java.awt.*;


public class gui {
    public static void main(String args []) {
        //Generate our fram
        JFrame frame = new JFrame("PPUClass");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);

        //menu for compponents
        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("Code");
        JMenu m2 = new JMenu("Run");
        mb.add(m1);
        mb.add(m2);
        JMenuItem m1a = new JMenuItem("About PPU");
        JMenuItem m1b = new JMenuItem("Exit");
        m1.add(m1a);
        m1.add(m1b);

        //Panel
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Input Data");
        JTextField txtField1 = new JTextField(25);
        JButton send = new JButton("Submit");
        JButton reset = new JButton("Reset");
        panel.add(label);
        panel.add(txtField1);
        panel.add(send);
        panel.add(reset);

        //Text Area
        JTextArea textArea1 = new JTextArea();

        //Add Components
        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.getContentPane().add(BorderLayout.NORTH, mb);
        frame.getContentPane().add(BorderLayout.CENTER, textArea1);



    }
}
