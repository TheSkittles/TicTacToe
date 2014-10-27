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

        Map map = new HashMap();
        map.put("name", "Erlingur");

        // GameWeb.mustache file is in resources/templates directory
        get("/hello", (rq, rs) -> new ModelAndView(map, "GameWeb.mustache"), new MustacheTemplateEngine());
    }
}
