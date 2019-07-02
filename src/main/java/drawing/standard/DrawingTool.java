package drawing.standard;

import java.util.List;

public class DrawingTool {

  public void drawAllShapes(List<Shape> shapeList) {
    for (Shape shape : shapeList) {
      shape.draw();
    }
  }
}
