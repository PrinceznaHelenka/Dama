import javax.swing.*;

public class TheGame {
   public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Gui gui = new Gui();
                gui.setVisible(true);
            }
        });
    }




    Integer orderOfPlayers;
    GameBoard gameBoard;



    }

