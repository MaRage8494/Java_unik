import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Soccer extends JFrame {
    public int milanScore = 0;
    public int realScore = 0;
    public String Winner = "DRAW";
    public String lastScore = "N/A";
    private JButton milan = new JButton("AC Milan");
    private JButton real = new JButton("Real Madrid");
    public JLabel goals = new JLabel("Result: " + milanScore + " X " + realScore);
    public JLabel last_score = new JLabel("Last Scorer: " + lastScore);
    public JLabel winner = new JLabel("Winner: " + Winner);
    JPanel[] pnl = new JPanel[6];
    public void podschet(){
        last_score.setText("Last Scorer: " + lastScore);
        goals.setText("Result: " + milanScore + " X " + realScore);
        if (milanScore > realScore){
            winner.setText("Winner: " + "AC Milan");
        }
        else if (realScore > milanScore) {
            winner.setText("Winner: " + "Real Madrid");
        }
        else if (realScore == milanScore){
            winner.setText("Winner: " + "DRAW");
        }
    }

    public Soccer(){
        super("AC Milan vs Real Madrid");
        this.setSize(500,170);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(2,3,10,10));
        for (int i = 0; i < pnl.length; i++){
            pnl[i] = new JPanel();
            add(pnl[i]);
        }
        milan.addActionListener(new milanscore());
        pnl[0].add(milan);
        real.addActionListener(new realscore());
        pnl[2].add(real);
        pnl[1].add(goals);
        pnl[3].add(last_score);
        pnl[5].add(winner);

    }
    class milanscore implements ActionListener{
        public void actionPerformed(ActionEvent e){
            milanScore += 1;
            lastScore = "AC Milan";
            podschet();
        }
    }

    class realscore implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            realScore += 1;
            lastScore = "Real Madrid";
            podschet();
        }
    }
}
