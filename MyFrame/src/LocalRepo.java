import java.util.ArrayList;

public class LocalRepo {

	public static void main(String[] args) {
	
		System.out.println("This is test");
		
		System.out.println(array());

	}
	public static void array(){
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i = 1; i<=10; i++) {
			arr.add(i);
		}
	}

}
