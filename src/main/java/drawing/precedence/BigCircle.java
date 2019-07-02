package drawing.precedence;

import java.util.logging.Level;
import java.util.logging.Logger;

public class BigCircle extends Circle {

  private static Logger logger = Logger.getLogger(BigCircle.class.getName());

  BigCircle(double radius, Point center) {
    itsRadius = radius;
    itsCenter = center;
  }

  @Override
  public void draw() {
    logger.log(Level.INFO, "=== Drawing Information for drawing.standard.BigCircle ===");
    logger.log(Level.INFO, "Radius = {0}", itsRadius);
    logger.log(Level.INFO, "Center (x,y) = ({0})", itsCenter.x + "," + itsCenter.y);
  }

  @Override
  boolean preceeds(Shape shape) {
    return shape instanceof Square;
  }
}
