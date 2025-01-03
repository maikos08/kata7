package software.ulpgc.kata7;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    public MainFrame() {
        setLayout(new BorderLayout());
        setTitle("kata7");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(250, 100);
        add(BorderLayout.CENTER, phrase());
    }

    private Component phrase() {
        JLabel phrase = new JLabel("¡Bienvenido a la kata 7!");
        phrase.setFont(new Font("Arial", Font.BOLD, 20));
        phrase.setForeground(Color.black);
        return phrase;
    }
}
