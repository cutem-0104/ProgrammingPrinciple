package drawing.precedence;

public abstract class Circle extends Shape {

  double itsRadius;
  Point itsCenter;

  public abstract void draw();

  abstract boolean preceeds(Shape shape);
}
