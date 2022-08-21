package dottedFiguresWithMethods;

public class ControllerAndView {
	static void getAndDisplayFigure(Line line) {
		for (int i = 0; i < line.lineShiftFromLeft; i++) {
			System.out.print(" ");
		}
		for (int i = 0; i < line.lineLength; i++) {
			System.out.print(line.lineChar);
		}
	}
	
	static void getAndDisplayFigure(MyRectangle rect) {
		for (int i = 0; i < rect.rectHeight; i++) {
			ControllerAndView.getAndDisplayFigure(new Line(rect.rectWidth, rect.rectChar, rect.rectShiftFromLeft));
			System.out.println();
		}
	}
	
	static void getAndDisplayFigure(Triangle triangle) {
		switch (triangle.triangleType) {
			case 1:{			
				for (int i = 0; i < triangle.triangleHeight; i++) {
					ControllerAndView.getAndDisplayFigure(new Line(i + 1, triangle.triangleChar, triangle.triangleShiftFromLeft));
					System.out.println();
				}
			}break;
			
			case 2:{
				for (int i = 0; i < triangle.triangleHeight; i++) {
					ControllerAndView.getAndDisplayFigure(new Line(triangle.triangleHeight - i, triangle.triangleChar, triangle.triangleShiftFromLeft));
					System.out.println();
				}
			}break;
			
			case 3:{
				for (int i = 0; i < triangle.triangleHeight; i++) {
					for (int col = 0; col < i; col++) {
						System.out.print(" ");
					}
					ControllerAndView.getAndDisplayFigure(new Line(triangle.triangleHeight - i, triangle.triangleChar, triangle.triangleShiftFromLeft));
					System.out.println();
				}
			}break;
			
			case 4: {
				for (int i = 0; i < triangle.triangleHeight; i++) {
					for (int col = 0; col < triangle.triangleHeight - i; col++) {
						System.out.print(" ");
					}
					ControllerAndView.getAndDisplayFigure(new Line(i + 1, triangle.triangleChar, triangle.triangleShiftFromLeft));
					System.out.println();
				}
			}break;

			case 5: {
				for (int row = 0; row < triangle.triangleHeight; row++) {
					ControllerAndView.getAndDisplayFigure(new Line(row * 2 + 1, triangle.triangleChar, triangle.triangleShiftFromLeft + (triangle.triangleHeight - row - 1)));
					
					System.out.println();
				}
			}break;
			
			default: System.out.println("Invalid triangle type!");
		}
	}

	static void getAndDisplayFigure(OtherFigure fig) {
		switch (fig.figType) {
			case 1: {
				getAndDisplayFigure(new Triangle(1, fig.figHeight / 2, fig.figChar, fig.figShiftFromLeft));
				System.out.println();
				if (fig.figHeight % 2 == 0) 
					getAndDisplayFigure(new Triangle(2, fig.figHeight / 2 - 1, fig.figChar, fig.figShiftFromLeft));
				else 
					getAndDisplayFigure(new Triangle(2, fig.figHeight / 2 + 1, fig.figChar, fig.figShiftFromLeft));
				System.out.println();
			}break;
			
			case 2: {
				if (fig.figHeight % 2 == 0)
					getAndDisplayFigure(new Triangle(1, fig.figHeight / 2 - 1, fig.figChar, fig.figShiftFromLeft));
				else 
					getAndDisplayFigure(new Triangle(1, fig.figHeight / 2, fig.figChar, fig.figShiftFromLeft));
					System.out.println();
				
				if (fig.figHeight % 2 == 0) 
					getAndDisplayFigure(new Triangle(3, fig.figHeight / 2, fig.figChar, fig.figShiftFromLeft));
				else 
					getAndDisplayFigure(new Triangle(3, fig.figHeight / 2 + 1, fig.figChar, fig.figShiftFromLeft));
				System.out.println();
			}break;

			case 3: {
				if (fig.figHeight % 2 == 0)
					getAndDisplayFigure(new Triangle(4, fig.figHeight / 2, fig.figChar, fig.figShiftFromLeft));
				else 
					getAndDisplayFigure(new Triangle(4, fig.figHeight / 2, fig.figChar, fig.figShiftFromLeft + 1));
				System.out.println();
					
				if (fig.figHeight % 2 == 0) 
					getAndDisplayFigure(new Triangle(3, fig.figHeight / 2 - 1, fig.figChar, fig.figShiftFromLeft + 1));
				else 
					getAndDisplayFigure(new Triangle(3, fig.figHeight / 2 + 1, fig.figChar, fig.figShiftFromLeft));
				System.out.println();
			}break;
			
			case 4: {
				if (fig.figHeight % 2 == 0)
					getAndDisplayFigure(new Triangle(4, fig.figHeight / 2, fig.figChar, fig.figShiftFromLeft));
				else 
					getAndDisplayFigure(new Triangle(4, fig.figHeight / 2 + 1, fig.figChar, fig.figShiftFromLeft));
				System.out.println();
					
				if (fig.figHeight % 2 == 0) 
					getAndDisplayFigure(new Triangle(2, fig.figHeight / 2 - 1, fig.figChar, fig.figShiftFromLeft));
				else 
					getAndDisplayFigure(new Triangle(2, fig.figHeight / 2, fig.figChar, fig.figShiftFromLeft));
				System.out.println();
			}break;

			case 5: {
				if (fig.figHeight % 3 == 1) fig.figHeight -=1;
				if (fig.figHeight % 3 == 2) fig.figHeight +=1;

				getAndDisplayFigure(new Triangle(1, fig.figHeight / 3, fig.figChar, fig.figShiftFromLeft));
				System.out.println();
				
				getAndDisplayFigure(new MyRectangle(fig.figHeight / 3, fig.figHeight / 3, fig.figChar, fig.figShiftFromLeft));
				System.out.println();
				
				getAndDisplayFigure(new Triangle(2, fig.figHeight / 3, fig.figChar, fig.figShiftFromLeft));
				System.out.println();
			}break;

			case 6: {
				if (fig.figHeight % 3 == 1) fig.figHeight -=1;
				if (fig.figHeight % 3 == 2) fig.figHeight +=1;

				getAndDisplayFigure(new Triangle(1, fig.figHeight / 3, fig.figChar, fig.figShiftFromLeft));
				// System.out.println();
				
				getAndDisplayFigure(new MyRectangle(fig.figHeight / 3, fig.figHeight / 3, fig.figChar, fig.figShiftFromLeft));
				// System.out.println();
				
				getAndDisplayFigure(new Triangle(3, fig.figHeight / 3, fig.figChar, fig.figShiftFromLeft));
				System.out.println();
			}break;

			case 7: {
				if (fig.figHeight % 3 == 1) fig.figHeight -=1;
				if (fig.figHeight % 3 == 2) fig.figHeight +=1;

				getAndDisplayFigure(new Triangle(4, fig.figHeight / 3, fig.figChar, fig.figShiftFromLeft));
				System.out.println();
				
				getAndDisplayFigure(new MyRectangle(fig.figHeight / 3, fig.figHeight / 3, fig.figChar, fig.figShiftFromLeft));
				System.out.println();
				
				getAndDisplayFigure(new Triangle(3, fig.figHeight / 3, fig.figChar, fig.figShiftFromLeft));
				System.out.println();
			}break;

			case 8: {
				if (fig.figHeight % 3 == 1) fig.figHeight -=1;
				if (fig.figHeight % 3 == 2) fig.figHeight +=1;

				getAndDisplayFigure(new Triangle(4, fig.figHeight / 3, fig.figChar, fig.figShiftFromLeft));
				System.out.println();

				getAndDisplayFigure(new MyRectangle(fig.figHeight / 3, fig.figHeight / 3, fig.figChar, fig.figShiftFromLeft));
				System.out.println();
				
				getAndDisplayFigure(new Triangle(2, fig.figHeight / 3, fig.figChar, fig.figShiftFromLeft));
				System.out.println();
			}break;

			default: System.out.println("Invalid figure type!");
		}
		}

	static void getAndDisplayFigure (DifficultFigure difFig) {
		switch (difFig.difFigType) {
			case 1: {
				for (int row = 0; row < difFig.difFigElheight; row++) {
					ControllerAndView.getAndDisplayFigure(new Line(difFig.difFigTopWidth + (row * 2), difFig.difFigChar, difFig.difFigShiftFromLeft + (difFig.difFigElheight - (row) - 1)));
					System.out.println();
				}
			}break;
			
			case 2: {
				int lowWidth = 1;
				for (int row = 0; row < difFig.difFigHeight; row++) {
					ControllerAndView.getAndDisplayFigure(new Triangle(5, difFig.difFigElheight, difFig.difFigChar, difFig.difFigShiftFromLeft));
//					ControllerAndView.getAndDisplayFigure(new Line(difFig.difFigTopWidth + (row * 2), difFig.difFigChar, difFig.difFigShiftFromLeft + (difFig.difFigElheight - (row) - 1)));
//					System.out.println();
				}
				int trunkHeight = (difFig.difFigElheight < 5) ? 2 : 3;
				lowWidth += 2 * (difFig.difFigElheight - 1);
					int elseShift = difFig.difFigShiftFromLeft + (lowWidth / 2) - 1;
					ControllerAndView.getAndDisplayFigure(
						new MyRectangle(3, trunkHeight, difFig.difFigChar, elseShift)
					);
			}break;

			case 3: {
				int width = 1 + (2 * (difFig.difFigElheight - 1));
				ControllerAndView.getAndDisplayFigure(new Triangle(5, difFig.difFigElheight, 
						difFig.difFigChar, difFig.difFigShiftFromLeft + width));
				
				ControllerAndView.getAndDisplayFigure(new MyRectangle(width, difFig.difFigElheight,
						difFig.difFigChar, difFig.difFigShiftFromLeft + width));
				
				ControllerAndView.getAndDisplayFigure(new DifficultFigure(1, width, 0, difFig.difFigElheight,
						difFig.difFigChar, difFig.difFigShiftFromLeft + (width / 2) + 1));
				
				ControllerAndView.getAndDisplayFigure(new MyRectangle(width, difFig.difFigElheight * 2 - (difFig.difFigElheight / 2),
						difFig.difFigChar, difFig.difFigShiftFromLeft + width));
				
				ControllerAndView.getAndDisplayFigure(new DifficultFigure(1, width, 0, difFig.difFigElheight * 2,
						difFig.difFigChar, difFig.difFigShiftFromLeft));
			}break;
			
			default: System.out.println("Invalid type!");
		}
	}
}
