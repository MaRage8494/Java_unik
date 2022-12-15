import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Countries extends JFrame {
    private int maxXBorder = 300, maxYBorder = 250;

    Font fontBox = new Font("Verdana", Font.PLAIN, 18);
    Font fontName = new Font("Verdana", Font.PLAIN, 24);
    Font fontText = new Font("Verdana", Font.PLAIN, 10);

    JPanel[] panel = new JPanel[3];
    final JLabel countryName = new JLabel(" ");
    final JLabel textPopulation = new JLabel("");

    String[] countries = {
            "Russia",
            "Ukraine",
            "USA"
    };


    public Countries(){
        super("Countries");
        setLayout(new GridLayout(3,1));
        for (int i = 0; i < 3; i++){
            panel[i] = new JPanel();
            add(panel[i]);
        }

        countryName.setFont(fontName); //текст
        panel[1].add(countryName);

        textPopulation.setFont(fontText);
        panel[2].add(textPopulation);

        JComboBox comboBox = new JComboBox(countries);
        comboBox.setFont(fontBox);
        panel[0].add(comboBox);

        ActionListener actionListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JComboBox box = (JComboBox)e.getSource();
                String item = (String)box.getSelectedItem();
                countryName.setText(item);

                switch (item){
                    case "Russia":
                        textPopulation.setText("Population: 144,1 million");
                        break;
                    case "Ukraine":
                        textPopulation.setText("Population: 44,13 million");
                        break;
                    case "USA":
                        textPopulation.setText("Population: 329,5 million");
                        break;
                }
            }
        };

        comboBox.addActionListener(actionListener);


        setSize(maxXBorder,maxYBorder);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[]args)
    {
        new Countries();
    }
}
