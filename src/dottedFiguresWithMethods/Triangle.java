package dottedFiguresWithMethods;

public class Triangle {
	int triangleHeight, triangleShiftFromLeft, triangleType;
	char triangleChar;
	Triangle(int type, int height, char symbol, int shiftFromLeft) {
		triangleType = type;
		triangleHeight = height;
		triangleChar = symbol;
		triangleShiftFromLeft = shiftFromLeft;
	}
}
