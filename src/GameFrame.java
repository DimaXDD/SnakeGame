import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame {

   ImageIcon icon = new ImageIcon("public/icon.png");
   Image iconImage = icon.getImage();
    GameFrame(){
        this.add(new GamePanel());
        this.setTitle("Snake game by DimaXDD");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setIconImage(iconImage);
        this.pack();
        this.setLocationRelativeTo(null); // именно тут
        this.setVisible(true);
    }
}
