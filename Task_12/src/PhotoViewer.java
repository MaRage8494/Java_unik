import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.File;


class PhotoViewer extends JFrame {
    JTextField textField = new JTextField(55);
    JButton buttonFind = new JButton("Find");
    Font fontTextField = new Font("Times new roman",Font.BOLD,30);


    public PhotoViewer() {

        super("Photo Viewer");
        getContentPane().setBackground(Color.black);
        setLayout(new FlowLayout());
        setSize(1920,1080);


        add(textField);
        textField.setForeground(Color.black);
        textField.setBackground(Color.gray);
        textField.setFont(fontTextField);

        add(buttonFind);
        buttonFind.setFont(fontTextField);
        buttonFind.setBackground(Color.gray);


        JLabel label = new JLabel();
        add(label);
        label.setLocation(960, 540);

        buttonFind.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try{
                    String src = textField.getText().trim();
                    System.out.println(src);

                    Image photo = ImageIO.read( new File( src));
                    label.setIcon(new ImageIcon(photo));
                    label.setLocation(960, 540);
                }
                catch(Exception exp){
                    JOptionPane.showMessageDialog(null, "Not string",
                            "alert", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) throws Exception {
        new PhotoViewer();
    }
}