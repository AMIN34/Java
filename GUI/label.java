package GUI;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class label {

    // JLabel is a GUI display area for a string of text, an image, or both

    public static void main(String[] args) {

        ImageIcon image = new ImageIcon("tree.png");
        Border border = BorderFactory.createLineBorder(Color.green,3);


        JLabel label = new JLabel("Hello Amin"); // create a label
        // label.setText("Hello Aminur"); // Set text of label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); //set text LEFT, CENTRE, RIGHT of image-icon
        label.setVerticalTextPosition(JLabel.TOP); // set text TOP, CENTER, BOTTOM of image-icon
        label.setForeground(new Color(0x00FF00)); // set font colot of text
        label.setFont(new Font("MV Boli",Font.PLAIN,50)); // set font of text
        label.setIconTextGap(25); // set gap of text to image
        label.setBackground(Color.black); //set background color
        label.setOpaque(true); //display background color
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER); // set vertical position of icon +text within label
        label.setHorizontalAlignment(JLabel.CENTER); //set horizontal position of icon+text within label
        // label.setBounds(100, 100, 250, 250); // set x,y position frame as well as dimension

        JFrame frame = new JFrame("Labels");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setSize(500, 500);
        // frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
        frame.pack();//first add all the labels then pack
    }
}
