package OOP_Assignment4;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class FileOperations {	
	private FileInputStream fileInputStream;
	private BufferedReader bufferedReader;
	/**
	 * @param fileName
	 * @return entity list by taking data from file
	 */
	public List<Entity> readDataFromFile(String fileName){
		List<Entity> entityList = null;
		try{			
			entityList = new ArrayList<Entity>();
			fileInputStream = new FileInputStream(fileName);
			bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
			String strLine;
			while( (strLine = bufferedReader.readLine() ) != null){				
				Entity entity;
				String[] entityDataArray = strLine.split(",");				
				// selecting entities based on file input
				if(entityDataArray[0].equals("o")){					
					entity = new Organization(); 
				}else{	
					entity = new Person();
				}
				// setting entity properties
				entity.setName(entityDataArray[1]);				
				entity.setContactNumber(entityDataArray[2]);				
				entity.setEmailID(entityDataArray[3]);				
				entityList.add(entity);
			}
		}catch(Exception ex){
			System.out.println("Something went wrong: " + ex.getMessage());
		}finally{
			try{
				fileInputStream.close();
				bufferedReader.close();
			}catch(Exception ex){
				System.out.println("Something went wrong: " + ex.getMessage());
			}
		}		
		return entityList;
	}
	/** 
	 * @param fileName
	 * @return list of string for connections between users
	 */
	public List<String> readConnectionsFromFile(String fileName){		
		List<String> connectionsList = null;
		try{			
			connectionsList = new ArrayList<String>();
			fileInputStream = new FileInputStream(fileName);
			bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
			String strLine;
			while((strLine = bufferedReader.readLine()) != null){
				connectionsList.add(strLine);
			}
		}catch(Exception ex){
			System.out.println("Something went wrong: " + ex.getMessage());
		}finally{
			try{
				fileInputStream.close();
				bufferedReader.close();
			}catch(Exception ex){
				System.out.println("Something went wrong: " + ex.getMessage());
			}
		}
		return connectionsList;
	}
}