package drawing.table_driven;

public abstract class Shape {

  abstract void draw();

  abstract String getType();

  private String[] typeOrderTable = {
      "square",
      "circle",
      ""
  };

  boolean preceeds(Shape shape) {
    String thisType = this.getType();
    String argType = shape.getType();
    boolean done = false;
    int thisOrd = -1;
    int argOrd = -1;
    for (int i = 0; !done; i++) {
      String tableEntry = typeOrderTable[i];
      if (!tableEntry.equals("")) {
        if (tableEntry.equals(thisType)) {
          thisOrd = i;
        }
        if (tableEntry.equals(argType)) {
          argOrd = i;
        }
        if ((argOrd >= 0) && (thisOrd >= 0)) {
          done = true;
        }
      } else {
        done = true;
      }
    }
    return thisOrd < argOrd;
  }
}
