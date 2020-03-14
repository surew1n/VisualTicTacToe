package VisualTicTacToe;

import javax.swing.*;

public class Board {
    private char[][] board = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
    private boolean gameEnd = false;
    private boolean playerWon = false;
    GUI gui = new GUI();

    public void setTile(JButton tile) {
        if(tile.getText().equals("X") == false && tile.getText().equals("O") == false) {
            if(tile == gui.b1) {
                board[0][0] = Game.curPlayer;
            } else if(tile == gui.b2) {
                board[0][1] = Game.curPlayer;
            } else if(tile == gui.b3) {
                board[0][2] = Game.curPlayer;
            } else if(tile == gui.b4) {
                board[1][0] = Game.curPlayer;
            } else if(tile == gui.b5) {
                board[1][1] = Game.curPlayer;
            } else if(tile == gui.b6) {
                board[1][2] = Game.curPlayer;
            } else if(tile == gui.b7) {
                board[2][0] = Game.curPlayer;
            } else if(tile == gui.b8) {
                board[2][1] = Game.curPlayer;
            } else if(tile == gui.b9) {
                board[2][2] = Game.curPlayer;
            }
            tile.setText(String.valueOf(Game.curPlayer));
            synchronized(Game.lock) {
                Game.lock.notify();
            }
        } else {
            System.out.println("That tile is already checked");
        }
    }

    public String condenseRC(int x, String condition) {
        String condensed = "";
        if(condition.equals("row")) {
            for(int i = 0; i < board[0].length; i++) {
                condensed = condensed + board[x][i];
            }
        } else if(condition.equals("column")) {
            for(int i = 0; i < board[0].length; i++) {
                condensed = condensed + board[i][x];
            }
        }
        return condensed;
    }

    public void checkGameEnd() {
        String testCase;
        for(int i = 0; i < board[0].length; i++) {
            // Checking for row win
            testCase = condenseRC(i, "row");
            if(testCase.equals("XXX") || testCase.equals("OOO")) {
                gameEnd = true;
                playerWon = true;
            }
            //Checking for column win
            testCase = condenseRC(i, "column");
            if (testCase.equals("XXX") || testCase.equals("OOO")) {
                gameEnd = true;
                playerWon = true;
            }
            //Player 1 left diagonal win
            if(board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X') {
                gameEnd = true;
                playerWon = true;
            }
            //Player 1 right diagonal win
            if(board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X') {
                gameEnd = true;
                playerWon = true;
            }
            //Player 2 left diagonal win
            if(board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O') {
                gameEnd = true;
                playerWon = true;
            }
            //Player 2 right diagonal win
            if(board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O') {
                gameEnd = true;
                playerWon = true;
            }

            //Checking tie
            int full = 0;
            for(int r = 0; r < board.length; r++) {
                for(int c = 0; c < board[0].length; c++) {
                    if(board[r][c] != ' ') {
                        full++;
                    }
                }
            }
            if(full == 9) {
                gameEnd = true;
            }
        }
    }

    public void displayBoard() {
        gui.b1.setText(String.valueOf(board[0][0]));
        gui.b2.setText(String.valueOf(board[0][1]));
        gui.b3.setText(String.valueOf(board[0][2]));
        gui.b4.setText(String.valueOf(board[1][0]));
        gui.b5.setText(String.valueOf(board[1][1]));
        gui.b6.setText(String.valueOf(board[1][2]));
        gui.b7.setText(String.valueOf(board[2][0]));
        gui.b8.setText(String.valueOf(board[2][1]));
        gui.b9.setText(String.valueOf(board[2][2]));
    }

    public boolean getGameEnd() {
        return gameEnd;
    }

    public boolean getPlayerWon() {
        return playerWon;
    }
}