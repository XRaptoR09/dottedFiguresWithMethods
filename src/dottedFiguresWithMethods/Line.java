package dottedFiguresWithMethods;

public class Line{
	int lineLength, lineShiftFromLeft;
	char lineChar;
	Line(int length, char symbol, int shiftFromLeft) {
		lineLength = length;
		lineChar = symbol;
		lineShiftFromLeft = shiftFromLeft;
	}
}
