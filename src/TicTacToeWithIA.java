import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TicTacToeWithIA {

    static String[] board = {"_", "_", "_", "_", "_", "_", "_", "_", "_"};
    static String x = "X";
    static String o = "O";
    static boolean isTrue = false;
    static boolean isTurn = true;

    public static void main(String[] args) throws IOException {

        TicTacToeWithIA ticTacToeWithIA = new TicTacToeWithIA();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ticTacToeWithIA.showBoard();

        while (!isTrue) {

            System.out.println("En que posicion te quieres mover?");
            int move = Integer.parseInt(br.readLine());
            if (isTurn){
                board[move] = x;
                isTurn = false;
            }
            System.out.println("En que posicion te quieres mover?");
            int move2 = Integer.parseInt(br.readLine());
            if (!isTurn){
                board[move2] = o;
                isTurn = true;
            }
            ticTacToeWithIA.showBoard();
            ticTacToeWithIA.evaluateWin(board);

        }
        System.out.println("Has ganado");
    }

    public void playerOne (){

    }
    public void showBoard() {

        System.out.println("|" + board[0] + "|" + board[1] + "|" + board[2] + "|");
        System.out.println("|" + board[3] + "|" + board[4] + "|" + board[5] + "|");
        System.out.println("|" + board[6] + "|" + board[7] + "|" + board[8] + "|");
    }

//    public int getComputerBoard() {
//        showBoard();
//        for (int i = 0; i < board.length; i++){
//            if (board[i].)
//        }
//        return 0;
//    }

    public void evaluateWin(String[] array) {

        //HORIZONTAL
        if (board[0].contains(x) && board[1].contains(x) && board[2].contains(x) || board[3].contains(x) && board[4].contains(x) && board[5].contains(x) || board[6].contains(x) && board[7].contains(x) && board[8].contains(x)) {
            isTrue = true;
        }
        if (board[0].contains(o) && board[1].contains(o) && board[2].contains(o) || board[3].contains(o) && board[4].contains(o) && board[5].contains(o) || board[6].contains(o) && board[7].contains(o) && board[8].contains(o)) {
            isTrue = true;
        }
        //VERTICAL
        if (board[0].contains(x) && board[3].contains(x) && board[6].contains(x) || board[1].contains(x) && board[4].contains(x) && board[7].contains(x) || board[2].contains(x) && board[5].contains(x) && board[8].contains(x)) {
            isTrue = true;
        }
        if (board[0].contains(o) && board[3].contains(o) && board[6].contains(o) || board[1].contains(o) && board[4].contains(o) && board[7].contains(o) || board[2].contains(o) && board[5].contains(o) && board[8].contains(o)) {
            isTrue = true;
        }
        //DIAGONAL
        if (board[0].contains(x) && board[4].contains(x) && board[8].contains(x) || board[2].contains(x) && board[4].contains(x) && board[5].contains(x)) {
            isTrue = true;
        }
        if (board[0].contains(o) && board[4].contains(o) && board[8].contains(o) || board[2].contains(o) && board[4].contains(o) && board[5].contains(o)) {
            isTrue = true;
        }

    }
}

