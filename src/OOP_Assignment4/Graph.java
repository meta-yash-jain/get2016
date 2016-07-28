package OOP_Assignment4;

import java.util.ArrayList;
import java.util.HashMap;

public class Graph {
	// hash map for vertices
	private HashMap<String, Node> vertices;
	// hash map for edges
	private HashMap<Integer, Connection> edges;
	// graph constructor for setting vertices and edges 
	public Graph() {		
		this.vertices = new HashMap<String, Node>();
		this.edges = new HashMap<Integer, Connection>();
	}	
	/**
	 * @param vertices
	 * parameterized constructors for setting vertices and edges
	 */
	public Graph(ArrayList<Node> vertices) {		
		this.vertices = new HashMap<String, Node>();		
		this.edges = new HashMap<Integer, Connection>();
		for (Node node : vertices) {
			this.vertices.put(node.getEntity().getName(), node);			
		}
	}
	/**
	 * @param one (nodes)
	 * @param two (nodes)
	 * @return true if edge is added else false if edges already present in graph
	 */
	public boolean addEdge(Node one, Node two) {
		if (one.equals(two)) {			
			return false;			
		}
		Connection connection = new Connection(one, two);
		if (edges.containsKey(connection.hashCode())) {
			return false;
		}else{ if (one.containsFriend(connection)|| two.containsFriend(connection)) {
			return false;
			}
		}
		edges.put(connection.hashCode(), connection);
		one.addFriend(connection);
		two.addFriend(connection);
		return true;
	}
	/**
	 * @param connection
	 * @return true if edge contains the nodes
	 */
	public boolean containsEdge(Connection connection) {
		if (connection.getOne() == null || connection.getTwo() == null) {
			return false;
		}
		return this.edges.containsKey(connection.hashCode());
	}
	/**
	 * @param connection
	 * @return connection by removing the edge
	 */
	public Connection removeEdge(Connection connection) {
		connection.getOne().removeFriend(connection);
		connection.getTwo().removeFriend(connection);
		return this.edges.remove(connection.hashCode());
	}
	/**
	 * @param vertex
	 * @return true if graph already has vertex
	 */
	public boolean containsVertex(Node vertex) {
		return this.vertices.get(vertex.getEntity()) != null;
	}
	/** 
	 * @param entity
	 * @return node of entity
	 */
	public Node getVertex(Entity entity) {
		return vertices.get(entity);
	}
	/**
	 * @param name
	 * @return node of name ( person or organization)
	 */
	public Node getVertex(String name){
		return vertices.get(name);
	}
	/**
	 * @param vertex
	 * @param overwriteExisting
	 * @return true if vertex is added else false
	 * if vertex already present then overwrite it if overwriteExisting is true 
	 */
	public boolean addVertex(Node vertex, boolean overwriteExisting) {
		// current node 
		Node current = this.vertices.get(vertex.getEntity());
		// if current node is not null 
		if (current != null) {
			if (!overwriteExisting) {
				return false;
			}
			// remove all the edges if the current is overwritten
			while (current.getFriendsCount() > 0) {
				this.removeEdge(current.getFriends(0));
			}
		}
		// put name of entities in vertices
		vertices.put(vertex.getEntity().getName(), vertex);
		return true;
	}
	/**
	 * @param label
	 * @return the removed vertex object
	 */
	public Node removeVertex(String label) {
		Node v = vertices.remove(label);
		while (v.getFriendsCount() > 0) {
			this.removeEdge(v.getFriends(0));
		}
		return v;
	}
}