class AA {
	AA(){
		System.out.println("생성자 AA");
	}
	
	AA(int x){
		System.out.println("매개변수 있는 생성자 AA "+x);
	}
}

class BB extends AA{
	BB(){
		System.out.println("생성자 BB");
	}
	BB(int x){
		super();
		System.out.println("매개변수 있는 생성자 BB "+x);
	}
}

public class ExtendsTest {
	public static void main(String[] args) {
		BB b = new BB();
		BB bb = new BB(1);
	}
}