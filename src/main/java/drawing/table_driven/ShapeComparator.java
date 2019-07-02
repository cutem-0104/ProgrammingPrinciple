package drawing.table_driven;

import java.util.Comparator;

public class ShapeComparator implements Comparator<Object> {

  public int compare(Object shape1, Object shape2) {
    if (((Shape) shape1).preceeds((Shape) shape2)) {
      return -1;
    } else {
      return 1;
    }
  }
}
