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
          Map map = new HashMap();
          map.put("name", "Erlingur");

          return new ModelAndView(map, "TicTacToeWeb.mustache");
        }, new MustacheTemplateEngine());
    }
}
