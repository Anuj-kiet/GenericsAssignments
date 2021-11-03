import java.util.HashMap;
import java.util.Map;

public class GenericsQue4A {

	public static void main(String[] args) {
		
		 HashMap<String, String> myObj = new HashMap<>();

         // Add elements using put method
         myObj.put("1","Anuj");
         myObj.put("2","Parth");
         myObj.put("3","Shivansh");
         myObj.put("4","Amandeep");
         myObj.put("5","Kushagra");

        //adding student NAMES with THEIR STREAM for 5 students in the class//



         // Iterate the map using
         // for-each loop
         for(Map.Entry<String, String> m : myObj.entrySet())
         {
             System.out.println(m.getKey() + "  " + m.getValue());
         }
	}

}
