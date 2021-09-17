class PolygonTest {
	public static void main(String[] args)
	{
		// 오버로딩
		Polygon p = new Polygon();
		System.out.println(p.Area(2.0, 4));
		System.out.println(p.Area(2, 4));
		System.out.println(p.Area(3));
		
		// 오버라이딩, 추상메소드
		Tri tri = new Tri(2,4);
		tri.calcArea();
		
		Rect rect = new Rect(2,4);
		rect.calcArea();
		
		Square square = new Square(3);
		square.calcArea();
	}
}
