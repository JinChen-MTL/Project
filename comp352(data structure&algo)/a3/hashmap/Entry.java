package hashmap;

import java.util.Random;

public class Entry {
	private Integer key;
	private Integer value;
	
	/**
	 * construct an entry with random key and value
	 */
	public Entry() {
		Random rd=new Random();
		//random key between 0 and 999,could get some entry with the same key
		this.key=rd.nextInt();
		this.value=rd.nextInt();
	}
	
	@Override
	public String toString() {
		return "entry("+ key + "," + value + ")";
	}

	/**
	 * construct an entry with key and value
	 * @param key
	 * @param value
	 */
	public Entry(Integer key, Integer value) {
		super();
		this.key = key;
		this.value = value;
	}

	public Integer getKey() {
		return key;
	}

	public void setKey(Integer key) {
		this.key = key;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	/**
	 * use hash stratage of  hash codes in java
	 * @param key
	 * @return
	 */
	public int hashCode(Integer key) {
		int h=key.hashCode();
		return (h<<5)|(h>>>27);
	}
	
}
