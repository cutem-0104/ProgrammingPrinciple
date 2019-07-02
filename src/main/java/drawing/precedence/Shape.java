package drawing.precedence;

public abstract class Shape {

  abstract void draw();

  abstract boolean preceeds(Shape shape);
}
