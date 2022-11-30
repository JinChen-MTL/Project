
public class entry {

	public entry() {
		// TODO Auto-generated constructor stub
	}

	private int k; // EIN
	private String info;

	/**
	 * construct an entry with random key and value
	 */
	public entry(int k, String info) {
		super();
		this.k = k;
		this.info = info;
	}

	@Override
	public String toString() {
		return "The EIN is :" + k + ",and the info is:  ";
	}

	public int getKey() {
		return k;
	}

	public void setKey(int k) {
		this.k = k;
	}

	public String getValue() {
		return info;
	}

	public void setValue(String info) {
		this.info = info;
	}


 

}
