import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Soft extends JFrame {
    private int maxXBorder = 300, maxYBorder = 250;

    Font fontBtn = new Font("Verdana", Font.PLAIN, 18);
    Font fontText = new Font("Verdana", Font.PLAIN, 10);
    Font fontMenu = new Font("Verdana", Font.PLAIN, 11);

    JPanel[] panel = new JPanel[6];
    JButton btn1 = new JButton("Жмяк 1");
    JButton btn2 = new JButton("Жмяк 2");;
    JTextArea textArea = new JTextArea("Абоба");


    public Soft(){
        super("Soft");
        setSize(maxXBorder,maxYBorder);
        setLayout(new GridLayout(2,3));
        for (int i = 0; i < 6; i++){
            panel[i] = new JPanel();
            add(panel[i]);
        }

        panel[0].add(btn1);
        btn1.setFont(fontBtn);
        btn1.setBackground(new Color(245,245,220));

        panel[2].add(btn2);
        btn2.setFont(fontBtn);
        btn2.setBackground(new Color(245,245,220));

        panel[4].add(textArea);
        textArea.setBackground(new Color(245,245,220));
        textArea.setFont(fontText);

        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        fileMenu.setFont(fontMenu);

        JMenuItem newMenu = new JMenuItem("Save");
        newMenu.setFont(fontMenu);
        fileMenu.add(newMenu);

        JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.setFont(fontMenu);
        fileMenu.add(exitItem);

        JMenu editMenu = new JMenu("Edit");
        editMenu.setFont(fontMenu);

        JMenuItem copyItem = new JMenuItem("Copy");
        copyItem.setFont(fontMenu);
        editMenu.add(copyItem);

        JMenuItem cutItem = new JMenuItem("Cut");
        cutItem.setFont(fontMenu);
        editMenu.add(cutItem);

        JMenuItem pasteItem = new JMenuItem("Paste");
        pasteItem.setFont(fontMenu);
        editMenu.add(pasteItem);

        JMenu helpMenu = new JMenu("Help");
        helpMenu.setFont(fontMenu);

        exitItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);


        setJMenuBar(menuBar);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[]args)
    {
        new Soft();
    }
}
