package is.skittles.tictactoe;

import static spark.Spark.*;

public class TicTacToeWeb {
    public static void main(String[] args) {

        staticFileLocation("/public");

        get("/hello", (req, res) -> "Hello World");
    }
}
