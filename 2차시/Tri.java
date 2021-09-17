class Tri extends Polygon{
	private int width, height;
	private double area;
	
	Tri(int width, int height) {
		super(width, height);
	}

	@Override
	void calcArea() {
		int w = getWidth();
		int h = getHeight();
		
		double triArea = w * h / 2;
		
		setArea(triArea);
		
		printArea();
	}
}
