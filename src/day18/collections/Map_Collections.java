package day18.collections;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class Map_Collections {

	public static void main(String[] args) {
		Map<Integer, String> m = new ConcurrentHashMap<Integer, String>();

		m.put(1, "Put");                                                                   // Put     
		m.put(2, "Size");      
		m.put(3, "Get");
		m.put(4, "Keyset");
		m.put(5, "Values");
		m.put(6, "Containskey");
		m.put(7, "Containsvalue");
		m.put(8, "Entryset");

		System.out.println(m);
		int size = m.size();                                                                 // Size
		System.out.println(size);

		String get = m.get(6);                                                            // Set    
		System.out.println(get);

		Set<Integer> keyset = m.keySet();                                         // KeySet
		System.out.println(keyset);

		Collection<String> values = m.values();                                // Values
		System.out.println(values);

		boolean containsKey = m.containsKey(9);                             // ContainsKey 
		System.out.println(containsKey);

		boolean containsValue = m.containsValue("Entryset");         // ContainsValue
		System.out.println(containsValue);

		Set<Entry<Integer, String>> entrySet = m.entrySet();           // EntrySet
		System.out.println(entrySet);

		Set<Entry<Integer, String>> entrySet2 = m.entrySet();
		for (Entry<Integer, String> entry : entrySet2) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());

		}

	}

}
