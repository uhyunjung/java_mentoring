class AA {
	AA(){
		System.out.println("������ AA");
	}
	
	AA(int x){
		System.out.println("�Ű����� �ִ� ������ AA "+x);
	}
}

class BB extends AA{
	BB(){
		System.out.println("������ BB");
	}
	BB(int x){
		super();
		System.out.println("�Ű����� �ִ� ������ BB "+x);
	}
}

public class ExtendsTest {
	public static void main(String[] args) {
		BB b = new BB();
		BB bb = new BB(1);
	}
}