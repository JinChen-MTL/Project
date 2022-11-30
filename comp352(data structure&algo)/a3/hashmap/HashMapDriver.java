package hashmap;

import java.util.ArrayList;
import java.util.List;

public class HashMapDriver {

	public static void validate() {
		List<Entry> data=new  ArrayList<>();
		//Create a local ArrayList of 50 random <K, V> pairs
		while(data.size()<50) {
			data.add(new Entry());
		}
		
		//Create a MyHashMap using 100 as the initial capacity
		MyHashMap map=new MyHashMap(100);
		
		//Add all 50 entries from the data array to the map
		for(Entry entry:data) {
			map.put(entry.getKey(),entry.getValue());
		}
		//Run get(k) on each of the 50 elements in data
		for(Entry entry:data) {
			map.get(entry.getKey());
		}
		//Run remove(k) on the first 25 keys
		for(int i=0;i<25;i++) {
			map.remove(data.get(i).getKey());
		}
		
	}
	
	public static void experiment_interpret() {
		List<Entry> data=new  ArrayList<>();
		//Create a local ArrayList of 50 random <K, V> pairs
		while(data.size()<150) {
			data.add(new Entry());
		}
		
		//Create a MyHashMap using 100 as the initial capacity
		MyHashMap map=new MyHashMap(100);
		
		//Add all 150 entries from the data array to the map
		for(Entry entry:data) {
			map.put(entry.getKey(),entry.getValue());
		}
	}
	
	public static void main(String[] args) {
		validate();
		experiment_interpret();
	}
}
