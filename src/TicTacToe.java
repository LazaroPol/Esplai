import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.IllegalFormatCodePointException;

public class TicTacToe {

    static String[] board = {"_", "_", "_", "_", "_", "_", "_", "_", "_"};
    static String x = "X";
    static String o = "O";
    static boolean isPlayer1 = true;
    static boolean isWinner = false;

    public static void main(String[] args) throws IOException {
        TicTacToe ticTacToe = new TicTacToe();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ticTacToe.showBoard();

        while (true) {
            System.out.println("En que posicion te quieres mover?");
            int move = Integer.parseInt(br.readLine());
            board[move] = isPlayer1 ? x:o;
            isPlayer1 = !isPlayer1;
//            if (isTurn){
//                board[move] = x;
//                isTurn = false;
//            }
//            System.out.println("En que posicion te quieres mover?");
//            int move2 = Integer.parseInt(br.readLine());
//            if (!isTurn){
//                board[move2] = o;
//                isTurn = true;
//            }
            ticTacToe.showBoard();
            isWinner = ticTacToe.evaluateWin(board);
           if (isWinner){
               System.out.println("isWinner = " + isWinner);
           }


        }

    }

    public void showBoard() {

        System.out.println("|" + board[0] + "|" + board[1] + "|" + board[2] + "|");
        System.out.println("|" + board[3] + "|" + board[4] + "|" + board[5] + "|");
        System.out.println("|" + board[6] + "|" + board[7] + "|" + board[8] + "|");
    }

    public boolean evaluateWin(String[] array) {

        //HORIZONTAL
        if (board[0].contains(x) && board[1].contains(x) && board[2].contains(x) || board[3].contains(x) && board[4].contains(x) && board[5].contains(x) || board[6].contains(x) && board[7].contains(x) && board[8].contains(x)) {
            return true;
        }
        if (board[0].contains(o) && board[1].contains(o) && board[2].contains(o) || board[3].contains(o) && board[4].contains(o) && board[5].contains(o) || board[6].contains(o) && board[7].contains(o) && board[8].contains(o)) {
            return true;
        }
        //VERTICAL
        if (board[0].contains(x) && board[3].contains(x) && board[6].contains(x) || board[1].contains(x) && board[4].contains(x) && board[7].contains(x) || board[2].contains(x) && board[5].contains(x) && board[8].contains(x)) {
            return true;
        }
        if (board[0].contains(o) && board[3].contains(o) && board[6].contains(o) || board[1].contains(o) && board[4].contains(o) && board[7].contains(o) || board[2].contains(o) && board[5].contains(o) && board[8].contains(o)) {
            return true;
        }
        //DIAGONAL
        if (board[0].contains(x) && board[4].contains(x) && board[8].contains(x) || board[2].contains(x) && board[4].contains(x) && board[5].contains(x)) {
            return true;
        }
        if (board[0].contains(o) && board[4].contains(o) && board[8].contains(o) || board[2].contains(o) && board[4].contains(o) && board[5].contains(o)) {
            return true;
        }else{
            return false;
        }

    }
}
