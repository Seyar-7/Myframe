import java.util.ArrayList;

public class LocalRepo {

	public static void main(String[] args) {
	
		System.out.println("This is test");
		
		array();

	}
	public static void array(){
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i = 1; i<=20; i++) {
			arr.add(i);
		}
		System.out.println(arr);
	}

}
