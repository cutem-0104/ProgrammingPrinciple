package drawing.table_driven;

import java.util.ArrayList;
import java.util.List;
import junit.framework.TestCase;

public class TestDrawingTool extends TestCase {

  public void testProceeds() {
    Circle circle = new BigCircle(10, new Point(20, 20));
    Square square = new BigSquare(50, new Point(10, 10));
    DrawingTool drawingTool = new DrawingTool();
    List<Shape> shapeList = new ArrayList<>();
    shapeList.add(square);
    shapeList.add(circle);
    shapeList.add(square);
    shapeList.add(square);
    shapeList.add(square);
    shapeList.add(circle);
    shapeList.add(circle);
    drawingTool.drawAllShapes(shapeList);
  }
}
