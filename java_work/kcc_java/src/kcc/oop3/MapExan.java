package kcc.oop3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExan {
	public static void main(String[] args) {
		
		
		Map map = new HashMap();
		
		//Map -> Set -> Iterator
		// key => keySet()
		//value =? values : Collection
		//(key,value) => entrySet() : Set
		
		Set set  = map.entrySet();
		Iterator iter = set.iterator();
		
		while(iter.hasNext()) {
			Map.Entry e = (Map.Entry)iter.next();
			//e.getKey(), e.getValue();
		}
	}
}
