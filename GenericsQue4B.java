import java.util.HashMap;

public class GenericsQue4B {

	public static void main(String[] args) {
		HashMap<String , java.util.Date> map=new HashMap<>();
		map.put("Today is ",new java.util.Date());
		System.out.println("Time And Date of map :" +map);
	}

}
