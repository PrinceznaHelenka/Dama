import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Gui extends JFrame {
    {
        JFrame frame = new JFrame("Konečně!");
        frame.setVisible(true);
        frame.setSize(800,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        final JLabel play = new JLabel("Ahoj! Začneme?", SwingConstants.CENTER);
        frame.add(play);
        play.setVisible(true);
        play.setSize(100, 50);
        play.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JLabel play = new JLabel();
                play.setText("Začneme!");
            }

        });




    }}
