package OOP_Assignment4;

public class Connection {
	private Node nodeOne, nodeTwo;
	/**
	 * @param nodeOne
	 * @param nodeTwo
	 * Constructor of connection class 
	 * compares one node to another 
	 */
	public Connection(Node nodeOne, Node nodeTwo) {
		this.nodeOne = (nodeOne.getEntity().getName().compareTo(nodeTwo.getEntity().getName()) <= 0) ? nodeOne : nodeTwo;
		this.nodeTwo = (this.nodeOne == nodeOne) ? nodeTwo : nodeOne;
	}
	/**
	 * @param current
	 * @return node if two nodes are not equal else return null
	 */
	public Node getConnection(Node current) {
		if (!(current.equals(nodeOne) || current.equals(nodeTwo))) {
			return null;
		}
		return (current.equals(nodeOne)) ? nodeTwo : nodeOne;
	}
	/**
	 * @return first node
	 */
	public Node getOne() {
		return this.nodeOne;
	}
	/** 
	 * @return second node
	 */
	public Node getTwo() {
		return this.nodeTwo;
	}
	/**
	 * returns the connected nodes
	 */
	public String toString() {
		return  nodeOne + "-->" + nodeTwo ;
	}
	/**
	 * returns hash code by adding two nodes
	 */
	public int hashCode() {
		return (nodeOne.getEntity().getName() + nodeTwo.getEntity().getName()).hashCode();
	}
	/**
	 * return true if both objects are equal else return false
	 */
	public boolean equals(Object other) {
		if (!(other instanceof Connection)) {
			return false;
		}
		Connection e = (Connection) other;
		return e.nodeOne.equals(this.nodeOne) && e.nodeTwo.equals(this.nodeTwo);
	}
}