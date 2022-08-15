package dottedFiguresWithMethods;

/**
  @author Ivan
 *
 */
public class Dispatcher {
	public static void main(String[] args) {
		Line l = new Line(15, '@', 3);
		ControllerAndView.getAndDisplayFigure(l);
		System.out.println();
		MyRectangle r1 = new MyRectangle(10, 3, '#', 10);
		MyRectangle r2 = new MyRectangle(10, 11, '.', 5);
		ControllerAndView.getAndDisplayFigure(r1);
		System.out.println();
		ControllerAndView.getAndDisplayFigure(r2);
		
		Triangle t1 = new Triangle(4, 5, '.', 0);
		ControllerAndView.getAndDisplayFigure(t1);
		
		OtherFigure f1 = new OtherFigure(1, 8, '#', 0);
		ControllerAndView.getAndDisplayFigure(f1);

		OtherFigure f2 = new OtherFigure(2, 10, '@', 10);
		ControllerAndView.getAndDisplayFigure(f2);

		OtherFigure f3 = new OtherFigure(3, 11, '=', 15);
		ControllerAndView.getAndDisplayFigure(f3);

		OtherFigure f4 = new OtherFigure(4, 8, '.', 3);
		ControllerAndView.getAndDisplayFigure(f4);
	}
}
 