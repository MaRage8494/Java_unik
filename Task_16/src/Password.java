import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Password extends JFrame {

    public Password() {
        super("CheckingPassword");
        String password = "bebra";
        Container contentPane = getContentPane();
        SpringLayout layout = new SpringLayout();
        contentPane.setLayout(layout);
        setSize(400, 200);
        setBackground(Color.gray);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JPanel service_label_panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel service_label = new JLabel("Service: ");
        service_label_panel.add(service_label);
        add(service_label_panel);

        JPanel service_field_panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JTextField service_field = new JTextField();
        service_field.setPreferredSize(new Dimension(100, 20));
        ;
        service_field.setBorder(BorderFactory.createLineBorder(Color.black));
        service_field_panel.add(service_field);
        add(service_field_panel);


        JPanel name_label_panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel name_label = new JLabel("User name: ");
        name_label_panel.add(name_label);
        add(name_label_panel);

        JPanel name_field_panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JTextField name_field = new JTextField();
        name_field.setPreferredSize(new Dimension(100, 20));
        ;
        name_field.setBorder(BorderFactory.createLineBorder(Color.black));
        name_field_panel.add(name_field);
        add(name_field_panel);

        JPanel password_label_panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel password_label = new JLabel("Password: ");
        password_label_panel.add(password_label);
        add(password_label_panel);

        JPanel password_field_panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JTextField password_field = new JTextField();
        password_field.setPreferredSize(new Dimension(100, 20));
        ;
        password_field.setBorder(BorderFactory.createLineBorder(Color.black));
        password_field_panel.add(password_field);
        add(password_field_panel);

        JPanel login = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton loginButton = new JButton("Login");
        login.add(loginButton);
        add(login);

        layout.putConstraint(SpringLayout.WEST, service_label_panel, 5, SpringLayout.WEST, contentPane);
        layout.putConstraint(SpringLayout.WEST, service_field_panel, 100, SpringLayout.WEST, service_label_panel);
        layout.putConstraint(SpringLayout.NORTH, name_label_panel, 15, SpringLayout.SOUTH, service_label_panel);
        layout.putConstraint(SpringLayout.WEST, name_label_panel, 5, SpringLayout.WEST, contentPane);
        layout.putConstraint(SpringLayout.NORTH, name_field_panel, 10, SpringLayout.SOUTH, service_field_panel);
        layout.putConstraint(SpringLayout.WEST, name_field_panel, 100, SpringLayout.WEST, name_label_panel);
        layout.putConstraint(SpringLayout.NORTH, password_label_panel, 15, SpringLayout.SOUTH, name_label_panel);
        layout.putConstraint(SpringLayout.WEST, password_label_panel, 5, SpringLayout.WEST, contentPane);
        layout.putConstraint(SpringLayout.NORTH, password_field_panel, 15, SpringLayout.SOUTH, name_field_panel);
        layout.putConstraint(SpringLayout.WEST, password_field_panel, 100, SpringLayout.WEST, password_label_panel);
        layout.putConstraint(SpringLayout.SOUTH, login, 120, SpringLayout.HORIZONTAL_CENTER, login);
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (password_field.getText().toString() == "") return;
                if (password_field.getText().toString().equals(password)) {
                    JOptionPane.showMessageDialog(getContentPane(),
                            "Right password.",
                            "Right",
                            JOptionPane.PLAIN_MESSAGE);
                    setVisible(false);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(getContentPane(),
                            "Incorrect password",
                            "ERROR",
                            JOptionPane.PLAIN_MESSAGE);
                    setVisible(false);
                    dispose();
                }
            }
        });
    }
}