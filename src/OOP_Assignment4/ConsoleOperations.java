package OOP_Assignment4;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ConsoleOperations {
	private BufferedReader bufferedReader;
	public ConsoleOperations(){
		bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	}
	/**
	 * @param message
	 * @return string
	 */
	public String getString(String message){
		String inputString = "";
		try{
			System.out.println(message);
			inputString = bufferedReader.readLine();
		}catch(Exception ex){
			System.out.println("Something went wrong: " + ex.getMessage());
			getString(message);
		}
		return inputString;
	}
}