
class Square extends Polygon{
	Square(int x) {
		super(x);
	}

	@Override
	void calcArea() {
		int x = getWidth();
		
		double squareArea = x * x;
		
		setArea(squareArea);
		
		super.printArea();
	}
}