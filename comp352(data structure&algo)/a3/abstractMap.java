
public abstract class abstractMap<T> {
	//hash table
	T[] hashTable;

	/**
	 * defalut constructor
	 */
	public abstractMap(){}
	
	/**
	 * construct abstract hashmap with initial capacity
	 * @param capacity
	 */
	public abstractMap(int capacity) {
		this.hashTable=(T[])new Object[capacity];
	}
	
	/**
	 * Returns the number of entries in the map
	 * @return
	 */
	public abstract int size();
	
	/**
	 * Returns a Boolean indicating whether the map is empty
	 * @return
	 */
	public abstract boolean isEmpty();
	
	/**
	 * Returns the value v associated with key k, if such an entry exists;
	 * otherwise return null.
	 * @param k
	 * @return
	 */
	public abstract Integer get(Integer k);
	
	/**
	 * if the map does not have an entry with key k, then adds entry (k,v) to it 
	 * and returns null; else replaces with v the existing value of the entry with
	 * key equal to k and returns the old value
	 * @param k
	 * @param v
	 * @return
	 */
	public abstract Integer put(Integer k,Integer v);
	
	/**
	 * Removes from the map the entry with key equal to k, and returns its value; 
	 * if the map has no such entry, then it returns null.
	 * @param k
	 * @return
	 */
	public abstract Integer remove(Integer k);
	

}
