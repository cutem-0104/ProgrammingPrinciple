package drawing;

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
    logger.log(Level.INFO, "=== Drawing Information for drawing.BigCircle ===");
    logger.log(Level.INFO, "Radius = {0}", itsRadius);
    logger.log(Level.INFO, "Center (x,y) = ({0})", itsCenter.x + "," + itsCenter.y);
  }
}
