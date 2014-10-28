package is.skittles.tictactoe;

import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

import static spark.Spark.*;
import spark.ModelAndView;
import spark.template.mustache.MustacheTemplateEngine;
import static spark.Spark.get;

public class TicTacToeWeb {
    public static void main(String[] args) {

        staticFileLocation("/public");

        // GameWeb.mustache file is in resources/templates directory
        get("/", (rq, rs) -> {
          String marks = rq.queryParams("marks");

          Map map = new HashMap();
          map.put("marks", marks);

          Board b = new Board();
          Game g = new Game(b);

          if (marks != null && marks.length() > 0) {
            for (char ch: marks.toCharArray()) {
              g.mark(Character.getNumericValue(ch));
            }

            if (g.getWinner() > 0) {
              map.put("winner", teamToMark(g.getWinner()));
            }
          }

          // Create the cells
          int[] board = g.getBoard();
          for(int i = 0; i < 9;i++) {
            map.put("c" + i, teamToMark(board[i]));
            map.put("c" + i + "_filled", board[i] != 0);
          }

          return new ModelAndView(map, "TicTacToeWeb.mustache");
        }, new MustacheTemplateEngine());
    }

    public static String teamToMark(int team) {
      if (team == 1) return "X";
      if (team == 2) return "O";
      return "░";
    }
}
