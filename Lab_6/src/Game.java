import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.ThreadLocalRandom;

public class Game extends JFrame {
    public Game() {
        super("Game");
        setSize(200, 200);
        setLayout(new BorderLayout());

        JTextField input = new JTextField(10);
        this.add(input);
        input.setHorizontalAlignment(JTextField.CENTER);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton userButton = new JButton("CHECK");
        add(userButton, BorderLayout.SOUTH);
        final int[] counter = {0};
        Integer value = ThreadLocalRandom.current().nextInt(0, 20 + 1);

        userButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (input.getText().toString() == "") return;
                if (input.getText().toString().equals(value.toString())) {
                    JOptionPane.showMessageDialog(getContentPane(),
                            "Good job.",
                            "You are right",
                            JOptionPane.PLAIN_MESSAGE);
                    setVisible(false);
                    dispose();
                } else if (counter[0] == 2) {
                    JOptionPane.showMessageDialog(getContentPane(),
                            "Take the L",
                            "Good bye",
                            JOptionPane.PLAIN_MESSAGE);
                    setVisible(false);
                    dispose();
                } else {
                    counter[0]++;
                    if (Integer.parseInt(input.getText().toString()) > value) {
                        JOptionPane.showMessageDialog(getContentPane(),
                                "Number lower than yours",
                                "Nice try.",
                                JOptionPane.PLAIN_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(getContentPane(),
                                "Number bigger than yours",
                                "Nice try.",
                                JOptionPane.PLAIN_MESSAGE);
                    }
                }
            }
        });
    }
}
