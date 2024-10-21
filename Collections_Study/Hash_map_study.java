package Collections_Study;
//keyset() retirve key in form of set
// valueset() retrieve value in collection
//entryset() retrieve key value pair
//put() enter one enrty to map
//putAll() enter another collection onto this hasmap
//remove(object key) to remove key and return entry
//remove(obj key,obj value) remove and return bool if entry present or not
//equals()
//clear() reset map
import java.util.*;
public class Hash_map_study 
{public static void main(String[] args)
	{
		Map<String, Integer> m=new HashMap<String,Integer>();
		m.put("Rohan",30000);
		m.put("Pooja",50000);
		m.put("Sreyas",35000);
		System.out.println(m);
		Set keys=m.keySet();
		System.out.println(m.keySet());
		System.out.println(keys);
		Collection val=m.values();
		System.out.println(m.values());
		System.out.println(val);
		m.put("Arman", 20000);
		System.out.println(m.remove("Pooja"));
		System.out.println(m.remove("Sreyas",35000));
		System.out.println(m);
		System.out.println(m.containsKey("Arman"));
		System.out.println(m.containsValue(30000));
		for (Map.Entry<String, Integer> entry : m.entrySet()) 
		{
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
	}

}
