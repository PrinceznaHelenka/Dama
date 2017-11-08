import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.EventListener;


public class Gui extends JFrame {
    private Container contents;
    private JButton[][] squares = new JButton[8][8];

    int i;
    int j;

    //current position
    int row = 2;
    int col = 1;


    Gui(){ super("Helelnčina hra dáma");

        contents = getContentPane();

        //nastavení okna

        setSize(600,600);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);

        createGB();
        setIcons();


   }

    public void createGB(){

        GridLayout layout = new GridLayout(8, 8);
        contents.setLayout(layout);

        MouseListener posunSe = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                Object source = e.getSource();

                for (i = 0; i < 8; i++) {
                    for (j = 0; j < 8; j++) {
                        if (source == squares[i][j]){
                            priKliknuti(i,j);

                        }
            }}}
        };



        //JButton[][].addButtonHandler nebo tak něco

        for (i = 0; i < 8; i++) {
            for (j = 0; j < 8; j++) {

                JButton button = new JButton();

                if (i % 2 == 0 && j % 2 == 0) {
                    button.setBackground(Color.lightGray);
                }
                if (i % 2 == 1 && j % 2 == 1) {
                    button.setBackground(Color.lightGray);
                }
                if (i % 2 == 0 && j % 2 == 1) {
                    button.setBackground(Color.darkGray);
                }
                if (i % 2 == 1 && j % 2 == 0) {
                    button.setBackground(Color.darkGray);
                }
                button.addMouseListener(posunSe);
                squares[i][j] = button;
                contents.add(squares[i][j]);
            }
        }


    }

    public void setIcons(){
        Icon black = new ImageIcon("/home/helena/HraDama/src/main/resources/black.png");
        Icon white = new ImageIcon("/home/helena/HraDama/src/main/resources/white.png");

        int m;

        for (m = 0; m<4; m++) {
            squares[0][2*m].setIcon(black);
        }
        for (m = 0; m<4; m++){
            squares[1][2*m+1].setIcon(black);
        }
        for (m = 0; m<4; m++){
            squares[6][2*m].setIcon(white);
        }
        for (m = 0; m<4; m++){
            squares[7][2*m+1].setIcon(white);
        }
    }

    public void priKliknuti(int i, int j){
        squares[i][j].setIcon(null);

    }


 }






    /*

    fungovalo:


      //  JFrame frame = new JFrame("Konečně!");
      //  frame.setVisible(true);
      //  frame.setSize(800, 600);
      //  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ---------------------

    Container pane = this.getContentPane();
        pane.setLayout(new BoxLayout(pane, BoxLayout.PAGE_AXIS));

        int j;
        for (j = 0; j < 8; j++) {
            JButton button = new JButton();
            button.setVisible(true);
            button.setOpaque(true);
            button.setBounds(100,100*j,100,100);
            button.setText("ahojahojahoj!");
            pane.add(button);
            // pane.add(Box.createRigidArea(new Dimension(100,10)));

        }
        frame.add(pane);


        -------------------------------

        int i;
        int j;

        for (i = 0; i < 8; i++) {
            for (j = 0; j < 8; j++) {

                JButton button = new JButton();
                button.setVisible(true);
                button.setOpaque(true);
                button.setBounds(50*i,50*j,50,50);
                button.setText("ahoj!");
                frame.add(button);

                 }
             }


   -------------------------------------------------------------------

        Container pane = this.getContentPane();
        pane.setLayout(new BorderLayout());
        JButton prvni = new JButton("prvni");
        JButton druhy = new JButton("druhy");
        pane.add(prvni, BorderLayout.PAGE_START);
        pane.add(druhy, BorderLayout.CENTER);

        JLabel label = new JLabel();
        label.setVisible(true);
        label.setOpaque(true);
        label.setLocation(200,200);
        label.setSize(10,10);
        label.setBackground(new Color(100, 125, 25));
        frame.add(label);

        JLabel label1 = new JLabel();
        label1.setVisible(true);
        label1.setOpaque(true);
        label1.setLocation(250,300);
        label1.setSize(100,10);
        label1.setBackground(new Color(200, 2, 2));
        frame.add(label1);


        int i;
        int j;

        int x;

        x = 10;

        for (i = 0; i < 8; i++) {
            for (j = 0; j < 8; j++) {
                JLabel label1 = new JLabel();
                label1.setVisible(true);
                label1.setOpaque(true);
                label1.setBounds(i*x,j*x,10,10);
                label1.setBackground(new Color(20, 25, 205));
                frame.add(label1);
                }
            }


        JButton button = new JButton("Ahoj! Začneme?");
        contentPane.add(button);
        button.setVisible(true);
        button.setSize(100, 50);
        button.setVerticalAlignment(100);
        button.setHorizontalAlignment(100);

        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JButton play = new JButton();
                play.setText("Začneme!");
            }

        });

    addWindowListener(new WindowAdapter() {
        @Override
        public void windowClosed(WindowEvent e) {
            windowClosed(e);
        }
        @Override
        public void windowOpened(WindowEvent e) {
            windowOpened(e);
        }
    });*/


