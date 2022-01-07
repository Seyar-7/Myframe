import java.util.ArrayList;

public class LocalRepo {

	public static void main(String[] args) {
	
		System.out.println("This is test");
		
		array();

	}
	public static void array(){
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int sum = 0;
		for(int i = 1; i<=20; i++) {
			arr.add(i);
		}
		System.out.println(arr);
		for(int i = 0; i<arr.size(); i++) {
			sum +=arr.get(i);
		}
		System.out.println(sum);
	}

}
