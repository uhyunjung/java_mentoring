
class Rect extends Polygon{
	Rect(int width, int height) {
		super(width, height);
	}

	@Override
	void calcArea() {
		int w = getWidth();
		int h = getHeight();
		
		double rectArea = w * h;
		
		setArea(rectArea);
		
		super.printArea();
	}
}

