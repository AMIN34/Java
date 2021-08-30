package GUI;

import javax.swing.*;
import java.awt.*;

public class ChatUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Chat Frame UI"); //creates a frame and the set the title
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
        frame.setResizable(false); //Prevent frame being resized
        frame.setSize(400, 400); //sets the x-dimension and y-dimension of frame

        /* ImageIcon image =new ImageIcon("favicon.ico");//create an ImageIcon
        frame.setIconImage(image.getImage()); */
        
        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("File");
        JMenu m2 = new JMenu("Help");
        mb.add(m1);
        mb.add(m2);
        JMenuItem m11 = new JMenuItem("Open");
        JMenuItem m12 = new JMenuItem("Save As");
        m1.add(m11);
        m1.add(m12);
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Enter Text : ");
        JTextField tf = new JTextField(10);
        JButton send = new JButton("Send");
        JButton reset = new JButton("Reset");
        panel.add(label);
        panel.add(tf);
        panel.add(send);
        panel.add(reset);
        // JTextArea tm = new JTextArea();
        frame.getContentPane().add(BorderLayout.SOUTH,panel);
        // frame.getContentPane().add(BorderLayout.CENTER,tm);
        frame.getContentPane().add(BorderLayout.NORTH,mb);
        frame.getContentPane().setBackground(new Color(0X123456)); //change background color
        frame.setVisible(true); //make frame visible
    }
    
}
