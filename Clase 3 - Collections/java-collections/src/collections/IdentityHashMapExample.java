package collections;

import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapExample {

	public static void main(String[] args) {
		
		Map<String, String> identityMap = new IdentityHashMap<String, String>();
	      
        identityMap.put("sony", "bravia");
        identityMap.put(new String("sony"), "mobile");
      
       //El tama�o debe ser 2 porque los elementos son diferentes!
        System.out.println("Size: " + identityMap.size());
        System.out.println("Map: " + identityMap);
      
        identityMap.put("sony", "videogame");
      
        System.out.println("Size: " + identityMap.size());
        System.out.println("Map: " + identityMap);
		
        identityMap.put(new String("sony").intern(), "bravia");
        //Cu�l cambi�?
        System.out.println("Size: " + identityMap.size());
        System.out.println("Map: " + identityMap);
        
	}
	
}
