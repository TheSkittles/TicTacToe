package is.skittles.tictactoe;

import static spark.Spark.*;

public class TicTacToeWeb {
    public static void main(String[] args) {
        get("/hello", (req, res) -> "Hello World");
    }
}
