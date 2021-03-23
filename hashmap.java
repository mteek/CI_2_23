package Hashmaphw;
import java.util.HashMap;
import java.util.Scanner; 

public class hashmap {
public static void main (String[]args) {

	Scanner print = new Scanner(System.in);	
	System.out.println("hi, welcome to my dealership. what vehicle make are you looking for?");
	String make = print.nextLine();
	System.out.println("let me see if I have it");
	
	
	HashMap<String, Integer> vehicles = new HashMap<>();
	vehicles.put("Tundra", 15000);
	vehicles.put("Tercel", 5000);
	vehicles.put("Tacoma", 24000);
	vehicles.put("Corolla", 2000);
	vehicles.put("Honda del Sol", 10000);
	
	for (HashMap.Entry<String, Integer> set : 
		vehicles.entrySet()) {System.out.println(set.getKey() + " : "
                + set.getValue()); 
} 
} 


	
}

