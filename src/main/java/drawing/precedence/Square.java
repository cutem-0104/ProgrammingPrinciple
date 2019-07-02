package drawing.precedence;

public abstract class Square extends Shape {

  double itsSide;
  Point itsTopLeft;

  public abstract void draw();

  abstract boolean preceeds(Shape shape);
}
