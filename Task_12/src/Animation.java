import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;

class Animation extends JFrame {
    int framesNum = 51;

    public Animation() throws Exception {

        super("Animation");
        setLayout(new BorderLayout());
        setSize(1920, 1080);
        this.getContentPane().setBackground( Color.gray );

        Image[] frames = new Image[framesNum];

        for( int i = 0; i < framesNum; i++){
            StringBuilder src = new StringBuilder("D:\\Projects Java\\Task_12\\video\\0 (");
            src.append(Integer.toString(i+1)).append(").jpg");
            System.out.println(new String(src));
            frames[i] = ImageIO.read( new File( new String(src)));
        }

        BufferedImage img = null;
        JToggleButton btn = new JToggleButton("Start");
        btn.setBackground(Color.BLACK);
        btn.setForeground(Color.gray);
        btn.setFocusPainted(false);
        btn.setFont(new Font("Times New Roman", Font.BOLD, 32));
        JPanel jp = new JPanel(new BorderLayout());
        JLabel label = new JLabel(new ImageIcon(frames[0]));
        add(label, BorderLayout.CENTER);
        jp.add(btn, BorderLayout.CENTER);
        add(jp, BorderLayout.NORTH);

        ActionListener animate = new ActionListener() { //

            public int index = 0;

            @Override
            public void actionPerformed(ActionEvent e) {
                if (index < frames.length - 1) {
                    index++;
                } else {
                    index = 0;
                }
                label.setIcon(new ImageIcon(frames[index]));
            }
        };
        final Timer timer = new Timer(80, animate);
        // чтобы анимация выглядела норм
        Border emptyBorder = BorderFactory.createEmptyBorder();
        btn.setBorder(emptyBorder);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (btn.isSelected()) {
                    btn.setText("Stop");
                    timer.start();
                    btn.setForeground(Color.WHITE);
                } else {
                    btn.setText("Start");
                    timer.stop();
                    btn.setForeground(Color.gray);
                }

            }
        });
        UIManager.put("ToggleButton.select", Color.BLACK);
        SwingUtilities.updateComponentTreeUI(btn);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) throws Exception {
        new Animation().setVisible(true);
    }
}