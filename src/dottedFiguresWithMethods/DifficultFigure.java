package dottedFiguresWithMethods;

public class DifficultFigure {
	int difFigType, difFigTopWidth, difFigHeight, difFigElheight; 
	char difFigChar;
	int difFigShiftFromLeft;
		
	DifficultFigure (int type, int topWidth, int height, int elheight, char symbol, int shiftFromLeft) {
		difFigType = type;
		difFigTopWidth = topWidth;
		difFigHeight = height;
		difFigElheight = elheight;
		difFigChar = symbol;
		difFigShiftFromLeft = shiftFromLeft;
	}
}
