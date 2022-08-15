package dottedFiguresWithMethods;

public class ControllerAndView {
	static void getAndDisplayFigure(Line line) {
		for (int i = 0; i < line.lineShiftFromLeft; i++) {
			System.out.print(" ");
		}
		for (int i = 0; i < line.lineLength; i++) {
			System.out.print(line.lineChar);
		}
		System.out.println();
	}
	
	static void getAndDisplayFigure(MyRectangle rect) {
		for (int i = 0; i < rect.rectHeight; i++) {
			ControllerAndView.getAndDisplayFigure(new Line(rect.rectWidth, rect.rectChar, rect.rectShiftFromLeft));
		}
	}
	
	static void getAndDisplayFigure(Triangle triangle) {
		switch (triangle.triangleType) {
			case 1:{			
				for (int i = 0; i < triangle.triangleHeight; i++) {
					ControllerAndView.getAndDisplayFigure(new Line(i + 1, triangle.triangleChar, triangle.triangleShiftFromLeft));
				}
			}break;
			
			case 2:{
				for (int i = 0; i < triangle.triangleHeight; i++) {
					ControllerAndView.getAndDisplayFigure(new Line(triangle.triangleHeight - i, triangle.triangleChar, triangle.triangleShiftFromLeft));
				}
			}break;
			
			case 3:{
				for (int i = 0; i < triangle.triangleHeight; i++) {
					for (int col = 0; col < i; col++) {
						System.out.print(" ");
					}
					ControllerAndView.getAndDisplayFigure(new Line(triangle.triangleHeight - i, triangle.triangleChar, triangle.triangleShiftFromLeft));
				}
			}break;
			
			case 4: {
				for (int i = 0; i < triangle.triangleHeight; i++) {
					for (int col = 0; col < triangle.triangleHeight - 1 - i; col++) {
						System.out.print(" ");
					}
					ControllerAndView.getAndDisplayFigure(new Line(i + 1, triangle.triangleChar, triangle.triangleShiftFromLeft));
				}
			}break;
			
			default: System.out.println("Invalid triangle type!");
		}
	}

	static void getAndDisplayFigure(OtherFigure fig) {
		switch (fig.figType) {
			case 1: {
				getAndDisplayFigure(new Triangle(1, fig.figHeight / 2, fig.figChar, fig.figShiftFromLeft));
				if (fig.figHeight % 2 == 0) 
					getAndDisplayFigure(new Triangle(2, fig.figHeight / 2 - 1, fig.figChar, fig.figShiftFromLeft));
				else 
					getAndDisplayFigure(new Triangle(2, fig.figHeight / 2 + 1, fig.figChar, fig.figShiftFromLeft));

			}break;
			
			case 2: {
				if (fig.figHeight % 2 == 0)
					getAndDisplayFigure(new Triangle(1, fig.figHeight / 2 - 1, fig.figChar, fig.figShiftFromLeft));
				else 
					getAndDisplayFigure(new Triangle(1, fig.figHeight / 2, fig.figChar, fig.figShiftFromLeft));
					
				
				if (fig.figHeight % 2 == 0) 
					getAndDisplayFigure(new Triangle(3, fig.figHeight / 2, fig.figChar, fig.figShiftFromLeft));
				else 
					getAndDisplayFigure(new Triangle(3, fig.figHeight / 2 + 1, fig.figChar, fig.figShiftFromLeft));
				
			}break;

			case 3: {
				if (fig.figHeight % 2 == 0)
					getAndDisplayFigure(new Triangle(4, fig.figHeight / 2, fig.figChar, fig.figShiftFromLeft));
				else 
					getAndDisplayFigure(new Triangle(4, fig.figHeight / 2, fig.figChar, fig.figShiftFromLeft + 1));
					
				if (fig.figHeight % 2 == 0) 
					getAndDisplayFigure(new Triangle(3, fig.figHeight / 2 - 1, fig.figChar, fig.figShiftFromLeft + 1));
				else 
					getAndDisplayFigure(new Triangle(3, fig.figHeight / 2 + 1, fig.figChar, fig.figShiftFromLeft));

			}break;
			
			case 4: {
				if (fig.figHeight % 2 == 0)
					getAndDisplayFigure(new Triangle(4, fig.figHeight / 2, fig.figChar, fig.figShiftFromLeft));
				else 
					getAndDisplayFigure(new Triangle(4, fig.figHeight / 2 + 1, fig.figChar, fig.figShiftFromLeft));
					
				if (fig.figHeight % 2 == 0) 
					getAndDisplayFigure(new Triangle(2, fig.figHeight / 2 - 1, fig.figChar, fig.figShiftFromLeft));
				else 
					getAndDisplayFigure(new Triangle(2, fig.figHeight / 2, fig.figChar, fig.figShiftFromLeft));

			}break;
		}
	}
}
