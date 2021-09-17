/*abstract*/
class Polygon {
	// private 선언
	private int width, height;
	private double area;
	
	// 생성자
	Polygon() {}
	
	// 정사각형 생성자
	Polygon(int x){
		this.width = x;
		this.height = x;
	}
	
	// 삼각형, 직사각형 생성자
	Polygon(int width, int height){
		this.width = width;
		this.height = height;
	}

	// get, set 메소드
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
	
	// 1. 오버로딩 넓이 계산 
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
	
	// 2. 오버라이딩 넓이 계산
	void calcArea() {
		printArea();
	}
	
	//3. 추상메소드 넓이 계산
	//abstract void calcArea();
	
	void printArea() {
		System.out.println("넓이 : " + getArea());
	}
}
