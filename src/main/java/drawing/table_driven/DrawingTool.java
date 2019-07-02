package drawing.table_driven;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DrawingTool {

  public void drawAllShapes(List<Shape> shapeList) {
    List<Shape> orderedList = drawingOrderSort(shapeList);
    for (Shape shape : orderedList) {
      shape.draw();
    }
  }

  private List<Shape> drawingOrderSort(List<Shape> shapeList) {
    Object[] shapes = shapeList.toArray();
    Arrays.sort(shapes, new ShapeComparator());
    List<Shape> orderedList = new ArrayList<>();
    for (Object shape : shapes) {
      orderedList.add((Shape) shape);
    }
    return orderedList;
  }
}
