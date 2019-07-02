package drawing.table_driven;

public abstract class Circle extends Shape {

  double itsRadius;
  Point itsCenter;

  public abstract void draw();

  String getType() {
    return "circle";
  }
}
