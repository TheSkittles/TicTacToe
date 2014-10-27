package is.skittles.tictactoe;

import java.util.HashMap;
import java.util.Map;

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
          boolean hasWinner = false;

          if (marks != null && marks.length() > 0) {
            Board b = new Board();
            Game g = new Game(b);

            for (char ch: marks.toCharArray()) {
              g.mark(Character.getNumericValue(ch));
            }

            if (g.getWinner() > 0) {
              map.put("winner", g.getWinner());
              hasWinner = true;
            }
          }

          map.put("hasWinner", hasWinner);

          return new ModelAndView(map, "TicTacToeWeb.mustache");
        }, new MustacheTemplateEngine());
    }
}
