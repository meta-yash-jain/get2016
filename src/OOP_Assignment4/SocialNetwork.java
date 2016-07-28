package OOP_Assignment4;

import java.util.ArrayList;
import java.util.List;

public class SocialNetwork {
	/**
	 * @param args
	 * Entry method of program
	 */
	public static void main(String[] args) {		
		Graph graph = new Graph();		
		ConsoleOperations consoleOperations = new ConsoleOperations();
		SocialNetwork socialNetwork = new SocialNetwork();
		List <Node> nodeList = socialNetwork.buildGraph(graph);
		socialNetwork.printSocialNetwork(nodeList);
		char userPermission = '\0';
		do{
			String userInput = consoleOperations.getString("Enter name to search in network");			
			// getting a node by user input
			Node userNode = graph.getVertex(userInput);
			if(userNode != null){
				// getting entity from node 
				Entity entity = userNode.getEntity();
				if(entity != null){
					System.out.println("Name: " + entity.getName());			
					System.out.println("Contact Number: " + entity.getContactNumber());
					System.out.println("Email ID: " + entity.getEmailID());
					}
			} else { 
				System.ot.println("Name does not exist");
			}
			userPermission = consoleOperations.getString("Do You Want to Continue ? " + "Press Y for Yes || press any key to exit").charAt(0);						
		}while(userPermission == 'y' || userPermission == 'Y' );		
		System.out.println("Program Ended");
	}	
	/**
	 * @param nodeList
	 * printing the complete social network 
	 */
	public void printSocialNetwork(List<Node> nodeList) {
		System.out.println("Social Network: ");
		for (int i = 0; i < nodeList.size(); ++i) {
			System.out.println("Connections of: " + nodeList.get(i).toString() + "\n");
			for (int j = 0; j < nodeList.get(i).getFriendsCount(); ++j) {
				System.out.println(nodeList.get(i).getFriends(j));
			}
			System.out.println();
		}
	} 	
	/**
	 * @param graph
	 * @return list of nodes
	 * this method builds the graph
	 */
	public List<Node> buildGraph(Graph graph) {	
		FileOperations fileOperations = new FileOperations();
		List<Entity> entityList = fileOperations.readDataFromFile("src//OOP_Assignment4//Network_Information.txt");
		List<String> connectionList = fileOperations.readConnectionsFromFile("src//OOP_Assignment4//Network_Relations.txt");
		List<Node> nodeList = new ArrayList<Node>();
		Node node = null;
		for (Entity entity : entityList) {
			node = new Node(entity);
			nodeList.add(node);
			graph.addVertex(node, true);
		}
		for (String string : connectionList) {
			String[] personNames = string.split(",");
			Node nodeOne = graph.getVertex(personNames[0]);
			for (int i = 1; i < personNames.length; i++) {
				Node nodeTwo = graph.getVertex(personNames[i]);
				graph.addEdge(nodeOne, nodeTwo);
			}
		}
		return nodeList;
	}
}
