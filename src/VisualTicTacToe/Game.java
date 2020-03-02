package VisualTicTacToe;

public class Game {
    static char curPlayer;
    static final Object lock = new Object();
    static Board board = new Board();

    public static void main(String[] args) throws InterruptedException {
        if((int) (Math.random() * 2 + 1) == 1) {
            curPlayer = 'X';
        } else {
            curPlayer = 'O';
        }
        board.displayBoard();
        Thread.sleep(2000);

        while(board.getGameEnd() == false) {
            System.out.println("It is player " + curPlayer + "'s turn");
            GUI.textField.setText("It is player " + curPlayer + "'s turn");
            synchronized (lock) {
                System.out.println("Waiting for choice");
                lock.wait();
            }
            System.out.println("Choice made");

            board.checkGameEnd();
            board.displayBoard();

            if(curPlayer == 'X') {
                curPlayer = 'O';
            } else {
                curPlayer = 'X';
            }
        }

        if(board.getPlayerWon()) {
            if (curPlayer == 'X') {
                System.out.println("The winner is player O");
                GUI.textField.setText("The winner is player O");
            } else if (curPlayer == 'O') {
                System.out.println("The winner is player X");
                GUI.textField.setText("The winner is player X");
            }
        }
    }
}