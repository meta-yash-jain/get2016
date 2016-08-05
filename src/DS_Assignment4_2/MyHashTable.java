package DS_Assignment4_2;

public class MyHashTable<K, V> {

	private Node<K, V> customerInfo;
	private Object[] room;

	public MyHashTable() {
		room = new Object[9];
	}
	/**
	 * @param key is unique value to be given
	 * @param value is the value of that key
	 * This function insert the customer information
	 */
	public void insertCustomerInfo(K key, V value) {
		if(key == null || value == null) {
			throw new IllegalArgumentException("Key or value is provided null");
		}
		int hashValue = getHash(key);
		int index = hashValue;
		customerInfo = new Node<K, V>();
		customerInfo.setKey(key);
		customerInfo.setValue(value);
		if(room[index] != null) {
			while(room[index] != null) {
				index = (index + 1) % room.length;
				if(index == hashValue) {
					break;
				}
			}
			if (index == hashValue) {
				System.out.println("Sorry There is no custInfos available");
				return;
			}
		}
		room[index] = customerInfo;
		System.out.println("Room Allocated for customer is "+index);
	}
	/**
	 * @param key is unique value provided
	 * @return unique hash value
	 * This function return the unique hash code for the key provided
	 */
	private int getHash(K key) {
		int hash = key.hashCode() % room.length;
		return hash;
	}
	/**
	 * @param key is unique value that you can get a value 
	 * @return V type value
	 * This function return the value according the the key provided
	 */
	@SuppressWarnings("unchecked")
	public V getValue(K key) {
		int hashValue1 = getHash(key);
		int hashValue2 = getHash(((Node<K, V>) room[hashValue1]).getKey());
		int index = hashValue2;
		if (hashValue1 != hashValue2) {
			while (hashValue1 != hashValue2) {
				hashValue2 = getHash(((Node<K, V>) room[(hashValue2 + 1) % room.length]).getKey());
				if(index == hashValue2){
					break;
				}
			}
			if(index == hashValue2){
				System.out.println("Please Check your key again.");
				throw new IllegalArgumentException("Key is not right");
			}
		}
		V value = ((Node<K, V>) room[hashValue2]).getValue();
		return value;
	}
}
