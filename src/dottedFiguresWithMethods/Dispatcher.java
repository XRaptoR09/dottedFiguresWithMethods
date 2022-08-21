package dottedFiguresWithMethods;

import java.util.ArrayList;
import java.util.Arrays;

/**
  @author Ivan
 *
 */
public class Dispatcher {
	private static final int NaN = (int)Double.NaN;

	public static void main(String[] args) {
//		Line l = new Line(15, '@', 3);
//		ControllerAndView.getAndDisplayFigure(l);
//		System.out.println();
		MyRectangle r1 = new MyRectangle(10, 3, '#', 10);
		MyRectangle r2 = new MyRectangle(10, 11, '.', 5);
		MyRectangle r3 = new MyRectangle(4, 7, '@', 17);
//		ControllerAndView.getAndDisplayFigure(r1);
//		System.out.println();
//		ControllerAndView.getAndDisplayFigure(r2);
//		
//		Triangle t1 = new Triangle(4, 5, '.', 0);
//		ControllerAndView.getAndDisplayFigure(t1);
//		
//		OtherFigure f1 = new OtherFigure(1, 8, '#', 0);
//		ControllerAndView.getAndDisplayFigure(f1);
//
//		OtherFigure f2 = new OtherFigure(2, 10, '@', 10);
//		ControllerAndView.getAndDisplayFigure(f2);
//
//		OtherFigure f3 = new OtherFigure(3, 11, '=', 15);
//		ControllerAndView.getAndDisplayFigure(f3);
//
//		OtherFigure f4 = new OtherFigure(4, 8, '.', 3);
//		ControllerAndView.getAndDisplayFigure(f4);
		System.out.println(NaN);
		DifficultFigure df1 = new DifficultFigure(3, NaN, NaN, 6, '%', 13);
		ControllerAndView.getAndDisplayFigure(df1);
		
		ArrayList<MyRectangle> myRectList = new ArrayList<MyRectangle>();
		myRectList.add(r1);
		myRectList.add(r2);
		System.out.println(myRectList);
		
		MyRectangle[] rects = {r1, r2, r3};
		for (MyRectangle rect : rects) {
			ControllerAndView.getAndDisplayFigure(rect);
		}
	}
}
