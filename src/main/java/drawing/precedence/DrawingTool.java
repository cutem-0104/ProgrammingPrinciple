package drawing.precedence;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DrawingTool {

  public void drawAllShapes(List<Shape> shapeList) {
    List<Shape> orderedList = drawingOrderSort(shapeList);
    for (Shape shape : orderedList) {
      shape.draw();
    }
  }

  private List<Shape> drawingOrderSort(List<Shape> shapeList) {
    List<Shape> orderedList = new ArrayList<>(shapeList);
    Collections.sort(orderedList, new ShapeComparator());
    return orderedList;
  }
}
