import javax.swing.*;
import java.awt.*;
public class SnakeGame extends JFrame {
    Board board;
    SnakeGame(){
        board=new Board();
        add(board);
        pack();
        setTitle("Harsha's Snake Game");
        setResizable(true);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        SnakeGame snakeGame=new SnakeGame();
    }
}
