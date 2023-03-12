package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    Character [][] board;
    public Board(Character[][] matrix) {
        this.board = matrix;
    }

    public String isInFavor() {
        String XO ="";
        if (board[0][0] == board[0][1] && board[0][1] == board[0][2] ) {
            XO = board[0][0] + "";
        } else if( board[1][0] == board[1][1] && board[1][1] == board[1][2] ) {
            XO = board[1][0] + "";
        } else if( board[2][0] == board[2][1] && board[2][1] == board[2][2] ) {
            XO = board[2][0] + "";
        }else if (board[0][0] == board[1][0] && board[1][0] == board[2][0] ) {
            XO = board[0][0] + "";
        }else if (board[0][1] == board[1][1] && board[1][1] == board[2][1] ) {
            XO = board[0][1] + "";
        }else if (board[0][2] == board[1][2] && board[1][2] == board[2][2] ) {
            XO = board[0][2] + "";
        } else if (board[0][0] == board[1][1] && board[1][1] == board[2][2] ) {
            XO = board[0][0] + "";
        }else if (board[0][2] == board[1][1] && board[1][1] == board[2][0] ) {
            XO = board[0][2] + "";
        }
        return XO;
    }

    public Boolean isInFavorOfX() {
        if (isInFavor().equals("X")) {
            return true;
        }
        return false;
    }

    public Boolean isInFavorOfO() {
        if (isInFavor().equals("O")) {
            return true;
        }
        return false;
    }

    public Boolean isTie() {
        if (isInFavor().equals("")) {
            return true;
        }
        return false;
    }

    public String getWinner() {
        return isInFavor();
    }

}