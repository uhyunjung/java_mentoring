/*abstract*/
class Polygon {
	// private ����
	private int width, height;
	private double area;
	
	// ������
	Polygon() {}
	
	// ���簢�� ������
	Polygon(int x){
		this.width = x;
		this.height = x;
	}
	
	// �ﰢ��, ���簢�� ������
	Polygon(int width, int height){
		this.width = width;
		this.height = height;
	}

	// get, set �޼ҵ�
	public int getWidth() {
		return width;
	}
	
	public void setWidth(int width){
		this.width = width;
	}

	public int getHeight() {
		return height;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}

	public double getArea() {
		return area;
	}
	
	public void setArea(double area) {
		this.area = area;
	}
	
	// 1. �����ε� ���� ��� 
	public double Area(double width, int height) {
		area = width * height / 2;
		return area;
	}
	
	protected double Area(int width, int height) {
		area = width * height;
		return area;
	}
	
	double Area(int x) {
		area = x * x;
		return area;
	}
	
	// 2. �������̵� ���� ���
	void calcArea() {
		printArea();
	}
	
	//3. �߻�޼ҵ� ���� ���
	//abstract void calcArea();
	
	void printArea() {
		System.out.println("���� : " + getArea());
	}
}
