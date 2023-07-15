import javax.swing.*;
public class snakeGame extends JFrame {
    Board board;
    snakeGame(){
        board = new Board();
        add(board);
        pack();
        setResizable(false);
        setVisible(true);
     }
    public static void main(String[] args) {
        snakeGame Snakegame = new snakeGame();
    }
}
