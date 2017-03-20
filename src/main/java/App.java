import java.util.HashMap;
import java.util.Map;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;
import java.util.List;
import java.util.ArrayList;

public class App {
  public static void main(String[] args) {

    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object>  model = new HashMap<String, Object>();
      model.put("template", "templates/index.vtl" );
      String userSide1 = request.queryParams("side1");
      String userSide2 = request.queryParams("side2");

      if (userSide1 == null && userSide2 == null){
        userSide1 = "0";
        userSide2 = userSide1;
      }

      int side1 = Integer.parseInt(userSide1);
      int side2 = Integer.parseInt(userSide2);
      Rectangle userRectangle = new Rectangle(side1, side2);
      List<Rectangle> allRectangles = new ArrayList<Rectangle>();
      allRectangles.add(userRectangle);
      model.put("rectangles", allRectangles);
      boolean squareResult = userRectangle.isSquare();
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

  }
}
