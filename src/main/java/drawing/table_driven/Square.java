package drawing.table_driven;

public abstract class Square extends Shape {

  double itsSide;
  Point itsTopLeft;

  public abstract void draw();

  String getType() {
    return "square";
  }
}
