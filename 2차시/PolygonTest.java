class PolygonTest {
	public static void main(String[] args)
	{
		// �����ε�
		Polygon p = new Polygon();
		System.out.println(p.Area(2.0, 4));
		System.out.println(p.Area(2, 4));
		System.out.println(p.Area(3));
		
		// �������̵�, �߻�޼ҵ�
		Tri tri = new Tri(2,4);
		tri.calcArea();
		
		Rect rect = new Rect(2,4);
		rect.calcArea();
		
		Square square = new Square(3);
		square.calcArea();
	}
}
