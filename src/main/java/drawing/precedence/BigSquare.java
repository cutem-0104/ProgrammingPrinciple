package drawing.precedence;

import java.util.logging.Level;
import java.util.logging.Logger;

public class BigSquare extends Square {

  private static Logger logger = Logger.getLogger(BigSquare.class.getName());

  BigSquare(double side, Point topLeft) {
    itsSide = side;
    itsTopLeft = topLeft;
  }

  @Override
  public void draw() {
    logger.log(Level.INFO, "=== Drawing Information for drawing.BigSquare ===");
    logger.log(Level.INFO, "Side = {0}", itsSide);
    logger.log(Level.INFO, "TopLeft (x,y) = ({0})", itsTopLeft.x + "," + itsTopLeft.y);
  }

  @Override
  boolean preceeds(Shape shape) {
    return shape instanceof Square;
  }
}
