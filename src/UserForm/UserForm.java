package UserForm;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserForm {
    private JLabel jName;
    private JTextField tfName;
    private JTextField tfFirstName;
    private JLabel jFirstName;
    private JLabel jEmail;
    private JTextField tfEmail;
    private JLabel jPassword;
    private JPasswordField pfPassword;
    private JButton btValid;
    private JButton btCancel;

    public UserForm() {
        btValid.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Bouton valider");
            }
        });
        btCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Bouton Annuler");
            }
        });
    }
}
