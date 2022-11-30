package hashmap;

import java.util.ArrayList;

public class MyHashMap extends AbsHashMap<ArrayList<Entry>> {
	ArrayList<Entry>[] hashTable;
	private int size;
	private int capacity;

	public MyHashMap(int capacity) {
		size = 0;
		this.capacity = capacity;
		hashTable = new ArrayList[capacity];
		for(int i=0;i<capacity;i++) {
			hashTable[i]=new ArrayList<Entry>();
		}
	}

	/**
	 * Returns the number of entries in the map
	 * 
	 * @return
	 */
	public int size() {
		return size;
	}

	/**
	 * Returns a Boolean indicating whether the map is empty
	 * 
	 * @return
	 */
	public boolean isEmpty() {
		return size == 0;
	}

	/**
	 * Returns the value v associated with key k, if such an entry exists; otherwise
	 * return null.
	 * 
	 * @param k
	 * @return
	 */
	public Integer get(Integer k) {
		long start=System.nanoTime();
		// compute hash code
		int h = (k.hashCode() << 5) | (k.hashCode() >>> 27);
		// compute bucket index
		int idx = Math.abs(h % capacity);
		// get the bucket
		ArrayList<Entry> al = hashTable[idx];
		// retrieve the bucket to find the entry with equal k
		for (Entry entry : al) {
			if (entry.getKey() == k.intValue()) {
				System.out.println("time used of GET:"+(System.nanoTime()-start)+"ns");
				return entry.getValue();
			}
		}
		
		System.out.println("time used of GET:"+(System.nanoTime()-start)+"ns");
		
		// can not find the entry,return null
		return null;
	}

	/**
	 * if the map does not have an entry with key k, then adds entry (k,v) to it and
	 * returns null; else replaces with v the existing value of the entry with key
	 * equal to k and returns the old value
	 * 
	 * @param k
	 * @param v
	 * @return
	 */
	public Integer put(Integer k, Integer v) {
		long start=System.nanoTime();
		long end=0;
		int collision=0;
		
//		System.out.println("table size:"+capacity);

		Integer oldValue = null;
		// compute hash code
		int h = (k.hashCode() << 5) | (k.hashCode() >>> 27);
		// compute bucket index
		int idx = Math.abs(h % capacity);
		// get the bucket
		ArrayList<Entry> al = hashTable[idx];
		// retrieve the bucket to find the entry with equal k
		for (Entry entry : al) {
//			try {
//				Thread.sleep(0);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			//the entry with equal k exists,update it
			if (entry.getKey() == k.intValue()) {
				oldValue=entry.getValue();
				entry.setValue(v);
				end=System.nanoTime();
//				System.out.println("the number of elements:"+size);
//				System.out.println("the number of items in the bucket storing v:"+al.size());
//				System.out.println("the number of keys that resulted in a collision:"+collision);
//				System.out.println("time used of PUT:"+(System.nanoTime()-start)+"ns");
				
				System.out.println(size+" "+al.size()+" "+collision+" "+(end-start));
				return oldValue;
			}
			collision++;
			System.out.println("new entry("+k+","+v+"collides with "+entry.toString());
		}
		//the entry with equal k does not exist,insert it
		al.add(new Entry(k,v));
		size++;
		end=System.nanoTime();
		
//		System.out.println("the number of elements:"+size);
//		System.out.println("the number of items in the bucket storing v:"+al.size());
//		System.out.println("the number of keys that resulted in a collision:"+collision);
//		System.out.println("time used of PUT:"+(System.nanoTime()-start)+"ns");
		System.out.println(size+" "+al.size()+" "+collision+" "+(end-start));
		
		// can not find the entry,return null
		return null;
	}

	/**
	 * Removes from the map the entry with key equal to k, and returns its value; if
	 * the map has no such entry, then it returns null.
	 * 
	 * @param k
	 * @return
	 */
	public Integer remove(Integer k) {
		long start=System.nanoTime();
		Integer oldValue = null;
		// compute hash code
		int h = (k.hashCode() << 5) | (k.hashCode() >>> 27);
		// compute bucket index
		int idx = Math.abs(h % capacity);
		// get the bucket
		ArrayList<Entry> al = hashTable[idx];
		// retrieve the bucket to find the entry with equal k
		for (Entry entry : al) {
			//the entry with equal k exists,update it
			if (entry.getKey() == k.intValue()) {
				oldValue=entry.getValue();
				al.remove(entry);
				size--;
				System.out.println("time used of REMOVE:"+(System.nanoTime()-start)+"ns");
				
				return oldValue;
			}
		}
		
		System.out.println("time used of REMOVE:"+(System.nanoTime()-start)+"ns");
		
		// can not find the entry,return null
		return null;
	}

}
