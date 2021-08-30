package GUI;

import java.awt.Color;
// import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class panel {

    // JPanel is a GUI component that functions as a container to hold other components
    
    public static void main(String[] args) {
        ImageIcon icon = new ImageIcon("tree.png");
        
        JLabel label = new JLabel("Hello");
        label.setIcon(icon);
        //We don't need these setVerticalAlignment or setHorizontalAlignment if are not using layout manager. Its used if we are using Border Layout
        // label.setVerticalAlignment(JLabel.BOTTOM);
        // label.setHorizontalAlignment(JLabel.RIGHT);
        label.setBounds(100, 100, 100, 100);

        JPanel redpanel = new JPanel();
        redpanel.setBackground(Color.red);
        redpanel.setBounds(0, 0, 250, 250);
        // redpanel.setLayout(new BorderLayout());
        redpanel.setLayout(null);
        
        JPanel bluepanel = new JPanel();
        bluepanel.setBackground(Color.blue);
        bluepanel.setBounds(250, 0, 250, 250);
        // bluepanel.setLayout(new BorderLayout());
        bluepanel.setLayout(null);
        
        JPanel greenpanel = new JPanel();
        greenpanel.setBackground(Color.green);
        greenpanel.setBounds(0, 250, 500, 250);
        // greenpanel.setLayout(new BorderLayout());
        greenpanel.setLayout(null);
        
        
        JFrame frame = new JFrame("Panels");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(750,750);
        frame.setVisible(true);
        frame.setLayout(null);
        greenpanel.add(label); // can also be add to other panels, as they act like containers (just change the panel name)
        frame.add(redpanel);
        frame.add(bluepanel);
        frame.add(greenpanel);

    }
}
