
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
public class Map extends abstractMap<doublelinklist>{
	private int size;
	doublelinklist[] hashTable;
	doublelinklist sorted;
	public Map() {
		// TODO Auto-generated constructor stub
	}
	public void setENIThreshold(int size) {
		this.size=size;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
  
	public entry generate() {
		Random rnd = new Random();
		int n = 100000 + rnd.nextInt(900000);//8 digits ,check if its exist next
		entry k =new entry(n,"new node!");
		if(!hashTable[hashfunction(n)].search(k)) {
              return k;
		}
		return null;
	}
    public doublelinklist allkeys(Map t) {
    	for(int i =0;i<hashTable.length;i++) {
    		while(hashTable[i].head.next!=null) {
    			sorted.insertFront(hashTable[i].head.k);
    			hashTable[i].head=hashTable[i].head.next;
    		}
    	}
		return sorted;
    	
    } 

	public int hashfunction(int i) {
		
		//
		return i;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public Integer get(Integer k) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Integer put(Integer k, Integer v) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Integer remove(Integer k) {
		// TODO Auto-generated method stub
		return null;
	}

}
